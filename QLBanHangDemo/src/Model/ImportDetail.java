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
public class ImportDetail {
    private int importID;
    private String importDate;
    private String productID;
    private float priceIn;
    private String note;
    private String supplier;
    private String category;
    private int num;
    private float total;
    
    public ImportDetail(){
        this.importID = this.num = 0;
        this.priceIn = this.total = 0;
        this.importDate = this.productID = this.category = this.supplier = this.note = "";
    }

    public ImportDetail(int importID, String importDate, String productID, float priceIn, String note, String supplier, String category, int num, float total) {
        this.importID = importID;
        this.importDate = importDate;
        this.productID = productID;
        this.priceIn = priceIn;
        this.note = note;
        this.supplier = supplier;
        this.category = category;
        this.num = num;
        this.total = total;
    }

    public ImportDetail(int importID, String productID, int num){
        this.importID = importID;
        this.productID = productID;
        this.num = num;
        this.priceIn = this.total = 0;
        this.importDate = this.category = this.supplier = this.note = "";
    }
    
    public ImportDetail(ResultSet rs) throws SQLException {
        this.importID = rs.getInt("importID");
        this.importDate = rs.getString("importDay");
        this.productID = rs.getString("productID");
        this.priceIn = rs.getFloat("priceIn");
        this.note = rs.getString("note");
        this.supplier = rs.getString("supplier");
        this.category = rs.getString("category");
        this.num = rs.getInt("num");
        this.total = rs.getFloat("total");
    }

    public void setImportID(int importID) {
        this.importID = importID;
    }
    
    public int getImportID(){
        return this.importID;
    }
    
    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public float getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(float priceIn) {
        this.priceIn = priceIn;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
