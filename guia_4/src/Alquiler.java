import java.time.LocalDate;
import java.util.UUID;

public class Alquiler {

    private UUID id;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fechaRecibido; //para "anotar" cuando una peli fue devuelta

    ////////////////// CONSTRUCTORES

    //para sumar fecha de devolucion:
    //    LocalDate today = LocalDate.now();
    //        tomorrow = today.plusDays(1); //metodo de instancia, le paso los dias que le quiero sumar


    ////////////////// GETTERS

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    ////////////////// SETTERS
    ////////////////// OTROS
    ////////////////// OVERRIDDEN
}
