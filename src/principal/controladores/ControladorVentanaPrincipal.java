package principal.controladores;


import autores.controladores.ControladorAutores;
import autores.vistas.VentanaAutores;
import idiomas.controladores.ControladorIdiomas;
import interfaces.IControladorPrincipal;
import principal.vistas.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Thomas Mafut & Luis Medina Raed
 */
public class ControladorVentanaPrincipal implements IControladorPrincipal {
    private static ControladorVentanaPrincipal instancia;
    private VentanaPrincipal ventana;

    /**
     * Constructor
     */
    private ControladorVentanaPrincipal() {
        this.ventana = new VentanaPrincipal(this);
    }

    /**
     * Crea una instancia de ControladorVentanaPrincipal
     */
    public static ControladorVentanaPrincipal crear() {
        if (instancia == null)
            instancia = new ControladorVentanaPrincipal();

        return instancia;
    }

    /**
     * Muestra la ventana
     */
    public void mostrarVentana() {
        if (ventana == null)
            ventana = new VentanaPrincipal(this);
        else
            ventana.setVisible(true);
    }

    /**
     * Oculta la ventana
     */
    public void ocultarVentana() {
        ventana.setVisible(false);
    }

    /**
     * Acción que se ejecuta cuando se selecciona el botón Autores
     *
     * @param evt evento
     */
    @Override
    public void btnIdiomasClic(ActionEvent evt) {
        ControladorIdiomas idiomas = ControladorIdiomas.crear();

        idiomas.mostrarVentana();
    }

    /**
     * Acción que se ejecuta cuando se selecciona el botón Salir
     *
     * @param evt evento
     */
    @Override
    public void btnSalirClic(ActionEvent evt) {
        int opcion = JOptionPane.showOptionDialog(null, CONFIRMACION, TITULO, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, this);
        if (opcion == JOptionPane.YES_OPTION) {
            this.ventana.dispose();
        }
    }
}
