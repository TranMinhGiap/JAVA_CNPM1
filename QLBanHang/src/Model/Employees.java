package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TRAN MINH GIAP
 */
public class Employees {
    private String employeeId;
    private String employeeName;
    private String employeeBirth;
    private String employeeGender;
    private String employeeAddress;
    private String employeePhone;
    private String employeeHometown;

    public Employees() {
        this.employeeId = this.employeeName = this.employeeGender = this.employeeAddress = this.employeePhone = this.employeeHometown = this.employeeBirth = "";
    }

    public Employees(String id, String name, String birth, String gender, String address, String phone, String hometown) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeBirth = birth;
        this.employeeGender = gender;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.employeeHometown = hometown;
    }

    public Employees(ResultSet rs) throws SQLException {
        this.employeeId = rs.getString(1);
        this.employeeName = rs.getString(2); 
        this.employeeBirth = rs.getString(3); 
        this.employeeGender = rs.getString(4); 
        this.employeeAddress = rs.getString(5); 
        this.employeePhone = rs.getString(6); 
        this.employeeHometown = rs.getString(7);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeBirth() {
        return employeeBirth;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public String getEmployeeHometown() {
        return employeeHometown;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeBirth(String employeeBirth) {
        this.employeeBirth = employeeBirth;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public void setEmployeeHometown(String employeeHometown) {
        this.employeeHometown = employeeHometown;
    }
}
