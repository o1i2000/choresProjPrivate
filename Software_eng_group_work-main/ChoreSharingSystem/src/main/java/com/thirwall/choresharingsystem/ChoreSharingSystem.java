/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.Oli200.choresharingsystem;

/**
 *
 * @author Oli2000
 */
public class ChoreSharingSystem {

    public static void main(String[] args) {
        
        ChoresDatabase db = new ChoresDatabase();
        System.out.println(db.getCommonTasks().toString());
        System.out.println(db.getUsers().toString());
    }
}
