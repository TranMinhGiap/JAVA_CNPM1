/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.KhachHangRepository;
import Controller.NhanVienRepository;
import Model.Employees;
import Model.Customer;
import java.awt.CardLayout;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author TRAN MINH GIAP
 */
public class frmMain extends javax.swing.JFrame {
    DefaultTableModel tbmNhanVien = new DefaultTableModel();
    DefaultTableModel tbmKhachHang = new DefaultTableModel();
    
    public frmMain() {
        initComponents();
//        this.add(pnSignIn, "card1");
//        this.add(pnMain, "card2");
//        pnSignIn.setName("card1");
//        pnMain.setName("card2");
        loadDataNhanVien();
        loadDataKhachHang();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        pnQLSanPham = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
            .addGap(0, 761, Short.MAX_VALUE)
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
        pnRight.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 571, 70));

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
        pnRight.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 110, 40));

        btnSignup.setBackground(new java.awt.Color(186, 79, 84));
        btnSignup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");
        btnSignup.setAutoscrolls(true);
        btnSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnRight.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 110, 40));

        lblFooter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFooter.setForeground(new java.awt.Color(255, 255, 255));
        lblFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFooter.setText("Forget Password ?");
        pnRight.add(lblFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 580, -1));

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

        pnNav.setBackground(new java.awt.Color(121, 105, 224));

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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel9");
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
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCard.setBackground(new java.awt.Color(51, 255, 51));
        pnCard.setLayout(new java.awt.CardLayout());

        pnHome.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnHomeLayout = new javax.swing.GroupLayout(pnHome);
        pnHome.setLayout(pnHomeLayout);
        pnHomeLayout.setHorizontalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        pnHomeLayout.setVerticalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );

        pnCard.add(pnHome, "card3");

        pnQLNhanVien.setBackground(new java.awt.Color(122, 122, 220));

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
                    .addComponent(jScrollPane1)
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
                                .addGap(10, 10, 10)
                                .addComponent(txtDayNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLNhanVienLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lblHomeTownNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHomeTownNV, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                        .addComponent(btnADDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnUPDATENV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDELETENV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(btnRESETNV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnSAVENV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnQLNhanVienLayout.setVerticalGroup(
            pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLNhanVienLayout.createSequentialGroup()
                .addComponent(lblHeaderQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDNV, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtAddressNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameNV, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenderNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHomeTownNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHomeTownNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtNamNV)
                    .addComponent(rbtNuNV))
                .addGap(18, 18, 18)
                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDayNV, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtMonthNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonthNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDayNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirthNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSAVENV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRESETNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDELETENV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATENV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pnCard.add(pnQLNhanVien, "card4");

        pnQLKhachHang.setBackground(new java.awt.Color(0, 204, 204));
        pnQLKhachHang.setForeground(new java.awt.Color(255, 255, 255));

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
                    .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnQLKhachHangLayout.createSequentialGroup()
                            .addComponent(btnAddKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(98, 98, 98)
                            .addComponent(btnUpdateKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(btnResetKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88)
                            .addComponent(btnSaveKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtIDKH, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(pnQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pnCard.add(pnQLKhachHang, "card5");

        pnQLSanPham.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pnQLSanPhamLayout = new javax.swing.GroupLayout(pnQLSanPham);
        pnQLSanPham.setLayout(pnQLSanPhamLayout);
        pnQLSanPhamLayout.setHorizontalGroup(
            pnQLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        pnQLSanPhamLayout.setVerticalGroup(
            pnQLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );

        pnCard.add(pnQLSanPham, "card6");

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
//        CardLayout cardLayout = (CardLayout) pnCard.getLayout();
//        cardLayout.show(pnCard, "card4");
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
    private javax.swing.JButton btnAddKH;
    private javax.swing.JButton btnDELETENV;
    private javax.swing.JButton btnDeleteKH;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRESETNV;
    private javax.swing.JButton btnResetKH;
    private javax.swing.JButton btnSAVENV;
    private javax.swing.JButton btnSaveKH;
    private javax.swing.JButton btnSignup;
    private javax.swing.JButton btnUPDATENV;
    private javax.swing.JButton btnUpdateKH;
    private javax.swing.JComboBox<String> cbxCV;
    private javax.swing.ButtonGroup grbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAddressKH;
    private javax.swing.JLabel lblAddressNV;
    private javax.swing.JLabel lblBirthNV;
    private javax.swing.JLabel lblDayNV;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JLabel lblGenderNV;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeaderKH;
    private javax.swing.JLabel lblHeaderQLNV;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHomeTownNV;
    private javax.swing.JLabel lblIDKH;
    private javax.swing.JLabel lblIDNV;
    private javax.swing.JLabel lblMonthNV;
    private javax.swing.JLabel lblNameKH;
    private javax.swing.JLabel lblNameNV;
    private javax.swing.JLabel lblPhoneKH;
    private javax.swing.JLabel lblPhoneNV;
    private javax.swing.JLabel lblQLKhachHang;
    private javax.swing.JLabel lblQLNhanVien;
    private javax.swing.JLabel lblQLSanPham;
    private javax.swing.JLabel lblYearNV;
    private javax.swing.JPanel pnCard;
    private javax.swing.JPanel pnHome;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnNav;
    private javax.swing.JPanel pnQLKhachHang;
    private javax.swing.JPanel pnQLNhanVien;
    private javax.swing.JPanel pnQLSanPham;
    private javax.swing.JPanel pnRight;
    private javax.swing.JPanel pnSignIn;
    private javax.swing.JRadioButton rbtNamNV;
    private javax.swing.JRadioButton rbtNuNV;
    private javax.swing.JTable tbQLKH;
    private javax.swing.JTable tbQLNV;
    private javax.swing.JTextField txtAddressKH;
    private javax.swing.JTextField txtAddressNV;
    private javax.swing.JTextField txtDayNV;
    private javax.swing.JTextField txtHomeTownNV;
    private javax.swing.JTextField txtIDKH;
    private javax.swing.JTextField txtIDNV;
    private javax.swing.JTextField txtMonthNV;
    private javax.swing.JTextField txtNameKH;
    private javax.swing.JTextField txtNameNV;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtPhoneKH;
    private javax.swing.JTextField txtPhoneNV;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtYearNV;
    // End of variables declaration//GEN-END:variables
}
