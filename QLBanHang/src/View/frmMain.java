/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.KhachHangRepository;
import Controller.NhanVienRepository;
import Controller.QuanLyPhieuNhap;
import Controller.SanPhamRepository;
import Model.Category;
import Model.Employees;
import Model.Customer;
import Model.Import;
import Model.Product;
import Model.Supplier;
import java.awt.CardLayout;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author TRAN MINH GIAP
 */
public class frmMain extends javax.swing.JFrame {
    DefaultTableModel tbmNhanVien = new DefaultTableModel();
    DefaultTableModel tbmKhachHang = new DefaultTableModel();
    DefaultTableModel tbmSanPham = new DefaultTableModel();
    DefaultTableModel tbmSanPhamDangBan = new DefaultTableModel();
    DefaultTableModel tbmQLPhieuNhap = new DefaultTableModel();
    DefaultTableModel tbmNhaCungCap = new DefaultTableModel();
    DefaultTableModel tbmorderDetail = new DefaultTableModel();
    DefaultListModel<Category> lstCategory = new DefaultListModel<>();
    private List<Category> lstCategoryBoLoc = new ArrayList<>();
    private List<Product> lstSanPhamBanBoLoc = new ArrayList<>();
    
    public frmMain() {
        initComponents();
//        this.add(pnSignIn, "card1");
//        this.add(pnMain, "card2");
//        pnSignIn.setName("card1");
//        pnMain.setName("card2");
        loadDataNhanVien();
        loadDataKhachHang();
        loadDataSanPham();
        loadDSPhieuNhap();
        loadCategorySP();
        loadSupplier();
        loadDataSanPhamDangBan();
        loadorderDetail();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbGender = new javax.swing.ButtonGroup();
        pnSignIn = new javax.swing.JPanel();
        pnLeft = new javax.swing.JPanel();
        pnRight = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();
        cbxCV = new javax.swing.JComboBox<>();
        lblHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        lblFooter = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();
        pnNav = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblQLNhanVien = new javax.swing.JLabel();
        lblQLKhachHang = new javax.swing.JLabel();
        lblQLSanPham = new javax.swing.JLabel();
        lblQLNhapKho = new javax.swing.JLabel();
        lblQLNCC = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnCard = new javax.swing.JPanel();
        pnHome = new javax.swing.JPanel();
        pnQLNhanVien = new javax.swing.JPanel();
        lblHeaderQLNV = new javax.swing.JLabel();
        lblIDNV = new javax.swing.JLabel();
        lblNameNV = new javax.swing.JLabel();
        lblGenderNV = new javax.swing.JLabel();
        lblBirthNV = new javax.swing.JLabel();
        lblAddressNV = new javax.swing.JLabel();
        lblPhoneNV = new javax.swing.JLabel();
        lblHomeTownNV = new javax.swing.JLabel();
        txtIDNV = new javax.swing.JTextField();
        txtAddressNV = new javax.swing.JTextField();
        txtPhoneNV = new javax.swing.JTextField();
        txtHomeTownNV = new javax.swing.JTextField();
        rbtNamNV = new javax.swing.JRadioButton();
        rbtNuNV = new javax.swing.JRadioButton();
        txtNameNV = new javax.swing.JTextField();
        lblMonthNV = new javax.swing.JLabel();
        lblYearNV = new javax.swing.JLabel();
        lblDayNV = new javax.swing.JLabel();
        txtDayNV = new javax.swing.JTextField();
        txtMonthNV = new javax.swing.JTextField();
        txtYearNV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQLNV = new javax.swing.JTable();
        btnADDNV = new javax.swing.JButton();
        btnUPDATENV = new javax.swing.JButton();
        btnDELETENV = new javax.swing.JButton();
        btnRESETNV = new javax.swing.JButton();
        btnSAVENV = new javax.swing.JButton();
        pnQLKhachHang = new javax.swing.JPanel();
        lblHeaderKH = new javax.swing.JLabel();
        lblIDKH = new javax.swing.JLabel();
        lblNameKH = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbQLKH = new javax.swing.JTable();
        lblAddressKH = new javax.swing.JLabel();
        lblPhoneKH = new javax.swing.JLabel();
        btnAddKH = new javax.swing.JButton();
        btnUpdateKH = new javax.swing.JButton();
        btnDeleteKH = new javax.swing.JButton();
        btnResetKH = new javax.swing.JButton();
        btnSaveKH = new javax.swing.JButton();
        txtIDKH = new javax.swing.JTextField();
        txtNameKH = new javax.swing.JTextField();
        txtAddressKH = new javax.swing.JTextField();
        txtPhoneKH = new javax.swing.JTextField();
        pnQLSPNew = new javax.swing.JPanel();
        pnToolQLSP = new javax.swing.JPanel();
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        lblHeaderQLSP = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbQLSPNew = new javax.swing.JTable();
        pnTitleTableSP = new javax.swing.JPanel();
        lblTitleQLSP = new javax.swing.JLabel();
        cbxLocSP = new javax.swing.JComboBox<>();
        txtTimKiemSP = new javax.swing.JTextField();
        btnTimKiemSP = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        pnNhapKho = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbNhapKho = new javax.swing.JTable();
        pnHeaderNhapSP = new javax.swing.JPanel();
        lblHeaderNhapSP = new javax.swing.JLabel();
        txtSearchNhapSP = new javax.swing.JTextField();
        btnSearchNhapSP = new javax.swing.JButton();
        cbxLocNhapSP = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        btnNhapSP = new javax.swing.JButton();
        pnTitleTableNhapSP = new javax.swing.JPanel();
        lblTitleTableNhapSP = new javax.swing.JLabel();
        btnXoaPhieu = new javax.swing.JButton();
        btnXemChiTietPhieuNhap = new javax.swing.JButton();
        pnQLNhaCungCap = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbNCC = new javax.swing.JTable();
        lblIDNCC = new javax.swing.JLabel();
        lblAddressNCC = new javax.swing.JLabel();
        lblPhoneNCC = new javax.swing.JLabel();
        txtIDNCC = new javax.swing.JTextField();
        txtAddressNCC = new javax.swing.JTextField();
        btnSuaNCC = new javax.swing.JButton();
        btnAddDMSP = new javax.swing.JButton();
        btnSuaDMSP = new javax.swing.JButton();
        btnAddNCC = new javax.swing.JButton();
        btnXoaDMSP = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstCategorySP = new javax.swing.JList<>();
        pnHeaderQLNCC = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnTitleTableNCC = new javax.swing.JPanel();
        lblTitleTableNCC = new javax.swing.JLabel();
        txtPhoneNCC = new javax.swing.JTextField();
        pnHeaderDMSP = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbxLocNCCKhuVuc = new javax.swing.JComboBox<>();
        txtTimKiemDMSP = new javax.swing.JTextField();
        btnTimKiemDMSP = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        btnXoaNCC = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        txtNameNCC = new javax.swing.JTextField();
        lblNameNCC = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        pnBanHang = new javax.swing.JPanel();
        pnHeader = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbSPB = new javax.swing.JTable();
        pnTitleTable = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblSearchIDSP = new javax.swing.JLabel();
        txtSearchIDSPB = new javax.swing.JTextField();
        cbxLocSPBan = new javax.swing.JComboBox<>();
        lblGioHang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1349, 760));
        getContentPane().setLayout(new java.awt.CardLayout());

        pnLeft.setBackground(new java.awt.Color(74, 31, 61));

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        pnLeftLayout.setVerticalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );

        pnRight.setBackground(new java.awt.Color(186, 79, 84));
        pnRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserName.setBackground(new java.awt.Color(186, 79, 84));
        txtUserName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(204, 204, 204));
        txtUserName.setBorder(null);
        txtUserName.setCaretColor(new java.awt.Color(255, 255, 255));
        pnRight.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 243, 320, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        pnRight.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 242, 131, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        pnRight.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 318, 131, 50));

        txtPassWord.setBackground(new java.awt.Color(186, 79, 84));
        txtPassWord.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPassWord.setForeground(new java.awt.Color(204, 204, 204));
        txtPassWord.setBorder(null);
        txtPassWord.setCaretColor(new java.awt.Color(255, 255, 255));
        pnRight.add(txtPassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 319, 320, 40));

        cbxCV.setBackground(new java.awt.Color(186, 79, 84));
        cbxCV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbxCV.setForeground(new java.awt.Color(255, 255, 255));
        cbxCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employeers" }));
        pnRight.add(cbxCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 164, 320, 40));

        lblHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("SIGN IN");
        pnRight.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 730, 70));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        pnRight.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 320, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        pnRight.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 287, 320, 10));

        btnLogin.setBackground(new java.awt.Color(186, 79, 84));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log In");
        btnLogin.setAutoscrolls(true);
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnRight.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 110, 40));

        btnSignup.setBackground(new java.awt.Color(186, 79, 84));
        btnSignup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");
        btnSignup.setAutoscrolls(true);
        btnSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnRight.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 110, 40));

        lblFooter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFooter.setForeground(new java.awt.Color(255, 255, 255));
        lblFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFooter.setText("Forget Password ?");
        pnRight.add(lblFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 730, -1));

        javax.swing.GroupLayout pnSignInLayout = new javax.swing.GroupLayout(pnSignIn);
        pnSignIn.setLayout(pnSignInLayout);
        pnSignInLayout.setHorizontalGroup(
            pnSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSignInLayout.createSequentialGroup()
                .addComponent(pnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnSignInLayout.setVerticalGroup(
            pnSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnSignIn, "card1");

        pnMain.setBackground(new java.awt.Color(255, 0, 0));
        pnMain.setPreferredSize(new java.awt.Dimension(1349, 760));

        pnNav.setBackground(new java.awt.Color(0, 153, 0));

        lblHome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("Home");

        lblQLNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblQLNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLNhanVien.setText("Quản Lý Nhân Viên");
        lblQLNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLNhanVienMouseClicked(evt);
            }
        });

        lblQLKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblQLKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLKhachHang.setText("Quản Lý Khách Hàng");
        lblQLKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLKhachHangMouseClicked(evt);
            }
        });

        lblQLSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblQLSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLSanPham.setText("Quản Lý Sản Phẩm");
        lblQLSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLSanPhamMouseClicked(evt);
            }
        });

        lblQLNhapKho.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLNhapKho.setForeground(new java.awt.Color(255, 255, 255));
        lblQLNhapKho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLNhapKho.setText("Quản Lý Nhập Kho");
        lblQLNhapKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLNhapKhoMouseClicked(evt);
            }
        });

        lblQLNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLNCC.setForeground(new java.awt.Color(255, 255, 255));
        lblQLNCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLNCC.setText("Quản Lý Nhà Cung Cấp");
        lblQLNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLNCCMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bán Hàng");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnNavLayout = new javax.swing.GroupLayout(pnNav);
        pnNav.setLayout(pnNavLayout);
        pnNavLayout.setHorizontalGroup(
            pnNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblQLNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblQLKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(lblQLSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblQLNhapKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblQLNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnNavLayout.setVerticalGroup(
            pnNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNavLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQLNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQLKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQLSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQLNhapKho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQLNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCard.setBackground(new java.awt.Color(51, 255, 51));
        pnCard.setLayout(new java.awt.CardLayout());

        pnHome.setBackground(new java.awt.Color(255, 0, 0));
        pnHome.setPreferredSize(new java.awt.Dimension(1083, 760));

        javax.swing.GroupLayout pnHomeLayout = new javax.swing.GroupLayout(pnHome);
        pnHome.setLayout(pnHomeLayout);
        pnHomeLayout.setHorizontalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        pnHomeLayout.setVerticalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );

        pnCard.add(pnHome, "card3");

        pnQLNhanVien.setBackground(new java.awt.Color(122, 122, 220));
        pnQLNhanVien.setPreferredSize(new java.awt.Dimension(1083, 760));

        lblHeaderQLNV.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHeaderQLNV.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderQLNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeaderQLNV.setText("QUẢN LÝ NHÂN VIÊN");

        lblIDNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblIDNV.setForeground(new java.awt.Color(255, 255, 255));
        lblIDNV.setText("ID");

        lblNameNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNameNV.setForeground(new java.awt.Color(255, 255, 255));
        lblNameNV.setText("Name");

        lblGenderNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblGenderNV.setForeground(new java.awt.Color(255, 255, 255));
        lblGenderNV.setText("Gender");

        lblBirthNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBirthNV.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthNV.setText("Birth");

        lblAddressNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddressNV.setForeground(new java.awt.Color(255, 255, 255));
        lblAddressNV.setText("Address");

        lblPhoneNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhoneNV.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNV.setText("Phone");

        lblHomeTownNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblHomeTownNV.setForeground(new java.awt.Color(255, 255, 255));
        lblHomeTownNV.setText("HomeTown");

        txtIDNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtAddressNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtPhoneNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtHomeTownNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        grbGender.add(rbtNamNV);
        rbtNamNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtNamNV.setForeground(new java.awt.Color(255, 255, 255));
        rbtNamNV.setText("Nam");

        grbGender.add(rbtNuNV);
        rbtNuNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtNuNV.setForeground(new java.awt.Color(255, 255, 255));
        rbtNuNV.setText("Nữ");

        txtNameNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        lblMonthNV.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblMonthNV.setForeground(new java.awt.Color(255, 255, 255));
        lblMonthNV.setText("Month");

        lblYearNV.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblYearNV.setForeground(new java.awt.Color(255, 255, 255));
        lblYearNV.setText("Year");

        lblDayNV.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblDayNV.setForeground(new java.awt.Color(255, 255, 255));
        lblDayNV.setText("Day");

        txtDayNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtMonthNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtYearNV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        tbQLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "Birth", "Gender", "Address", "Phone", "HomeTown"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQLNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbQLNV);

        btnADDNV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnADDNV.setText("ADD");
        btnADDNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDNVActionPerformed(evt);
            }
        });

        btnUPDATENV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUPDATENV.setText("UPDATE");
        btnUPDATENV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATENVActionPerformed(evt);
            }
        });

        btnDELETENV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDELETENV.setText("DELETE");
        btnDELETENV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETENVActionPerformed(evt);
            }
        });

        btnRESETNV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRESETNV.setText("RESET");
        btnRESETNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESETNVActionPerformed(evt);
            }
        });

        btnSAVENV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSAVENV.setText("SAVE");
        btnSAVENV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAVENVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnQLNhanVienLayout = new javax.swing.GroupLayout(pnQLNhanVien);
        pnQLNhanVien.setLayout(pnQLNhanVienLayout);
        pnQLNhanVienLayout.setHorizontalGroup(
            pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeaderQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                        .addComponent(btnADDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(btnUPDATENV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btnDELETENV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRESETNV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btnSAVENV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                        .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                                    .addComponent(lblNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnQLNhanVienLayout.createSequentialGroup()
                                    .addComponent(lblIDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                                .addComponent(lblBirthNV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDayNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDayNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblMonthNV, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMonthNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                                .addComponent(lblGenderNV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtNamNV, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(rbtNuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(lblYearNV, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtYearNV)))))
                        .addGap(105, 105, 105)
                        .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addComponent(lblHomeTownNV, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeTownNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnQLNhanVienLayout.setVerticalGroup(
            pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                .addComponent(lblHeaderQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                        .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDNV, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNameNV, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenderNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHomeTownNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtNamNV)
                            .addComponent(rbtNuNV))
                        .addGap(18, 18, 18)
                        .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonthNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYearNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYearNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMonthNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDayNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBirthNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDayNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                        .addComponent(txtAddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHomeTownNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATENV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDELETENV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRESETNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSAVENV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pnCard.add(pnQLNhanVien, "card4");

        pnQLKhachHang.setBackground(new java.awt.Color(0, 204, 204));
        pnQLKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        pnQLKhachHang.setPreferredSize(new java.awt.Dimension(1083, 760));

        lblHeaderKH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHeaderKH.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeaderKH.setText("QUẢN LÝ KHÁCH HÀNG");

        lblIDKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblIDKH.setForeground(new java.awt.Color(255, 255, 255));
        lblIDKH.setText("Customer ID");

        lblNameKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNameKH.setForeground(new java.awt.Color(255, 255, 255));
        lblNameKH.setText("Customer Name");

        tbQLKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Address", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQLKHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbQLKH);

        lblAddressKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddressKH.setForeground(new java.awt.Color(255, 255, 255));
        lblAddressKH.setText("Address");

        lblPhoneKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhoneKH.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneKH.setText("Phone");

        btnAddKH.setText("ADD");
        btnAddKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKHActionPerformed(evt);
            }
        });

        btnUpdateKH.setText("UPDATE");
        btnUpdateKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateKHActionPerformed(evt);
            }
        });

        btnDeleteKH.setText("DELETE");
        btnDeleteKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteKHActionPerformed(evt);
            }
        });

        btnResetKH.setText("RESET");
        btnResetKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetKHActionPerformed(evt);
            }
        });

        btnSaveKH.setText("SAVE");
        btnSaveKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveKHActionPerformed(evt);
            }
        });

        txtIDKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtNameKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtAddressKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtPhoneKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout pnQLKhachHangLayout = new javax.swing.GroupLayout(pnQLKhachHang);
        pnQLKhachHang.setLayout(pnQLKhachHangLayout);
        pnQLKhachHangLayout.setHorizontalGroup(
            pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeaderKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnQLKhachHangLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnQLKhachHangLayout.createSequentialGroup()
                        .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnQLKhachHangLayout.createSequentialGroup()
                                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIDKH)
                                    .addComponent(lblNameKH)
                                    .addComponent(lblAddressKH)
                                    .addComponent(lblPhoneKH))
                                .addGap(54, 54, 54)
                                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneKH, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddressKH, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNameKH, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDKH, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE))
                            .addGroup(pnQLKhachHangLayout.createSequentialGroup()
                                .addComponent(btnAddKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(btnUpdateKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(btnDeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(btnResetKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnQLKhachHangLayout.createSequentialGroup()
                        .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSaveKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
        pnQLKhachHangLayout.setVerticalGroup(
            pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLKhachHangLayout.createSequentialGroup()
                .addComponent(lblHeaderKH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddressKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        pnCard.add(pnQLKhachHang, "card5");

        pnQLSPNew.setBackground(new java.awt.Color(255, 255, 255));
        pnQLSPNew.setPreferredSize(new java.awt.Dimension(1078, 760));

        pnToolQLSP.setBackground(new java.awt.Color(0, 153, 51));
        pnToolQLSP.setForeground(new java.awt.Color(255, 255, 255));

        btnThemSP.setBackground(new java.awt.Color(0, 153, 0));
        btnThemSP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThemSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSP.setText("Thêm Mới Sản Phẩm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnSuaSP.setBackground(new java.awt.Color(0, 153, 0));
        btnSuaSP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSuaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaSP.setText("Sửa Sản Phẩm");
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });

        btnXoaSP.setBackground(new java.awt.Color(0, 153, 0));
        btnXoaSP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSP.setText("Xóa Sản Phẩm");
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnToolQLSPLayout = new javax.swing.GroupLayout(pnToolQLSP);
        pnToolQLSP.setLayout(pnToolQLSPLayout);
        pnToolQLSPLayout.setHorizontalGroup(
            pnToolQLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnToolQLSPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemSP)
                .addGap(75, 75, 75)
                .addComponent(btnSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btnXoaSP)
                .addContainerGap())
        );
        pnToolQLSPLayout.setVerticalGroup(
            pnToolQLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnToolQLSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnToolQLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemSP, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnSuaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblHeaderQLSP.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblHeaderQLSP.setText("Quản Lý Sản Phẩm");

        tbQLSPNew.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbQLSPNew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng Trong Kho", "Giá Nhập", "Giá Bán", "Loại Sản Phẩm", "Nhà Cung Cấp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tbQLSPNew);

        pnTitleTableSP.setBackground(new java.awt.Color(0, 153, 0));
        pnTitleTableSP.setForeground(new java.awt.Color(255, 255, 255));

        lblTitleQLSP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitleQLSP.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleQLSP.setText("Sản Phẩm");
        lblTitleQLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTitleQLSPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnTitleTableSPLayout = new javax.swing.GroupLayout(pnTitleTableSP);
        pnTitleTableSP.setLayout(pnTitleTableSPLayout);
        pnTitleTableSPLayout.setHorizontalGroup(
            pnTitleTableSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleTableSPLayout.createSequentialGroup()
                .addComponent(lblTitleQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTitleTableSPLayout.setVerticalGroup(
            pnTitleTableSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleTableSPLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitleQLSP)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        cbxLocSP.setBackground(new java.awt.Color(0, 153, 0));
        cbxLocSP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbxLocSP.setForeground(new java.awt.Color(255, 255, 255));
        cbxLocSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả Sản Phẩm", "Giá Bán > 500000 VNĐ", "Giá Bán < 500000 VNĐ", " " }));
        cbxLocSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocSPActionPerformed(evt);
            }
        });

        txtTimKiemSP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnTimKiemSP.setBackground(new java.awt.Color(0, 153, 0));
        btnTimKiemSP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTimKiemSP.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemSP.setText("Tìm Kiếm");
        btnTimKiemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSPActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 153, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout pnQLSPNewLayout = new javax.swing.GroupLayout(pnQLSPNew);
        pnQLSPNew.setLayout(pnQLSPNewLayout);
        pnQLSPNewLayout.setHorizontalGroup(
            pnQLSPNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnToolQLSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblHeaderQLSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6)
            .addComponent(pnTitleTableSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLSPNewLayout.createSequentialGroup()
                .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(cbxLocSP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator4)
        );
        pnQLSPNewLayout.setVerticalGroup(
            pnQLSPNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLSPNewLayout.createSequentialGroup()
                .addComponent(pnToolQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblHeaderQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnQLSPNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTimKiemSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtTimKiemSP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxLocSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(pnTitleTableSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnCard.add(pnQLSPNew, "card8");

        pnNhapKho.setBackground(new java.awt.Color(255, 255, 255));
        pnNhapKho.setPreferredSize(new java.awt.Dimension(1083, 760));

        tbNhapKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phiếu", "Tên Nhân Viên", "Tổng Số Lượng", "Ngày Nhập", "Tổng Tiền", "Ghi Chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbNhapKho);

        pnHeaderNhapSP.setBackground(new java.awt.Color(0, 153, 0));

        lblHeaderNhapSP.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblHeaderNhapSP.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderNhapSP.setText("Quản Lý Nhập Sản Phẩm");

        javax.swing.GroupLayout pnHeaderNhapSPLayout = new javax.swing.GroupLayout(pnHeaderNhapSP);
        pnHeaderNhapSP.setLayout(pnHeaderNhapSPLayout);
        pnHeaderNhapSPLayout.setHorizontalGroup(
            pnHeaderNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderNhapSPLayout.createSequentialGroup()
                .addComponent(lblHeaderNhapSP)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnHeaderNhapSPLayout.setVerticalGroup(
            pnHeaderNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeaderNhapSPLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblHeaderNhapSP)
                .addGap(17, 17, 17))
        );

        txtSearchNhapSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        btnSearchNhapSP.setBackground(new java.awt.Color(0, 153, 0));
        btnSearchNhapSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnSearchNhapSP.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchNhapSP.setText("Tìm Kiếm");
        btnSearchNhapSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNhapSPActionPerformed(evt);
            }
        });

        cbxLocNhapSP.setBackground(new java.awt.Color(0, 153, 0));
        cbxLocNhapSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cbxLocNhapSP.setForeground(new java.awt.Color(255, 255, 255));
        cbxLocNhapSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả Phiếu Nhập", "Tổng Tiền > 500000 VND", "Tổng Tiền < 500000 VND", "Số Lượng > 50 Sản Phẩm", "Số Lượng < 50 Sản Phẩm" }));
        cbxLocNhapSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocNhapSPActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 153, 0));

        btnNhapSP.setBackground(new java.awt.Color(0, 153, 0));
        btnNhapSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnNhapSP.setForeground(new java.awt.Color(255, 255, 255));
        btnNhapSP.setText("Nhập Sản Phẩm");
        btnNhapSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapSPActionPerformed(evt);
            }
        });

        pnTitleTableNhapSP.setBackground(new java.awt.Color(0, 153, 0));

        lblTitleTableNhapSP.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblTitleTableNhapSP.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleTableNhapSP.setText("Danh Sách Phiếu Nhập Sản Phẩm Vào Kho");

        javax.swing.GroupLayout pnTitleTableNhapSPLayout = new javax.swing.GroupLayout(pnTitleTableNhapSP);
        pnTitleTableNhapSP.setLayout(pnTitleTableNhapSPLayout);
        pnTitleTableNhapSPLayout.setHorizontalGroup(
            pnTitleTableNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleTableNhapSPLayout.createSequentialGroup()
                .addComponent(lblTitleTableNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTitleTableNhapSPLayout.setVerticalGroup(
            pnTitleTableNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTitleTableNhapSPLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblTitleTableNhapSP)
                .addGap(16, 16, 16))
        );

        btnXoaPhieu.setBackground(new java.awt.Color(0, 153, 0));
        btnXoaPhieu.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnXoaPhieu.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaPhieu.setText("Xóa Phiếu");
        btnXoaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhieuActionPerformed(evt);
            }
        });

        btnXemChiTietPhieuNhap.setBackground(new java.awt.Color(0, 153, 0));
        btnXemChiTietPhieuNhap.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnXemChiTietPhieuNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnXemChiTietPhieuNhap.setText("Chi Tiết Phiếu Nhập");
        btnXemChiTietPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietPhieuNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnNhapKhoLayout = new javax.swing.GroupLayout(pnNhapKho);
        pnNhapKho.setLayout(pnNhapKhoLayout);
        pnNhapKhoLayout.setHorizontalGroup(
            pnNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnHeaderNhapSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnNhapKhoLayout.createSequentialGroup()
                .addComponent(txtSearchNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addComponent(cbxLocNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator3)
            .addGroup(pnNhapKhoLayout.createSequentialGroup()
                .addComponent(btnNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnXemChiTietPhieuNhap)
                .addGap(61, 61, 61)
                .addComponent(btnXoaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pnTitleTableNhapSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnNhapKhoLayout.setVerticalGroup(
            pnNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapKhoLayout.createSequentialGroup()
                .addComponent(pnHeaderNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxLocNhapSP)
                    .addComponent(txtSearchNhapSP)
                    .addComponent(btnSearchNhapSP, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhapSP, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btnXoaPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXemChiTietPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnTitleTableNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
        );

        pnCard.add(pnNhapKho, "card7");

        pnQLNhaCungCap.setBackground(new java.awt.Color(255, 255, 255));
        pnQLNhaCungCap.setPreferredSize(new java.awt.Dimension(1083, 760));

        tbNCC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Name", "Address", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNCCMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbNCC);

        lblIDNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblIDNCC.setForeground(new java.awt.Color(0, 153, 0));
        lblIDNCC.setText("Supplier ID");

        lblAddressNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddressNCC.setForeground(new java.awt.Color(0, 153, 0));
        lblAddressNCC.setText("Address");

        lblPhoneNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhoneNCC.setForeground(new java.awt.Color(0, 153, 0));
        lblPhoneNCC.setText("Phone");

        txtIDNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtIDNCC.setBorder(null);

        txtAddressNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAddressNCC.setBorder(null);

        btnSuaNCC.setBackground(new java.awt.Color(0, 153, 0));
        btnSuaNCC.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnSuaNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaNCC.setText("Sửa");
        btnSuaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNCCActionPerformed(evt);
            }
        });

        btnAddDMSP.setBackground(new java.awt.Color(0, 153, 0));
        btnAddDMSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnAddDMSP.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDMSP.setText("Thêm");
        btnAddDMSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDMSPActionPerformed(evt);
            }
        });

        btnSuaDMSP.setBackground(new java.awt.Color(0, 153, 0));
        btnSuaDMSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnSuaDMSP.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaDMSP.setText("Sửa");
        btnSuaDMSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDMSPActionPerformed(evt);
            }
        });

        btnAddNCC.setBackground(new java.awt.Color(0, 153, 0));
        btnAddNCC.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnAddNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNCC.setText("Thêm");
        btnAddNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNCCActionPerformed(evt);
            }
        });

        btnXoaDMSP.setBackground(new java.awt.Color(0, 153, 0));
        btnXoaDMSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnXoaDMSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaDMSP.setText("Xóa");
        btnXoaDMSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDMSPActionPerformed(evt);
            }
        });

        lstCategorySP.setBorder(null);
        lstCategorySP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jScrollPane3.setViewportView(lstCategorySP);

        pnHeaderQLNCC.setBackground(new java.awt.Color(0, 153, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quản Lý Nhà Cung Cấp");

        javax.swing.GroupLayout pnHeaderQLNCCLayout = new javax.swing.GroupLayout(pnHeaderQLNCC);
        pnHeaderQLNCC.setLayout(pnHeaderQLNCCLayout);
        pnHeaderQLNCCLayout.setHorizontalGroup(
            pnHeaderQLNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnHeaderQLNCCLayout.setVerticalGroup(
            pnHeaderQLNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderQLNCCLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnTitleTableNCC.setBackground(new java.awt.Color(0, 153, 0));

        lblTitleTableNCC.setBackground(new java.awt.Color(255, 255, 255));
        lblTitleTableNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitleTableNCC.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleTableNCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleTableNCC.setText("Danh Sách Các Nhà Cung Cấp");
        lblTitleTableNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTitleTableNCCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnTitleTableNCCLayout = new javax.swing.GroupLayout(pnTitleTableNCC);
        pnTitleTableNCC.setLayout(pnTitleTableNCCLayout);
        pnTitleTableNCCLayout.setHorizontalGroup(
            pnTitleTableNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleTableNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTitleTableNCCLayout.setVerticalGroup(
            pnTitleTableNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTitleTableNCCLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblTitleTableNCC)
                .addGap(12, 12, 12))
        );

        txtPhoneNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPhoneNCC.setBorder(null);

        pnHeaderDMSP.setBackground(new java.awt.Color(0, 153, 0));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Danh Mục Sản Phẩm");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnHeaderDMSPLayout = new javax.swing.GroupLayout(pnHeaderDMSP);
        pnHeaderDMSP.setLayout(pnHeaderDMSPLayout);
        pnHeaderDMSPLayout.setHorizontalGroup(
            pnHeaderDMSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        pnHeaderDMSPLayout.setVerticalGroup(
            pnHeaderDMSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderDMSPLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        cbxLocNCCKhuVuc.setBackground(new java.awt.Color(0, 153, 0));
        cbxLocNCCKhuVuc.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cbxLocNCCKhuVuc.setForeground(new java.awt.Color(255, 255, 255));
        cbxLocNCCKhuVuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "THAI BINH", "HA NOI", "NGHE AN", "THANH HOA", "SAI GON", "BINH DUONG", " " }));
        cbxLocNCCKhuVuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocNCCKhuVucActionPerformed(evt);
            }
        });

        txtTimKiemDMSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtTimKiemDMSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemDMSPKeyReleased(evt);
            }
        });

        btnTimKiemDMSP.setBackground(new java.awt.Color(0, 153, 0));
        btnTimKiemDMSP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnTimKiemDMSP.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemDMSP.setText("Tìm Kiếm");
        btnTimKiemDMSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemDMSPActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 153, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 153, 0));

        btnXoaNCC.setBackground(new java.awt.Color(0, 153, 0));
        btnXoaNCC.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnXoaNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaNCC.setText("Xóa");
        btnXoaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNCCActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 153, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 153, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 153, 0));

        jSeparator9.setBackground(new java.awt.Color(0, 153, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 153, 0));

        txtNameNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtNameNCC.setBorder(null);

        lblNameNCC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNameNCC.setForeground(new java.awt.Color(0, 153, 0));
        lblNameNCC.setText("Name");

        jSeparator10.setBackground(new java.awt.Color(0, 153, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout pnQLNhaCungCapLayout = new javax.swing.GroupLayout(pnQLNhaCungCap);
        pnQLNhaCungCap.setLayout(pnQLNhaCungCapLayout);
        pnQLNhaCungCapLayout.setHorizontalGroup(
            pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeaderQLNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLNhaCungCapLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnHeaderDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                        .addComponent(btnAddDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSuaDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                            .addComponent(pnTitleTableNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLNhaCungCapLayout.createSequentialGroup()
                        .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(btnAddNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(btnSuaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(btnXoaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                        .addComponent(lblNameNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator10)
                                            .addComponent(txtNameNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
                                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                        .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblPhoneNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblIDNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAddressNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtAddressNCC, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIDNCC, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPhoneNCC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING))))))
                        .addGap(138, 138, 138))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLNhaCungCapLayout.createSequentialGroup()
                .addComponent(txtTimKiemDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiemDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxLocNCCKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnQLNhaCungCapLayout.setVerticalGroup(
            pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                .addComponent(pnHeaderQLNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiemDMSP, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(btnTimKiemDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxLocNCCKhuVuc))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                        .addComponent(pnTitleTableNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                        .addComponent(pnHeaderDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLNhaCungCapLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLNhaCungCapLayout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                        .addComponent(txtIDNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblIDNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNameNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                        .addComponent(txtNameNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtAddressNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLNhaCungCapLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAddressNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                        .addComponent(txtPhoneNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnQLNhaCungCapLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblPhoneNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(pnQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSuaDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoaDMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSuaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))))))
        );

        pnCard.add(pnQLNhaCungCap, "card6");

        pnBanHang.setBackground(new java.awt.Color(255, 255, 255));

        pnHeader.setBackground(new java.awt.Color(0, 153, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cửa Hàng");

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tbSPB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL Còn Lại", "Giá Bán"
            }
        ));
        tbSPB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSPBMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbSPB);

        pnTitleTable.setBackground(new java.awt.Color(0, 153, 0));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Danh Danh Sách Các Sản Phẩm Đang Bán");

        javax.swing.GroupLayout pnTitleTableLayout = new javax.swing.GroupLayout(pnTitleTable);
        pnTitleTable.setLayout(pnTitleTableLayout);
        pnTitleTableLayout.setHorizontalGroup(
            pnTitleTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTitleTableLayout.setVerticalGroup(
            pnTitleTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleTableLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lblSearchIDSP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSearchIDSP.setText("Mã Sản Phẩm");

        txtSearchIDSPB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSearchIDSPB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchIDSPB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchIDSPBKeyReleased(evt);
            }
        });

        cbxLocSPBan.setBackground(new java.awt.Color(0, 153, 0));
        cbxLocSPBan.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cbxLocSPBan.setForeground(new java.awt.Color(255, 255, 255));
        cbxLocSPBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả Sản Phẩm", "Giá Bán > 100.000 VND", "Giá Bán < 100.000 VND", " " }));
        cbxLocSPBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocSPBanActionPerformed(evt);
            }
        });

        lblGioHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shopping-cart.png"))); // NOI18N
        lblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGioHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBanHangLayout.createSequentialGroup()
                        .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnTitleTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane7))
                        .addContainerGap())
                    .addGroup(pnBanHangLayout.createSequentialGroup()
                        .addComponent(lblSearchIDSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchIDSPB, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                        .addComponent(lblGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxLocSPBan, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBanHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxLocSPBan)
                            .addComponent(lblGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(pnBanHangLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearchIDSPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearchIDSP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(pnTitleTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnCard.add(pnBanHang, "card9");

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addComponent(pnNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnMain, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*======================== Load Data =========================*/
    public void loadDataNhanVien(){
        String[] columnNames = {"ID", "NAME", "Birth", "Gender", "Address", "Phone", "Hometown"};
        tbmNhanVien.setColumnIdentifiers(columnNames);
        NhanVienRepository nvRepository = new NhanVienRepository();
        try {
            List<Employees> lstNV = nvRepository.getAll();
            tbmNhanVien.setRowCount(0);
            for(Employees nv : lstNV){
                tbmNhanVien.addRow(new Object[]{nv.getEmployeeId(), nv.getEmployeeName(), nv.getEmployeeBirth(), nv.getEmployeeGender(), nv.getEmployeeAddress(), nv.getEmployeePhone(), nv.getEmployeeHometown()});
            }
            tbQLNV.setModel(tbmNhanVien);
        } catch (Exception ex) {
            System.out.println("ERROR FUNTION loadDataNhanVien ! " + ex.getMessage());
        }
    }
    public void loadDataKhachHang(){
        String[] columnNames = {"ID", "NAME","Address", "Phone"};
        tbmKhachHang.setColumnIdentifiers(columnNames);
        KhachHangRepository khRepository = new KhachHangRepository();
        try {
            List<Customer> lstKH = khRepository.getAll();
            tbmKhachHang.setRowCount(0);
            for(Customer kh :lstKH){
                tbmKhachHang.addRow(new Object[]{kh.getCustomerID(), kh.getCustomerName(), kh.getCustomerAddress(), kh.getCustomerPhone()});
            }
            tbQLKH.setModel(tbmKhachHang);
        } catch (Exception ex) {
            System.out.println("ERROR FUNTION loadDataKhachHang ! " + ex.getMessage());
        }   
    }
    public void loadDataSanPham(){
        String[] columnNames = {"Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng Tồn Kho", "Giá Nhập","Giá Bán","Mã Loại SP","Mã Nhà Cung Cấp"};
        tbmSanPham.setColumnIdentifiers(columnNames);
        SanPhamRepository spReposytory = new SanPhamRepository();
        try {
            List<Product> lstSP = spReposytory.getAll();
            tbmSanPham.setRowCount(0);
            for(Product sp :lstSP){
//                System.out.println("ADD SP : " + sp);
//                lstSanPhamBanBoLoc.add(sp);
                tbmSanPham.addRow(new Object[]{sp.getProductID(), sp.getProductName(), sp.getQuantity(), sp.getProductPriceIn(), sp.getProductPriceOut(), sp.getCategoryID(), sp.getSupplierID()});
            }
            tbQLSPNew.setModel(tbmSanPham);
//            loadComoboxSP();
//            loadListSP();
        } catch (Exception ex) {
            System.out.println("ERROR FUNTION loadDataSanPham ! " + ex.getMessage());
        }   
    }
    
    public void loadDSPhieuNhap(){
        String[] columnNames = {"Mã Phiếu", "Tên Nhân Viên", "Tổng Số Lượng", "Ngày Nhập","Tổng Tiền","Ghi Chú"};
        tbmQLPhieuNhap.setColumnIdentifiers(columnNames);
        QuanLyPhieuNhap pl = new QuanLyPhieuNhap();
        try {
            List<Import> lst = pl.getImport();
            tbmQLPhieuNhap.setRowCount(0);
            for(Import ip : lst){
                tbmQLPhieuNhap.addRow(new Object[]{ip.getImportID(), ip.getEmployeesName(), ip.getNum(), ip.getImportDay(), ip.getTotal(), ip.getNote()});
            }
            tbNhapKho.setModel(tbmQLPhieuNhap);
        } catch (Exception ex) {
            System.out.println("ERROR FUNTION loadDSPhieuNhap ! " + ex.getMessage());
        }
    }
    public void loadDataSanPhamDangBan(){
        String[] columnNames = {"Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng Còn Lại", "Giá Bán"};
       tbmSanPhamDangBan.setColumnIdentifiers(columnNames);
        SanPhamRepository spReposytory = new SanPhamRepository();
        try {
            List<Product> lstSP = spReposytory.getProductForSale();
            tbmSanPhamDangBan.setRowCount(0);
            for(Product sp :lstSP){
//                System.out.println("ADD SP : " + sp);
                lstSanPhamBanBoLoc.add(sp);
                tbmSanPhamDangBan.addRow(new Object[]{sp.getProductID(), sp.getProductName(), sp.getQuantity(), sp.getProductPriceOut()});
            }
            tbSPB.setModel(tbmSanPhamDangBan);
        } catch (Exception ex) {
            System.out.println("ERROR FUNTION loadDataSanPham ! " + ex.getMessage());
        }  
    }
    /************************ CU************************************/
    public void loadSupplier(){
        String[] columnNames = {"Supplier ID", "Supplier Name", "Address", "NumberPhone"};
        tbmNhaCungCap.setColumnIdentifiers(columnNames);
        SanPhamRepository spReposytory = new SanPhamRepository();
        try {
            List<Supplier> lstSP = spReposytory.getcomboboxSupplier();
            tbmNhaCungCap.setRowCount(0);
            for(Supplier sp : lstSP){
                tbmNhaCungCap.addRow(new Object[]{sp.getSupplierID(), sp.getSupplierName(), sp.getAddress(), sp.getPhone()});
            }
            tbNCC.setModel(tbmNhaCungCap);
        } catch (Exception ex) {
            System.out.println("ERROR FUNTION loadSupplier ! " + ex.getMessage());
        }
    }
    public void loadCategorySP(){
        SanPhamRepository spReposytory = new SanPhamRepository();
        List<Category> lstSP = spReposytory.getComboboxCategory();
        lstCategory.clear();
        for(int i = 0 ; i < lstSP.size() ; i++){
            lstCategory.addElement(lstSP.get(i));
            lstCategoryBoLoc.add(lstSP.get(i));
        }
        lstCategorySP.setModel(lstCategory);
    }
    // Chi them vao bang orderDetail
    public void loadorderDetail(){
        String[] columns = {"ID", "NAME", "SL", "PRICE", "CATEGORY", "SUPPLIER", "TOTAL"};
        tbmorderDetail.setColumnIdentifiers(columns);
    }
    /************************************************************/
    /*==================== Reset TextField ======================*/
    public void resetTextField(){
        txtIDNV.setText("");
        txtNameNV.setText("");
        grbGender.clearSelection();
        txtDayNV.setText("");
        txtMonthNV.setText("");
        txtYearNV.setText("");
        txtAddressNV.setText("");
        txtPhoneNV.setText("");
        txtHomeTownNV.setText("");
        tbQLNV.clearSelection();
        btnADDNV.setEnabled(true);
    }
    public void resetTextFieldKH(){
        txtIDKH.setText("");
        txtNameKH.setText("");
        txtAddressKH.setText("");
        txtPhoneKH.setText("");
        tbQLKH.clearSelection();
        btnAddKH.setEnabled(true);
    }
    public void resetTextNCC(){
        txtIDNCC.setText("");
        txtNameNCC.setText("");
        txtAddressNCC.setText("");
        txtPhoneNCC.setText("");
        txtIDNCC.setEditable(true);
        btnAddNCC.setEnabled(true);
        tbNCC.clearSelection();
    }
    /**********************************************************/
    /*============ frm Login ===========*/
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), "card2");
    }//GEN-LAST:event_btnLoginActionPerformed
    /************************************************************/
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) pnCard.getLayout();
        cardLayout.show(pnCard, "card9");
    }//GEN-LAST:event_jLabel9MouseClicked
    /*==================== EVEN TABLE QLNV======================*/
    private void tbQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQLNVMouseClicked
        // TODO add your handling code here:
        int selectedRow = tbQLNV.getSelectedRow();
        txtIDNV.setText(tbQLNV.getValueAt(selectedRow, 0).toString());
        txtNameNV.setText(tbQLNV.getValueAt(selectedRow, 1).toString());
        String[] Birth = (tbQLNV.getValueAt(selectedRow, 2).toString()).split("-");
        txtDayNV.setText(Birth[2]);
        txtMonthNV.setText(Birth[1]);
        txtYearNV.setText(Birth[0]);
        String gender = tbQLNV.getValueAt(selectedRow, 3).toString();
        if(gender.equalsIgnoreCase("NAM")){
            rbtNamNV.setSelected(true);
        }
        else{
            rbtNuNV.setSelected(true);
        }
        txtAddressNV.setText(tbQLNV.getValueAt(selectedRow, 4).toString());
        txtPhoneNV.setText(tbQLNV.getValueAt(selectedRow, 5).toString());
        txtHomeTownNV.setText(tbQLNV.getValueAt(selectedRow, 6).toString());
        /*Setting trang thai*/
        btnADDNV.setEnabled(false);
        txtIDNV.setEditable(false);
    }//GEN-LAST:event_tbQLNVMouseClicked
    /************************************************************/
    /*=========================== EVEN ALL BUTTON PANEL QLNV ==================================*/
    private void btnRESETNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETNVActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "RESET SUCCESSFULl !");
        resetTextField();
    }//GEN-LAST:event_btnRESETNVActionPerformed

    private void btnSAVENVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAVENVActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "SAVE SUCCESSFULl !");
        resetTextField();
    }//GEN-LAST:event_btnSAVENVActionPerformed

    private void btnADDNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDNVActionPerformed
        // TODO add your handling code here:
        String id = txtIDNV.getText();
        String name = txtNameNV.getText();
        String day = txtDayNV.getText();
        String month = txtMonthNV.getText();
        String year = txtYearNV.getText();
        String address = txtAddressNV.getText();
        String phone = txtPhoneNV.getText();
        String hometown = txtHomeTownNV.getText();
        String birth = year + "/" + month + "/" + day;
        String gender;
        if(rbtNamNV.isSelected()){
            gender = "NAM";
        }
        else{
            gender = "NU";
        }
        
        if(id.equals("") || name.equals("") || grbGender.getSelection() == null || day.equals("") || month.equals("") || year.equals("")
           || address.equals("") || phone.equals("") || hometown.equals(""))
        {
            JOptionPane.showMessageDialog(this, "PLEASE INPUT ALL DATA !");
            return;
        }
        try {
            int day1 = Integer.parseInt(day);
            int month1 = Integer.parseInt(month);
            int year1 = Integer.parseInt(year);
            if(day1 <= 0 || day1 > 31 || month1 <= 0 || month1 > 31 || year1 <= 0){
                JOptionPane.showMessageDialog(this, "VALIDATE BIRTH ! ");
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "VALIDATE BIRTH ! " + ex.getMessage());
            return;
        }
      
        NhanVienRepository nvRepository = new NhanVienRepository();
        if(nvRepository.addEmployees(new Employees(id,name,birth,gender,address,phone,hometown))){
            loadDataNhanVien();
            JOptionPane.showMessageDialog(this, "ADD EMPLOYEES SUCCESSFULL !");
        }
        else{
            JOptionPane.showMessageDialog(this, "ID ALREADY EXISTS IN LIST");
        }
        resetTextField();
    }//GEN-LAST:event_btnADDNVActionPerformed

    private void btnUPDATENVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATENVActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbQLNV.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "PLEASE CHOICE 1 ROW TO UPDATE");
        }
        else{
            NhanVienRepository nvRepository = new NhanVienRepository();
            String id = txtIDNV.getText();
            String name = txtNameNV.getText();
            String day = txtDayNV.getText();
            String month = txtMonthNV.getText();
            String year = txtYearNV.getText();
            String address = txtAddressNV.getText();
            String phone = txtPhoneNV.getText();
            String hometown = txtHomeTownNV.getText();
            String birth = year + "/" + month + "/" + day;
            String gender;
            if(rbtNamNV.isSelected()){
                gender = "NAM";
            }
            else{
                gender = "NU";
            }
            if(nvRepository.updateEmployees(new Employees(id,name,birth,gender,address,phone,hometown))){
                loadDataNhanVien();
                JOptionPane.showMessageDialog(this, "UPDATE EMPLOYEES SUCCESSFULL !");
            }
            else{
                JOptionPane.showMessageDialog(this, "UPDATE EMPLOYEES FAILED !");
            }
        }
        resetTextField();
    }//GEN-LAST:event_btnUPDATENVActionPerformed

    private void btnDELETENVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETENVActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbQLNV.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "PLEASE CHOICE 1 ROW TO DELETE");
        }
        else{
            NhanVienRepository nvRepository = new NhanVienRepository();
            String id = txtIDNV.getText();
            String name = txtNameNV.getText();
            String day = txtDayNV.getText();
            String month = txtMonthNV.getText();
            String year = txtYearNV.getText();
            String address = txtAddressNV.getText();
            String phone = txtPhoneNV.getText();
            String hometown = txtHomeTownNV.getText();
            String birth = year + "/" + month + "/" + day;
            String gender;
            if(rbtNamNV.isSelected()){
                gender = "NAM";
            }
            else{
                gender = "NU";
            }
            if(nvRepository.deleteEmployees(new Employees(id,name,birth,gender,address,phone,hometown))){
                loadDataNhanVien();
                JOptionPane.showMessageDialog(this, "DELETE EMPLOYEES SUCCESSFULL !");
            }
            else{
                JOptionPane.showMessageDialog(this, "DELETE EMPLOYEES FAILED !");
            }
        }
        resetTextField();
    }//GEN-LAST:event_btnDELETENVActionPerformed
    /************************************************************/
    private void lblQLNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNhanVienMouseClicked
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) pnCard.getLayout();
        cardLayout.show(pnCard, "card4");
    }//GEN-LAST:event_lblQLNhanVienMouseClicked

    private void lblQLKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLKhachHangMouseClicked
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) pnCard.getLayout();
        cardLayout.show(pnCard, "card5");
    }//GEN-LAST:event_lblQLKhachHangMouseClicked
    /*======================= EVEN TABLE QLKH ========================*/
    private void tbQLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQLKHMouseClicked
        // TODO add your handling code here:
        int selectedRow = tbQLKH.getSelectedRow();
        txtIDKH.setText(tbQLKH.getValueAt(selectedRow, 0).toString());
        txtNameKH.setText(tbQLKH.getValueAt(selectedRow, 1).toString());
        txtAddressKH.setText(tbQLKH.getValueAt(selectedRow, 2).toString());
        txtPhoneKH.setText(tbQLKH.getValueAt(selectedRow, 3).toString());
        btnAddKH.setEnabled(false);
        txtIDKH.setEditable(false);
    }//GEN-LAST:event_tbQLKHMouseClicked
    /*=========================== EVEN ALL BUTTON PANEL QLNV ==================================*/
    private void btnAddKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKHActionPerformed
        // TODO add your handling code here:
        if(txtIDKH.getText().equals("") || txtNameKH.getText().equals("") || txtAddressKH.getText().equals("") || txtPhoneKH.getText().equals("")){
            JOptionPane.showMessageDialog(this, "PLEASE INPUT ALL DATA CUSTOMER !");
        }
        else{
            KhachHangRepository khRepository = new KhachHangRepository();
            Customer kh = new Customer(txtIDKH.getText(), txtNameKH.getText(), txtAddressKH.getText(), txtPhoneKH.getText());
            if(khRepository.addCustomer(kh)){
                loadDataKhachHang();
                JOptionPane.showMessageDialog(this, "ADD CUSTOMER SUCCESSFULL !");
            }
            else{
                JOptionPane.showMessageDialog(this, "ID CUSTOMER ALREADY EXISTS IN LIST");
            }
            resetTextFieldKH();
        }
    }//GEN-LAST:event_btnAddKHActionPerformed

    private void btnUpdateKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateKHActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbQLKH.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "PLEASE CHOICE 1 ROW CUSTOMER TO UPDATE");
        }
        else{
            KhachHangRepository khRepository = new KhachHangRepository();
            Customer kh = new Customer(txtIDKH.getText(), txtNameKH.getText(), txtAddressKH.getText(), txtPhoneKH.getText());
            if(khRepository.updateCustomer(kh)){
                loadDataKhachHang();
                JOptionPane.showMessageDialog(this, "UPDATE CUSTOMER SUCCESSFULL !");
            }
            else{
                JOptionPane.showMessageDialog(this, "UPDATE CUSTOMER FAILED");
            }
            resetTextFieldKH();
        }
    }//GEN-LAST:event_btnUpdateKHActionPerformed

    private void btnDeleteKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteKHActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbQLKH.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "PLEASE CHOICE 1 ROW CUSTOMER TO DELETE");
        }
        else{
            KhachHangRepository khRepository = new KhachHangRepository();
            Customer kh = new Customer(txtIDKH.getText(), txtNameKH.getText(), txtAddressKH.getText(), txtPhoneKH.getText());
            if(khRepository.deleteCustomer(kh)){
                loadDataKhachHang();
                JOptionPane.showMessageDialog(this, "DELETE CUSTOMER SUCCESSFULL !");
            }
            else{
                JOptionPane.showMessageDialog(this, "DELETE CUSTOMER FAILED !");
            }
            resetTextFieldKH();
        }
    }//GEN-LAST:event_btnDeleteKHActionPerformed

    private void btnResetKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetKHActionPerformed
        // TODO add your handling code here:
        resetTextFieldKH();
        JOptionPane.showMessageDialog(this, "RESET CUSTOMER SUCCESSFULl !");
    }//GEN-LAST:event_btnResetKHActionPerformed

    private void btnSaveKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveKHActionPerformed
        // TODO add your handling code here:
        resetTextFieldKH();
        JOptionPane.showMessageDialog(this, "SAVE CUSTOMER SUCCESSFULl !");
    }//GEN-LAST:event_btnSaveKHActionPerformed

   /*PN QLSP NEW*/
    private void lblQLSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLSanPhamMouseClicked
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) pnCard.getLayout();
        cardLayout.show(pnCard, "card8");
    }//GEN-LAST:event_lblQLSanPhamMouseClicked
    /*SỬA SP*/
    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        // TODO add your handling code here:
        pnUpdatePr pn = new pnUpdatePr();
        JDialog dialog = new JDialog(this, "Dialog", true);
        /*Lay du lieu tu hang duoc chon*/
        int selectedRow = tbQLSPNew.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "PLEASE CHOICE 1 PRODUCT IN TABLE QLSP TO UPDATE");
            return;
        }
        else{
            String id = tbQLSPNew.getValueAt(selectedRow, 0).toString();
            String name = tbQLSPNew.getValueAt(selectedRow, 1).toString();
            int num = (int)tbQLSPNew.getValueAt(selectedRow, 2);
            float nhap = (float)tbQLSPNew.getValueAt(selectedRow, 3);
            float ban = (float)tbQLSPNew.getValueAt(selectedRow, 4);
            String category = tbQLSPNew.getValueAt(selectedRow, 5).toString();
            String supplier = tbQLSPNew.getValueAt(selectedRow, 6).toString();
            
            pn.showData(id, name, category, supplier, nhap, ban, num);
        }
        /**/
        dialog.add(pn);
        dialog.setSize(600, 560);
        dialog.setVisible(true); 
        loadDataSanPham();
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void lblQLNhapKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNhapKhoMouseClicked
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) pnCard.getLayout();
        cardLayout.show(pnCard, "card7");
    }//GEN-LAST:event_lblQLNhapKhoMouseClicked

    private void lblQLNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNCCMouseClicked
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) pnCard.getLayout();
        cardLayout.show(pnCard, "card6");
    }//GEN-LAST:event_lblQLNCCMouseClicked
    /*THEM SP*/
    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        // TODO add your handling code here:
        frmAddProduct addProduct = new frmAddProduct();
        addProduct.setVisible(true);
    }//GEN-LAST:event_btnThemSPActionPerformed

    // TIM KIEM SP : CO THE DUNG TRUY VAN SQL
    private void btnTimKiemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSPActionPerformed
        // TODO add your handling code here:
        String search = txtTimKiemSP.getText();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tbmSanPham);
        tbQLSPNew.setRowSorter(sorter);
        try {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + search, 1));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Không thể tìm kiếm !");
        }
    }//GEN-LAST:event_btnTimKiemSPActionPerformed
    // LOC SP
    private void cbxLocSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocSPActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) cbxLocSP.getSelectedItem();
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tbmSanPham);
        tbQLSPNew.setRowSorter(sorter);
        try {
            if(cbxLocSP.getSelectedIndex() == 1){
                RowFilter<TableModel, Object> filter = RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, 500000, 4);
                sorter.setRowFilter(filter);
            }
                else if(cbxLocSP.getSelectedIndex() == 2){
                RowFilter<TableModel, Object> filter = RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, 500000, 4);
                sorter.setRowFilter(filter);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Khòng thể tìm kiếm !");
        }
    }//GEN-LAST:event_cbxLocSPActionPerformed
    // load SP khi them boi them dung frame kphai panel
    private void lblTitleQLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitleQLSPMouseClicked
        // TODO add your handling code here:
        loadDataSanPham();
    }//GEN-LAST:event_lblTitleQLSPMouseClicked
    // XOA SP
    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbQLSPNew.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "PLEASE CHOICE 1 PRODUCT IN TABLE QLSP TO DELETE");
        }
        else{
            SanPhamRepository rsp = new SanPhamRepository();
            String id = tbQLSPNew.getValueAt(selectedRow, 0).toString();
            String name = tbQLSPNew.getValueAt(selectedRow, 1).toString();
            int num = (int)tbQLSPNew.getValueAt(selectedRow, 2);
            float nhap = (float)tbQLSPNew.getValueAt(selectedRow, 3);
            float ban = (float)tbQLSPNew.getValueAt(selectedRow, 4);
            String category = tbQLSPNew.getValueAt(selectedRow, 5).toString();
            String supplier = tbQLSPNew.getValueAt(selectedRow, 6).toString();
            
            Product sp = new Product(id, name, nhap, ban, num, category, supplier);
            
            if(rsp.deleteProduct(sp)){
                loadDataSanPham();
                JOptionPane.showMessageDialog(this, "DELETE PRODUCT SUCCESSFULL !");
            }
            else{
                JOptionPane.showMessageDialog(this, "DELETE PRODUCT FAILED !");
            }
        }
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void btnNhapSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapSPActionPerformed
        // TODO add your handling code here:
        pnPhieuNhap pn = new pnPhieuNhap();
        JDialog dialog = new JDialog(this, "Dialog", true);
        QuanLyPhieuNhap ql = new QuanLyPhieuNhap();
        int id = ql.createID();
        pn.createID(id);
        dialog.add(pn);
        dialog.setSize(700, 665);
        dialog.setVisible(true); 
        loadDataSanPham();
        loadDSPhieuNhap();
    }//GEN-LAST:event_btnNhapSPActionPerformed

    private void btnSuaDMSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDMSPActionPerformed
        if(lstCategorySP.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Chọn 1 Category Trong Danh Mục Sản Phẩm Để Sửa !");
            return;
        }
        Category ctg = lstCategorySP.getSelectedValue();
        pnSuaDMSP pn = new pnSuaDMSP();
        JDialog dialog = new JDialog(this, "Dialog", true);
        pn.showData(ctg);
        dialog.add(pn);
        dialog.setSize(500, 380);
        dialog.setVisible(true); 
        lstCategorySP.clearSelection();
        loadCategorySP();
    }//GEN-LAST:event_btnSuaDMSPActionPerformed

    private void btnAddDMSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDMSPActionPerformed
        pnAddDMSP pn = new pnAddDMSP();
        JDialog dialog = new JDialog(this, "Dialog", true);
        dialog.add(pn);
        dialog.setSize(480, 370);
        dialog.setVisible(true);
        loadCategorySP();
    }//GEN-LAST:event_btnAddDMSPActionPerformed

    private void tbNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNCCMouseClicked
        int selectedRow = tbNCC.getSelectedRow();
        txtIDNCC.setText(tbNCC.getValueAt(selectedRow, 0).toString());
        txtNameNCC.setText(tbNCC.getValueAt(selectedRow, 1).toString());
        txtAddressNCC.setText(tbNCC.getValueAt(selectedRow, 2).toString());
        txtPhoneNCC.setText(tbNCC.getValueAt(selectedRow, 3).toString());
        txtIDNCC.setEditable(false);
        btnAddNCC.setEnabled(false);
    }//GEN-LAST:event_tbNCCMouseClicked

    private void btnXoaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhieuActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbNhapKho.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "PLEASE CHOICE 1 Warehouse Receipt TO DELETE");
        }
        else{
            QuanLyPhieuNhap ql = new QuanLyPhieuNhap();
            String id = tbNhapKho.getValueAt(selectedRow, 0).toString();
            try {
                int id1 = Integer.parseInt(id);
                Import ip = new Import(id1);
                if(ql.deleteImport(ip)){ 
                    loadDSPhieuNhap();
                    JOptionPane.showMessageDialog(this, "DELETE Warehouse Receipt SUCCESSFULL !");
                }
                else{
                    JOptionPane.showMessageDialog(this, "DELETE Warehouse Receipt FAILED !");
                }
            } catch (Exception ex) {
                System.out.println("ERROR btnXoaPhieu : " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnXoaPhieuActionPerformed

    private void btnSearchNhapSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNhapSPActionPerformed
        // TODO add your handling code here:
        String search = txtSearchNhapSP.getText();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tbmQLPhieuNhap);
        tbNhapKho.setRowSorter(sorter);
        try {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + search, 0));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Không thể tìm kiếm !");
        }
    }//GEN-LAST:event_btnSearchNhapSPActionPerformed
    
    private void cbxLocNhapSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocNhapSPActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) cbxLocNhapSP.getSelectedItem();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tbmQLPhieuNhap);
        tbNhapKho.setRowSorter(sorter);
        try {
            if(cbxLocNhapSP.getSelectedIndex() == 1){
                RowFilter<TableModel, Object> filter = RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, 500000, 4);
                sorter.setRowFilter(filter);
            }
            else if(cbxLocNhapSP.getSelectedIndex() == 2){
                RowFilter<TableModel, Object> filter = RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, 500000, 4);
                sorter.setRowFilter(filter);
            }
            else if(cbxLocNhapSP.getSelectedIndex() == 3){
                RowFilter<TableModel, Object> filter = RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, 50, 2);
                sorter.setRowFilter(filter);
            }
            else if(cbxLocNhapSP.getSelectedIndex() == 4){
                RowFilter<TableModel, Object> filter = RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, 50, 2);
                sorter.setRowFilter(filter);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Không thể tìm kiếm !");
        }
    }//GEN-LAST:event_cbxLocNhapSPActionPerformed

    private void btnXemChiTietPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietPhieuNhapActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbNhapKho.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "PLEASE CHOICE 1 Phiếu TO Review");
        }
        else{
            String id = tbNhapKho.getValueAt(selectedRow, 0).toString();
            try {
                int indentify = Integer.parseInt(id);
                ThongTinChiTietPhieuNhap tt = new ThongTinChiTietPhieuNhap();
                JDialog dialog = new JDialog(this, "Dialog", true);
                tt.loadThongTinChiTiet(indentify);
                dialog.add(tt);
                dialog.setSize(800, 525);
                dialog.setVisible(true); 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "KHÔNG THỂ XEM CHI TIẾT PHIẾU");
            }
            tbNhapKho.clearSelection();
        }
        
    }//GEN-LAST:event_btnXemChiTietPhieuNhapActionPerformed

    private void btnXoaDMSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDMSPActionPerformed
        // TODO add your handling code here:
        int selectedIndex = lstCategorySP.getSelectedIndex();
        if(selectedIndex == -1){
            JOptionPane.showMessageDialog(this, "Chọn 1 Danh Mục Sản Phẩm Muốn Xóa !");
            return;
        }
        try {
            Category ctg = lstCategorySP.getSelectedValue();
            SanPhamRepository sprepo = new SanPhamRepository();
            if(sprepo.deleteCategory(ctg)){
                JOptionPane.showMessageDialog(this, "Xóa Danh Mục Sản Phẩm Thành Công !");
                loadCategorySP();
            }
            else{
                JOptionPane.showMessageDialog(this, "Xóa Danh Mục Sản Phẩm Thất Bại !");
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN EVEN btnXoaDMSP in frmMain: " + ex.getMessage());
            return;
        }
        
    }//GEN-LAST:event_btnXoaDMSPActionPerformed

    private void lblTitleTableNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitleTableNCCMouseClicked
        // TODO add your handling code here:
        txtIDNCC.setText("");
        txtNameNCC.setText("");
        txtAddressNCC.setText("");
        txtPhoneNCC.setText("");
        btnAddNCC.setEnabled(true);
        tbNCC.clearSelection();
    }//GEN-LAST:event_lblTitleTableNCCMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        lstCategorySP.clearSelection();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnAddNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNCCActionPerformed
        // TODO add your handling code here:
        String id = txtIDNCC.getText();
        String name = txtNameNCC.getText();
        String address = txtAddressNCC.getText();
        String phone = txtPhoneNCC.getText();
        if(id.equals("") || name.equals("") || address.equals("") || phone.equals("")){
            JOptionPane.showMessageDialog(this, "Nhập Thiếu Dữ Liệu !");
            return;
        }
        else if(phone.length() > 11 || phone.length() < 10){
            JOptionPane.showMessageDialog(this, "Số Điện Thoại Không Hợp Lệ !");
            return;
        }
        try {
            SanPhamRepository sprepo = new SanPhamRepository();
            Supplier sp = new Supplier(id, name, address, phone);
            if(sprepo.addSupplier(sp)){
                JOptionPane.showMessageDialog(this, "Thêm Nhà Cung Cấp Thành Công !");
                loadSupplier();
            }
            else{
                JOptionPane.showMessageDialog(this, "Không Thể Thêm Nhà Cung Cấp !");
            }
        } catch (Exception ex) {
            System.out.println("ERROR EVEN btnAddNCC in frmMain : " + ex.getMessage());
        }
        resetTextNCC();
    }//GEN-LAST:event_btnAddNCCActionPerformed

    private void btnSuaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNCCActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbNCC.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Chọn 1 Nhà Cung Cấp Để Sửa !");
            return;
        }
        String id = txtIDNCC.getText();
        String name = txtNameNCC.getText();
        String address = txtAddressNCC.getText();
        String phone = txtPhoneNCC.getText();
        try {
            SanPhamRepository sprepo = new SanPhamRepository();
            Supplier sp = new Supplier(id, name, address, phone);
            if(sprepo.updateSupplier(sp)){
                JOptionPane.showMessageDialog(this, "Đã Cập Nhật Nhà Cung Cấp");
                loadSupplier();
            }
            else{
                JOptionPane.showMessageDialog(this, "Không Thể Cập Nhật Nhà Cung Cấp");
            }
        } catch (Exception ex) {
            System.out.println("ERROR EVEN btnSuaNCC in frmMain : " + ex.getMessage());
        }
        resetTextNCC();
    }//GEN-LAST:event_btnSuaNCCActionPerformed

    private void btnXoaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNCCActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbNCC.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Chọn 1 Nhà Cung Cấp Để Xóa !");
            return;
        }
        String id = txtIDNCC.getText();
        String name = txtNameNCC.getText();
        String address = txtAddressNCC.getText();
        String phone = txtPhoneNCC.getText();
        try {
            SanPhamRepository sprepo = new SanPhamRepository();
            Supplier sp = new Supplier(id, name, address, phone);
            if(sprepo.deleteSupplier(sp)){
                JOptionPane.showMessageDialog(this, "Đã Xóa Nhà Cung Cấp");
                loadSupplier();
            }
            else{
                JOptionPane.showMessageDialog(this, "Không Thể Xóa Nhà Cung Cấp");
            }
        } catch (Exception ex) {
            System.out.println("ERROR EVEN btnXoaNCC in frmMain : " + ex.getMessage());
        }
        resetTextNCC();
    }//GEN-LAST:event_btnXoaNCCActionPerformed
    /*Tu tao bo loc*/
    private void filterList(String searchText){
        lstCategory.clear();
//        for (Category item : lstCategoryBoLoc) {
//            if (item.getCategoryName().toLowerCase().contains(searchText.toLowerCase())) {
//                lstCategory.addElement(item);
//            }
//        }
        if (!searchText.isEmpty()) {
            for (Category item : lstCategoryBoLoc) {
                if (item.getCategoryName().toLowerCase().contains(searchText.toLowerCase())) {
                    lstCategory.addElement(item);  // Thêm mục phù hợp vào lstCategory
                }
            }
        } else {
            lstCategory.addAll(lstCategoryBoLoc);
        }
    }
    private void txtTimKiemDMSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemDMSPKeyReleased
        // TODO add your handling code here:
        String search = txtTimKiemDMSP.getText();
        filterList(search);
    }//GEN-LAST:event_txtTimKiemDMSPKeyReleased

    private void btnTimKiemDMSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemDMSPActionPerformed
        // TODO add your handling code here:
        if(lstCategory.getSize() == 0){
            JOptionPane.showMessageDialog(this, "Không Tìm Thấy Danh Mục Phù Họp !");
            txtTimKiemDMSP.setText("");
            loadCategorySP();
        }
    }//GEN-LAST:event_btnTimKiemDMSPActionPerformed

    private void cbxLocNCCKhuVucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocNCCKhuVucActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) cbxLocNCCKhuVuc.getSelectedItem();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tbmNhaCungCap);
        tbNCC.setRowSorter(sorter);
        RowFilter<TableModel, Object> filter = RowFilter.regexFilter(".*" + selectedItem + ".*", 2);
        sorter.setRowFilter(filter);
        if(tbNCC.getRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Không Nhà Cung Cấp Nào Có Địa Chỉ Ở " + selectedItem);
            sorter.setRowFilter(null); 
        }
    }//GEN-LAST:event_cbxLocNCCKhuVucActionPerformed

    private void cbxLocSPBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocSPBanActionPerformed
        // TODO add your handling code here:
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tbmSanPhamDangBan);
        tbSPB.setRowSorter(sorter);
        try {
            if(cbxLocSPBan.getSelectedIndex() == 1){
                RowFilter<TableModel, Object> filter = RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, 100000, 3);
                sorter.setRowFilter(filter);
            }
            else if(cbxLocSPBan.getSelectedIndex() == 2){
                RowFilter<TableModel, Object> filter = RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, 100000, 3);
                sorter.setRowFilter(filter);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Không thể tìm kiếm !");
        }
    }//GEN-LAST:event_cbxLocSPBanActionPerformed
    private void filterList1(String searchText){
        tbmSanPhamDangBan.setRowCount(0);
        if (!searchText.isEmpty()) {
            for (Product item : lstSanPhamBanBoLoc) {
                if (item.getProductID().toLowerCase().contains(searchText.toLowerCase())) {
                    tbmSanPhamDangBan.addRow(new Object[]{item.getProductID(), item.getProductName(), item.getQuantity(), item.getProductPriceIn()});  // Thêm mục phù hợp vào lstCategory
                }
            }
        } else {
            /*Sử dụng loadDataSanPhamDangBan() sẽ khiến list bị thêm nhiều lần*/
            for(int i = 0 ; i < lstSanPhamBanBoLoc.size() ; i++){
                tbmSanPhamDangBan.addRow(new Object[]{lstSanPhamBanBoLoc.get(i).getProductID(), lstSanPhamBanBoLoc.get(i).getProductName(), lstSanPhamBanBoLoc.get(i).getQuantity(), lstSanPhamBanBoLoc.get(i).getProductPriceOut()});
            }
        }
    }
    private void txtSearchIDSPBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchIDSPBKeyReleased
        // TODO add your handling code here:
        String search = txtSearchIDSPB.getText();
        filterList1(search);
    }//GEN-LAST:event_txtSearchIDSPBKeyReleased

    private void tbSPBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSPBMouseClicked
        // TODO add your handling code here:
        int selectedRow = tbSPB.getSelectedRow();
        pnAddProductInCart pn = new pnAddProductInCart();
        pn.showDataProduct(lstSanPhamBanBoLoc.get(selectedRow), tbmorderDetail);
