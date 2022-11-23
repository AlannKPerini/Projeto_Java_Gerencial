/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package LeG;

import CONEXAO_BANCO.Banco_Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alann Kelly
 */
public class pet extends javax.swing.JDialog {

    /**
     * Creates new form pet
     */
    public pet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        comboxtutor();
        comboxanimal();
    }
    
    int id_tutor;
    int id_animal;
    
    Banco_Dados bd = new Banco_Dados();
   
    public void comboxtutor(){
  jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"SELECIONE"}));
 if(bd.getConnection()){
      try{
       String query = "select nome_tutor from tutores";
       PreparedStatement id = bd.connection.prepareStatement(query);
       ResultSet rs = id.executeQuery();

      while(rs.next()){
      jComboBox1.addItem(rs.getString("nome_tutor")); 
       }  
       rs.close();
       id.close();

     }catch(SQLException e){
       JOptionPane.showMessageDialog(null,"ERRO DE SQL" + e.toString());
    }
    }

}
 public void combotutor(){
   
      String tipo = jComboBox1.getSelectedItem().toString();
      System.out.println(tipo);
  
      if(bd.getConnection()){
      try{
       String query = "select idtutores from tutores where nome_tutor ='" + tipo + "'";
       PreparedStatement id = bd.connection.prepareStatement(query);
       ResultSet rs = id.executeQuery();

      while(rs.next()){
      id_tutor = rs.getInt(1);
         System.out.println(id_tutor);
      
       }  
       rs.close();
       id.close();

     }catch(SQLException e){
       JOptionPane.showMessageDialog(null,"ERRO DE SQL" + e.toString());
    }
    }
    }
    
 
 //tratamento animais 


public void comboxanimal(){
 jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"SELECIONE"}));
 if(bd.getConnection()){
      try{
       String query = "select nome_animal from animais";
       PreparedStatement id = bd.connection.prepareStatement(query);
       ResultSet rs = id.executeQuery();

      while(rs.next()){
      jComboBox2.addItem(rs.getString("nome_animal")); 
       }  
       rs.close();
       id.close();

     }catch(SQLException e){
       JOptionPane.showMessageDialog(null,"ERRO DE SQL" + e.toString());
    }
    }

}
public void comboanimais(){
   
       String tipoanimal = jComboBox2.getSelectedItem().toString();
    
      if(bd.getConnection()){
      try{
       String query = "select idanimais from animais where nome_animal ='" + tipoanimal + "'";
       PreparedStatement id = bd.connection.prepareStatement(query);
       ResultSet rs = id.executeQuery();

      while(rs.next()){
     id_animal = rs.getInt(1);
        System.out.println(id_animal);
       }  
       rs.close();
       id.close();

     }catch(SQLException e){
       JOptionPane.showMessageDialog(null,"ERRO DE SQL" + e.toString());
    }
    }
    }
 
     //salvar

public void salvar(){

  if(bd.getConnection()){
    
     try{
         String query = "insert into adocao_has_tutores (idtutores,idanimais,data)values(?,?,?)";
         PreparedStatement stmp = bd.connection.prepareStatement(query);
         
          stmp.setInt(1, id_tutor);
          stmp.setInt(2, id_animal);
           stmp.setString(3, jTextField1.getText());
           
         stmp.executeUpdate();
         JOptionPane.showMessageDialog(null, "DADOS GRAVADOS");
          stmp.close();
          bd.connection.close();
       } catch(SQLException E){
       JOptionPane.showMessageDialog
       (null, "ERRO DE GRAVAÇÃO NO BANCO" + E.toString());
       }  
     }
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 175, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       combotutor();
       comboanimais();
       salvar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pet dialog = new pet(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
