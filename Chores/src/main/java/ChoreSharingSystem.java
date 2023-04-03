
import javax.swing.JTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author olly2
 */
public class ChoreSharingSystem {
    
    public static void main(String[] args) {
        
        ChoresDatabase db = new ChoresDatabase();
        System.out.println(db.getCommonTasks().toString());
        //System.out.println(db.getUsers().toString());
        
        
        
    }
}
