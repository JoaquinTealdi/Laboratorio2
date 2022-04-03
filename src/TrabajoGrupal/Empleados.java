package TrabajoGrupal;

public class Empleados extends Personas {
    //atributos
    private double sueldo;

    //contructor
    public Empleados(String nombre, int edad){
        super.nombre = nombre;
        super.edad = edad;
    }

    //setter
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }
    public String getTipo(){
        return "Empleado";
    }

    public String nombreCompleto(){
        return super.nombre + super.edad;
    }

    public String toString() {
        return "\n" + "Nombre: " + super.nombre + "\n" + "Edad: " + super.edad + "\n" + "Sueldo: " + sueldo + "\n";
    }
}
