/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import java.util.List;
import Model.Employees;

/**
 *
 * @author TRAN MINH GIAP
 */
public interface INhanVienRepository {
    List<Employees> getAll();
    boolean addEmployees(Employees product);
    boolean updateEmployees(Employees product);
    boolean updateEmployeespass(Employees product);
    boolean deleteEmployees(Employees product);
}
