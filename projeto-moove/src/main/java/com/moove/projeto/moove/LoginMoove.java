/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moove.projeto.moove;

import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Aluno
 */
public class LoginMoove extends javax.swing.JFrame {
    private JdbcTemplate jdbcTemplate;
    Integer cont = 3;
    
    public LoginMoove() {
        initComponents();
    }
void ConexaoBanco() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:file:./bancoMoove");
        dataSource.setUsername("sa");
        dataSource.setPassword(""); 
        
        jdbcTemplate = new JdbcTemplate(dataSource);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        BTentrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LBabrircad = new javax.swing.JLabel();
        TFsenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 230, 193));
        jLabel1.setText("copyright © 2020");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 160, 30));

        jSeparator1.setBackground(new java.awt.Color(33, 230, 193));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 450, 30));

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 230, 193));
        jLabel2.setText("Moove");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 100, 50));

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 230, 193));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, 30));
        jPanel1.add(TFemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, 30));

        BTentrar.setBackground(new java.awt.Color(255, 255, 255));
        BTentrar.setText("Entrar");
        BTentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTentrarActionPerformed(evt);
            }
        });
        jPanel1.add(BTentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 200, -1));

        jLabel4.setBackground(new java.awt.Color(0, 102, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 230, 193));
        jLabel4.setText("Senha");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 30));

        LBabrircad.setBackground(new java.awt.Color(0, 102, 255));
        LBabrircad.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        LBabrircad.setForeground(new java.awt.Color(33, 230, 193));
        LBabrircad.setText("Criar uma conta");
        LBabrircad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBabrircad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBabrircadMouseClicked(evt);
            }
        });
        jPanel1.add(LBabrircad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 170, 30));
        jPanel1.add(TFsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(617, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LBabrircadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBabrircadMouseClicked
        // TODO add your handling code here:
        
        new LoginMoove().setVisible(false);
        new CadastroMoove().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_LBabrircadMouseClicked

    private void BTentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTentrarActionPerformed
        ConexaoBanco();
        
        String email = TFemail.getText();
        String senha = TFsenha.getText();
        
        List<Cadastro> consultaCadastro = jdbcTemplate.query(
                "Select * from cadastro where email = ? and senha = ?",
                new BeanPropertyRowMapper(Cadastro.class),
                email, senha);
        if(consultaCadastro.isEmpty()){
               cont--;
                JOptionPane.showMessageDialog
        (null,"Email e/ou senha incorreto. Você tem " +cont+ " tentantivas");
                if(cont == 0){
                    JOptionPane.showMessageDialog
                    (null,"Sistema Bloqueado - procure o suporte");
                    BTentrar.setVisible(false);
                }
            }else{
                for(Cadastro users :consultaCadastro){
                    JOptionPane.showMessageDialog
                        (null,"Login efetuado com sucesso.Bem vindo(a) "
                                +users.getNome());
                }
            }
    }//GEN-LAST:event_BTentrarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginMoove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMoove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMoove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMoove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMoove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTentrar;
    private javax.swing.JLabel LBabrircad;
    private javax.swing.JTextField TFemail;
    private javax.swing.JPasswordField TFsenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
