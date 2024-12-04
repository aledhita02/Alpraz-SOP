package AlprazSOP;

public class ProdukSales  implements java.io.Serializable {


     private String kdPesanan;
     private String customer;
     private String jenis;
     private String namaProduk;
     private int stok;
     private int harga;

    public ProdukSales() {
    }

    public ProdukSales(String kdPesanan, String customer, String jenis, String namaProduk, int stok, int harga) {
        this.kdPesanan = kdPesanan;
        this.customer = customer;
        this.jenis = jenis;
        this.namaProduk = namaProduk;
        this.stok = stok;
        this.harga = harga;
    }
   
    public String getKdPesanan() {
        return this.kdPesanan;
    }
    
    public void setKdPesanan(String kdPesanan) {
        this.kdPesanan = kdPesanan;
    }
    
    public String getCustomer() {
        return this.customer;  
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getJenis() {
        return this.jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String getNamaProduk() {
        return this.namaProduk;  
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public int getStok() {
        return this.stok;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getHarga() {
        return this.harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
}


