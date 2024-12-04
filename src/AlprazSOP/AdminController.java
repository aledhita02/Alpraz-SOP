package AlprazSOP;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import AlprazSOP.HibernateUtil;
import java.util.List; 

/**
 *
 * @author Asus
 */
public class AdminController {
    ArrayList<ModelManajemen> ArrayData;
    DefaultTableModel tabelModel;
    
    public AdminController(){
        ArrayData = new ArrayList<ModelManajemen>();
    }
    
    public void InsertData(String kdPesanan, String customer, String jenis, String namaProduk, int stok, int harga) {
    Session session = HibernateUtil.getSessionFactory().openSession(); 
    Transaction tx = session.beginTransaction();
    try {
        ProdukSales mnj = new ProdukSales(kdPesanan, customer, jenis, namaProduk, stok, harga);
        session.save(mnj);
        tx.commit();
    } catch (Exception e) {
        if (tx != null) tx.rollback();
        e.printStackTrace();
    } finally {
        session.close();
    }
}
    
   public static void UpdateData(String kdPesanan, String customer, String jenis, String namaProduk, int stok, int harga) {
    Session session = HibernateUtil.getSessionFactory().openSession(); 
    Transaction tx = session.beginTransaction(); 
    try {
        // Mencari objek berdasarkan kdBarang
        ProdukSales mproduk = (ProdukSales) session.get(ProdukSales.class, kdPesanan); 
        
        if (mproduk != null) {
            // Update data produk
            mproduk.setCustomer(customer);
            mproduk.setJenis(jenis);
            mproduk.setNamaProduk(namaProduk);
            mproduk.setStok(stok);
            mproduk.setHarga(harga);

            // Simpan perubahan
            session.update(mproduk);
            tx.commit(); // Komit transaksi
        } else {
            System.out.println("Produk dengan kode barang " + kdPesanan + " tidak ditemukan.");
        }
    } catch (Exception e) {
        if (tx != null) tx.rollback(); 
        e.printStackTrace();
    } finally {
        session.close(); 
    }
}

public boolean deleteData(String kdPesanan) {
    Session session = HibernateUtil.getSessionFactory().openSession(); 
    Transaction tx = null;
    boolean isDeleted = false;

    try {
        tx = session.beginTransaction();
        
        
        ProdukSales mproduk = (ProdukSales) session.get(ProdukSales.class, kdPesanan);
        
        if (mproduk != null) {       
            session.delete(mproduk);
            tx.commit(); 
            isDeleted = true;
        } else {
            System.out.println("Produk dengan kode barang " + kdPesanan + " tidak ditemukan.");
        }
    } catch (Exception e) {
        if (tx != null) tx.rollback(); 
        e.printStackTrace();
    } finally {
        session.close(); 
    }

    return isDeleted;
}

  
public DefaultTableModel showData() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;
    List<ProdukSales> products = null;
    
    try {
        tx = session.beginTransaction();
        products = session.createQuery("FROM ProdukSales").list(); 
        tx.commit();
    } catch (Exception e) {
        if (tx != null) tx.rollback();  
        e.printStackTrace();
    } finally {
        session.close();  
    }

   
    String[] columnNames = {"Invoice Pesanan", "Customer", "Jenis Produk", "Nama Produk", "Jumlah Stok", "Harga"};
    
   
    Object[][] data = new Object[products.size()][6];

    
    for (int i = 0; i < products.size(); i++) {
        ProdukSales product = products.get(i);
        data[i] = new Object[]{product.getKdPesanan(), product.getCustomer(), product.getJenis(), product.getNamaProduk(), product.getStok(), product.getHarga()};
    }
    return new DefaultTableModel(data, columnNames);
}}
