package TrabajoGrupal;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;

    Object[]  espectadores;
    //constructor
    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getPelicula() {
        return this.pelicula;
    }

    public String getNombre() { return this.nombre;}

    public int getCapacidad() {
        return this.capacidad;
    }

    public Object getEspectadores(){ return espectadores;}

    //toString propio de la clase Sala
    @Override
    public String toString() {
        return "Capacidad=" + capacidad +"\t"+ "Pelicula:"+ pelicula + "\t"+"Nombre:"+ nombre;
    }
}


