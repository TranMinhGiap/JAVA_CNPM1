/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Customer;
import java.util.List;

/**
 *
 * @author TRAN MINH GIAP
 */
public interface IKhachHangRepository {
    List<Customer> getAll();
    boolean addCustomer(Customer person);
    boolean updateCustomer(Customer person);
    boolean deleteCustomer(Customer person);
}
