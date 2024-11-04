/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author TRAN MINH GIAP
 */
public class KhachHangRepository implements IKhachHangRepository{

    @Override
    public List<Customer> getAll() {
       List<Customer> lstCustomer = new ArrayList<>();
       String sql = "SELECT * FROM Customer";
       try(Connection conn = Connect.getConnection();
           PreparedStatement pstm = conn.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery()) 
       {
           while(rs.next()){
               lstCustomer.add(new Customer(rs));
           }
       } catch (Exception ex) {
           System.out.println("ERROR IN FUNCTION getAll in KhachHangRepository: " + ex.getMessage());
       }
       return lstCustomer;
    }

    @Override
    public boolean addCustomer(Customer person) {
        String sql = "INSERT INTO Customer VALUES (?,?,?,?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)
            ) 
        {
            pstm.setString(1, person.getCustomerID());
            pstm.setString(2, person.getCustomerName());
            pstm.setString(3, person.getCustomerAddress());
            pstm.setString(4, person.getCustomerPhone());
            return pstm.executeUpdate() > 0;
            
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION addCustomer in KhachHangRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateCustomer(Customer person) {
        String sql = "UPDATE Customer SET CustomerName = ?, CustomerAddress = ?, Phone = ? WHERE CustomerID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, person.getCustomerName());
            pstm.setString(2, person.getCustomerAddress());
            pstm.setString(3, person.getCustomerPhone());
            pstm.setString(4, person.getCustomerID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateCustomer in KhachHangRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteCustomer(Customer person) {
        String sql = "DELETE FROM Customer WHERE CustomerID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)
            )
        {
            pstm.setString(1, person.getCustomerID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION deleteCustomer in KhachHangRepository: " + ex.getMessage());
            return false;
        }
    }
}
