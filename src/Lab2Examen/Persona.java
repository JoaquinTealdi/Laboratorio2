package Lab2Examen;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private double sueldoBasico;

    public Persona(String nombre, String apellido, int dni, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        System.out.println("se ha creado una persona: " + nombre + apellido + dni + sueldoBasico);
    }

    public String modificarDatos(String nombre, String apellido, int dni) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
        return "modficacion de datos" + this.nombre + this.apellido + this.dni;
    }

    public abstract void subirSueldo(double incremento);

    public abstract double verSueldo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "Persona " + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico;
    }
}
