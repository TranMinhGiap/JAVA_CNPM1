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
public class Import {
    private int importID;
    private String employeesName;
    private int num;
    private String importDay;
    private float total;
    private String note;
    
    public Import(){
        this.importID = this.num = 0;
        this.total = 0;
        this.employeesName = this.importDay = this.note = "";
    }

    public Import(int importID, String employeesName, int num, String importDay, float total, String note) {
        this.importID = importID;
        this.employeesName = employeesName;
        this.num = num;
        this.importDay = importDay;
        this.total = total;
        this.note = note;
    }
    
    public Import(int importID){
        this.importID = importID;
        this.num = 0;
        this.total = 0;
        this.employeesName = this.importDay = this.note = "";
    }
    
    public Import(ResultSet rs) throws SQLException {
        this.importID = rs.getInt("importID");
        this.employeesName = rs.getString("employeesName");
        this.num = rs.getInt("num");
        this.importDay = rs.getString("importDay");
        this.total = rs.getFloat("total");
        this.note = rs.getString("note");
    }
    
    public int getImportID() {
        return importID;
    }

    public void setImportID(int importID) {
        this.importID = importID;
    }

    public String getEmployeesName() {
        return employeesName;
    }

    public void setEmployeesName(String employeesName) {
        this.employeesName = employeesName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getImportDay() {
        return importDay;
    }

    public void setImportDay(String importDay) {
        this.importDay = importDay;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
