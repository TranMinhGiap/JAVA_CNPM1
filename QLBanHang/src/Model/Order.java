/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class Order {
    private String orderID;
    private String customID;
    private String employeeID;
    private String orderDate;
    private float Total;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomID() {
        return customID;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public Order() {
    }

    public Order(String orderID, String customID, String employeeID, String orderDate, float Total) {
        this.orderID = orderID;
        this.customID = customID;
        this.employeeID = employeeID;
        this.orderDate = orderDate;
        this.Total = Total;
    }
}
