package LibraryUser;

public class Main {
    
    public static void main(String[] args) {   // Método principal para probar las clases e interfaces
        Reader reader = new Reader("Ana");  // Crear instancia de Reader y reservar un libro
        LibraryAssistance assistant = new LibraryAssistance("Carlos");  // Crear instancia de LibraryAssistance y modificar disponibilidad
        WebAdmin admin = new WebAdmin("Laura");  // Crear instancia de WebAdmin, reservar un libro y modificar disponibilidad

        System.out.println("=== Operaciones de Reserva de Libros ===");  
        reader.ShowUser();  // Mostrar el nombre del lector
        reader.reserveBook("Hablando con el cielo");  // Reservar un libro

        System.out.println(); // Línea en blanco para separar las operaciones

        assistant.ShowUser();  // Mostrar el nombre del asistente de biblioteca
        assistant.modifyAvailability("Cien años de soledad", false);  // Modificar la disponibilidad de un libro y mostrar el mensaje correspondiente

        System.out.println();  //pongo otra línea en blanco para separar las operaciones

        admin.ShowUser();  // Mostrar el nombre del administrador web
        admin.reserveBook("El mensaje de los sabios");  // Reservar un libro
        admin.modifyAvailability("El mensaje de los sabios", true);  // Modifica la disponibilidad de un libro y muestra el mensaje correspondiente


    }

}
