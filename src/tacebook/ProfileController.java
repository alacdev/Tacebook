/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author haleacu
 */
public class ProfileController {
    
    /**
     * Obtiene el número de publicaciones a mostrar, para lo que llamará al
     * método con el mismo nombre de la clase ProfileView.
     * @return devuelve el nº de publicaciones a mostrar
     */
    public int getPostsShowed() {
        
        
        return 0;    
    }
    
    /**
     * Obtiene el objeto del perfil de la sesión usando la clase ProfileDB y
     * muestra el menú de perfil para el.
     */
    public void reloadProfile() {
        
    }
    
    /**
     * Abre una sesión con un perfil, almacena el objeto "sessionProfile" en su
     * atributo y llamando al método "showProfileMenu()" del objeto vista.
     * @param sessionProfile
     */
    public void openSession(Profile sessionProfile) {
        
    }
    
    /**
     * Actualiza el estado del perfil, modificando el atributo del objeto "profile"
     * y llama a la clase "ProfileDB" para guardar el cambio. Después, invocará el
     * método "reloadProfile()" para recargar el perfil y mostrar de nuevo el menú
     * @param newStatus
     */
    public void updateProfileStatus (String newStatus) {
        
    }
}
