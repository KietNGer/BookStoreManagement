/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.LuongController;
import Controller.TaiKhoanController;
import javax.swing.JOptionPane;
/**
 *
 * @author GIA KIET
 */
public class ChamCong extends javax.swing.JFrame {

    /**
     * Creates new form ChamCong
     */
    public ChamCong() {
        initComponents();
    }
    
    public String TenDNHome, MatKhauHome;
    public TaiKhoanController tk = new TaiKhoanController();
    public LuongController luong = new LuongController();
    public int checkChamCong = 0;
    
    public ChamCong(String TenDN, String MatKhau){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.TenDNHome = TenDN;
        this.MatKhauHome = MatKhau;
        if(tk.TraVeChucVu(TenDNHome, MatKhauHome) != 4)
            this.XemdsccBtn.setVisible(false);
        CheckChamCong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BatDauBtn = new javax.swing.JButton();
        KetThucBtn = new javax.swing.JButton();
        XemdsccBtn = new javax.swing.JButton();
        QlaiBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chấm công");

        jPanel2.setBackground(new java.awt.Color(0, 100, 100));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chấm công");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(173, 216, 230));

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));

        BatDauBtn.setBackground(new java.awt.Color(173, 216, 230));
        BatDauBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BatDauBtn.setText("Bắt đầu làm việc");
        BatDauBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatDauBtnActionPerformed(evt);
            }
        });

        KetThucBtn.setBackground(new java.awt.Color(173, 216, 230));
        KetThucBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        KetThucBtn.setText("Kết thúc ca làm");
        KetThucBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KetThucBtnActionPerformed(evt);
            }
        });

        XemdsccBtn.setBackground(new java.awt.Color(173, 216, 230));
        XemdsccBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        XemdsccBtn.setText("Xem danh sách chấm công của nhân viên");
        XemdsccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XemdsccBtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BatDauBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KetThucBtn)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(XemdsccBtn)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QlaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BatDauBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KetThucBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(XemdsccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(QlaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CheckChamCong(){
        int MaTK = tk.GetMaTK(TenDNHome, MatKhauHome);
        System.out.println(MaTK);
        if(luong.SlChamCong(MaTK) == 1){
            BatDauBtn.setEnabled(false);
        } else if(luong.SlChamCong(MaTK) == 2) {
            BatDauBtn.setEnabled(false);
            KetThucBtn.setEnabled(false);
        }
    }
    
    private void XemdsccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemdsccBtnActionPerformed
        // TODO add your handling code here:
        new DSChamCong(TenDNHome, MatKhauHome);
        dispose();
    }//GEN-LAST:event_XemdsccBtnActionPerformed

    private void QlaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QlaiBtnActionPerformed
        // TODO add your handling code here:
        new Home(TenDNHome, MatKhauHome);
        dispose();
    }//GEN-LAST:event_QlaiBtnActionPerformed

    private void BatDauBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatDauBtnActionPerformed
        // TODO add your handling code here:
        int MaTK = tk.GetMaTK(TenDNHome, MatKhauHome);
        System.out.println(MaTK);
        try {
            if(luong.BatDauChamCong(MaTK) != 0)
                JOptionPane.showMessageDialog(this, "Bắt đầu chấm công");
            BatDauBtn.setEnabled(false);
            CheckChamCong();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Chấm công thất bại", "Bắt đầu chấm công", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BatDauBtnActionPerformed

    private void KetThucBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KetThucBtnActionPerformed
        // TODO add your handling code here:
        int MaTK = tk.GetMaTK(TenDNHome, MatKhauHome);
        System.out.println(MaTK);
        try {
            if(luong.KetThucChamCong(MaTK) != 0)
                JOptionPane.showMessageDialog(this, "kết thúc chấm công");
            KetThucBtn.setEnabled(false);
            CheckChamCong();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Chấm công thất bại", "Bắt đầu chấm công", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_KetThucBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChamCong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatDauBtn;
    private javax.swing.JButton KetThucBtn;
    private javax.swing.JButton QlaiBtn;
    private javax.swing.JButton XemdsccBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
