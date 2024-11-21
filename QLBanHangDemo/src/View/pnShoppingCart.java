/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.KhachHangRepository;
import Controller.PhieuBan;
import Controller.SanPhamRepository;
import Model.Customer;
import Model.Product;
import java.awt.Color;
import java.awt.Window;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
public class pnShoppingCart extends javax.swing.JPanel {
    SanPhamRepository sp = new SanPhamRepository();
    List<Product> lst = sp.getProductForSale();
    List<Object[]> cartList = new ArrayList<>();
    KhachHangRepository kh = new KhachHangRepository();
    List<Customer> lsCustomers = kh.getAll();
    public pnShoppingCart() {
        initComponents();
//        loadDataSanPhamDangBan();
        LoadComboBoxSP();
        LoadGioHang();
    }
    public void LoadComboBoxSP(){
        cboSPDangBan.removeAll();
        for(Product product : lst){
            cboSPDangBan.addItem(product.getProductName());
        }
    }
    public boolean CheckSoLuongSP(){
        if(txtSoLuong.getText().isEmpty()){
            lbCheckSL.setForeground(Color.red);
            lbCheckSL.setText("Vui lòng nhập số lượng");
            return false;
        }
        int soLuong;
        try {
            soLuong = Integer.parseInt(txtSoLuong.getText());
        } catch (NumberFormatException e) {
            lbCheckSL.setForeground(Color.red);
            lbCheckSL.setText("Số lượng phải là một số");
            return false;
        }
        for (Product product : lst) {
            if (txtMaSP.getText().equals(product.getProductID())) {
                if (soLuong > product.getQuantity()) {
                    lbCheckSL.setForeground(Color.red);
                    lbCheckSL.setText("Không đủ số lượng sản phẩm");
                    return false;
                }
            }
        }
        return true;
    }
    public void LoadGioHang(){
        String[] columnNames = {"Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Giá Bán", "Loại SP", "NCC", "Tổng tiền"};
        DefaultTableModel tbmGioHang = (DefaultTableModel) this.tbmGioHang.getModel();
        tbmGioHang.setColumnIdentifiers(columnNames);
        tbmGioHang.setRowCount(0);
        for(Object[] rowData : cartList){
            tbmGioHang.addRow(rowData);
        }
    }
    public void ToTalPrice(){
        double price = 0;
        DefaultTableModel model = (DefaultTableModel) tbmGioHang.getModel();
        for(int i = 0; i < model.getRowCount(); i++){
            double rowTotal = (double) model.getValueAt(i, 6);
            price += rowTotal;
        }
        txtTotal.setText(String.valueOf(price));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbmGioHang = new javax.swing.JTable();
        btnAddSP = new javax.swing.JButton();
        btnUpdateSP = new javax.swing.JButton();
        btnDeleteSP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTienTra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTraLai = new javax.swing.JTextField();
        btnComplete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        cboSPDangBan = new javax.swing.JComboBox<>();
        txtMaSP = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtLoaiSP = new javax.swing.JTextField();
        txtNCC = new javax.swing.JTextField();
        lbCheckSL = new javax.swing.JLabel();
        lbCheckKH = new javax.swing.JLabel();
        lbCheckPrice = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtOrderDate = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("BÁN HÀNG");

        tbmGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Loại SP", "NCC", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbmGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmGioHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbmGioHang);

        btnAddSP.setText("Thêm");
        btnAddSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSPActionPerformed(evt);
            }
        });

        btnUpdateSP.setText("Sửa");
        btnUpdateSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSPActionPerformed(evt);
            }
        });

        btnDeleteSP.setText("Xóa");
        btnDeleteSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSPActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("GIỎ HÀNG");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("SẢN PHẨM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Total");

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Khách trả");

        txtTienTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Trả lại");

        txtTraLai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnComplete.setText("Hoàn tất");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenKHKeyReleased(evt);
            }
        });

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Address");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("CustomerID");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("CustomerName");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Phone");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Mã SP");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Tên SP");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Số lượng");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Đơn giá");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Loại SP");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("NCC");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSoLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSoLuongMouseClicked(evt);
            }
        });

        cboSPDangBan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboSPDangBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSPDangBanActionPerformed(evt);
            }
        });

        txtMaSP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaSP.setEnabled(false);

        txtDonGia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDonGia.setEnabled(false);

        txtLoaiSP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoaiSP.setEnabled(false);

        txtNCC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNCC.setEnabled(false);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Ngày Mua");

        txtOrderDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtOrderDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOrderDateMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Mã HĐ");

        txtMaHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaHDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addGap(3, 3, 3)))
                                        .addGap(3, 3, 3)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbCheckSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSoLuong)
                                    .addComponent(cboSPDangBan, 0, 234, Short.MAX_VALUE)
                                    .addComponent(txtMaSP)
                                    .addComponent(txtDonGia)
                                    .addComponent(txtLoaiSP)
                                    .addComponent(txtNCC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtOrderDate)
                                    .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(48, 48, 48)
                                .addComponent(btnAddSP)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteSP)
                    .addComponent(btnUpdateSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(9, 9, 9))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnComplete)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCheckKH)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtTraLai, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtTienTra, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(lbCheckPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addGap(124, 124, 124))))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel11)
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(cboSPDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCheckSL)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(btnAddSP))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel20)
                                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21))
                                        .addGap(12, 12, 12))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCheckKH)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lbCheckPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(btnUpdateSP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGap(10, 10, 10)
                        .addComponent(btnDeleteSP)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnComplete)
                            .addComponent(btnCancel))
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTienTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(47, 47, 47))))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSPActionPerformed
        if(CheckSoLuongSP()){
            String ProductID = txtMaSP.getText();
            String ProductName = (String) cboSPDangBan.getSelectedItem();
            int soluong = Integer.parseInt(txtSoLuong.getText());
            double price = Double.parseDouble(txtDonGia.getText());
            double ThanhTien = soluong*price;
            boolean IsExit = false;
            
            for(Object[] rowData : cartList){
                String cartProductID = (String) rowData[0];
                if(cartProductID.equals(ProductID)){
                    rowData[2] = (int) rowData[2] + soluong;
                    System.out.println("RowData: " +(int) rowData[2] + soluong);
                    rowData[6] =  (int) rowData[2] * price * 1.0;
                    IsExit = true;
                    break;
                }
            }
            if(!IsExit){
                  cartList.add(new Object[] {
                  txtMaSP.getText(),
                  cboSPDangBan.getSelectedItem(),
                  soluong,
                  price,
                  txtLoaiSP.getText(),
                  txtNCC.getText(),
                  ThanhTien
              }); 
            }
        }
