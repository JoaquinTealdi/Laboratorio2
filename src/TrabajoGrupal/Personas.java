package TrabajoGrupal;

public abstract class Personas {
    //atributos
    String nombre;
    int edad;
    //constructor generico
    public Personas(){
    
    }

    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract String getTipo();

    //ToString
    @Override
    public abstract String toString();
}
