/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.controladores;

import autores.modelos.GestorAutores;
import interfaces.IControladorPublicaciones;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import palabrasclaves.modelos.ModeloTablaPalabrasClaves;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.GestorPublicaciones;
import publicaciones.modelos.ModeloTablaPublicaciones;
import publicaciones.modelos.Publicacion;
import publicaciones.vistas.VentanaPublicaciones;

/**
 * @author Medina Raed, Luis Eugenio & Mafut, Thomas
 */
public class ControladorPublicaciones implements IControladorPublicaciones{
    private static ControladorPublicaciones instancia;
    private VentanaPublicaciones ventana;

            
    private ControladorPublicaciones(){
        ventana = new VentanaPublicaciones(this);
    }
    
    public static ControladorPublicaciones crear() {
        if(instancia==null){
            instancia = new ControladorPublicaciones();
        }
        return instancia;
    }
    
    public void mostrarVentana(){
        if(ventana == null)
            ventana = new VentanaPublicaciones(this);
        
        ventana.getTablaPublicaciones().setModel(new ModeloTablaPublicaciones());
        
        if(ventana.getTablaPublicaciones().getRowCount() == 0){
            ventana.getBtnBorrar().setEnabled(false);
            ventana.getBtnModificar().setEnabled(false);
            ventana.getBtnBuscar().setEnabled(false);
            ventana.getTxtTitulo().setEnabled(false);
        }
        else{
            ventana.getBtnBorrar().setEnabled(true);
            ventana.getBtnModificar().setEnabled(true);
            ventana.getBtnBuscar().setEnabled(true);
            ventana.getTxtTitulo().setEnabled(true);
        }
        
        ventana.setTitle(TITULO);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        GestorAutores autores = GestorAutores.crear();
        JOptionPane.showMessageDialog(ventana, "Usted esta logueado como: " + autores.verProfesores().get(0).verNombreCompleto() + " (" + autores.verProfesores().get(0).verDni() +")");
    }
    
    public void ocultar(){
        ventana.setVisible(false);
    }

    public VentanaPublicaciones getVentana() {
        return ventana;
    }
    
    public void actualizarTablaPublicaciones(){
        ventana.getTablaPublicaciones().setModel(new ModeloTablaPublicaciones());
        
        if(ventana.getTablaPublicaciones().getRowCount() == 0){
            ventana.getBtnBorrar().setEnabled(false);
            ventana.getBtnModificar().setEnabled(false);
            ventana.getBtnBuscar().setEnabled(false);
            ventana.getTxtTitulo().setEnabled(false);
        }
        else{
            ventana.getBtnBorrar().setEnabled(true);
            ventana.getBtnModificar().setEnabled(true);
            ventana.getBtnBuscar().setEnabled(true);
            ventana.getTxtTitulo().setEnabled(true);
        }
    }
    
    public void filtrarTablaPublicacion(String tituloFiltrar){
        ventana.getTablaPublicaciones().setModel(new ModeloTablaPublicaciones(tituloFiltrar));
        
        if(ventana.getTablaPublicaciones().getRowCount() == 0){
            ventana.getBtnBorrar().setEnabled(false);
            ventana.getBtnModificar().setEnabled(false);
        }
        else{
            ventana.getBtnBorrar().setEnabled(true);
            ventana.getBtnModificar().setEnabled(true);
            ventana.getBtnBuscar().setEnabled(true);
            ventana.getTxtTitulo().setEnabled(true);
        }
    }
    
    @Override
    public void btnNuevaClic(ActionEvent evt) {
        ControladorAMPublicacion nueva = ControladorAMPublicacion.crear();
        nueva.limpiar();
        nueva.mostrarVentana(nueva.TITULO_NUEVA);

    }

    @Override
    public void btnModificarClic(ActionEvent evt) {
        int filaElegida = ventana.getTablaPublicaciones().getSelectedRow();

        if(filaElegida != -1){
            String titulo = (String)ventana.getTablaPublicaciones().getValueAt(filaElegida, 0);

            GestorPublicaciones gPublicaciones = GestorPublicaciones.crear();
            Publicacion publicacionElegida = gPublicaciones.verPublicacion(titulo);

            ControladorAMPublicacion modificar = ControladorAMPublicacion.crear();
            modificar.mostrarVentana(modificar.TITULO_MODIFICAR);
            modificar.getVentana().getTxtTitulo().setText(publicacionElegida.getTitulo());
            GregorianCalendar f = GregorianCalendar.from(publicacionElegida.getFechaPublicacion().atStartOfDay(ZoneId.systemDefault()));
            modificar.getVentana().getSelectorFecha().setCalendar(f);
            modificar.getVentana().getTxtEnlace().setText(publicacionElegida.getEnlace());
            modificar.getVentana().getComboGrupo().setSelectedItem(publicacionElegida.getAutor().verGrupo());
            modificar.getVentana().getComboIdioma().setSelectedItem(publicacionElegida.getIdiomaPublicacion());
            modificar.getVentana().getComboLugar().setSelectedItem(publicacionElegida.getLugarPublicacion());
            modificar.getVentana().getComboTipo().setSelectedItem(publicacionElegida.getTipoPublicacion());
            ModeloTablaPalabrasClaves mt = (ModeloTablaPalabrasClaves)modificar.getVentana().getTablaPalabrasClave().getModel();
            ListSelectionModel modeloSeleccion = modificar.getVentana().getTablaPalabrasClave().getSelectionModel();
            for(PalabraClave palabraClave : publicacionElegida.getPalabrasClaves()) {
                for(int fila = 0; fila < modificar.getVentana().getTablaPalabrasClave().getRowCount(); fila++) {
                    PalabraClave pc = mt.verPalabraClave(fila);
                    if (palabraClave.equals(pc)) {
                        modeloSeleccion.addSelectionInterval(fila, fila);
                        break;
                    }
                }
            }
            modificar.getVentana().getTxtResumen().setText(publicacionElegida.getResumen());
        }
        else{
            JOptionPane.showMessageDialog(ventana, "No ha seleccionado ninguna publicacion");
        }
    }


    @Override
    public void btnBorrarClic(ActionEvent evt) {
        JTable tablaPublicacion = ventana.getTablaPublicaciones();
        int filaElegida = tablaPublicacion.getSelectedRow();
        
        if(filaElegida != -1){
            String[] botones = {"Si", "No"};
            int respuesta = JOptionPane.showOptionDialog(ventana, "¿Desea eliminar la publicacion elegida?", "Elija Una Opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
            
            if(respuesta == 0){
                String tituloElegido = tablaPublicacion.getValueAt(filaElegida, 0).toString();

                GestorPublicaciones publicaciones = GestorPublicaciones.crear();
                Publicacion p = publicaciones.verPublicacion(tituloElegido);
                String resultado = publicaciones.borrarPublicacion(p);

                this.actualizarTablaPublicaciones();
                JOptionPane.showMessageDialog(ventana, resultado);
            }
            else{
                JOptionPane.showMessageDialog(ventana, "Se ha cancelado la operacion");
            }
        }
    }

    @Override
    public void btnVolverClic(ActionEvent evt) {        
        this.ocultar();
    }

    @Override
    public void btnBuscarClic(ActionEvent evt) {
        String tituloBucar = ventana.getTxtTitulo().getText().trim();
        
        filtrarTablaPublicacion(tituloBucar);
    }

    @Override
    public void ventanaObtenerFoco(WindowEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void txtTituloPresionarTecla(KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ventana.getBtnBuscar().doClick();
            
            ventana.getTxtTitulo().setText("");
        }
    }
    
}
