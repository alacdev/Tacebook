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
public class ProfileView {

    private int postsShowed = 10;
    private ProfileController profileController;
    Scanner scan = new Scanner(System.in);
    InitMenuView s = new InitMenuView();
    ProfileController p = new ProfileController();

    /**
     * Constructor de la clase ProfileView pasando un objeto ProfileController
     * como parámetro
     *
     * @param profileController
     */
    public ProfileView(ProfileController profileController) {
        this.profileController = profileController;
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

        System.out.println("El nombre es el siguiente: " + s.getName());
        System.out.println("El estado actual es: " + s.getStatus());
        ownProfile = true;
    }

    private void changeStatus(boolean ownProfile, Scanner scanner, Profile profile) {

        if (ownProfile = true) {
            System.out.println("Inserta un nuevo estado: ");
            String status = scan.nextLine();
            s.setStatus(status);
            p.updateProfileStatus(status);
        } else if (ownProfile = false) {
            System.out.println("Esta opción sólo es valida en la propia biografía");
            this.showProfileMenu(profile);
        }
    }

    public void showProfileMenu(Profile profile) {
        this.showProfileInfo(true, profile);
        this.changeStatus(true, scan, profile);
        
    }
}
