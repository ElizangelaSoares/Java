/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerandoCPF;

import java.util.InputMismatchException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elizangela
 */
public class JFrameCPF extends javax.swing.JFrame {
    
    

    /**
     * Creates new form JFrameCPF
     */
    public JFrameCPF() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelCPF = new javax.swing.JLabel();
        jButtonCPF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        LabelCPF1 = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        LabelDigitaCPF = new javax.swing.JLabel();
        jButtonVerificaCPF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaVerificaCPF = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LabelCPF.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        LabelCPF.setForeground(new java.awt.Color(204, 204, 204));
        LabelCPF.setText("Gerador de CPF");

        jButtonCPF.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonCPF.setText("GERAR CPF");
        jButtonCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCPFActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Validando"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
        }

        LabelCPF1.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        LabelCPF1.setForeground(new java.awt.Color(204, 204, 204));
        LabelCPF1.setText("Verificar CPF");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LabelDigitaCPF.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        LabelDigitaCPF.setText("Digite o CPF");

        jButtonVerificaCPF.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonVerificaCPF.setText("VERIFICAR");
        jButtonVerificaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificaCPFActionPerformed(evt);
            }
        });

        tabelaVerificaCPF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF Digitado", "Verificando CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaVerificaCPF);
        if (tabelaVerificaCPF.getColumnModel().getColumnCount() > 0) {
            tabelaVerificaCPF.getColumnModel().getColumn(0).setResizable(false);
            tabelaVerificaCPF.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(LabelCPF)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jButtonVerificaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelDigitaCPF)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(LabelCPF1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCPF)
                .addGap(51, 51, 51)
                .addComponent(jButtonCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelCPF1)
                .addGap(32, 32, 32)
                .addComponent(LabelDigitaCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldCPF)
                    .addComponent(jButtonVerificaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(464, 464, 464))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(478, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCPFActionPerformed
        // TODO add your handling code here:
        GeraCPF gerador = new GeraCPF();
        String CPF = gerador.CPF();
        String v;
        
        
        if (gerador.validaCPF(CPF) == true){
            v = "CPF Válido";
        } else {
            v = "CPF Inválido";
        }
        
            DefaultTableModel model = (DefaultTableModel) tabela.getModel(); 
            model.setRowCount(0);
            model.addRow(new Object[] {(CPF),(v)});
    }//GEN-LAST:event_jButtonCPFActionPerformed

    private void jButtonVerificaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificaCPFActionPerformed
        // TODO add your handling code here:
        GeraCPF gerador = new GeraCPF();
        String CPF = jFormattedTextFieldCPF.getText();
        String v;
        
        
        if (gerador.validaCPF(CPF) == true){
            v = "CPF Válido";
        } else {
            v = "CPF Inválido";
        }
        
            DefaultTableModel model = (DefaultTableModel) tabelaVerificaCPF.getModel(); 
            model.setRowCount(0);
            model.addRow(new Object[] {(CPF),(v)});
        
    }//GEN-LAST:event_jButtonVerificaCPFActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCPF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCPF;
    private javax.swing.JLabel LabelCPF1;
    private javax.swing.JLabel LabelDigitaCPF;
    private javax.swing.JButton jButtonCPF;
    private javax.swing.JButton jButtonVerificaCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelaVerificaCPF;
    // End of variables declaration//GEN-END:variables
}
