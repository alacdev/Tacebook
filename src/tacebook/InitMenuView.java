/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author haleacu
 */
public class InitMenuView {
    
    /**
     * Método que muestra las opciones iniciar sesión (método "login()"), crear un nuevo
     * perfil (método "register()") y salir de la aplicaión (en ese caso devuelve true)
     * @return
     */
    public boolean showLoginMenu() {
        
        return false;
    }
    
    /** 
     * Muestra al usuario un mensaje de usuario y/o contraseña erróneos.
     */
    public void showLoginErrorMessage() {
        
    }
    
    /**
     * Muestra el menú para registrarse, en el que pide una contraseña dos veces,
     * (comprobando que coincidan) y un estado. Con esos datos, se invocará al 
     * método "createProfile()" del controlador.
     */
    public void showRegisterMenu() {
        
    }
    
    /**
     * Muestra un mensaje diciendo que el nombre ya estaba en uso y pide un 
     * nuevo nombre para el usuario.
     * @return devuelve el nuevo nombre introducido por el usuario
     */
    public String showNewNameMenu() {
        
        
        
        return null;        
    }
}
