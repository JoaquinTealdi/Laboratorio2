package TrabajoGrupal;

public class Acomodadores extends Empleados implements ParaAcomodadores {
    String sala;
    double sueldo;

    //constructor
    public Acomodadores(String nombre, int edad) { //, double sueldo
        super(nombre, edad); //, sueldo
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTipo() {
        return "Acomodador";
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Sueldo: " + sueldo + "\n" + "Sala: " + sala;
    }

    public void setSala(Salas sala) {
    }

    public String getSala() {
        return this.sala;
    }
}

/*public  class Acomodadores implements ParaAcomodador{

}*/