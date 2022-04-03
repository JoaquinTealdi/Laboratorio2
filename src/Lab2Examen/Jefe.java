package Lab2Examen;

public class Jefe extends Persona {
    private double porcentaje;

    public Jefe(String nombre, String apellido, int dni, double sueldoBasico, double porcentaje) {
        super(nombre, apellido, dni, sueldoBasico);
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void subirSueldo(double incremento) {
        double monto = super.getSueldoBasico() + incremento + super.getSueldoBasico() * this.porcentaje;
        this.setSueldoBasico(monto);
    }

    @Override
    public double verSueldo() {
        double monto = super.getSueldoBasico() + super.getSueldoBasico() * this.porcentaje;
        return monto;
    }

    @Override
    public String toString() {
        return "jefe :" + super.toString() + "porcentaje = " + porcentaje;
    }
}
