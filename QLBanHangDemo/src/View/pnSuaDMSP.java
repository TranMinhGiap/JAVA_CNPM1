/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.SanPhamRepository;
import Model.Category;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author TRAN MINH GIAP
 */
public class pnSuaDMSP extends javax.swing.JPanel {

    /**
     * Creates new form pnSuaDMSP
     */
    public pnSuaDMSP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHeader = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDESC = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtNAME = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDESC = new javax.swing.JTextArea();

        pnHeader.setBackground(new java.awt.Color(0, 153, 0));

        lblHeader.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Sửa Danh Mục Sản Phẩm");

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblHeader)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblID.setText("ID");

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblName.setText("NAME");

        lblDESC.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblDESC.setText("DESC");

        btnSua.setBackground(new java.awt.Color(0, 153, 0));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(0, 153, 0));
        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        txtNAME.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        txtaDESC.setColumns(20);
        txtaDESC.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtaDESC.setRows(5);
        jScrollPane1.setViewportView(txtaDESC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(lblID))
                        .addComponent(lblDESC))
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDESC)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        String name = txtNAME.getText();
        String desc = txtaDESC.getText();
        Category ctg = new Category(id, name, desc);
        try {
            SanPhamRepository sprepo = new SanPhamRepository();
            if(sprepo.updateCategory(ctg)){
                JOptionPane.showMessageDialog(this, "Cập Nhật Danh Mục Sản Phẩm Thành Công !");
            }
            else{
                JOptionPane.showMessageDialog(this, "Cập Nhật Danh Mục Sản Phẩm Không Thành Công !");
            }
        } catch (Exception ex) {
            System.out.println("Error EVEN btnSua in pnSuaDMSP : " + ex.getMessage());
        }finally{
            destroy();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Kết Thúc Quá Trình Nhập Sản Phẩm !");
        destroy();
    }//GEN-LAST:event_btnHuyActionPerformed

    public void showData(Category ctg){
        this.txtID.setText(ctg.getCategoryID());
        this.txtNAME.setText(ctg.getCategoryName());
        this.txtaDESC.setText(ctg.getDescription());
        this.txtID.setEditable(false);
    }
    
    public void destroy(){
        Window window = SwingUtilities.windowForComponent(this);
        if (window != null) {
            window.dispose(); // Đóng JDialog
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDESC;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNAME;
    private javax.swing.JTextArea txtaDESC;
    // End of variables declaration//GEN-END:variables
}
