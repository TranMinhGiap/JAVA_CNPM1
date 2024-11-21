/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Import;
import Model.ImportDetail;
import Model.Order;
import Model.OrderDetail;
import View.frmMain;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */

public class PhieuBan {
    public boolean InsertHD(String id, String khid, String date, double total) throws SQLException{
        String sql = "INSERT INTO Orders VALUES (?, ? , ? , ?, ?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ){
            pstm.setString(1, id);
            pstm.setString(2, khid);
            pstm.setString(3, frmMain.id);
            pstm.setString(4, date);
            pstm.setDouble(5, total);
            return pstm.executeUpdate() > 0;
        }
        catch(Exception ex){
            System.out.println("ERROR INSERT ORDER: " + ex.getMessage());
            return false;
        }
    }
    public boolean DeleteHD(String id) throws SQLException{
        String sql = "DELETE FROM Orders WHERE OrdersID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);){
            pstm.setString(1, String.valueOf(frmMain.Order_id - 1));
            return pstm.executeUpdate() > 0;
        }
        catch(Exception ex){
            System.out.println("ERROR CANCEL BILL: " + ex.toString());
            return false;
        }
    }
    public List<Order> getOrder() throws SQLException{
        String sql = "SELECT * FROM Orders";
        List<Order> lstOrder = new ArrayList<Order>();
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery()){
            while(rs.next()){
                Date sqlDate = rs.getDate("OrdersDate");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(sqlDate);
                lstOrder.add(new Order(rs.getString("OrderID"), rs.getString("CustomerID"), rs.getString("EmployeesID"), date, rs.getFloat("Total")));
            }
        }
        catch(Exception ex){
            System.out.println("ERROR SELECT ORDER " + ex.getMessage());
        }
        return lstOrder;
    }
    public boolean InsertOrderDetail(String id, List<Object[]> cartList) throws SQLException{
        String sql = "INSERT INTO OrderDetails VALUES (?, ?, ?, ?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);){
            for(Object[] rowData : cartList){
                String productid = (String) rowData[0];
                int quantity = (int) rowData[2];
                double price = (double) rowData[6];
                pstm.setString(1, id);
                pstm.setString(2, productid);
                pstm.setInt(3, quantity);
                pstm.setDouble(4, price);
                pstm.addBatch();
            }
            int[] results = pstm.executeBatch();
            for(int result : results){
                if(result == -2){
                    System.out.println("Lỗi khi thêm nhiều bản ghi");
                    return false;
                }
            }
            return true;
        }catch(Exception ex){
            System.out.println("Lỗi khi thực thi Batch: " + ex.getMessage());
            return false;
        }
    }
    public boolean updateQuantityProduct(List<Object[]> cartList) throws SQLException{
        String sql = "UPDATE Product SET Quantity = Quantity - ? WHERE ProductID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);){
            for(Object[] rowData : cartList){
                int Quantity = (int) rowData[2];
                String productid = (String) rowData[0];
                pstm.setInt(1, Quantity);
                pstm.setString(2, productid);
                pstm.addBatch();
            }
            int[] results = pstm.executeBatch();
            for(int result : results){
                if(result == -2){
                    System.out.println("lỗi khi update sản phẩm");
                    return false;
                }
            }
           return true;
        }catch(Exception ex){
            System.out.println("ERROR UPDATE PRODUCT: " + ex.getMessage());
            return false;
        }
    }
    public List<Order> DisplayHD() throws SQLException {
        List<Order> lstOrders = new ArrayList<>();
            String sql = "SELECT * FROM Orders";
            try (Connection conn = Connect.getConnection();
                PreparedStatement pstm = conn.prepareStatement(sql)) {
                ResultSet rs = pstm.executeQuery();
                while (rs.next()) {
                    // Lấy ngày từ ResultSet và chuyển định dạng ngày tháng
                    Date date = rs.getDate("OrdersDate");
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String ngay = sdf.format(date);
                    String customerID = rs.getString("CustomerID");  // Mã khách hàng
                    String employeeID = rs.getString("EmployeesID"); // Mã nhân viên
                    lstOrders.add(new Order(rs.getString("OrdersID"), customerID, employeeID, ngay, rs.getDouble("Total")));
            }
        }   catch (Exception ex) {
            System.out.println("Lỗi select order: " + ex.getMessage());
        }
            return lstOrders;
        }
    public String getEmployeeName(String employeeID) throws SQLException {
        String employeeName = "";
        String sql = "SELECT EmployeesName FROM Employees WHERE EmployeesID = ?";
        try (Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, employeeID);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                employeeName = rs.getString("EmployeesName");
            }
        }
        return employeeName;
    }
        public String getCustomerName(String customerID) throws SQLException {
        String customerName = "";
        String sql = "SELECT CustomerName FROM Customer WHERE CustomerID = ?";
        try (Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, customerID);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                customerName = rs.getString("CustomerName");
            }
        }
        return customerName;
    }
//    public List<Order> DisplayHD() throws SQLException{
//        List<Order> lstOrders = new ArrayList<>();
//        String sql = "SELECT Orders.OrdersID, Customer.CustomerName, Employees.EmployeesName, Orders.OrdersDate, Orders.Total FROM Orders, Customer, Employees WHERE Orders.CustomerID = Customer.CustomerID AND Orders.EmployeesID = Employees.EmployeesID";
//        try(Connection conn = Connect.getConnection();
//            PreparedStatement pstm = conn.prepareStatement(sql);){
//            ResultSet rs = pstm.executeQuery();
//            while(rs.next()){
//                Date date = rs.getDate("OrdersDate");
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                String ngay = sdf.format(date);
//                lstOrders.add(new Order(rs.getString("OrdersID")), rs.getString("CustomerName"), rs.getString("EmployeesName"), ngay, rs.getFloat("Total"));
//            }
//           
//        }catch(Exception ex){
//            System.out.println("Lỗi select order: "+ ex.getMessage());
//        }
//        return lstOrders;
//    }
}