//        System.out.println("Cart List" + cartList.size());
        LoadGioHang();
        ToTalPrice();
    }//GEN-LAST:event_btnAddSPActionPerformed

    private void cboSPDangBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSPDangBanActionPerformed
        String name = (String) cboSPDangBan.getSelectedItem();
        for(Product product : lst){
            if(name.equals(product.getProductName())){
                txtMaSP.setText(product.getProductID());
                txtDonGia.setText(String.valueOf(product.getProductPriceOut()));
                txtLoaiSP.setText(sp.getNameCategory(product.getProductID()));
                txtNCC.setText(sp.getNameSuppier(product.getSupplierID()));
            }
        }
    }//GEN-LAST:event_cboSPDangBanActionPerformed

    private void txtSoLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSoLuongMouseClicked
        lbCheckSL.setText("");
    }//GEN-LAST:event_txtSoLuongMouseClicked

    private void tbmGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmGioHangMouseClicked
        // TODO add your handling code here:
        int selectedRow = tbmGioHang.getSelectedRow();
        txtMaSP.setText(tbmGioHang.getValueAt(selectedRow, 0).toString());
        cboSPDangBan.setSelectedItem(tbmGioHang.getValueAt(selectedRow, 1));
        txtSoLuong.setText(tbmGioHang.getValueAt(selectedRow, 2).toString());
        txtDonGia.setText(tbmGioHang.getValueAt(selectedRow, 3).toString());
        txtLoaiSP.setText(tbmGioHang.getValueAt(selectedRow, 4).toString());
        txtNCC.setText(tbmGioHang.getValueAt(selectedRow, 5).toString());
        
    }//GEN-LAST:event_tbmGioHangMouseClicked

    private void btnUpdateSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSPActionPerformed
        if(tbmGioHang.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 hàng để cập nhật số lượng");
        }
        else{
            tbmGioHang.setValueAt(txtSoLuong.getText(), tbmGioHang.getSelectedRow(), 2);
            tbmGioHang.setValueAt(Double.parseDouble(txtDonGia.getText())* Integer.parseInt(txtSoLuong.getText()), tbmGioHang.getSelectedRow(), 6);
            JOptionPane.showMessageDialog(this, "Update successful");
        }
        ToTalPrice();
    }//GEN-LAST:event_btnUpdateSPActionPerformed

    private void btnDeleteSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSPActionPerformed
        // TODO add your handling code here:
        if(tbmGioHang.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 hàng để xóa sản phẩm khỏi giỏ");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) tbmGioHang.getModel();
            model.removeRow(tbmGioHang.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Delete successful");
        }
        ToTalPrice();
    }//GEN-LAST:event_btnDeleteSPActionPerformed

    private void txtTenKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKHKeyReleased
        // TODO add your handling code here:
        for(Customer customer : lsCustomers){
            
            if(customer.getCustomerName().toLowerCase().equals(txtTenKH.getText().toLowerCase())){
                txtMaKH.setText(customer.getCustomerID());
                txtDiaChi.setText(customer.getCustomerAddress());
                txtSDT.setText(customer.getCustomerPhone());
//                lbCheckKH.setText("");
            }
//            else{
//                lbCheckKH.setForeground(Color.red);
//                lbCheckKH.setText("Đây là khách hàng mới!");
//            }
        }
    }//GEN-LAST:event_txtTenKHKeyReleased

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        if(Double.parseDouble(txtTienTra.getText()) < Double.parseDouble(txtTotal.getText())){
            lbCheckPrice.setText("Không đủ tiền trả hàng");
            lbCheckPrice.setForeground(Color.red);
        }
        else{
           lbCheckPrice.setText("");
           txtTraLai.setText(String.valueOf(Double.parseDouble(txtTienTra.getText()) - Double.parseDouble(txtTotal.getText())));
            PhieuBan pb = new PhieuBan();
            System.out.println("ID employee: "+ frmMain.id);
            try {
                pb.InsertHD(txtMaHD.getText(), txtMaKH.getText(), txtOrderDate.getText() , Double.parseDouble(txtTotal.getText()));
                pb.InsertOrderDetail(txtMaHD.getText(), cartList);
                pb.updateQuantityProduct(cartList);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Hủy hóa đơn thành công");
        Window window = SwingUtilities.windowForComponent(this);
        if(window!=null){
            window.dispose();
        }
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtOrderDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOrderDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderDateMouseClicked

    private void txtMaHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaHDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHDMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSP;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnDeleteSP;
    private javax.swing.JButton btnUpdateSP;
    private javax.swing.JComboBox<String> cboSPDangBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCheckKH;
    private javax.swing.JLabel lbCheckPrice;
    private javax.swing.JLabel lbCheckSL;
    private javax.swing.JTable tbmGioHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtLoaiSP;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNCC;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTienTra;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTraLai;
    // End of variables declaration//GEN-END:variables
}
