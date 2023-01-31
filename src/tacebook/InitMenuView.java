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
    private String password, name;

    public boolean showLoginMenu() {

        InitMenuController p = new InitMenuController();
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolle unha opción");
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
                return true;
            case 2:
                p.register();
                return true;
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

    }

    /**
     * Muestra el menú para registrarse, en el que pide una contraseña dos
     * veces, (comprobando que coincidan) y un estado. Con esos datos, se
     * invocará al método "createProfile()" del controlador.
     */
    public void showRegisterMenu() {

    }

    /**
     * Muestra un mensaje diciendo que el nombre ya estaba en uso y pide un
     * nuevo nombre para el usuario.
     *
     * @return devuelve el nuevo nombre introducido por el usuario
     */
    public String showNewNameMenu() {

        return null;
    }
}
