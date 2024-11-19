/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Category;
import Model.Product;
import Model.Supplier;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author TRAN MINH GIAP
 */
public class SanPhamRepository implements ISanPhamRepository{

    @Override
    public List<Product> getAll() {
        List<Product> lstProduct = new ArrayList<>();
        String sql = "SELECT * FROM Product";
        try(Connection conn = Connect.getConnection();
           PreparedStatement pstm = conn.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery()) 
       {
           while(rs.next()){
               lstProduct.add(new Product(rs));
           }
       } catch (Exception ex) {
           System.out.println("ERROR IN FUNCTION getAll in SanPhamRepository: " + ex.getMessage());
       }
       return lstProduct;
    }

    @Override
    public boolean addProduct(Product sp) {
        String sql = "INSERT INTO Product(ProductID, ProductName, Quantity, PriceOut, CategoryID, SupplierID, PriceIn) VALUES (?,?,?,?,?,?,?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)
            ) 
        {
            pstm.setString(1, sp.getProductID());
            pstm.setString(2, sp.getProductName());
            pstm.setInt(3, sp.getQuantity());
            pstm.setFloat(4, sp.getProductPriceOut());
            pstm.setString(5, sp.getCategoryID());
            pstm.setString(6, sp.getSupplierID());
            pstm.setFloat(7, sp.getProductPriceIn());
            return pstm.executeUpdate() > 0; 
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION addProduct in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateProduct(Product sp) {
        String sql = "UPDATE Product SET ProductName = ?, Quantity = ?, PriceOut = ?, CategoryID = ?, SupplierID = ?, PriceIn = ? WHERE ProductID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(7, sp.getProductID());
            pstm.setString(1, sp.getProductName());
            pstm.setInt(2, sp.getQuantity());
            pstm.setFloat(3, sp.getProductPriceOut());
            pstm.setString(4, sp.getCategoryID());
            pstm.setString(5, sp.getSupplierID());
            pstm.setFloat(6, sp.getProductPriceIn());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateProduct in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteProduct(Product sp) {
        String sql = "DELETE FROM Product WHERE ProductID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)
            )
        {
            pstm.setString(1, sp.getProductID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION deleteProduct in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    } 

    @Override
    public List<String> getComoboxSP() {
        List<String> lst = new ArrayList<>();
        String sql = "SELECT CategoryName FROM Product, Category WHERE Product.CategoryID = Category.CategoryID GROUP BY CategoryName";
        try(Connection conn = Connect.getConnection();
           PreparedStatement pstm = conn.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery())
        {
            while(rs.next()){
                lst.add(rs.getString("CategoryName"));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION getComoboxSP in SanPhamRepository: " + ex.getMessage());
        }
        return lst;
    }

    @Override
    public List<String> getListSP() {
        List<String> lst = new ArrayList<>();
        String sql = "SELECT CategoryName FROM Category";
        try(Connection conn = Connect.getConnection();
           PreparedStatement pstm = conn.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery())
        {
            while(rs.next()){
                lst.add(rs.getString("CategoryName"));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION getListSP in SanPhamRepository: " + ex.getMessage());
        }
        return lst;
    }

    @Override
    public List<Category> getComboboxCategory() {
        List<Category> lst = new ArrayList<>();
        String sql = "SELECT * FROM Category";
        try(Connection conn = Connect.getConnection();
           PreparedStatement pstm = conn.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery())
        {
            while(rs.next()){
                String id = rs.getString("CategoryID");
                String name = rs.getString("CategoryName");
                String desc = rs.getString("Description");
//                System.out.println("Đọc ID / NAME / DESC : " + id + " / " + name + " / " + desc);
                lst.add(new Category(id, name, desc));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION getComoboxCategory in SanPhamRepository: " + ex.getMessage());
        }
        return lst;
    }

    @Override
    public List<Supplier> getcomboboxSupplier() {
        List<Supplier> lst = new ArrayList<>();
        String sql = "SELECT * FROM Supplier";
        try(Connection conn = Connect.getConnection();
           PreparedStatement pstm = conn.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery())
        {
            while(rs.next()){
                String id = rs.getString("SupplierID");
                String name = rs.getString("SupplierName");
                String address = rs.getString("SupplierAddress");
                String phone = rs.getString("Phone");
                String status = rs.getString("Status");
                lst.add(new Supplier(id, name, address, phone, status));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION getcomoboxSupplier in SanPhamRepository: " + ex.getMessage());
        }
        return lst;
    }
    
    
    /*Category*/
    
    @Override
    public boolean addCategory(Category dm) {
        String sql = "INSERT INTO Category VALUES (?,?,?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1,dm.getCategoryID());
            pstm.setString(2, dm.getCategoryName());
            pstm.setString(3, dm.getDescription());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION addCategory in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateCategory(Category dm) {
        String sql = "UPDATE Category SET CategoryName = ?, Description = ? WHERE CategoryID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, dm.getCategoryName());
            pstm.setString(2, dm.getDescription());
            pstm.setString(3, dm.getCategoryID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateCategory in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteCategory(Category dm) {
        String sql = "DELETE FROM Category WHERE CategoryID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1,dm.getCategoryID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION deleteCategory in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    }

    /*Supplier*/
    
    @Override
    public boolean addSupplier(Supplier sp) {
        String sql = "INSERT INTO Supplier VALUES (?,?,?,?, ?)";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, sp.getSupplierID());
            pstm.setString(2, sp.getSupplierName());
            pstm.setString(3, sp.getAddress());
            pstm.setString(4, sp.getPhone());
            pstm.setString(5, sp.getStatus());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION addSupplier in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateSupplier(Supplier sp) {
        String sql = "UPDATE Supplier SET SupplierName = ?, SupplierAddress = ?, Phone = ?, Status = ? WHERE SupplierID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, sp.getSupplierName());
            pstm.setString(2, sp.getAddress());
            pstm.setString(3, sp.getPhone());
            pstm.setString(4, sp.getStatus());
            pstm.setString(5, sp.getSupplierID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION updateSupplier in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteSupplier(Supplier sp) {
//        String sql = "DELETE FROM Supplier WHERE SupplierID = ?";
        String sql = "UPDATE Supplier SET SupplierName = ?, SupplierAddress = ?, Phone = ?, Status = ? WHERE SupplierID = ?";
        try(Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, sp.getSupplierName());
            pstm.setString(2, sp.getAddress());
            pstm.setString(3, sp.getPhone());
            pstm.setString(4, sp.getStatus());
            pstm.setString(5, sp.getSupplierID());
            return pstm.executeUpdate() > 0;
        } catch (Exception ex) {
            System.out.println("ERROR IN FUNCTION deleteSupplier in SanPhamRepository: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Product> getProductForSale() {
    List<Product> lstProduct = new ArrayList<>();
    String sql = "SELECT * FROM Product WHERE Quantity > 0";
    try (Connection conn = Connect.getConnection();
         PreparedStatement pstm = conn.prepareStatement(sql);
         ResultSet rs = pstm.executeQuery()) 
    {
        while (rs.next()) {
            lstProduct.add(new Product(rs));  
        }
    } catch (Exception ex) {
        System.err.println("ERROR IN FUNCTION getProductForSale in SanPhamRepository: " + ex.getMessage());
        ex.printStackTrace();  
    }
    return lstProduct;
}

    @Override
    public String getNameSuppier(String id) {
        String sql = "SELECT SupplierName FROM Supplier WHERE SupplierID = ?";
        String ans = "";
        try (Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
        
            if (rs.next()) {  
                ans = rs.getString("SupplierName");
            }   
        } catch (Exception ex) {
            System.err.println("ERROR IN FUNCTION getNameSupplier in SanPhamRepository: " + ex.getMessage());
            ex.printStackTrace(); 
        }
        return ans;
    }

    @Override
    public String getNameCategory(String id) {
       String sql = "SELECT ProductName FROM Product WHERE ProductID = ?";
       String ans = "";
        try (Connection conn = Connect.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql))
        {
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
        
            if (rs.next()) {  
                ans = rs.getString("ProductName");
            }   
        } catch (Exception ex) {
            System.err.println("ERROR IN FUNCTION getNameCategory in SanPhamRepository: " + ex.getMessage());
            ex.printStackTrace(); 
        }
        return ans;
    }
}
