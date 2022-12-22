/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author haleacu
 */
public class ProfileDB {
    
    /**
     * Método que busca el usuario en función del nombre y nº de publicaciones.
     * @param name recibe como parámetro el nombre del usuario
     * @param NumberOfPosts recibe como parámetro el nº de publicaciones de ese usuario
     * @return devuelve el objeto 'Profile' asociado a ese usuario o 'null' en caso de que no exista
     */
    public static Profile findByName (String name, int NumberOfPosts) {
     
        
        return null;        
    }
    
    /**
     * Método que hace lo mismo que FindByName pero pasándole la contraseña también como parámetro.
     * @param name recibe como parámetro el nombre de un usuario
     * @param password recibe como parámetro la contraseña de ese usuario
     * @param NumberOfPosts recibe como parámetro el nº de publicaciones de ese usuario
     * @return devuelve el objeto 'Profile' asociado a ese usuario o 'null' en caso de que no exista
     */
    public static Profile findByNameAndPassword (String name, String password, int NumberOfPosts) {
       
        
        return null;
    }
    
    /**
     * Método que almacena el perfil en la DB
     * @param profile
     */
    public static void save(Profile profile) {
        
    }
    
    /**
     * Método que actualiza el perfil en la DB
     * @param profile
     */
    public static void update(Profile profile) {
        
    }
}
