/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class telaprincipal extends javax.swing.JFrame {
    
    float salario,faturamento,finalfat,finalsal;
     String nome;
    
    /**
     * Creates new form telaprincipal
     */
    public telaprincipal() {
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

        title = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        inputnome = new javax.swing.JTextField();
        inputsalario = new javax.swing.JTextField();
        labelsalario = new javax.swing.JLabel();
        btnenviar = new javax.swing.JButton();
        labelfaturamento = new javax.swing.JLabel();
        inputfaturamento = new javax.swing.JTextField();
        btnnovo = new javax.swing.JButton();
        lablefichatitle = new javax.swing.JLabel();
        labelrespname = new javax.swing.JLabel();
        labelsalfinal = new javax.swing.JLabel();
        labelsalfixo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        title.setText("$ Controle de Salário");

        labelname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelname.setText("Nome do Funcionário:");

        inputnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnomeActionPerformed(evt);
            }
        });

        inputsalario.setName(""); // NOI18N
        inputsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputsalarioActionPerformed(evt);
            }
        });

        labelsalario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelsalario.setText("Salário do Vendedor:");

        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        labelfaturamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelfaturamento.setText("Faturamento do Funcionário:");

        inputfaturamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputfaturamentoActionPerformed(evt);
            }
        });

        btnnovo.setText("Novo Funcionário");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        lablefichatitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lablefichatitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lablefichatitle.setText("Ficha do Funcionário");

        labelrespname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelrespname.setText("Nome:");

        labelsalfinal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelsalfinal.setText("Salário Final:");
        labelsalfinal.setAlignmentX(200.0F);

        labelsalfixo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelsalfixo.setText("Salário Fixo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputfaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(title))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputnome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelname)
                                .addComponent(inputsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelsalario)
                                .addComponent(labelfaturamento)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnnovo)
                            .addGap(18, 18, 18)
                            .addComponent(btnenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lablefichatitle, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addComponent(labelsalfixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelrespname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelsalfinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputnome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelsalario)
                        .addGap(11, 11, 11)
                        .addComponent(inputsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelfaturamento))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lablefichatitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelrespname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelsalfixo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelsalfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputfaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnomeActionPerformed
        
        
       
    }//GEN-LAST:event_inputnomeActionPerformed

    private void inputsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputsalarioActionPerformed
      
       
        
       
      
    }//GEN-LAST:event_inputsalarioActionPerformed

    private void inputfaturamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputfaturamentoActionPerformed
         
         
    }//GEN-LAST:event_inputfaturamentoActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        // TODO add your handling code here:
        faturamento =  Float.parseFloat(inputfaturamento.getText());
        finalfat = faturamento*15/100;
        
        salario =  Float.parseFloat(inputsalario.getText());
        finalsal = salario+ finalfat;
        
        
        
        nome = inputnome.getText();
        labelrespname.setText("Nome:"+nome);
        labelsalfixo.setText("Salário Fixo R$:" + salario);
        labelsalfinal.setText(String.valueOf("Salário Final R$:"+finalsal));
    }//GEN-LAST:event_btnenviarActionPerformed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        nome = "";
        salario = 0;
        faturamento = 0; 
        finalfat = 0;
        finalsal = 0;
        
        inputnome.setText("");
        inputsalario.setText("");
        inputfaturamento.setText("");
        
        labelrespname.setText("Nome:");
    }//GEN-LAST:event_btnnovoActionPerformed

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
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnenviar;
    private javax.swing.JButton btnnovo;
    private javax.swing.JTextField inputfaturamento;
    private javax.swing.JTextField inputnome;
    private javax.swing.JTextField inputsalario;
    private javax.swing.JLabel labelfaturamento;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelrespname;
    private javax.swing.JLabel labelsalario;
    private javax.swing.JLabel labelsalfinal;
    private javax.swing.JLabel labelsalfixo;
    private javax.swing.JLabel lablefichatitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}