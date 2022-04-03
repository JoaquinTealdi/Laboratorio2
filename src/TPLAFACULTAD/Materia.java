package POO.TPLAFACULTAD;

import java.util.LinkedHashSet;
import java.util.Set;

public class Materia implements Informacion{
    private String nombre;
    private Profesor titular;
    Set<Estudiante> coleccionEstudiantes;

    public Materia (String nombre, Profesor titular){
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedHashSet<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public Set<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(Set<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        this.coleccionEstudiantes.add(estudiante);
    }

    public void eliminarEstudiante(String estudianteEliminado){
        boolean existe = false;
        for (Estudiante nombre : this.coleccionEstudiantes) {
            if(nombre.getNombre() == estudianteEliminado){
                this.coleccionEstudiantes.remove(nombre);
                break;
            }
        }
        if(existe)
            System.out.println("Estudiante eliminado correctamente");
        else
            System.out.println("Estudiante no encontrado");
    }

    public void modificarTitular(Profesor profesor){
        this.titular = profesor;
    }

    @Override
    public int verCantidad() {
        return this.coleccionEstudiantes.size();
    }

    @Override
    public String listarContenidos() {
        System.out.println("Los estudiantes de la materia son:");
        for (Estudiante estudiante: this.coleccionEstudiantes) {
            System.out.println(estudiante.getNombre());
        }
        return "finalizado";
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\ntitular=" + titular + "\nEstudiantes:" + coleccionEstudiantes.size() +"\n" + coleccionEstudiantes;
    }
}
