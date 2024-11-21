/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author TRAN MINH GIAP
 */
public class Supplier {
    private String supplierID;
    private String supplierName;
    private String address;
    private String phone;
    private String status;

    public Supplier(String supplierID, String supplierName, String address, String phone, String status) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }
    
    public Supplier(){
        this.supplierID = this.supplierName = this.address = this.phone = this.status = "";
    }
    public String getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return this.supplierName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierID, supplierName, address, phone, status);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Supplier other = (Supplier) obj;
        if (!Objects.equals(this.supplierID, other.supplierID)) {
            return false;
        }
        if (!Objects.equals(this.supplierName, other.supplierName)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if(!Objects.equals(this.phone, other.phone)){
            return false;
        }
        return Objects.equals(this.status, other.status);
    }
}
