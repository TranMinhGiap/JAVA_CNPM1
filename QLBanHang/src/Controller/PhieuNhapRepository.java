/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ImportDetail;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author TRAN MINH GIAP
 */
public class PhieuNhapRepository implements IPhieuNhapRepository{

    @Override
    public List<ImportDetail> getImportDetail() {
        List<ImportDetail> lst = new ArrayList<>();
        String sql = "SELECT * FROM ImportDetail";
        try(Connection conn = Connect.getConnection();
           PreparedStatement pstm = conn.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery()) 
        {
            while(rs.next()){
                lst.add(new ImportDetail(rs));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION getImportDetail in PhieuNhapRepository: " + ex.getMessage());
        }
        return lst;
    }

    @Override
    public boolean addImportDetail(ImportDetail hd) {
        String sql = "INSERT INTO ImportDetail(importID, productID, importDay, priceIn, note, supplier, category, num, total) VALUES (?,?,?,?,?,?,?,?,?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setInt(1, hd.getImportID());
            pstm.setString(2,hd.getProductID());
            pstm.setString(3, hd.getImportDate());
            pstm.setFloat(4, hd.getPriceIn());
            pstm.setString(5, hd.getNote());
            pstm.setString(6, hd.getSupplier());
            pstm.setString(7, hd.getCategory());
            pstm.setInt(8, hd.getNum());
            pstm.setFloat(9, hd.getTotal());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION addImportDetail in PhieuNhapRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateImportDetail(ImportDetail hd) {
        String sql = "UPDATE ImportDetail SET importDay = ?, priceIn = ?, note = ?, supplier = ?, category = ?, num = ?, total = ? WHERE importID = ? AND productID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, hd.getImportDate());
            pstm.setFloat(2, hd.getPriceIn());
            pstm.setString(3, hd.getNote());
            pstm.setString(4, hd.getSupplier());
            pstm.setString(5, hd.getCategory());
            pstm.setInt(6, hd.getNum());
            pstm.setFloat(7, hd.getTotal());
            pstm.setInt(8, hd.getImportID());
            pstm.setString(9,hd.getProductID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateImportDetail in PhieuNhapRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteImportDetail(ImportDetail hd) {
        String sql = "DELETE FROM ImportDetail WHERE importID = ? AND productID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)
            )
        {
            pstm.setInt(1, hd.getImportID());
            pstm.setString(2, hd.getProductID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION deleteImportDetail in PhieuNhapRepository: " + ex.getMessage());
            return false;
        }
    }
    /*update so luong san pham ton kho dua tren hoa don nhap*/
    @Override
    public boolean updateNumberProduct(ImportDetail hd, int check, int sl) {
        String sql = "UPDATE Product SET Quantity = ? WHERE ProductID = ?";
        String sqlGetNum = "SELECT Quantity FROM Product WHERE ProductID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            PreparedStatement pstm1 = conn.prepareStatement(sqlGetNum))
        {
            int quantity = 0;
            pstm1.setString(1, hd.getProductID());
            ResultSet rs = pstm1.executeQuery();
            if(rs.next()){
                quantity = rs.getInt("Quantity");
            }
            if(check == 1){
                pstm.setInt(1, hd.getNum()+quantity);
            }
            else if(check == 2){
                pstm.setInt(1, quantity - hd.getNum());
            }
            else if(check == 3){
                pstm.setInt(1, quantity + sl);
            }
            else{
                pstm.setInt(1, quantity - sl);
            }
            pstm.setString(2, hd.getProductID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateNumberProduct in PhieuNhapRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<ImportDetail> getImportDetailGroupID(int id) {
        List<ImportDetail> lst = new ArrayList<>();
        String sql = "SELECT * FROM ImportDetail WHERE importID = ?";
        try(Connection conn = Connect.getConnection();
           PreparedStatement pstm = conn.prepareStatement(sql)) 
        {
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                lst.add(new ImportDetail(rs));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION getImportDetail in PhieuNhapRepository: " + ex.getMessage());
        }
        return lst;
    }

}
