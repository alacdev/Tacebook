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
    private InitMenuController controller;

    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
    }

    /**
     * Método que muestra el menú de inicio de sesión y proporciona opciones de
     * inicio de sesión.
     *
     * @return
     */
    public boolean showLoginMenu() {
        String password, name;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenid@ a Taceboook - La red social más bakana del globo");
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
                if (System.console() != null) {
                    password = new String(System.console().readPassword());
                } else {
                    password = scan.nextLine();
                }
                controller.login(name, password);
                break;
            case 2:
                controller.register();
                //showLoginMenu();
                break;
            case 3:
                return true;
            default:
                System.out.println(" Debes elegir una opción del 1 al 3");
        }
        return false;
    }

    /**
     * Muestra al usuario un mensaje de usuario y/o contraseña erróneos.
     */
    public void showLoginErrorMessage() {
        System.out.println("Usuario y/o contraseña incorrectos");
    }

    /**
     * Muestra el menú para registrarse, en el que pide una contraseña dos
     * veces, (comprobando que coincidan) y un estado. Con esos datos, se
     * invocará al método "createProfile()" del controlador.
     */
    public void showRegisterMenu() {
        String password, password2, name, nameOfProfile, status;
        Scanner scan = new Scanner(System.in);

        boolean equalPassword = false;

        System.out.println("Inserta un nombre de perfil: ");
        nameOfProfile = scan.nextLine();
        do {
            System.out.println("Inserta una contraseña:");
            if (System.console() != null) {
                password = new String(System.console().readPassword());
            } else {
                password = scan.nextLine();
            }
            System.out.println("Inserta una contraseña:");
            if (System.console() != null) {
                password2 = new String(System.console().readPassword());
            } else {
                password2 = scan.nextLine();
            }
            if (!password.equals(password2)) {
                System.out.println("Contraseña incorrecta. Escríbala de nuevo");
            } else {
                equalPassword = true;
            }
        } while (!equalPassword);
        System.out.println("Inserta un estado: ");
        status = scan.nextLine();

        controller.createProfile(nameOfProfile, password, status);
    }

    /**
     * Muestra un mensaje diciendo que el nombre ya estaba en uso y pide un
     * nuevo nombre para el usuario.
     *
     * @return devuelve el nuevo nombre introducido por el usuario
     */
    public String showNewNameMenu() {
        String nameOfProfile;
        Scanner scan = new Scanner(System.in);

        System.out.println("El nombre introducido ya está en uso, intruduzca uno diferente, por favor: ");
        nameOfProfile = scan.nextLine();
        return nameOfProfile;
    }
}
