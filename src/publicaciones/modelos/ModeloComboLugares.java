/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import interfaces.IGestorLugares;
import lugares.modelos.GestorLugares;
import lugares.modelos.Lugar;

import javax.swing.*;

/**
 * @author Medina Raed, Luis Eugenio & Mafut, Thomas
 */
public class ModeloComboLugares extends DefaultComboBoxModel {

    public ModeloComboLugares() {
        IGestorLugares gesLugares = GestorLugares.crear();
        for (Lugar lugar : gesLugares.verLugares()) {
            this.addElement(lugar);
        }
    }

    public Lugar obtenerLugar() {
        return (Lugar) this.getSelectedItem();
    }

}
