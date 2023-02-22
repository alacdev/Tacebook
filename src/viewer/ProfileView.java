/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewer;

import controller.ProfileController;
import java.util.Scanner;
import tacebook.Profile;

/**
 *
 * @author haleacu
 */
public class ProfileView {

    private int postsShowed = 10;
    private ProfileController controller;
    InitMenuView initMenuView;

    public ProfileView(ProfileController controller) {
        this.controller = controller;
    }

    /**
     * Método get de postsShowed
     *
     * @return
     */
    public int getPostsShowed() {

        return postsShowed;
    }

    private void showProfileInfo(boolean ownProfile, Profile profile) {
        ownProfile = true;
        System.out.println("El nombre es el siguiente: " + profile.getName());
        System.out.println("El estado actual es: " + profile.getStatus());
        ownProfile = true;
    }

    private void changeStatus(boolean ownProfile, Scanner scan, Profile profile) {

        if (ownProfile = true) {
            System.out.println("Inserta un nuevo estado: ");
            String status = scan.nextLine();
            profile.setStatus(status);
            controller.updateProfileStatus(status);
        } else {
            System.out.println("Esta opción sólo es valida en la propia biografía");
            this.showProfileMenu(profile);
        }
    }

    public void showProfileMenu(Profile profile) {
        Scanner scan = new Scanner(System.in);
        this.showProfileInfo(true, profile);

        System.out.println("1. Cambiar el estado");
        System.out.println("2. Cerrar sesión");

        int option = scan.nextInt();
        scan.nextLine();
        switch (option) {
            case 1:
                this.changeStatus(true, scan, profile);
                this.showProfileMenu(profile);
                break;
            case 2:
                break;

            default:
                System.out.println("Opción incorrecta");
                this.showProfileMenu(profile);
        }
    }
    
    private int selectElement(String text, int maxNumber, Scanner scanner) {
        
        return 0;        
    }
    
    private void writeNewPost(Scanner scanner, Profile profile) {
        
    }
    
   private void commentPost(Scanner scanner, Profile profile) {
       
   }
   
   private void addLike(Scanner scanner, Profile profile) {
       
   }
   
   private void showBiography(boolean ownProfile, Scanner scanner, Profile profile) {
       
   }
   
   private void sendFriendshipRequest(boolean ownProfile, Scanner scanner, Profile profile) {
       
   }
   
   private void proccessFriendshipRequest(boolean ownProfile, Scanner scanner, Profile profile, boolean accept) {
       
   }
   
   private void sendPrivateMessage(boolean ownProfile, Scanner scanner, Profile profile) {
       
   }
   
   private void readPrivateMessage(boolean ownProfile, Scanner scanner, Profile profile) {
       
   }
   
   private void deletePrivateMessage(boolean ownProfile, Scanner scanner, Profile profile) {
       
   }
   
   private void showOldPosts(Scanner scanner, Profile profile) {
       
   }
   
   public void showProfileNotFoundMessage() {
       
   }
   
   public void showCannotLikeOwnPostMessage() {
       
   }
   
   public void showAlreadyLikedPostMessage() {
       
   }
   
   public void showIsAlreadyFriendMessage(String profileName) {
       
   }
   
   public void showExistsFrienshipRequestMessage(String profileName) {
       
   }
   
   public void showDuplicateFrienshipRequestMessage(String profileName) {
       
   }
}
