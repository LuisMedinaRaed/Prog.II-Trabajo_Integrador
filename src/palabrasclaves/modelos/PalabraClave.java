package palabrasclaves.modelos;

import java.util.Objects;

/**
 * @author Medina Raed, Luis Eugenio & Mafut, Thomas
 */
public class PalabraClave {
    // Variables de instancia
    private String nombre;

    // Constructor
    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public void mostrarPalabraClave() {
        System.out.println(this.nombre);
    }

    public String toString() {
        return nombre;
    }

    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PalabraClave other = (PalabraClave) obj;
        return this.nombre.trim().equalsIgnoreCase(other.nombre.trim());
    }

    // Getters & Setters
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
}
