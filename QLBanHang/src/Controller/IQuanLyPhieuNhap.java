/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Import;
import java.util.List;

/**
 *
 * @author TRAN MINH GIAP
 */
public interface IQuanLyPhieuNhap {
    int createID();
    List<Import> getImport();
    void executeImport();
    boolean addImport(Import ip);
    boolean updateImport(Import ip);
    boolean deleteImport(Import ip);
}
