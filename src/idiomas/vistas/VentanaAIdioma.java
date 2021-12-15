/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.vistas;

import interfaces.IControladorAIdiomas;

import javax.swing.*;

/**
 * @author Medina Raed, Luis Eugenio & Mafut, Thomas
 */
public class VentanaAIdioma extends JDialog {
    private final IControladorAIdiomas controlador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNombre;

    public VentanaAIdioma(IControladorAIdiomas controlador) {
        this.controlador = controlador;
        initComponents();
        this.setTitle(IControladorAIdiomas.TITULO);
        this.setLocationRelativeTo(null);
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Idiomas");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        txtNombre.setToolTipText("Ingrese un Idioma");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombrePresionarTecla(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setMnemonic('G');
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClic(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClic(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNombre))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 224, Short.MAX_VALUE)
                                                .addComponent(btnGuardar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCancelar)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnGuardar)
                                        .addComponent(btnCancelar))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClic
        controlador.btnGuardarClic(evt);
    }//GEN-LAST:event_btnGuardarClic

    private void btnCancelarClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClic
        controlador.btnCancelarClic(evt);
    }//GEN-LAST:event_btnCancelarClic

    private void txtNombrePresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePresionarTecla
        // TODO add your handling code here:
        controlador.txtNombrePresionarTecla(evt);
    }//GEN-LAST:event_txtNombrePresionarTecla
    // End of variables declaration//GEN-END:variables
}
