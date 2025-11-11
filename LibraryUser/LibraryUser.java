

/*
 *1. Clase padre: LibraryUser
 *Atributo: String name
 *Constructor  Método: ShowUser()
 *Getters y setters. 
 */

package LibraryUser;

public class LibraryUser { // Clase padre
    private String name;

    public LibraryUser(String name) { // Constructor
        this.name = name;
    }

    public String getName() { // Getter
        return name;
    }

    public void setName(String name) {  //
        this.name = name; 
    }

    public void ShowUser() {  // Método para mostrar el nombre del usuario
        System.out.println("User Name: " + name);
    }


}





