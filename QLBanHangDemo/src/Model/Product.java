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
public class Product {
    private String productID;
    private String productName;
    private float productPriceIn;
    private float productPriceOut;
    private int quantity;
    private String categoryID;
    private String supplierID;

    public Product(){
        
    }
    
    public Product(String productID, String productName, float productPriceIn, float productPriceOut, int quantity, String categoryID, String supplierID) {
        this.productID = productID;
        this.productName = productName;
        this.productPriceIn = productPriceIn;
        this.productPriceOut = productPriceOut;
        this.quantity = quantity;
        this.categoryID = categoryID;
        this.supplierID = supplierID;
    }
    
    public Product(ResultSet rs) throws SQLException {
        this.productID = rs.getString("ProductID");
        this.productName = rs.getString("ProductName"); 
        this.quantity = rs.getInt("Quantity"); 
        this.productPriceIn = rs.getFloat("PriceIn"); 
        this.productPriceOut = rs.getFloat("PriceOut"); 
        this.categoryID= rs.getString("CategoryID");
        this.supplierID = rs.getString("SupplierID");
    }
    
    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPriceIn() {
        return productPriceIn;
    }

    public float getProductPriceOut() {
        return productPriceOut;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPriceIn(float productPriceIn) {
        this.productPriceIn = productPriceIn;
    }

    public void setProductPriceOut(float productPriceOut) {
        this.productPriceOut = productPriceOut;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    @Override
    public String toString() {
        return this.productName;
    }
}