//        System.out.println("TRUYEN SAN PHAM" + lstSanPhamBanBoLoc.get(selectedRow) + " VOI SO LUONG : " + lstSanPhamBanBoLoc.get(selectedRow).getQuantity());
        JDialog dialog = new JDialog(this, "Dialog", true);
        dialog.add(pn);
        dialog.setSize(450, 425);
        dialog.setVisible(true);
        tbSPB.clearSelection();
        System.out.println("Check thử số lượng cart : " + tbmorderDetail.getRowCount());
    }//GEN-LAST:event_tbSPBMouseClicked

    private void lblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGioHangMouseClicked
        // TODO add your handling code here:
        ShoppingCart spc = new ShoppingCart();
        spc.showData(tbmorderDetail);
        JDialog dialog = new JDialog(this, "Dialog", true);
        dialog.add(spc);
        dialog.setSize(800, 600);
        dialog.setVisible(true);
    }//GEN-LAST:event_lblGioHangMouseClicked

   /************************************************************/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADDNV;
    private javax.swing.JButton btnAddDMSP;
    private javax.swing.JButton btnAddKH;
    private javax.swing.JButton btnAddNCC;
    private javax.swing.JButton btnDELETENV;
    private javax.swing.JButton btnDeleteKH;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNhapSP;
    private javax.swing.JButton btnRESETNV;
    private javax.swing.JButton btnResetKH;
    private javax.swing.JButton btnSAVENV;
    private javax.swing.JButton btnSaveKH;
    private javax.swing.JButton btnSearchNhapSP;
    private javax.swing.JButton btnSignup;
    private javax.swing.JButton btnSuaDMSP;
    private javax.swing.JButton btnSuaNCC;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnTimKiemDMSP;
    private javax.swing.JButton btnTimKiemSP;
    private javax.swing.JButton btnUPDATENV;
    private javax.swing.JButton btnUpdateKH;
    private javax.swing.JButton btnXemChiTietPhieuNhap;
    private javax.swing.JButton btnXoaDMSP;
    private javax.swing.JButton btnXoaNCC;
    private javax.swing.JButton btnXoaPhieu;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JComboBox<String> cbxCV;
    private javax.swing.JComboBox<String> cbxLocNCCKhuVuc;
    private javax.swing.JComboBox<String> cbxLocNhapSP;
    private javax.swing.JComboBox<String> cbxLocSP;
    private javax.swing.JComboBox<String> cbxLocSPBan;
    private javax.swing.ButtonGroup grbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAddressKH;
    private javax.swing.JLabel lblAddressNCC;
    private javax.swing.JLabel lblAddressNV;
    private javax.swing.JLabel lblBirthNV;
    private javax.swing.JLabel lblDayNV;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JLabel lblGenderNV;
    private javax.swing.JLabel lblGioHang;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeaderKH;
    private javax.swing.JLabel lblHeaderNhapSP;
    private javax.swing.JLabel lblHeaderQLNV;
    private javax.swing.JLabel lblHeaderQLSP;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHomeTownNV;
    private javax.swing.JLabel lblIDKH;
    private javax.swing.JLabel lblIDNCC;
    private javax.swing.JLabel lblIDNV;
    private javax.swing.JLabel lblMonthNV;
    private javax.swing.JLabel lblNameKH;
    private javax.swing.JLabel lblNameNCC;
    private javax.swing.JLabel lblNameNV;
    private javax.swing.JLabel lblPhoneKH;
    private javax.swing.JLabel lblPhoneNCC;
    private javax.swing.JLabel lblPhoneNV;
    private javax.swing.JLabel lblQLKhachHang;
    private javax.swing.JLabel lblQLNCC;
    private javax.swing.JLabel lblQLNhanVien;
    private javax.swing.JLabel lblQLNhapKho;
    private javax.swing.JLabel lblQLSanPham;
    private javax.swing.JLabel lblSearchIDSP;
    private javax.swing.JLabel lblTitleQLSP;
    private javax.swing.JLabel lblTitleTableNCC;
    private javax.swing.JLabel lblTitleTableNhapSP;
    private javax.swing.JLabel lblYearNV;
    private javax.swing.JList<Category> lstCategorySP;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnCard;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnHeaderDMSP;
    private javax.swing.JPanel pnHeaderNhapSP;
    private javax.swing.JPanel pnHeaderQLNCC;
    private javax.swing.JPanel pnHome;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnNav;
    private javax.swing.JPanel pnNhapKho;
    private javax.swing.JPanel pnQLKhachHang;
    private javax.swing.JPanel pnQLNhaCungCap;
    private javax.swing.JPanel pnQLNhanVien;
    private javax.swing.JPanel pnQLSPNew;
    private javax.swing.JPanel pnRight;
    private javax.swing.JPanel pnSignIn;
    private javax.swing.JPanel pnTitleTable;
    private javax.swing.JPanel pnTitleTableNCC;
    private javax.swing.JPanel pnTitleTableNhapSP;
    private javax.swing.JPanel pnTitleTableSP;
    private javax.swing.JPanel pnToolQLSP;
    private javax.swing.JRadioButton rbtNamNV;
    private javax.swing.JRadioButton rbtNuNV;
    private javax.swing.JTable tbNCC;
    private javax.swing.JTable tbNhapKho;
    private javax.swing.JTable tbQLKH;
    private javax.swing.JTable tbQLNV;
    private javax.swing.JTable tbQLSPNew;
    private javax.swing.JTable tbSPB;
    private javax.swing.JTextField txtAddressKH;
    private javax.swing.JTextField txtAddressNCC;
    private javax.swing.JTextField txtAddressNV;
    private javax.swing.JTextField txtDayNV;
    private javax.swing.JTextField txtHomeTownNV;
    private javax.swing.JTextField txtIDKH;
    private javax.swing.JTextField txtIDNCC;
    private javax.swing.JTextField txtIDNV;
    private javax.swing.JTextField txtMonthNV;
    private javax.swing.JTextField txtNameKH;
    private javax.swing.JTextField txtNameNCC;
    private javax.swing.JTextField txtNameNV;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtPhoneKH;
    private javax.swing.JTextField txtPhoneNCC;
    private javax.swing.JTextField txtPhoneNV;
    private javax.swing.JTextField txtSearchIDSPB;
    private javax.swing.JTextField txtSearchNhapSP;
    private javax.swing.JTextField txtTimKiemDMSP;
    private javax.swing.JTextField txtTimKiemSP;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtYearNV;
    // End of variables declaration//GEN-END:variables
}
