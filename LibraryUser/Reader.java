package LibraryUser;

public class Reader extends LibraryUser implements BookReserver {  // Clase Reader que implementa BookReserver
    public Reader(String name) {
        super(name);
    }
    @Override // Implementación del método reserveBook
    public void reserveBook(String title) {  // Método para reservar un libro
        System.out.println(getName() + " ha reservado el libro: " + title);  // Uso de getName() para obtener el nombre del usuario y 
    }                                                                       // mostrar el mensaje de reserva
}
