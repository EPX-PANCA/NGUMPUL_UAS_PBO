/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

PANCA PUTRA PAHLAWAN 15312414 TI 15 C

 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ACE
 */
public class Koneksi {
    public Statement state;
    private Connection Connect;
    String naDat = "jdbc:mysql://localhost/db_uas_15312414";
    
    public void konDat(){
        try {
            Connect = DriverManager.getConnection(naDat,"root","");
            state = Connect.createStatement();
            System.out.println("Terhubung Ke Database");
        } catch (Exception e) {
            System.err.println("Terjadi Kesalahan :" + e);
        }
    }
}

