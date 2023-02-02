/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

import java.util.Scanner;

/**
 *
 * @author haleacu
 */
public class InitMenuView {

    /**
     * Método que muestra las opciones iniciar sesión (método "login()"), crear
     * un nuevo perfil (método "register()") y salir de la aplicaión (en ese
     * caso devuelve true)
     *
     * @return
     */
    private String password, password2, name, nameOfProfile, status;

    public String getName() {
        return name;
    }

    /**
     * Get para obtener el valor de la contraseña.
     *
     * @return
     */
    public String getStatus() {    
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    


    Scanner scan = new Scanner(System.in);

    /**
     * Método que muestra el menú de inicio de sesión y proporciona opciones de
     * inicio de sesión.
     *
     * @return
     */
    public boolean showLoginMenu() {

        InitMenuController p = new InitMenuController();

        System.out.println("1. Iniciar sesión");
        System.out.println("2. Crear un novo perfil");
        System.out.println("3. Saír da aplicación");

        int option = scan.nextInt();
        scan.nextLine();
        switch (option) {

            case 1:
                System.out.println("Introduce o nome de usuario:");
                name = scan.nextLine();
                System.out.println("Introduce o contrasinal:");
                password = scan.nextLine();
                p.login(name, password);
                break;
            case 2:
                p.register();
                break;
            case 3:
                return true;
        }
        System.out.println(" Debes elegir una opción del 1 al 3");
        return false;
    }

    /**
     * Muestra al usuario un mensaje de usuario y/o contraseña erróneos.
     */
    public void showLoginErrorMessage() {
        System.out.println("Usuario o/y contraseña incorrectos");
    }

    /**
     * Muestra el menú para registrarse, en el que pide una contraseña dos
     * veces, (comprobando que coincidan) y un estado. Con esos datos, se
     * invocará al método "createProfile()" del controlador.
     */
    public void showRegisterMenu() {
        boolean equalPassword = false;

        System.out.println("Inserta un nombre de perfil: ");
        nameOfProfile = scan.nextLine();

        System.out.println("Inserta una contraseña:");
        password = scan.nextLine();
        System.out.println("Inserta una contraseña:");
        password2 = scan.nextLine();
        if (password.equals(password2)) {
            equalPassword = true;
        }
        System.out.println("Inserta un estado: ");
        status = scan.nextLine();
    }

    /**
     * Muestra un mensaje diciendo que el nombre ya estaba en uso y pide un
     * nuevo nombre para el usuario.
     *
     * @return devuelve el nuevo nombre introducido por el usuario
     */
    public String showNewNameMenu() {

        System.out.println("El nombre introducido ya está en uso, intruduzca uno diferente, por favor: ");
        nameOfProfile = scan.nextLine();
        return nameOfProfile;
    }
}
