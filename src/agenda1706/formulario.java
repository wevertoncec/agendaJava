/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * formulario.java
 *
 * Created on 17/06/2013, 13:26:40
 */
package agenda1706;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUNO
 */
public class formulario extends javax.swing.JFrame {

    /** Creates new form formulario */
    public formulario() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlnome = new javax.swing.JLabel();
        jlsexo = new javax.swing.JLabel();
        jlemail = new javax.swing.JLabel();
        jltelefone = new javax.swing.JLabel();
        jtfnome = new javax.swing.JTextField();
        jtfemail = new javax.swing.JTextField();
        jcbsexo = new javax.swing.JComboBox();
        jbcadastrar = new javax.swing.JButton();
        jblimpar = new javax.swing.JButton();
        jftftelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(51, 51, 255));

        jlnome.setText("Nome");

        jlsexo.setText("Sexo");

        jlemail.setText("Email");

        jltelefone.setText("Telefone");

        jcbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino" }));
        jcbsexo.setToolTipText("");
        jcbsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbsexoActionPerformed(evt);
            }
        });

        jbcadastrar.setText("Cadastrar");
        jbcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcadastrarActionPerformed(evt);
            }
        });

        jblimpar.setText("Limpar");
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });

        try {
            jftftelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Cadastra aee Maluco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlnome)
                                    .addComponent(jlsexo)
                                    .addComponent(jlemail)
                                    .addComponent(jltelefone))
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfnome)
                                    .addComponent(jtfemail)
                                    .addComponent(jftftelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jbcadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jblimpar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnome)
                    .addComponent(jtfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlsexo)
                    .addComponent(jcbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlemail)
                    .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jltelefone)
                    .addComponent(jftftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcadastrar)
                    .addComponent(jblimpar))
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jcbsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbsexoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jcbsexoActionPerformed

private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
Limpar(); // TODO add your handling code here:
}//GEN-LAST:event_jblimparActionPerformed

private void jbcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcadastrarActionPerformed
 Cadastrar();
 Limpar();// TODO add your handling code here:
}//GEN-LAST:event_jbcadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formulario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbcadastrar;
    private javax.swing.JButton jblimpar;
    private javax.swing.JComboBox jcbsexo;
    private javax.swing.JFormattedTextField jftftelefone;
    private javax.swing.JLabel jlemail;
    private javax.swing.JLabel jlnome;
    private javax.swing.JLabel jlsexo;
    private javax.swing.JLabel jltelefone;
    private javax.swing.JTextField jtfemail;
    private javax.swing.JTextField jtfnome;
    // End of variables declaration//GEN-END:variables
private void Limpar(){
    jtfnome.setText("");
    jcbsexo.setSelectedIndex(0);
    jtfemail.setText("");
    jftftelefone.setText("");
}
private void Cadastrar(){
    String N,S = null,E,T;
    N=jtfnome.getText();
    if(jcbsexo.getSelectedItem().equals("Masculino")){
        S="M";
    }else if(jcbsexo.getSelectedItem().equals("Feminino")){
        S="F";
    }
    E=jtfemail.getText();
    T=jftftelefone.getText();
    String I="insert into contato(nome,sexo,email,telefone) values('" +N+ "','" +S+ "',' "+E+" ',' "+T+"')";
    Conexao cone =  new Conexao (); 
        try {
            cone.Atualiza(I);
            cone.Exit();
        } catch (SQLException ex) {
            Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
}


}
