package POO.TPLAFACULTAD;

import java.util.LinkedHashSet;
import java.util.Set;

public class Facultad implements Informacion {
    private String nombre;
    Set<Carrera> coleccionCarreras;

    public Facultad (String nombre){
        this.nombre = nombre;
        this.coleccionCarreras = new LinkedHashSet<Carrera>();
    }

    public void agregarCarrera(Carrera carrera){
        coleccionCarreras.add(carrera);
    }

    public void eliminarCarrera(String nombre){
        for (Carrera i : this.coleccionCarreras) {
            boolean existe = false;
            if (nombre.equals(i.getNombre())) {
                this.coleccionCarreras.remove(i);
                existe = true;
                break;
            }
            if (existe){
                System.out.println("Carrera eliminada correctamente");
            }else{
                System.out.println("Carrera no encontrada");
            }
        }
    }

    public void eliminarEstudiante(Estudiante estudianteEliminado){
        boolean existe = false;
        for (Carrera carrera: this.coleccionCarreras) {
            for (Materia materia: carrera.getColeccionMaterias()) {
                for (Estudiante estudiante: materia.getColeccionEstudiantes()) {
                    if (estudiante == estudianteEliminado){
                        materia.coleccionEstudiantes.remove(estudiante);
                        existe = true;
                        break;
                    }
                }
            }
        }
        if(existe)
            System.out.println("Estudiante eliminado correctamente");
        else
            System.out.println("Estudiante no encontrado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(Set<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    @Override
    public int verCantidad() {
        return this.coleccionCarreras.size();
    }

    @Override
    public String listarContenidos() {
        System.out.println("La lista de las carreras de la Facultad es: ");
        for (Carrera carreras: this.coleccionCarreras) {
            System.out.println(carreras.getNombre());
        }
        return "finalizado";
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\nCarreras: " + coleccionCarreras.size()+ "\n" + coleccionCarreras;
    }
}
