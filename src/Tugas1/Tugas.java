package Tugas1;

import static java.awt.SystemColor.text;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dwi Sulistiyani
 */
public class Tugas extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Tugas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtttl = new javax.swing.JTextField();
        txtumur = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txts = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtunit = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        simpan = new javax.swing.JToggleButton();
        P = new javax.swing.JRadioButton();
        L = new javax.swing.JRadioButton();
        txtnama = new javax.swing.JTextField();
        res = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("Formulir Pendaftaran Member Drumline");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Nama");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 104, -1, 35));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Tempat, Tanggal Lahir");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 139, -1, 35));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Umur");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 180, -1, 35));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("NO. Telepon");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 298, -1, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 35));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Asal Unit");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 35));

        txtttl.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        txtttl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtttlKeyPressed(evt);
            }
        });
        jPanel1.add(txtttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 143, 202, -1));

        txtumur.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        txtumur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtumurActionPerformed(evt);
            }
        });
        txtumur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtumurKeyPressed(evt);
            }
        });
        jPanel1.add(txtumur, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 181, 202, -1));

        txtno.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });
        txtno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnoKeyPressed(evt);
            }
        });
        jPanel1.add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 301, 202, -1));

        txts.setBackground(new java.awt.Color(0, 153, 255));
        txts.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        txts.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilihan", "Snare Drum", "Bass Drum", "Quintom", "Cymbal" }));
        txts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsActionPerformed(evt);
            }
        });
        jPanel1.add(txts, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 339, 107, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Section yang di inginkan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 35));

        txtunit.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        txtunit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtunitKeyPressed(evt);
            }
        });
        jPanel1.add(txtunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 262, 202, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 78, 643, 10));

        simpan.setBackground(new java.awt.Color(0, 153, 255));
        simpan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        P.setBackground(new java.awt.Color(0, 153, 255));
        buttonGroup1.add(P);
        P.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        P.setText("Perempuan");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        jPanel1.add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 221, 91, -1));

        L.setBackground(new java.awt.Color(0, 153, 255));
        buttonGroup1.add(L);
        L.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        L.setText("Laki - Laki");
        jPanel1.add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 221, 104, -1));

        txtnama.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnamaKeyPressed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 102, 202, -1));

        res.setBackground(new java.awt.Color(0, 153, 255));
        res.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        res.setText("Reset");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });
        jPanel1.add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 79, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\foto\\42809.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 128, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsActionPerformed

    private void txtumurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtumurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtumurActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
       
       String nama=txtnama.getText();
       String ttl=txtttl.getText();
       String umur=txtumur.getText();
       String jk=" ";
        if(L.isSelected()){
            jk=L.getText();
        }
        else {
            jk=P.getText();
        }
         String unit=txtunit.getText();
         String no=txtno.getText();
         String pilih=(String) txts.getSelectedItem();
        
        Tugas2 a = new Tugas2(nama,ttl,umur,jk,unit,no,pilih); 
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_simpanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PActionPerformed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        // TODO add your handling code here:
        txtnama.setText("");
        txtttl.setText("");
        txtumur.setText("");
        txtunit.setText("");
        txtno.setText("");
      
    }//GEN-LAST:event_resActionPerformed

    private void txtnamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode () == evt.VK_ENTER)
        {
            if(txtnama.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"Upsss Gaboleh Kosong Yaa","Maaf",JOptionPane.INFORMATION_MESSAGE);
                txtnama.requestFocus();
                return;
            }
            simpan.requestFocus();
        }
            
    }//GEN-LAST:event_txtnamaKeyPressed

    private void txtttlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtttlKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode () == evt.VK_ENTER)
        {
            if(txtttl.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"Upsss Gaboleh Kosong Yaa","Maaf",JOptionPane.INFORMATION_MESSAGE);
                txtttl.requestFocus();
                return;
            }
            simpan.requestFocus();
        }
    }//GEN-LAST:event_txtttlKeyPressed

    private void txtumurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtumurKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode () == evt.VK_ENTER)
        {
            if(txtumur.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"Upsss Gaboleh Kosong Yaa","Maaf",JOptionPane.INFORMATION_MESSAGE);
                txtumur.requestFocus();
                return;
            }
            simpan.requestFocus();
        }
    }//GEN-LAST:event_txtumurKeyPressed

    private void txtunitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunitKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode () == evt.VK_ENTER)
        {
            if(txtunit.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"Upsss Gaboleh Kosong Yaa","Maaf",JOptionPane.INFORMATION_MESSAGE);
                txtunit.requestFocus();
                return;
            }
            simpan.requestFocus();
        }
    }//GEN-LAST:event_txtunitKeyPressed

    private void txtnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode () == evt.VK_ENTER)
        {
            if(txtno.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"Upsss Gaboleh Kosong Yaa","Maaf",JOptionPane.INFORMATION_MESSAGE);
                txtno.requestFocus();
                return;
            }
            simpan.requestFocus();
        }
    }//GEN-LAST:event_txtnoKeyPressed

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton L;
    private javax.swing.JRadioButton P;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton res;
    private javax.swing.JToggleButton simpan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JComboBox txts;
    private javax.swing.JTextField txtttl;
    private javax.swing.JTextField txtumur;
    private javax.swing.JTextField txtunit;
    // End of variables declaration//GEN-END:variables
}
