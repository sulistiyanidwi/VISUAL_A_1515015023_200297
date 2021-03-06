/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;

/**
 *
 * @author Dwi Sulistiyani
 */
import Tugas6.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class formdatabuku extends javax.swing.JFrame {
    private DefaultTableModel model;//untuk membuat model pada tabel
    private Connection con = koneksi.getConnection();//untuk mengambil koneksi
    private Statement stt;//untuk eksekusi qury database
    private ResultSet rss;//untuk penampung data dari database
    
    
    private int baris; //pendeklarasian variable baris
    private boolean  oke=true; //pendeklarasian variable untuk verifikasi yang bernilai boolean
    /**
     * Creates new form formdatabuku
     */
    public formdatabuku() { //method form yang dibuat
        initComponents(); 
        
    }
     private void InitTable(){ //method formdatabuku
         model = new DefaultTableModel();
         model.addColumn("ID");  
         model.addColumn("JUDUL");
         model.addColumn("PENULIS");
         model.addColumn("HARGA");
         
         jTable1.setModel(model);
     }
     
     private void TampilData(){//method untuk tampil data
         try{
             String sql = "SELECT * FROM buku";
             stt = con.createStatement();
             rss = stt.executeQuery(sql);
             while(rss.next()){
                 Object[] o = new Object[4];
                 o[0] = rss.getString("id");
                 o[1] = rss.getString("judul");
                 o[2] = rss.getString("penulis");
                 o[3] = rss.getString("harga");
                 model.addRow(o);
             }
         }catch(SQLException e){//digunakan untuk menangkap kesalahan
             System.out.println(e.getMessage());
         }
         
     }
     
     private void TambahData(String judul, String penulis, String harga){ //method untuk tambah data
         try{
             String sql = "INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"',"+harga+")";
             stt=con.createStatement();
             stt.executeUpdate(sql);
    }catch(SQLException e){ //digunakan untuk menangkap kesalahan
             System.out.println(e.getMessage());
         }
         
     }
     
     private void UbahData(String judul, String penulis, String harga, String id){//method untuk ubah data
         try{
             String sql = "UPDATE buku SET judul='"+judul+"', penulis='"+penulis+"', harga='"+harga+"' WHERE id='"+id+"'";
             stt=con.createStatement();
             stt.executeUpdate(sql);
             
    }catch(SQLException e){//digunakan untuk menangkap kesalahan
             System.out.println(e.getMessage());
         }
         
     }
     
     private void HapusData(String id, int baris){//method dari hapus data
         try{
             String sql = "DELETE FROM buku WHERE id='"+id+"'";
                  
             stt=con.createStatement();
             stt.executeUpdate(sql);
             model.removeRow(baris);
    }catch(SQLException e){//digunakan untuk menangkap kesalahan
             System.out.println(e.getMessage());
         }
         
     }
     
private void CariData(){//method dari cari data
         try{
             String sql = "SELECT * FROM buku WHERE judul='"+search.getText()+"'|| penulis='"+search.getText()+"'|| harga='"+search.getText()+"'";
             stt = con.createStatement();
             rss = stt.executeQuery(sql);
             while(rss.next()){
                 Object[] o = new Object[4];
                 o[0] = rss.getString("id");
                 o[1] = rss.getString("judul");
                 o[2] = rss.getString("penulis");
                 o[3] = rss.getString("harga");
                 model.addRow(o);
             }
         }catch(SQLException e){//digunakan untuk menangkap kesalahan
             System.out.println(e.getMessage());
         }
         
     }

private void oce(String judul, String penulis, String harga){//method untuk verifikasi jika ada data yang sama jika data yan  di inputkan telah ada maka di sini terjadi pemrosesan yang akan memberi tahu data telah ada jika memang yang diinputkan telah ada
         try{
             String sql = "SELECT * FROM buku ";
             stt = con.createStatement();
             rss = stt.executeQuery(sql);
             while(rss.next()){
                 Object[] o = new Object[2];
                 o[0] = rss.getString("judul").toLowerCase();
                 o[1] = rss.getString("penulis").toLowerCase();
                           
                 if(o[0].equals(judul.toLowerCase()) && o[1].equals(penulis.toLowerCase())){
                     JOptionPane.showMessageDialog(null,"Data telah ada");
                     oke=false;
                     break;
                 } 
             }
             if(oke==true)
                 TambahData(judul,penulis,harga);
         }catch(SQLException e){ //digunakan untuk menangkap kesalahan
             System.out.println(e.getMessage());
         }
         
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtjudul = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        compenulis = new javax.swing.JComboBox();
        butsimpan = new javax.swing.JButton();
        butubah = new javax.swing.JButton();
        buthapus = new javax.swing.JButton();
        butkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tampil = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("FORM DATA BUKU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("Judul");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Penulis");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Harga");

        txtjudul.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        txtjudul.setForeground(new java.awt.Color(51, 0, 102));
        txtjudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjudulActionPerformed(evt);
            }
        });

        txtharga.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        txtharga.setForeground(new java.awt.Color(51, 0, 102));
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        compenulis.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        compenulis.setForeground(new java.awt.Color(51, 0, 102));
        compenulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S Rendra", "Asma Nadia", "Dewi Lestari" }));
        compenulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compenulisActionPerformed(evt);
            }
        });

        butsimpan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        butsimpan.setForeground(new java.awt.Color(51, 0, 102));
        butsimpan.setText("Simpan");
        butsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsimpanActionPerformed(evt);
            }
        });

        butubah.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        butubah.setForeground(new java.awt.Color(51, 0, 102));
        butubah.setText("Ubah");
        butubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butubahActionPerformed(evt);
            }
        });

        buthapus.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        buthapus.setForeground(new java.awt.Color(51, 0, 102));
        buthapus.setText("Hapus");
        buthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buthapusActionPerformed(evt);
            }
        });

        butkeluar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        butkeluar.setForeground(new java.awt.Color(51, 0, 102));
        butkeluar.setText("Keluar");
        butkeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butkeluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtjudul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtharga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compenulis, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(butsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buthapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butkeluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(compenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butsimpan)
                    .addComponent(butubah)
                    .addComponent(buthapus)
                    .addComponent(butkeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(255, 204, 102));
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        jTable1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 0, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "JUDUL", "PENULIS", "HARGA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Search");

        search.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(51, 0, 102));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("CARI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tampil.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        tampil.setForeground(new java.awt.Color(51, 0, 102));
        tampil.setText("TAMPIL");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(tampil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(tampil))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();//untuk menghubungkan data inputan yang ada ke tabel
        TampilData();//untuk menampilkan data
    }//GEN-LAST:event_formComponentShown

    private void butsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsimpanActionPerformed
        //untuk action tombol button simpan
        String judul = txtjudul.getText();
        String penulis = compenulis.getSelectedItem().toString();
        String harga = txtharga.getText();
        oce(judul,penulis,harga);
        InitTable();
        TampilData();
    }//GEN-LAST:event_butsimpanActionPerformed

    private void butubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butubahActionPerformed
        //untuk action tombol button ubah 
        int baris = jTable1.getSelectedRow();
        
        jTable1.setValueAt(txtjudul.getText(),baris,1);
        jTable1.setValueAt(compenulis.getSelectedItem(),baris,2);
        jTable1.setValueAt(txtharga.getText(),baris,3);
        
        String judul = jTable1.getValueAt(baris,1).toString();
        String penulis = jTable1.getValueAt(baris,2).toString();
        String harga = jTable1.getValueAt(baris,3).toString();
        String id = jTable1.getValueAt(baris,0).toString();
        
        UbahData(judul,penulis,harga,id);
    }//GEN-LAST:event_butubahActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
             //digunakan untuk get data yang ada ketika tombol yang dipilih di klik 
        int baris = jTable1.getSelectedRow();
        
        String judul = jTable1.getValueAt(baris,1).toString();
        String penulis = jTable1.getValueAt(baris,2).toString();
        String harga = jTable1.getValueAt(baris,3).toString();
        String id = jTable1.getValueAt(baris,0).toString();
        
        txtjudul.setText(judul);
        compenulis.setSelectedItem(penulis);
        txtharga.setText(harga);
    }//GEN-LAST:event_jTable1MouseClicked

    private void buthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buthapusActionPerformed
         //untuk action tombol button hapus
        int baris=jTable1.getSelectedRow();
        String id = jTable1.getValueAt(baris,0).toString();
        HapusData(id,baris);
    }//GEN-LAST:event_buthapusActionPerformed

    private void butkeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butkeluarMouseClicked
         //untuk action tombol button keluar
        System.exit(0);
    }//GEN-LAST:event_butkeluarMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_searchActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        // TODO add your handling code here:
        InitTable();
       TampilData();
    }//GEN-LAST:event_tampilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        model.getDataVector().removeAllElements();//untuk menghapus semua elemen pada tabel
        model.fireTableDataChanged();//untuk mengubah dan menghapus data yang ada pada tabel
        CariData();//digunakan untuk mencari data
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtjudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjudulActionPerformed

    private void compenulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compenulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compenulisActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

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
            java.util.logging.Logger.getLogger(formdatabuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formdatabuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formdatabuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formdatabuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formdatabuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buthapus;
    private javax.swing.JButton butkeluar;
    private javax.swing.JButton butsimpan;
    private javax.swing.JButton butubah;
    private javax.swing.JComboBox compenulis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField search;
    private javax.swing.JButton tampil;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjudul;
    // End of variables declaration//GEN-END:variables

   

    
}
