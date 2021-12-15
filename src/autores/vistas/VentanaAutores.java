/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.vistas;

import autores.modelos.ModeloTablaAlumnos;
import autores.modelos.ModeloTablaProfesor;
import interfaces.IControladorAutores;

import javax.swing.*;

/**
 * @author Medina Raed, Luis Eugenio & Mafut, Thomas
 */
public class VentanaAutores extends JDialog {

    private final ModeloTablaAlumnos modeloAlumno = new ModeloTablaAlumnos();
    private final ModeloTablaProfesor modeloProfesor = new ModeloTablaProfesor();
    private IControladorAutores controlador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarAlumno;
    private javax.swing.JButton btnBorrarProfesor;
    private javax.swing.JButton btnBuscarAlumno;
    private javax.swing.JButton btnBuscarProfesor;
    private javax.swing.JButton btnModificarAlumno;
    private javax.swing.JButton btnModificarProfesor;
    private javax.swing.JButton btnNuevoAlumno;
    private javax.swing.JButton btnNuevoProfesor;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTable tablaProfesores;
    private javax.swing.JTextField txtApellidosAlumno;
    private javax.swing.JTextField txtApellidosProfesor;

    public VentanaAutores(IControladorAutores controlador) {
        initComponents();
        this.controlador = controlador;
        this.setTitle(controlador.TITULO);
        this.tablaAlumnos.setModel(modeloAlumno);
        if (this.tablaAlumnos.getRowCount() == 0) {
            this.btnModificarAlumno.setEnabled(false);
            this.btnBorrarAlumno.setEnabled(false);
        } else {
            this.btnModificarAlumno.setEnabled(true);
            this.btnBorrarAlumno.setEnabled(true);
        }
        this.tablaProfesores.setModel(modeloProfesor);
        if (this.tablaProfesores.getRowCount() == 0) {
            this.btnModificarProfesor.setEnabled(false);
            this.btnBorrarProfesor.setEnabled(false);
        } else {
            this.btnModificarProfesor.setEnabled(true);
            this.btnBorrarProfesor.setEnabled(true);
        }
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtApellidosProfesor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarProfesor = new javax.swing.JButton();
        btnNuevoProfesor = new javax.swing.JButton();
        btnModificarProfesor = new javax.swing.JButton();
        btnBorrarProfesor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtApellidosAlumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarAlumno = new javax.swing.JButton();
        btnNuevoAlumno = new javax.swing.JButton();
        btnModificarAlumno = new javax.swing.JButton();
        btnBorrarAlumno = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTabbedPane1.setInheritsPopupMenu(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtApellidosProfesor.setFont(new java.awt.Font("SF UI  Text", 0, 11)); // NOI18N
        txtApellidosProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosProfesorKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Apellidos: ");

        btnBuscarProfesor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscarProfesor.setText("Buscar");
        btnBuscarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProfesorActionPerformed(evt);
            }
        });

        btnNuevoProfesor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNuevoProfesor.setText("Nuevo");
        btnNuevoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProfesorActionPerformed(evt);
            }
        });

        btnModificarProfesor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificarProfesor.setText("Modificar");
        btnModificarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProfesorActionPerformed(evt);
            }
        });

        btnBorrarProfesor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBorrarProfesor.setText("Borrar");
        btnBorrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProfesorActionPerformed(evt);
            }
        });

        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "DNI", "Apellidos", "Nombres", "Cargos"
                }
        ));
        tablaProfesores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProfesores);
        if (tablaProfesores.getColumnModel().getColumnCount() > 0) {
            tablaProfesores.getColumnModel().getColumn(0).setResizable(false);
            tablaProfesores.getColumnModel().getColumn(1).setResizable(false);
            tablaProfesores.getColumnModel().getColumn(2).setResizable(false);
            tablaProfesores.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtApellidosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBuscarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnNuevoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnModificarProfesor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnBorrarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtApellidosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(btnBuscarProfesor))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnNuevoProfesor)
                                        .addComponent(btnModificarProfesor)
                                        .addComponent(btnBorrarProfesor))
                                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Profesores", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtApellidosAlumno.setFont(new java.awt.Font("SF UI  Text", 0, 11)); // NOI18N
        txtApellidosAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosAlumnoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Apellidos: ");

        btnBuscarAlumno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscarAlumno.setText("Buscar");
        btnBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnoActionPerformed(evt);
            }
        });

        btnNuevoAlumno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNuevoAlumno.setText("Nuevo");
        btnNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAlumnoActionPerformed(evt);
            }
        });

        btnModificarAlumno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificarAlumno.setText("Modificar");
        btnModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlumnoActionPerformed(evt);
            }
        });

        btnBorrarAlumno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBorrarAlumno.setText("Borrar");
        btnBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlumnoActionPerformed(evt);
            }
        });

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "DNI", "Apellidos", "Nombres", "Cargos"
                }
        ));
        tablaAlumnos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaAlumnos);
        if (tablaAlumnos.getColumnModel().getColumnCount() > 0) {
            tablaAlumnos.getColumnModel().getColumn(0).setResizable(false);
            tablaAlumnos.getColumnModel().getColumn(1).setResizable(false);
            tablaAlumnos.getColumnModel().getColumn(2).setResizable(false);
            tablaAlumnos.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtApellidosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBuscarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnNuevoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnModificarAlumno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtApellidosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(btnBuscarAlumno))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnNuevoAlumno)
                                        .addComponent(btnModificarAlumno)
                                        .addComponent(btnBorrarAlumno))
                                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Alumnos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVolver)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProfesorActionPerformed
        // TODO add your handling code here:
        controlador.btnBuscarProfesorClic(evt);
    }//GEN-LAST:event_btnBuscarProfesorActionPerformed

    private void btnNuevoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProfesorActionPerformed
        // TODO add your handling code here:
        controlador.btnNuevoProfesorClic(evt);
    }//GEN-LAST:event_btnNuevoProfesorActionPerformed

    private void btnModificarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProfesorActionPerformed
        // TODO add your handling code here:
        controlador.btnModificarProfesorClic(evt);
    }//GEN-LAST:event_btnModificarProfesorActionPerformed

    private void btnBorrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProfesorActionPerformed
        // TODO add your handling code here:
        controlador.btnBorrarProfesorClic(evt);
    }//GEN-LAST:event_btnBorrarProfesorActionPerformed

    private void btnBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnoActionPerformed
        // TODO add your handling code here:
        controlador.btnBuscarAlumnoClic(evt);
    }//GEN-LAST:event_btnBuscarAlumnoActionPerformed

    private void btnNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAlumnoActionPerformed
        // TODO add your handling code here:
        controlador.btnNuevoAlumnoClic(evt);
    }//GEN-LAST:event_btnNuevoAlumnoActionPerformed

    private void btnModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlumnoActionPerformed
        // TODO add your handling code here:
        controlador.btnModificarAlumnoClic(evt);
    }//GEN-LAST:event_btnModificarAlumnoActionPerformed

    private void btnBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlumnoActionPerformed
        // TODO add your handling code here:
        controlador.btnBorrarAlumnoClic(evt);
    }//GEN-LAST:event_btnBorrarAlumnoActionPerformed

    private void txtApellidosProfesorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosProfesorKeyPressed
        // TODO add your handling code here:
        controlador.txtApellidosProfesorPresionarTecla(evt);
    }//GEN-LAST:event_txtApellidosProfesorKeyPressed

    private void txtApellidosAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosAlumnoKeyPressed
        // TODO add your handling code here:
        controlador.txtApellidosAlumnoPresionarTecla(evt);
    }//GEN-LAST:event_txtApellidosAlumnoKeyPressed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        controlador.btnVolverClic(evt);
    }//GEN-LAST:event_btnVolverActionPerformed

    public IControladorAutores getControlador() {
        return controlador;
    }

    public void setControlador(IControladorAutores controlador) {
        this.controlador = controlador;
    }

    public JButton getBtnBorrarAlumno() {
        return btnBorrarAlumno;
    }

    public void setBtnBorrarAlumno(JButton btnBorrarAlumno) {
        this.btnBorrarAlumno = btnBorrarAlumno;
    }

    public JButton getBtnBorrarProfesor() {
        return btnBorrarProfesor;
    }

    public void setBtnBorrarProfesor(JButton btnBorrarProfesor) {
        this.btnBorrarProfesor = btnBorrarProfesor;
    }

    public JButton getBtnBuscarAlumno() {
        return btnBuscarAlumno;
    }

    public void setBtnBuscarAlumno(JButton btnBuscarAlumno) {
        this.btnBuscarAlumno = btnBuscarAlumno;
    }

    public JButton getBtnBuscarProfesor() {
        return btnBuscarProfesor;
    }

    public void setBtnBuscarProfesor(JButton btnBuscarProfesor) {
        this.btnBuscarProfesor = btnBuscarProfesor;
    }

    public JButton getBtnModificarAlumno() {
        return btnModificarAlumno;
    }

    public void setBtnModificarAlumno(JButton btnModificarAlumno) {
        this.btnModificarAlumno = btnModificarAlumno;
    }

    public JButton getBtnModificarProfesor() {
        return btnModificarProfesor;
    }

    public void setBtnModificarProfesor(JButton btnModificarProfesor) {
        this.btnModificarProfesor = btnModificarProfesor;
    }

    public JButton getBtnNuevoAlumno() {
        return btnNuevoAlumno;
    }

    public void setBtnNuevoAlumno(JButton btnNuevoAlumno) {
        this.btnNuevoAlumno = btnNuevoAlumno;
    }

    public JButton getBtnNuevoProfesor() {
        return btnNuevoProfesor;
    }

    public void setBtnNuevoProfesor(JButton btnNuevoProfesor) {
        this.btnNuevoProfesor = btnNuevoProfesor;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JTable getTablaAlumnos() {
        return tablaAlumnos;
    }

    public void setTablaAlumnos(JTable tablaAlumnos) {
        this.tablaAlumnos = tablaAlumnos;
    }

    public JTable getTablaProfesores() {
        return tablaProfesores;
    }

    public void setTablaProfesores(JTable tablaProfesores) {
        this.tablaProfesores = tablaProfesores;
    }

    public JTextField getTxtApellidosAlumno() {
        return txtApellidosAlumno;
    }

    public void setTxtApellidosAlumno(JTextField txtApellidosAlumno) {
        this.txtApellidosAlumno = txtApellidosAlumno;
    }

    public JTextField getTxtApellidosProfesor() {
        return txtApellidosProfesor;
    }

    public void setTxtApellidosProfesor(JTextField txtApellidosProfesor) {
        this.txtApellidosProfesor = txtApellidosProfesor;
    }
    // End of variables declaration//GEN-END:variables
}
