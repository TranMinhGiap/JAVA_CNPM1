/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Employees;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
public class NhanVienRepository implements INhanVienRepository{

    @Override
    public List<Employees> getAll() {
        List<Employees> lst = new ArrayList<>();
        String sql = "SELECT * FROM Employees";
        try (Connection conn = Connect.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) 
        {
            while (rs.next()) {
                lst.add(new Employees(rs));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION getAll in NhanVienRepository: " + ex.getMessage());
        }
        return lst;
    }
    
    @Override
    public boolean addEmployees(Employees product) {
        String sql = "INSERT INTO Employees VALUES (?,?,?,?,?,?,?, ?, ?,?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)
            ) 
        {
            pstm.setString(1, product.getEmployeeId());
            pstm.setString(2, product.getEmployeeName());
            pstm.setString(3, product.getEmployeeBirth());
            pstm.setString(4, product.getEmployeeGender());
            pstm.setString(5, product.getEmployeeAddress());
            pstm.setString(6, product.getEmployeePhone());
            pstm.setString(7, product.getEmployeeHometown());
            pstm.setString(8, product.getEmployeeuser());
            pstm.setString(9, Cipher.HashPassword(product.getEmployeepass()));
            pstm.setString(10, product.getEmployeeRole());
            return pstm.executeUpdate() > 0;
            
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION addEmployees in NhanVienRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateEmployees(Employees product) {
        String sql = "UPDATE Employees SET EmployeesName = ?, Birth = ?, Gender = ?, EmployeesAddress = ?, Phone = ?, Hometown = ?, EmployeeUser = ?, EmployeePass = ?, EmployeeRole = ? WHERE EmployeesID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, product.getEmployeeName());
            pstm.setString(2, product.getEmployeeBirth());
            pstm.setString(3, product.getEmployeeGender());
            pstm.setString(4, product.getEmployeeAddress());
            pstm.setString(5, product.getEmployeePhone());
            pstm.setString(6, product.getEmployeeHometown());
            pstm.setString(7, product.getEmployeeuser());
            pstm.setString(8, product.getEmployeepass());
            pstm.setString(9, product.getEmployeeRole());
            pstm.setString(10, product.getEmployeeId());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateEmployees in NhanVienRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteEmployees(Employees product) {
        String sql = "DELETE FROM Employees WHERE EmployeesID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)
            )
        {
            pstm.setString(1, product.getEmployeeId());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION deleteEmployees in NhanVienRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateEmployeespass(Employees product) {
        String sql = "UPDATE Employees SET EmployeePass = ? WHERE Hometown = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, product.getEmployeepass());
            pstm.setString(2, product.getEmployeeHometown());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateEmployeesPass in NhanVienRepository: " + ex.getMessage());
            return false;
        }
    }
    
}
