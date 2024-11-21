/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TRAN MINH GIAP
 */
public class Customer {
    private String customerID;
    private String customerName;
    private String customerAddress;
    private String customerPhone;

    public Customer(){
        this.customerID = this.customerName = this.customerAddress = this.customerPhone = "";
    }
    
    public Customer(String ID, String Name, String Address, String Phone) {
        this.customerID = ID;
        this.customerName = Name;
        this.customerAddress = Address;
        this.customerPhone = Phone;
    }
    
    public Customer(ResultSet rs) throws SQLException {
        this.customerID = rs.getString(1);
        this.customerName = rs.getString(2); 
        this.customerAddress = rs.getString(3); 
        this.customerPhone = rs.getString(4); 
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
