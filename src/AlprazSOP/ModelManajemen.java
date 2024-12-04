/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlprazSOP;

/**
 *
 * @author Asus
 */
public class ModelManajemen {
    private String kdPesanan;
    private String customer;
    private String jenis;
    private String namaProduk;
    private int stok;
    private int harga;
    
    public ModelManajemen(String kdPesanan, String customer, String jenis, String namaProduk, int stok, int harga){
        this.kdPesanan = kdPesanan;
        this.customer = customer;
        this.jenis = jenis;
        this.namaProduk = namaProduk;
        this.stok = stok;
        this.harga = harga;
    }
    
    public String getKDPesanan(){
        return kdPesanan;
    }
    public String getCustomer(){
        return customer;
    }
    public void setCustomer(String customer){
        this.customer = customer;
    }
    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public int getStok(){
        return stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
}
