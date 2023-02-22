/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.ArrayList;
import tacebook.Profile;

/**
 *
 * @author haleacu
 */
public class TacebookDB {
    private static ArrayList <Profile> profiles = new ArrayList<>();

    public static ArrayList<Profile> getProfiles() {
        return profiles;
    }    

    public void setProfiles(ArrayList<Profile> profiles) {
        TacebookDB.profiles = profiles;
    }

    public TacebookDB(ArrayList<Profile> profiles) {
        TacebookDB.profiles = profiles;
    }
    
    
    
    
    

}
