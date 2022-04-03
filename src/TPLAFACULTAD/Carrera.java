package POO.TPLAFACULTAD;

import java.util.LinkedHashSet;
import java.util.Set;

public class Carrera implements Informacion {
    private String nombre;
    private Set<Materia> coleccionMaterias;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedHashSet<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(Set<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void agregarMateria(Materia materia) {
        coleccionMaterias.add(materia);
    }

    public void eliminarMaterias(String nombreMateria) {
        boolean existe = false;
        for (Materia nombre : this.coleccionMaterias) {
            if (nombreMateria == nombre.getNombre()) {
                this.coleccionMaterias.remove(nombre);
                existe = true;
                break;
            }
        }
        if (existe)
            System.out.println("Materia eliminada correctamente");
        else
            System.out.println("Materia no encontrada");
    }


    public void encontrarMateria(String nombreDMateria) {
        boolean existe = false;
        for (Materia nombre : this.coleccionMaterias) {
            if (nombre.getNombre() == nombreDMateria) {
                existe = true;
                break;
            }
        }
        if (existe)
            System.out.println("Materia encontrada");
        else
            System.out.println("Materia no encontrada");
    }

    @Override
    public int verCantidad() {
        return this.coleccionMaterias.size();
    }

    @Override
    public String listarContenidos() {
        System.out.println("Nombres de las materias pertenencientes a la carrera: ");
        for (Materia i : this.coleccionMaterias) {
            System.out.println(i.getNombre());
        }
        return "finalizado";
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\nMaterias: " + coleccionMaterias.size() + "\n" + coleccionMaterias;
    }
}
