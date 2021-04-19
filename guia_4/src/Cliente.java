import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Cliente {

    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private ArrayList<Alquiler> alquileres; //also hashset?

    ////////////////// CONSTRUCTORES
    public Cliente() {
        this.setId();
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.direccion = "";
        this.alquileres = new ArrayList<>();
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion, ArrayList<Alquiler> alquileres) {
        this.setId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.alquileres = alquileres;
    }

    ////////////////// GETTERS

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
/*
    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }
*/
    public String getAlquileres() {
    return alquileres.toString();
}

    ////////////////// SETTERS

    private void setId() {
        UUID aux_id = UUID.randomUUID();
      this.id = aux_id.toString().substring(0, 4);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    ////////////////// OTROS
    ////////////////// OVERRIDDEN

    @Override
    public String toString() {
        return "Cliente" + getId() + '\n' +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Teléfono: " + telefono + '\n' +
                "Dirección: " + direccion + '\n' +
                "Alquileres: " + getAlquileres().toString() + "\n\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return getId().equals(cliente.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
