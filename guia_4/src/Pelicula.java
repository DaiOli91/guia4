import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Pelicula {
    private UUID id;
    private String titulo;
    private String pais;
    private LocalDate fechaLanzamiento;
    private String descripcion;
    private int duracion;
    private Audiencia clasificacion;
    private Genero genero;

    ////////////////// CONSTRUCTORES
    public Pelicula() {
        this.setId();
        this.titulo = titulo;
        this.pais = pais;
        this.fechaLanzamiento = fechaLanzamiento;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.genero = genero;
    }

    public Pelicula(String titulo, String pais, LocalDate fechaLanzamiento, String descripcion, int duracion, Audiencia clasificacion, Genero genero) {
        this.setId();
        this.titulo = titulo;
        this.pais = pais;
        this.fechaLanzamiento = fechaLanzamiento;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.genero = genero;
    }

    ////////////////// GETTERS

    public String getId() {
        return id.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPais() {
        return pais;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public Audiencia getClasificacion() {
        return clasificacion;
    }

    public Genero getGenero() {
        return genero;
    }

    ////////////////// SETTERS

    private void setId() {
        this.id = UUID.randomUUID();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setClasificacion(Audiencia clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    ////////////////// OTROS
    ////////////////// OVERRIDDEN

    @Override
    public String toString() {
        return "Pelicula " + getId() + '\n' +
                "Título: " + titulo + '\n' +
                "Pais" + pais + '\n' +
                "Fecha Lanzamiento: " + fechaLanzamiento + '\n' +
                "Descripción: " + descripcion + '\n' +
                "Duración en minutos: " + duracion + '\n' +
                "Clasificación" + clasificacion + '\n' +
                "Género: " + genero + "\n\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelicula)) return false;
        Pelicula pelicula = (Pelicula) o;
        return getId().equals(pelicula.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
