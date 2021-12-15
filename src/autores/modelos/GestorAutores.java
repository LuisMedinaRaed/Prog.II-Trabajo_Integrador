package autores.modelos;


import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import interfaces.IGestorAutores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Medina Raed, Luis Eugenio & Mafut, Thomas
 */
public class GestorAutores implements IGestorAutores {
    private static final ArrayList<Autor> autores = new ArrayList<>();
    private static GestorAutores gestor;

    /**
     * Constructor
     */
    private GestorAutores() {

    }

    /**
     * Método que permite crear una instancia de GestorAutores
     *
     * @return GestorAutores
     */
    public static GestorAutores crear() {
        if (gestor == null)
            gestor = new GestorAutores();

        return gestor;
    }

    // PROFESOR

    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        Autor nuevoProfesor = new Profesor(dni, apellidos, nombres, clave, cargo);

        if (autores.contains(nuevoProfesor)) {
            return "\n\tEste Autor ya EXISTE!";
        }
        if (dni <= 0) {
            return "\n\tRevise el DNI ingresado";
        }
        if (apellidos == null || apellidos.trim().isEmpty()) {
            return "\n\tRevise los apellidos ingresados";
        }
        if (nombres == null || nombres.trim().isEmpty()) {
            return "\n\tRevise los nombres ingresados";
        }
        if (cargo == null) {
            return "\n\tRevise el cargo ingresado";
        }
        if (!clave.equals(claveRepetida)) {
            return "\n\tLas contraseñas no coinciden!";
        } else {
            autores.add(nuevoProfesor);
            return "\n\tProfesor agregado de forma EXITOSA!";
        }
    }

    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {

        if (existeEsteAutor(autor)) {
            for (Profesor p : verProfesores()) {
                if (p.equals(autor)) {
                    if (apellidos == null || apellidos.trim().isEmpty()) {
                        return "\n\tRevise los apellidos ingresados";
                    }
                    if (nombres == null || nombres.trim().isEmpty()) {
                        return "\n\tRevise los nombres ingresados";
                    }
                    if (cargo == null) {
                        return "\n\tRevise el cargo ingresado";
                    }
                    if (!clave.equals(claveRepetida)) {
                        return "\n\tLas contraseñas no coinciden!";
                    } else {
                        p.asignarApellidos(apellidos);
                        p.asignarNombres(nombres);
                        p.asignarCargo(cargo);
                        p.asignarClave(clave);
                        return "Datos de Profesor modificados de forma EXITOSA!";
                    }
                }

            }
        }
        return "ERROR al modificar los datos de su Profesor!";
    }

    @Override
    public ArrayList<Profesor> verProfesores() {
        ArrayList<Profesor> profesores = new ArrayList<>();

        for (Autor a : autores) {
            if (a instanceof Profesor)
                profesores.add((Profesor) a);
        }
        Collections.sort(profesores, new ComparatorApellidoyNombre());
        return profesores;
    }

    // ALUMNO

    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        Autor nuevoAlumno = new Alumno(dni, apellidos, nombres, clave, cx);

        if (autores.contains(nuevoAlumno)) {
            return "\n\tEste Autor ya EXISTE!";
        }
        if (dni <= 0) {
            return "\n\tRevise el DNI ingresado";
        }
        if (apellidos == null || apellidos.trim().isEmpty()) {
            return "\n\tRevise los apellidos ingresados";
        }
        if (nombres == null || nombres.trim().isEmpty()) {
            return "\n\tRevise los nombres ingresados";
        }
        if (cx == null || cx.trim().isEmpty()) {
            return "\n\tRevise el cargo ingresado";
        }
        if (!clave.equals(claveRepetida)) {
            return "\n\tLas contraseñas no coinciden!";
        } else {
            autores.add(nuevoAlumno);
            return "\n\tAlumno agregado de forma EXITOSA!";
        }
    }

    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        if (existeEsteAutor(autor)) {
            for (Alumno a : verAlumnos()) {
                if (a.equals(autor)) {
                    if (apellidos == null || apellidos.trim().isEmpty()) {
                        return "\n\tRevise los apellidos ingresados";
                    }
                    if (nombres == null || nombres.trim().isEmpty()) {
                        return "\n\tRevise los nombres ingresados";
                    }
                    if (cx == null || cx.trim().isEmpty()) {
                        return "\n\tRevise el cargo ingresado";
                    }
                    if (!clave.equals(claveRepetida)) {
                        return "\n\tLas contraseñas no coinciden!";
                    } else {
                        a.asignarApellidos(apellidos);
                        a.asignarNombres(nombres);
                        a.asignarCx(cx);
                        a.asignarClave(clave);
                        return "Datos del Alumno modificados de forma EXITOSA!";
                    }
                }

            }
        }
        return "ERROR al modificar los datos de su Alumno!";
    }

    @Override
    public ArrayList<Alumno> verAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        for (Autor a : autores) {
            if (a instanceof Alumno)
                alumnos.add((Alumno) a);
        }
        Collections.sort(alumnos, new ComparatorApellidoyNombre());
        return alumnos;
    }

    @Override
    public boolean existeEsteAutor(Autor autor) {
        if (autor == null)
            return false;
        else {
            for (Autor a : autores) {
                if (a.equals(autor))
                    return true;
            }
            return false;
        }
    }

    @Override
    public ArrayList<Autor> verAutores() {
        Collections.sort(autores, new ComparatorApellidoyNombre());
        return autores;
    }

    @Override
    public Autor verAutor(int dni) {
        for (Autor a : autores) {
            if (a.verDni() == dni)
                return a;
        }
        return null;
    }

    @Override
    public boolean hayAutoresConEsteGrupo(Grupo grupo) {
        return false;
    }

    @Override
    public String borrarAutor(Autor dni) {
        if (this.existeEsteAutor(dni)) {
            autores.remove(dni);
            return "Autor removido con EXITO!";
        }
        return "Autor Inexistente!";
    }

    @Override
    public String agregarGrupos(Autor autor, List<MiembroEnGrupo> grupos) {
        return null;
    }

    @Override
    public String quitarGrupos(Autor autor, List<MiembroEnGrupo> grupos) {
        return null;
    }

    @Override
    public ArrayList<Alumno> buscarAlumnos(String apellidos) {
        ArrayList<Alumno> alumnosBuscados = new ArrayList<>();
        if (apellidos != null) {
            for (Autor autor : autores) {
                if (autor instanceof Alumno) {
                    if (autor.verApellidos().toLowerCase().contains(apellidos.toLowerCase()))
                        alumnosBuscados.add((Alumno) autor);
                }
            }
        }
        Collections.sort(alumnosBuscados, new ComparatorApellidoyNombre());
        return alumnosBuscados;
    }

    @Override
    public ArrayList<Profesor> buscarProfesores(String apellidos) {
        ArrayList<Profesor> profesoresBuscados = new ArrayList<>();
        if (apellidos != null) {
            for (Autor autor : autores) {
                if (autor instanceof Profesor) {
                    if (autor.verApellidos().toLowerCase().contains(apellidos.toLowerCase()))
                        profesoresBuscados.add((Profesor) autor);
                }
            }
        }
        Collections.sort(profesoresBuscados, new ComparatorApellidoyNombre());
        return profesoresBuscados;
    }


    public void mostrarProfesores() {
        if (!verProfesores().isEmpty()) {
            for (Profesor a : verProfesores())
                a.mostrar();
        }
    }


    public void mostrarAutores() {
        if (!verAutores().isEmpty())
            for (Autor a : autores)
                a.mostrar();
    }

    public void mostrarAlumnos() {
        if (!verAlumnos().isEmpty()) {
            for (Alumno a : verAlumnos())
                a.mostrar();
        }
    }
}

