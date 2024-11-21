/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Connect {
                 public static Connection conn = null;

    public static Connection getConnection() throws SQLException{
        try {
            String user = "sa";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLBanHang1;encrypt=false";
            // Nạp trình điều khiển
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Thực hiện kết nối cơ sở dữ liệu
            conn = DriverManager.getConnection(url, user, password);
            System.out.print("Kết nối thành công!");
            return conn;          
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Kết nối cơ sở dữ liệu thất bại!", "Thông báo", 1);
        }
        return null;
    }
}
