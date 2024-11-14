/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Import;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author TRAN MINH GIAP
 */
public class QuanLyPhieuNhap implements IQuanLyPhieuNhap{

    @Override
    public int createID() {
        int id = 0;
        String sql = "SELECT MAX(importID) AS maxID FROM Import";
        String sqlAddID = "INSERT INTO Import(importID) VALUES (?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            PreparedStatement pstmAdd = conn.prepareStatement(sqlAddID);
            ResultSet rs = pstm.executeQuery())
        {
            if(rs.next() && rs.getInt("maxID") != 0){
                id = rs.getInt("maxID");
            }
            else{
                id = 1;
            }
            pstmAdd.setInt(1, id+1);
            pstmAdd.executeUpdate();
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION createID in QuanLyPhieuNhap: " + ex.getMessage());
        }
        return id+1;
    }

    @Override
    public List<Import> getImport() {
        executeImport();
        String sql = "SELECT * FROM Import";
        List<Import> lst = new ArrayList<>();
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery())
        {
            while(rs.next()){
                lst.add(new Import(rs));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION getImport in QuanLyPhieuNhapRepository: " + ex.getMessage());
        }
        return lst;
    }
    /*Chua xử lý xong do truy vấn update dư liệu chưa rõ ràng để cập nhật*/
    @Override
    public void executeImport() {
        int id = 0;
        String importDay = "";
        int sum = 0;
        float total = 0;
        /*sql Lấy dữ liệu về*/
        String sql = "SELECT importID, importDay, SUM(total) AS Total, SUM(num) AS TotalNum FROM ImportDetail GROUP BY importID, importDay";
        /*sql update khi da lay du lieu*/
        String sqlUpdate = "UPDATE Import SET num = ?, importDay = ?, total = ? WHERE importID = ?";
        try(Connection conn = Connect.getConnection();
            /*pstm lay du lieu*/
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();  /*Lưu Kết quả*/
            /*pstm1 cap nhat du lieu*/
            PreparedStatement pstm1 = conn.prepareStatement(sqlUpdate))
        {
            while(rs.next()){
                id = rs.getInt("importID");
                importDay = rs.getString("importDay");
                sum = rs.getInt("TotalNum");
                total = rs.getFloat("Total");
                /*Lấy xong thì sử dụng làm đối số*/
                pstm1.setInt(1, sum);
                pstm1.setString(2, importDay);
                pstm1.setFloat(3, total);
                pstm1.setInt(4, id);
                if(pstm1.executeUpdate() > 0){
                    System.out.println("CẬP NHẬT DỮ LIỆU CHO BẢNG PHIẾU THÀNH CÔNG !");
                }
                else{
                    System.out.println("CẬP NHẬT DỮ LIỆU CHO BẢNG PHIẾU KHÔNG THÀNH CÔNG !");
                }
            }
        } catch (Exception ex) {
            System.out.println("Không thể cập nhập dữ liệu vào bảng import (quản lý hóa đơn) do lỗi + " + ex.getMessage());
        }
    }

    @Override
    public boolean addImport(Import ip) {
        String sql = "INSERT INTO Import VALUES (?,?,?,?,?,?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setInt(1, ip.getImportID());
            pstm.setString(2, ip.getEmployeesName());
            pstm.setInt(3, ip.getNum());
            pstm.setString(4, ip.getImportDay());
            pstm.setFloat(5, ip.getTotal());
            pstm.setString(6, ip.getNote());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION addImport in QuanLyPhieuNhapRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateImport(Import ip) {
        String sql = "UPDATE Import SET employeesName = ?, num = ?, importDay = ?, total = ?, note = ? WHERE importID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, ip.getEmployeesName());
            pstm.setInt(2, ip.getNum());
            pstm.setString(3, ip.getImportDay());
            pstm.setFloat(4, ip.getTotal());
            pstm.setString(5, ip.getNote());
            pstm.setInt(6, ip.getImportID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateImport in QuanLyPhieuNhapRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteImport(Import ip) {
        String sql = "DELETE FROM Import WHERE importID = ?";
        String sql1 = "DELETE FROM ImportDetail WHERE importID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            PreparedStatement pstm1 = conn.prepareStatement(sql1))
        {
            pstm.setInt(1, ip.getImportID());
            pstm1.setInt(1, ip.getImportID());
            if(pstm1.executeUpdate() >= 0){
                return pstm.executeUpdate() > 0;
            }
            else{
                System.out.println("Lỗi trong hàm deleteImport int QuanLyPhieuNhap !");
                return false;
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION deleteImport in QuanLyPhieuNhapRepository: " + ex.getMessage());
            return false;
        }
    }
}
