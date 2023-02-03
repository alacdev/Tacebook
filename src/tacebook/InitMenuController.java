/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author haleacu
 */
public class InitMenuController {

    InitMenuView menuView = new InitMenuView(this);
    ProfileController controller = new ProfileController();

    /**
     * Método que inicia la aplicación llamando repetidamente al showLoginMenu()
     * hasta que devuelve true
     */
    private void init() {
        boolean exit;
        do {
            exit = menuView.showLoginMenu();
        } while (!exit);
    }   

    /**
     * Método para iniciar sesión que abre una sesión si existe el usuario con
     * esa contraseña o muestra un error en caso contrario.
     *
     * @param name
     * @param password
     */
    public void login(String name, String password) {        
        for (Profile p : TacebookDB.getProfiles()) {
            if (p.getName().equals(name) & p.getPassword().equals(password)) {
                controller.openSession(p);
            } else {
                System.out.println("");
                menuView.showLoginErrorMessage();
            }
        }

    }

    /**
     * Método que registra un nuevo usuario
     */
    public void register() {
        menuView.showRegisterMenu();
    }

    /**
     * Método que crea un nuevo perfil (comprobando que el nombre no esté en
     * uso) y abre una sesión con él. Crea un objeto Profile y lo añade a la
     * base de datos, y abre una sesión con ese perfil creando un objeto
     * ProfileController
     *
     * @param name
     * @param password
     * @param status
     */
    public void createProfile(String name, String password, String status) {
        boolean nameIsUsed = false;

        // Comprobamos se o nome recibido xa esta en uso por algun perfil da lista
        for (Profile p : TacebookDB.getProfiles()) {
            if (p.getName().equals(name)) {
                nameIsUsed = true;
            }
        }

        if (nameIsUsed) {
            menuView.showNewNameMenu();
        } else {
            Profile profile = new Profile(name, password, status);
            ProfileDB.save(profile);
            controller.openSession(profile);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InitMenuController imc = new InitMenuController();
        imc.init();
    }
}
