import java.time.LocalDate;
import java.util.*;

public class VideoStore {
    private HashMap<String, Cliente> clientes;
    private ArrayList<Pelicula> peliculas;
    private HashSet<Alquiler> alquileres;

    ////////////////// CONSTRUCTORES

    public VideoStore() {
        this.clientes = new HashMap<>();
        this.peliculas = new ArrayList<>();
        this.alquileres = new HashSet<>();
    }

    ////////////////// GETTERS

    public String getClientes() {
        return clientes.toString();
    }

    public String getPeliculas() {
        return peliculas.toString();
    }

    public String getAlquileres() {
        return alquileres.toString();
    }
/*
    ////////////////// SETTERS

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
*/
    ////////////////// OTROS

    public void addCliente(Cliente cliente){
        if(!this.clientes.containsKey(cliente.getId())) {
            this.clientes.put(cliente.getId(), cliente);
        }
    }

    public void addPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public void addAlquiler(Alquiler alquiler){
        if(!this.alquileres.contains(alquiler)) {
            this.alquileres.add(alquiler);
        }
    }

    public Cliente buscarCliente(Cliente cliente){
        if(clientes.containsKey(cliente.getId())){
            return clientes.get(cliente.getId());
        }
        else {
            return cliente;
        }
    }

    public String getAlquileresXCliente(Cliente cliente){
        if(clientes.containsKey(cliente.getId())){
            return clientes.get(cliente.getId()).getAlquileres();
        }
        else {
            return "Cliente no encontrado";
        }
    }

    public String getAlquileresDevolverHoy(){
        LocalDate today = LocalDate.now();
        StringBuilder sb = new StringBuilder();

        Iterator it = alquileres.iterator(); //los hashSets no tienen orden, necesito un Iterator
        while(it.hasNext()){ //mientras el iterator tenga un siguiente, recorro
            Alquiler aux_alquiler = (Alquiler) it.next(); //guardo los datos del iterator en una variable auxiliar
            if(aux_alquiler.getFechaDevolucion().isEqual(today)){ //comparo la fecha del auxiliar con la de hoy
                sb.append(aux_alquiler.toString()); //si es la misma, lo agrego al StringBluilder
            }
        }
        return sb.toString();
    }
    ////////////////// OVERRIDDEN

}
