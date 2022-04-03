package POO.TPLAFACULTAD;

public class Main {
    public static void main(String[] args) {
        Facultad UTN = new Facultad("Facultad Regional Resistencia");
        Profesor profesor1 = new Profesor("Facundo", "Matoff", 23, 60000, 6);
        Profesor profesor2 = new Profesor("Facundo", "Uferer", 32, 50000, 4);
        Carrera programacion = new Carrera("Tecnicatura Universitaria en Programacion");
        UTN.agregarCarrera(programacion);

        Materia lab1 = new Materia("Laboratorio de computacion I", profesor2);
        programacion.agregarMateria(lab1);

        Materia prog1 = new Materia("Programacion 1", profesor1);
        programacion.agregarMateria(prog1);


    }
}
