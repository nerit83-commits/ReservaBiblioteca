package LibraryUser;

public class WebAdmin extends LibraryUser implements BookReserver, AvailabilityManager {  // Clase WebAdmin que implementa BookReserver y AvailabilityManager
    
    public WebAdmin(String name) {  // Constructor
        super(name);
    }

    @Override   // Implementación del método reserveBook
    public void reserveBook(String title) {  // Implementación del método reserveBook
        System.out.println("EL Administrador web " + getName() + " ha reservado el libro: " + title);  // Uso de getName() para obtener el nombre del usuario y mostrar el mensaje de reserva
    }

    @Override   // Implementación del método modifyAvailability
    public void modifyAvailability(String title, boolean available) {  // Implementación del método modifyAvailability
        String estado = available ? "disponible" : "no disponible";   // Determina el estado del libro
        System.out.println("El administrador web " + getName() + " ha modificado la disponibilidad del libro: " + title + " a: " + estado);  // Uso de getName() para obtener el nombre del usuario y mostrar el mensaje de modificación
    }
}
