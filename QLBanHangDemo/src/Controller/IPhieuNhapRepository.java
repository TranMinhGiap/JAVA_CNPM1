/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.ImportDetail;
import java.util.List;

/**
 *
 * @author TRAN MINH GIAP
 */
public interface IPhieuNhapRepository {
    List<ImportDetail> getImportDetail();
    List<ImportDetail> getImportDetailGroupID(int id);
    boolean addImportDetail(ImportDetail hd);
    boolean updateImportDetail(ImportDetail hd);
    boolean deleteImportDetail(ImportDetail hd);
    boolean updateNumberProduct(ImportDetail hd, int check, int sl);
}
