/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * listagem.java
 *
 * Created on 20/06/2013, 14:36:46
 */
package agenda1706;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUNO
 */
public class listagem extends javax.swing.JFrame {

    /** Creates new form listagem */
    public listagem() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListar = new javax.swing.JTable();
        jRBCodigo = new javax.swing.JRadioButton();
        jRBNome = new javax.swing.JRadioButton();
        jRBSexoNome = new javax.swing.JRadioButton();
        jRBTel = new javax.swing.JRadioButton();
        jBListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Sexo", "Email", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTListar);

        buttonGroup1.add(jRBCodigo);
        jRBCodigo.setText("Codigo");

        buttonGroup1.add(jRBNome);
        jRBNome.setText("Nome");

        buttonGroup1.add(jRBSexoNome);
        jRBSexoNome.setText("Sexo/Nome");

        buttonGroup1.add(jRBTel);
        jRBTel.setText("Telefone");

        jBListar.setText("Listar");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jBListar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jRBCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(jRBNome)
                        .addGap(29, 29, 29)
                        .addComponent(jRBSexoNome)
                        .addGap(36, 36, 36)
                        .addComponent(jRBTel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBSexoNome)
                    .addComponent(jRBNome)
                    .addComponent(jRBTel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBCodigo))
                .addGap(34, 34, 34)
                .addComponent(jBListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        
            Listar();// TODO add your handling code here:
       
}//GEN-LAST:event_jBListarActionPerformed

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
            java.util.logging.Logger.getLogger(listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new listagem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBListar;
    private javax.swing.JRadioButton jRBCodigo;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JRadioButton jRBSexoNome;
    private javax.swing.JRadioButton jRBTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListar;
    // End of variables declaration//GEN-END:variables
public void Listar() {
    String S="select * from contato order by ";
    if (jRBCodigo.isSelected()) S=S+ "cod";
    else if(jRBNome.isSelected()) S=S+ "nome";
    else if(jRBSexoNome.isSelected()) S=S+ "sexo,nome";
    Conexao Cone = new Conexao();
    ResultSet rs ;
        
    int L=0;
        try {
             rs = Cone.Consulta(S);
            while (rs.next()){
                jTListar.setValueAt(rs.getString("cod"), L, 0 ); 
                jTListar.setValueAt(rs.getString("nome"), L, 1 );
                jTListar.setValueAt(rs.getString("sexo"), L, 2); 
                jTListar.setValueAt(rs.getString("email"), L, 3); 
                jTListar.setValueAt(rs.getString("telefone"), L, 4);
                L++;
            }
            Cone.Exit();
        } catch (SQLException ex) {
            Logger.getLogger(listagem.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
