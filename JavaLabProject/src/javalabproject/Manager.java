/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moadn
 */
public class Manager {
    int id;
    String name;
    String password;
    String email;
    String phoneNumber;
    int status;
    
    
    //Constructor to make Managers >>> Created by Muath

    public Manager(int id, String name, String password, String email, String phoneNumber, int status) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
        
        //Write information of manager to txt file
        
         String path = "manager.txt";
        File file = new File(path);
        try {
            FileWriter fw = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fw, true);
            fw.write("\r");
            String writeInfo = ("\nID:"+id +" "+"NAME:"+ name +" "+"PASSWORD:"+ password +" "+"EMAIL:"+ email +" "+"PHONE_NUMBER:"+ phoneNumber +" "+"STATUS:"+ status);
            fw.write(writeInfo);
            
            fw.flush();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
