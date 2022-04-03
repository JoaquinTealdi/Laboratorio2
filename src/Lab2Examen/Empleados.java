package Lab2Examen;

public class Empleados extends Persona {
    public Empleados(String nombre, String apellido, int dni, double sueldoBasico) {
        super(nombre, apellido, dni, sueldoBasico);
    }

    @Override
    public void subirSueldo(double incremento) {
        double monto = incremento + super.getSueldoBasico();
        super.setSueldoBasico(monto);
    }

    @Override
    public double verSueldo() {
        return super.getSueldoBasico();
    }

    @Override
    public String toString() {
        return "Empleados " + super.toString();
    }
}
