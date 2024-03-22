/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasirujikom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net. proteanit.sql.DbUtils;
/**
 *
 * @author User
 */
public class formProduk extends javax.swing.JFrame {
 Connection konek;
            PreparedStatement pst;
            ResultSet rst;
    /**
     * Creates new form formProduk
     */
    public formProduk() {
        initComponents();
        konek = Koneksi.KoneksiDB();
            updateTabel();
    }
    
     public void updateTabel() {
        try {
            String sql = "select * from produk";
            pst = konek.prepareStatement(sql);
            rst = pst.executeQuery();
            tblproduk.setModel(DbUtils.resultSetToTableModel(rst));         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
     
     private void clear() {
            txtidproduk.setText("");
            txtnamaproduk.setText("");
            txtharga.setText("");
            txtstok.setText("");
    }
     
     private void simpan() {
        try {
            String sql = "insert into produk(ProdukID,NamaProduk,Harga,Stok)value (?,?,?,?)";
            pst = konek.prepareStatement(sql);
            pst .setString(1, txtidproduk.getText());
            pst .setString(2, txtnamaproduk.getText());
            pst .setString(3, txtharga.getText());
            pst .setString(4, txtstok.getText());
            pst .execute();
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
            
         }catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
            
        }
            updateTabel();
            clear();
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidproduk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnamaproduk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproduk = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("INPUT PRODUK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel1)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Id Produk");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nama Produk");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Harga");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Stok");

        btnsimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-save-35.png")); // NOI18N
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-edit-property-35.png")); // NOI18N
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-delete-35.png")); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-move-out-35.png")); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        tblproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblprodukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblproduk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidproduk)
                                    .addComponent(txtnamaproduk)
                                    .addComponent(txtharga)
                                    .addComponent(txtstok, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnamaproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsimpan)
                        .addGap(51, 51, 51)
                        .addComponent(btnedit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnhapus)
                        .addGap(45, 45, 45)
                        .addComponent(btnkeluar)
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        simpan();
        clear(); // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
 try{
                String ID = txtidproduk.getText();
                String Nama  = txtnamaproduk.getText();
                String Harga  = txtharga.getText();
                String Stok = txtstok.getText();
                String sql = "update produk set ProdukID='"+ID+"', NamaProduk='"+Nama+"', Harga='"+Harga+"', Stok='"+Stok+"' where ProdukID='"+ID+"'";
                pst = konek.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    updateTabel();
    clear();        

        // TODO add your handling code here:  
    }//GEN-LAST:event_btneditActionPerformed

    private void tblprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblprodukMouseClicked
try {
    int baris = tblproduk.getSelectedRow();
    String tabelKlik =(tblproduk.getModel().getValueAt(baris, 0) .toString());
    String sql = " select * from produk where  ProdukID='"+tabelKlik+"'";
    pst = konek.prepareStatement(sql);
    rst = pst.executeQuery();
    if (rst.next()) {
        String ID=rst.getString(("ProdukID"));
        txtidproduk.setText(ID);
        
        String Nama = rst.getString (("NamaProduk"));
        txtnamaproduk.setText(Nama);
        
        String Harga = rst.getString(("Harga"));
        txtharga.setText(Harga);
        
        String Stok = rst.getString(("Stok"));
        txtstok.setText(Stok);
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);

}

        // TODO add your handling code here:
    }//GEN-LAST:event_tblprodukMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
try {
    String sql = "delete from produk where ProdukID=?";
    pst = konek.prepareStatement (sql);
    pst.setString(1, txtidproduk.getText());
    pst.execute();
    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
       updateTabel();
       clear();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
new MenuUtama().setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeluarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(formProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblproduk;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidproduk;
    private javax.swing.JTextField txtnamaproduk;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}
