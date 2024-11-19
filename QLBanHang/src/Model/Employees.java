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
    private String employeeUser;
    private String employeePass;
    private String employeeRole;

    public Employees() {
    }

    public Employees(String employeeId, String employeeName, String employeeBirth, String employeeGender, String employeeAddress, String employeePhone, String employeeHometown, String employeeUser, String employeePass, String employeeRole) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirth = employeeBirth;
        this.employeeGender = employeeGender;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.employeeHometown = employeeHometown;
        this.employeeUser = employeeUser;
        this.employeePass = employeePass;
        this.employeeRole = employeeRole;
    }
    public Employees(ResultSet rs) throws SQLException {
        this.employeeId = rs.getString(1);
        this.employeeName = rs.getString(2); 
        this.employeeBirth = rs.getString(3); 
        this.employeeGender = rs.getString(4); 
        this.employeeAddress = rs.getString(5); 
        this.employeePhone = rs.getString(6); 
        this.employeeHometown = rs.getString(7);
        this.employeeUser = rs.getString(8);
        this.employeePass = rs.getString(9);
        this.employeeRole = rs.getString(10);
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
       public String getEmployeeuser() {
        return employeeUser;
    }

    public void setEmployeeuser(String employeeuser) {
        this.employeeUser = employeeuser;
    }

    public String getEmployeepass() {
        return employeePass;
    }

    public void setEmployeepass(String employeepass) {
        this.employeePass = employeepass;
    }
       public String getEmployeeRole() {
        return employeeRole;
    }
    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
}
