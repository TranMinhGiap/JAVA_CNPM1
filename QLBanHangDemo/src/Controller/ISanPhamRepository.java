/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Product;
import Model.Category;
import Model.Supplier;
import java.util.List;

/**
 *
 * @author TRAN MINH GIAP
 */

/*Bao Gồm Sản Phẩm / Nhà Cung Cấp / Danh Mục Sản Phẩm*/
public interface ISanPhamRepository {
    List<Product> getAll();
    List<Product> getProductForSale();
    List<String> getComoboxSP();
    List<Category> getComboboxCategory();
    List<String> getListSP();
    List<Supplier> getcomboboxSupplier();
    /*Sản Phẩm*/
    boolean addProduct(Product sp);
    boolean updateProduct(Product sp);
    boolean deleteProduct(Product sp);
    /*Danh Mục Sản Phẩm*/
    String getNameCategory(String id); /*Lấy tên loại thông qua id*/
    boolean addCategory(Category dm);
    boolean updateCategory(Category dm);
    boolean deleteCategory(Category dm);
    /*Nhà Cung Cấp*/
    String getNameSuppier(String id); /*Lấy tên nhà cung cấp thông qua id*/
    boolean addSupplier(Supplier sp);
    boolean updateSupplier(Supplier sp);
    boolean deleteSupplier(Supplier sp);
}
