/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.ProfileDB;
import tacebook.Message;
import tacebook.Post;
import tacebook.Profile;
import viewer.ProfileView;

/**
 *
 * @author haleacu
 */
public class ProfileController {

    private ProfileView profileView = new ProfileView(this);
    private Profile sessionProfile;

    public ProfileView getProfileView() {
        return profileView;
    }

    public void setProfileView(ProfileView profileView) {
        this.profileView = profileView;
    }

    public Profile getSessionProfile() {
        return sessionProfile;
    }

    public void setSessionProfile(Profile sessionProfile) {
        this.sessionProfile = sessionProfile;
    }

    /**
     * Obtiene el número de publicaciones a mostrar, para lo que llamará al
     * método con el mismo nombre de la clase ProfileView.
     *
     * @return devuelve el nº de publicaciones a mostrar
     */
    public int getPostsShowed() {
        int postShowed = profileView.getPostsShowed();

        return postShowed;
    }

    /**
     * Obtiene el objeto del perfil de la sesión usando la clase ProfileDB y
     * muestra el menú de perfil para el.
     */
    public void reloadProfile() {

        sessionProfile = ProfileDB.findByName(sessionProfile.getName(), 0);        

    }

    /**
     * Abre una sesión con un perfil, almacena el objeto "sessionProfile" en su
     * atributo y llamando al método "showProfileMenu()" del objeto vista.
     *
     * @param sessionProfile
     */
    public void openSession(Profile sessionProfile) {
        this.sessionProfile = sessionProfile;
        profileView.showProfileMenu(sessionProfile);
    }

    /**
     * Actualiza el estado del perfil, modificando el atributo del objeto
     * "profile" y llama a la clase "ProfileDB" para guardar el cambio. Después,
     * invocará el método "reloadProfile()" para recargar el perfil y mostrar de
     * nuevo el menú
     *
     * @param newStatus
     */
    public void updateProfileStatus(String newStatus) {

    }
    
    public void newPost(String text, Profile destProfile) {
        
    }
    
    public void newComment(Post post, String commentText) {
        
    }
    
    public void newLike(Post post) {
        
    }
    
    public void newFriendshipRequest(String profileName) {
        
    }
    
    public void acceptFriendshipRequest(Profile sourceProfile) {
        
    }
    
    public void rejectFriendshipRequest(Profile sourceProfile) {
        
    }
    
    public void newMessage(Profile destProfile, String text) {
        
    }
    
    public void deleteMessage(Message message) {
        
    }
    
    public void markMessageAsRead(Message message) {
        
    }
    
    public void replyMessage(Message message, String text) {
        
    }
}
