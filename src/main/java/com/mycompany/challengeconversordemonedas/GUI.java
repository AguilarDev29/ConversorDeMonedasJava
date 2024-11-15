package com.mycompany.challengeconversordemonedas;

import java.awt.Color;
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
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConversion.setBackground(new java.awt.Color(51, 51, 51));
        btnConversion.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnConversion.setForeground(new java.awt.Color(255, 255, 255));
        btnConversion.setText("Convertir");
        btnConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 110, 50));

        cbDivisa1.setBackground(new java.awt.Color(204, 255, 204));
        cbDivisa1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        cbDivisa1.setForeground(new java.awt.Color(0, 0, 0));
        cbDivisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar estadounidense - USD", "Euro - EUR", "Yen japonés - JPY", "Libra esterlina - GBP", "Dólar australiano - AUD", "Dólar canadiense - CAD", "Franco suizo - CHF   ", "Yuan chino - CNY", "Peso Mexicano - MXN", "Real Brasileño - BRL", "Peso Argentino - ARS", "Peso Chileno - CLP", "Peso Colombiano - COP", "Sol Peruano - PEN", "Peso Uruguayo - UYU", "Bolívar Soberano - VEF", "Córdoba Oro Nicaragüense - NIO" }));
        cbDivisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDivisa1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbDivisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 240, 40));

        cbDivisa2.setBackground(new java.awt.Color(204, 255, 204));
        cbDivisa2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        cbDivisa2.setForeground(new java.awt.Color(0, 0, 0));
        cbDivisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar estadounidense - USD", "Euro - EUR", "Yen japonés - JPY", "Libra esterlina - GBP", "Dólar australiano - AUD", "Dólar canadiense - CAD", "Franco suizo - CHF   ", "Yuan chino - CNY", "Peso Mexicano - MXN", "Real Brasileño - BRL", "Peso Argentino - ARS", "Peso Chileno - CLP", "Peso Colombiano - COP", "Sol Peruano - PEN", "Peso Uruguayo - UYU", "Bolívar Soberano - VEF", "Córdoba Oro Nicaragüense - NIO" }));
        jPanel1.add(cbDivisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 240, 40));

        txtMonto1.setBackground(new java.awt.Color(204, 255, 204));
        txtMonto1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtMonto1.setForeground(new java.awt.Color(0, 0, 0));
        txtMonto1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtMonto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 190, 40));

        txtMonto2.setBackground(new java.awt.Color(204, 255, 204));
        txtMonto2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtMonto2.setForeground(new java.awt.Color(0, 0, 0));
        txtMonto2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMonto2.setEnabled(false);
        txtMonto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonto2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 190, 40));

        btnInvertir.setBackground(new java.awt.Color(51, 51, 51));
        btnInvertir.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnInvertir.setForeground(new java.awt.Color(255, 255, 255));
        btnInvertir.setText("Invertir");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });
        jPanel1.add(btnInvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 110, 50));

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 80, 40));

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtMonto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonto2ActionPerformed

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
