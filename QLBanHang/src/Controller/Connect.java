/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TRAN MINH GIAP
 */
public class Connect {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLBanHang;encrypt=true;trustServerCertificate=true", "sa", "15092004");
            if(conn != null){
                System.out.println("Database Connection " + conn.getCatalog() + " Successfull !");
            }
            else{
                System.out.println("Database Connection Failed !");
            }
        } catch (Exception ex) {
            System.out.println("ERROR DURING CONNECTION " + ex.getMessage());
        } finally {
            return conn;
        }
    }
}
