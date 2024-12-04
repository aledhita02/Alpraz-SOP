
package AlprazSOP;
import javax.swing.JOptionPane;
import AlprazSOP.AdminController;

public class ViewSalesProduk extends javax.swing.JFrame {
    AdminController admin = new AdminController();
        
        public ViewSalesProduk() {
        initComponents();  
        AdminController adminController = new AdminController();
        tablelist2.setModel(adminController.showData());
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TKdPesanan = new javax.swing.JTextField();
        TCustomer = new javax.swing.JTextField();
        TJenis = new javax.swing.JComboBox<>();
        TStok = new javax.swing.JTextField();
        THarga = new javax.swing.JTextField();
        TSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablelist2 = new javax.swing.JTable();
        TUpdate = new javax.swing.JButton();
        TDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TNamaProduk = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ALPRAZ SALES");

        jLabel2.setText("Invoice Pesanan");

        jLabel3.setText("Jenis Produk");

        jLabel4.setText("Jumlah Stok");

        jLabel5.setText("Harga");

        jLabel6.setText("Customer");

        TJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Handphone", "Laptop", "Headphone", "Mouse", "Keyboard" }));

        TSimpan.setBackground(new java.awt.Color(51, 204, 0));
        TSimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TSimpan.setForeground(new java.awt.Color(255, 255, 255));
        TSimpan.setText("Simpan");
        TSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSimpanActionPerformed(evt);
            }
        });

        tablelist2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Invoice Pesanan", "Customer", "Jenis Barang", "Nama Produk", "Jumlah Stok", "Harga"
            }
        ));
        tablelist2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablelist2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablelist2);

        TUpdate.setBackground(new java.awt.Color(255, 255, 0));
        TUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TUpdate.setForeground(new java.awt.Color(0, 0, 0));
        TUpdate.setText("Update");
        TUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUpdateActionPerformed(evt);
            }
        });

        TDelete.setBackground(new java.awt.Color(255, 102, 51));
        TDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TDelete.setForeground(new java.awt.Color(255, 255, 255));
        TDelete.setText("Delete");
        TDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Nama Produk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TKdPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TStok)
                                    .addComponent(THarga))
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(123, Short.MAX_VALUE)
                        .addComponent(TSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TKdPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(THarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSimpanActionPerformed
        String kdPesanan = TKdPesanan.getText();
        String customer = TCustomer.getText();
        String jenis = TJenis.getSelectedItem().toString();
        String namaProduk = TNamaProduk.getText();
        int stok = Integer.parseInt(TStok.getText());
        int harga = Integer.parseInt(THarga.getText());
        admin.InsertData(kdPesanan, customer, jenis, namaProduk, stok, harga);
        tablelist2.setModel(admin.showData());
    }//GEN-LAST:event_TSimpanActionPerformed

    private void TUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUpdateActionPerformed
        String kdPesanan = TKdPesanan.getText(); 
        String customer = TCustomer.getText();
        String jenis = TJenis.getSelectedItem().toString();
        String namaProduk = TNamaProduk.getText();
        int stok = Integer.parseInt(TStok.getText());
        int harga = Integer.parseInt(THarga.getText());

        
        AdminController adminController = new AdminController();     
        adminController.UpdateData(kdPesanan, customer, jenis, namaProduk, stok, harga);
        tablelist2.setModel(adminController.showData()); 
        JOptionPane.showMessageDialog(this, "Data produk berhasil diupdate.");
    }//GEN-LAST:event_TUpdateActionPerformed

    private void TDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDeleteActionPerformed
        String kdPesanan = TKdPesanan.getText();  
        int confirmation = JOptionPane.showConfirmDialog(this, 
                "Apakah Anda yakin ingin menghapus pesanan " + kdPesanan + "?", 
                "Alert", 
                JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            AdminController adminController = new AdminController();
            boolean isDeleted = adminController.deleteData(kdPesanan); 

            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "Pesanan berhasil dihapus.");
            } else {
                JOptionPane.showMessageDialog(this, "Pesanan gagal dihapus.");
            }
            tablelist2.setModel(adminController.showData());
        }
    }//GEN-LAST:event_TDeleteActionPerformed

    private void tablelist2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablelist2MouseClicked
        int selectedRow = tablelist2.getSelectedRow();
        String kdPesanan = tablelist2.getValueAt(selectedRow, 0).toString(); 
        String customer = tablelist2.getValueAt(selectedRow, 1).toString(); 
        String jenis = tablelist2.getValueAt(selectedRow, 2).toString(); 
        String namaProduk = tablelist2.getValueAt(selectedRow, 3).toString(); 
        String stok = tablelist2.getValueAt(selectedRow, 4).toString(); 
        String harga = tablelist2.getValueAt(selectedRow, 5).toString(); 

       
        TKdPesanan.setText(kdPesanan);  
        TCustomer.setText(customer);  
        TJenis.setSelectedItem(jenis); 
        TNamaProduk.setText(namaProduk);
        TStok.setText(stok);         
        THarga.setText(harga);        
    }//GEN-LAST:event_tablelist2MouseClicked


    public static void main(String args[]) {
          /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewSalesProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSalesProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSalesProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSalesProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSalesProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TCustomer;
    private javax.swing.JButton TDelete;
    private javax.swing.JTextField THarga;
    private javax.swing.JComboBox<String> TJenis;
    private javax.swing.JTextField TKdPesanan;
    private javax.swing.JTextField TNamaProduk;
    private javax.swing.JButton TSimpan;
    private javax.swing.JTextField TStok;
    private javax.swing.JButton TUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablelist2;
    // End of variables declaration//GEN-END:variables
}
