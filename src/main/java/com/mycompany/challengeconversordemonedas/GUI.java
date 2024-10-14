package com.mycompany.challengeconversordemonedas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConversion = new javax.swing.JButton();
        cbDivisa1 = new javax.swing.JComboBox<>();
        cbDivisa2 = new javax.swing.JComboBox<>();
        txtMonto1 = new javax.swing.JTextField();
        txtMonto2 = new javax.swing.JTextField();
        btnInvertir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConversion.setText("Convertir");
        btnConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversionActionPerformed(evt);
            }
        });

        cbDivisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar estadounidense - USD", "Euro - EUR", "Yen japonés - JPY", "Libra esterlina - GBP", "Dólar australiano - AUD", "Dólar canadiense - CAD", "Franco suizo - CHF   ", "Yuan chino - CNY", "Peso Mexicano - MXN", "Real Brasileño - BRL", "Peso Argentino - ARS", "Peso Chileno - CLP", "Peso Colombiano - COP", "Sol Peruano - PEN", "Peso Uruguayo - UYU", "Bolívar Soberano - VEF", "Córdoba Oro Nicaragüense - NIO" }));
        cbDivisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDivisa1ActionPerformed(evt);
            }
        });

        cbDivisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar estadounidense - USD", "Euro - EUR", "Yen japonés - JPY", "Libra esterlina - GBP", "Dólar australiano - AUD", "Dólar canadiense - CAD", "Franco suizo - CHF   ", "Yuan chino - CNY", "Peso Mexicano - MXN", "Real Brasileño - BRL", "Peso Argentino - ARS", "Peso Chileno - CLP", "Peso Colombiano - COP", "Sol Peruano - PEN", "Peso Uruguayo - UYU", "Bolívar Soberano - VEF", "Córdoba Oro Nicaragüense - NIO" }));

        txtMonto2.setEnabled(false);
        txtMonto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonto2ActionPerformed(evt);
            }
        });

        btnInvertir.setText("Invertir");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbDivisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInvertir)
                        .addGap(66, 66, 66)
                        .addComponent(btnConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbDivisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(cbDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cbDivisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDivisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDivisa1ActionPerformed

    private void btnConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversionActionPerformed
        Datos datos;
        String monto;
        String moneda1 = Convertidor.extraerCodigo(String.valueOf(cbDivisa1.getSelectedItem()));
        String moneda2 = Convertidor.extraerCodigo(String.valueOf(cbDivisa2.getSelectedItem()));
        String texto;
        if(txtMonto1.isEnabled()){
            datos = Convertidor.convertirDesdeJson(moneda1, moneda2, Double.parseDouble(txtMonto1.getText()));
            monto = String.valueOf(datos.conversionResult());
            txtMonto2.setText("$" + String.valueOf(monto));
            texto = "$" + txtMonto1.getText() + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
            try {
                Convertidor.historialConsultas(texto);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(txtMonto2.isEnabled()){
            datos = Convertidor.convertirDesdeJson(moneda2, moneda1, Double.parseDouble(txtMonto2.getText()));
            monto = String.valueOf(datos.conversionResult());
            txtMonto1.setText("$" + String.valueOf(monto));
            texto = "$" + txtMonto2.getText() + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
            try {
                Convertidor.historialConsultas(texto);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConversionActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        if(txtMonto1.isEnabled()){
            int aux = cbDivisa1.getSelectedIndex();
            txtMonto1.setEnabled(false);
            txtMonto2.setEnabled(true);
            cbDivisa1.setSelectedIndex(cbDivisa2.getSelectedIndex());
            cbDivisa2.setSelectedIndex(aux);
            txtMonto1.setText(null);
            txtMonto2.setText(null);
        }else{
            int aux = cbDivisa1.getSelectedIndex();
            txtMonto1.setEnabled(true);
            txtMonto2.setEnabled(false);
            cbDivisa1.setSelectedIndex(cbDivisa2.getSelectedIndex());
            cbDivisa2.setSelectedIndex(aux);
            txtMonto1.setText(null);
            txtMonto2.setText(null);
        }
        
    }//GEN-LAST:event_btnInvertirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtMonto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonto2ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConversion;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnSalir;
    public javax.swing.JComboBox<String> cbDivisa1;
    public javax.swing.JComboBox<String> cbDivisa2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtMonto1;
    public javax.swing.JTextField txtMonto2;
    // End of variables declaration//GEN-END:variables
}
