package LibraryUser;

public class LibraryAssistance extends LibraryUser implements AvailabilityManager {  // Clase LibraryAssistance que implementa AvailabilityManager
    public LibraryAssistance(String name) {   // Constructor
        super(name);
    }

    @Override
    public void modifyAvailability(String title, boolean available) {   // Implementación del método modifyAvailability
        String estado = available ? "disponible" : "no disponible";  // Determina el estado del libro
        System.out.println(getName() + " ha modificado la disponibilidad del libro: " + title + " a " + estado);  // Uso de getName() para obtener el nombre del usuario y mostrar el mensaje de modificación
    }

}
