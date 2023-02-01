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
    private Profile profileController;
    private ProfileController profileController1;

    public ProfileView(Profile profileController) {
        this.profileController = profileController;
    }    

    public int getPostsShowed() {
        return postsShowed;
    }
    
    
    private void showProfileInfo(boolean ownProfile, Profile profile) {
        
    }
    
    private void changeStatus(boolean ownProfile,Scanner scanner, Profile profile) {
        
    }
    
    public void showProfileMenu(Profile profile) {
        
    }
}
