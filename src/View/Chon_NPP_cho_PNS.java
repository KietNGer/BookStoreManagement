/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.NhaPhanPhoiController;
import Controller.TaiKhoanController;
import Model.NhaPhanPhoiModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GIA KIET
 */
public class Chon_NPP_cho_PNS extends javax.swing.JFrame {

    /**
     *
     */
    public Chon_NPP_cho_PNS() {
        initComponents();
        GetAllNPP();
    }
    
    public String TenDNHome, MatKhauHome;
    public int ID;
    public TaiKhoanController tk = new TaiKhoanController();
    public NhaPhanPhoiController npp = new NhaPhanPhoiController(); 
    public DefaultTableModel table = new DefaultTableModel();
    
    public boolean CheckNumberOrNot(String regax){
        return regax.matches("-?\\d+(\\.\\d+)?");
    }
    
    public Chon_NPP_cho_PNS(String TenDN, String MatKhau){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.TenDNHome = TenDN;
        this.MatKhauHome = MatKhau;
        GetAllNPP();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Search_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddHDBtn = new javax.swing.JButton();
        QlaiBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        SearchBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 100, 100));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chọn nhà phân phối để tạo phiếu nhập");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));

        Search_txt.setBackground(new java.awt.Color(173, 216, 230));
        Search_txt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        Search_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã NPP", "Tên nhà phân phối"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        AddHDBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        AddHDBtn.setText("Tạo phiếu nhập");
        AddHDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddHDBtnActionPerformed(evt);
            }
        });

        QlaiBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        QlaiBtn.setText("Quay lại");
        QlaiBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        QlaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QlaiBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(0, 204, 204));
        ResetBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ResetBtn.setText("Làm mới");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhà phân phối", "Tên nhà phân phối" }));

        SearchBtn1.setBackground(new java.awt.Color(0, 204, 204));
        SearchBtn1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SearchBtn1.setText("Tìm nhà phân phối");
        SearchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddHDBtn)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(QlaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchBtn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(AddHDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(QlaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jTable1.setDefaultEditor(Object.class, null);
        try{
            int selectedRow = jTable1.getSelectedRow();
            DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
            ID = Integer.parseInt(temp.getValueAt(selectedRow, 0).toString());
            String TenKH = temp.getValueAt(selectedRow, 1).toString();
            System.out.println(ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void AddHDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddHDBtnActionPerformed
        // TODO add your handling code here:
        new Them_PN(TenDNHome, MatKhauHome, ID);
        dispose();
    }//GEN-LAST:event_AddHDBtnActionPerformed

    private void QlaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QlaiBtnActionPerformed
        // TODO add your handling code here:
        new PhieuNhapSach(TenDNHome, MatKhauHome);
        dispose();
    }//GEN-LAST:event_QlaiBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        Search_txt.setText("");
        GetAllNPP();;

    }//GEN-LAST:event_ResetBtnActionPerformed

    private void SearchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtn1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Table_for_search = (DefaultTableModel) jTable1.getModel();
        Table_for_search.setRowCount(0);
        ArrayList<NhaPhanPhoiModel> nppModel = new ArrayList<NhaPhanPhoiModel>();
        if(CheckNumberOrNot(Search_txt.getText()) == false && jComboBox1.getSelectedItem().toString().equals("Mã nhà cung cấp")){
            JOptionPane.showMessageDialog(this, "Mã nhà cung cấp phải là số", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            nppModel = npp.TimKiemNCC(jComboBox1.getSelectedItem().toString(), Search_txt.getText());
            npp.Add(nppModel, Table_for_search);
        }
    }//GEN-LAST:event_SearchBtn1ActionPerformed

    public void GetAllNPP(){
        String title[] = {"Mã NPP", "Tên NPP"};
        table.setColumnIdentifiers(title);
        table.setRowCount(0);
        ArrayList<NhaPhanPhoiModel> nppModel = new ArrayList<NhaPhanPhoiModel>();
        nppModel = npp.getTCNCC();
        npp.Add(nppModel, table);
        jTable1.setModel(table);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTable1.setRowHeight(30);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args) {
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
            java.util.logging.Logger.getLogger(Chon_NPP_cho_PNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chon_NPP_cho_PNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chon_NPP_cho_PNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chon_NPP_cho_PNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chon_NPP_cho_PNS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddHDBtn;
    private javax.swing.JButton QlaiBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SearchBtn1;
    private javax.swing.JTextField Search_txt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
