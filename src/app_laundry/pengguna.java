/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_laundry;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author WINDOWS10
 */
public class pengguna extends javax.swing.JFrame {
    Connection con;
    DefaultTableModel tm;
    
    public void connect(){
        con=null;
        try{
     Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db_laundry", "root", "");
        } catch(Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n" +e+ "\n\n");
        }
    }
    
    public void tampil_tabel(){
        tm=new DefaultTableModel(null, new Object[] {"Id User", "Nama", "Username", "Password", "Role"});
        tbluser.setModel(tm);
        tm.getDataVector().removeAllElements();
        try{
            PreparedStatement s=con.prepareStatement("SELECT * FROM tb_user");
            ResultSet r=s.executeQuery();
            while(r.next()){
                Object[] data= {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5)
                };
                tm.addRow(data);
            }
        } catch(Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n" +e+ "\n\n");
        }
    }
    


    /**
     * Creates new form pengguna
     */
    public pengguna() {
        initComponents();
         connect();
        tampil_tabel();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtiduser = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbluser = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        cbrole = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("DATA USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 330, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Id User");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Role");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, -1, -1));
        jPanel1.add(txtiduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 110, 350, 49));
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 180, 350, 45));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 240, 340, 44));

        tbluser.setModel(new javax.swing.table.DefaultTableModel(
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
        tbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbluserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbluser);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 590, 310));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 230, -1, 0));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/Frame Sky Light Backdrop Background.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 210, 40));

        cbrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir", "Owner" }));
        jPanel1.add(cbrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 110, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/Frame Sky Light Backdrop Background.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 650, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 460, 70, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Cari");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, -1, -1));
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 260, 40));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/exit.png"))); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 102, 40));

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/delete.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, 40));

        jButton4.setBackground(new java.awt.Color(102, 204, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/P.png"))); // NOI18N
        jButton4.setText("EDIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 146, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/floppy-disk.png"))); // NOI18N
        jButton5.setText("SAVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/WhatsApp Image 2023-05-09 at 14.27.58.jpeg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 910, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbluserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbluserMouseClicked
        // TODO add your handling code here:
        int i=tbluser.getSelectedRow();
        if(i==-1){
            return;
        }
        String Iduser=(String) tm.getValueAt(i, 0);
        txtiduser.setText(Iduser);
        String Nama=(String) tm.getValueAt(i, 1);
        txtnama.setText(Nama);
        String username=(String) tm.getValueAt(i, 2);
        txtusername.setText(username);
        String role=(String) tm.getValueAt(i, 3);
        cbrole.setSelectedItem(role);
        String password=(String) tm.getValueAt(i, 4);
        txtpass.setText(password);
    }//GEN-LAST:event_tbluserMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      try{
            PreparedStatement ps=con.prepareStatement("UPDATE tb_user SET nama=?, username=?, password=?, role=? WHERE id_user=?");
            ps.setString(1, txtnama.getText());
            ps.setString(2, txtusername.getText());
            ps.setString(3, txtpass.getText());
            ps.setString(4, cbrole.getSelectedItem().toString());
             ps.setString(5, txtiduser.getText());
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data telah teredit");
            tampil_tabel();
        } catch(Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n" +e+ "\n\n");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null, "Apakah anda yakin='" + txtiduser.getText()+"'", "Konfirmasi", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            try{
                PreparedStatement ps=con.prepareStatement("DELETE FROM tb_user WHERE id_user=?");
                ps.setString(1, txtiduser.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data telah terhapus");
                tampil_tabel();
            } catch(Exception e){
                System.out.print("ERROR KUERI KE DATABASE:\n" +e+ "\n\n");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tm = new DefaultTableModel (null,
        new Object[] {"Id User","Nama","User Name","Password","Role"});
        tbluser.setModel(tm);
        tm.getDataVector().removeAllElements();
        try
        {
            PreparedStatement s=con.prepareStatement("SELECT * from tb_user where nama LIKE '%"+txtcari.getText().toString()+"%'");
            ResultSet r=s.executeQuery();
            while(r.next())
            {
                Object[]data={
                    r.getString(1),
                r.getString(2),
                r.getString(3),
                r.getString(4),
                r.getString(5)};
                tm.addRow(data);
            }
        }
        catch (Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n"+e+"\n\n");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO tb_user VALUES (?,?,?,?,?)");
    ps.setString(1, txtiduser.getText());
    ps.setString(2, txtnama.getText());
    ps.setString(3, txtusername.getText());
    ps.setString(4, txtpass.getText());
        ps.setString(5, cbrole.getSelectedItem().toString());
    
    
    ps.executeUpdate();
    JOptionPane.showMessageDialog(this,"Data telah tersimpan"); 
    } catch(Exception e) {
    System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

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
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbrole;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbluser;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtiduser;
    private javax.swing.JTextField txtnama;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
