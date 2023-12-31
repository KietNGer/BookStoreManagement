/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.KhachHangController;
import Controller.TaiKhoanController;
import Model.KhachHangModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GIA KIET
 */
public class KhachHang extends javax.swing.JFrame {

    /**
     * Creates new form KhachHang
     */
    public String TenDNHome, MatKhauHome;
    public KhachHangController kh = new KhachHangController();
    public TaiKhoanController tk = new TaiKhoanController();
    public DefaultTableModel table = new DefaultTableModel();
    public int ID;

    
    public KhachHang() {
        initComponents();
        this.setLocationRelativeTo(null);
        GetAllKhachHang();
    }
    
    public KhachHang(String TenDN, String MatKhau){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.TenDNHome = TenDN;
        this.MatKhauHome = MatKhau;
        GetAllKhachHang();
    }
    
    public void Reset(){
        HoTen_txt.setText("");
        CCCD_txt.setText("");
        DC_txt.setText("");
        SDT_txt.setText("");
        GT_txt.setText("");
        NgSinhKH.setDate(null);
    }
    
    public boolean CheckSDT(String regax){
        return regax.matches("^\\d{10}$");
    }
    
    public boolean CheckEmail(String regax){
        return regax.matches("^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
    }
    
    public boolean CheckNumberOrNot(String regax){
        return regax.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Search_txt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        SearchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddKHBtn = new javax.swing.JButton();
        UpdateKHBtn = new javax.swing.JButton();
        DelKHBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        HoTen_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NgSinhKH = new com.github.lgooddatepicker.components.DatePicker();
        jLabel9 = new javax.swing.JLabel();
        GT_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DC_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SDT_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CCCD_txt = new javax.swing.JTextField();
        QlaiBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sách khách hàng");

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));

        Search_txt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        Search_txt.setBackground(new java.awt.Color(173, 216, 230));
        Search_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khách hàng", "Tên khách hàng" }));
        jComboBox1.setBackground(new java.awt.Color(0, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        SearchBtn.setText("Tìm khách hàng");
        SearchBtn.setBackground(new java.awt.Color(0, 204, 204));
        SearchBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên khách hàng", "Ngày sinh ", "Địa chỉ", "SĐT", "CCCD", "Ngày tạo ", "Giới tính "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        AddKHBtn.setText("Thêm khách hàng");
        AddKHBtn.setBackground(new java.awt.Color(0, 204, 204));
        AddKHBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        AddKHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddKHBtnActionPerformed(evt);
            }
        });

        UpdateKHBtn.setText("Sửa khách hàng");
        UpdateKHBtn.setBackground(new java.awt.Color(0, 204, 204));
        UpdateKHBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        UpdateKHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateKHBtnActionPerformed(evt);
            }
        });

        DelKHBtn.setText("Xoá khách hàng");
        DelKHBtn.setBackground(new java.awt.Color(0, 204, 204));
        DelKHBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        DelKHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelKHBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Họ Tên");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        HoTen_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HoTen_txt.setBackground(new java.awt.Color(173, 216, 230));
        HoTen_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Ngày sinh");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        NgSinhKH.setBackground(new java.awt.Color(173, 216, 230));
        NgSinhKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Giới tính");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        GT_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GT_txt.setBackground(new java.awt.Color(173, 216, 230));
        GT_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Địa chỉ");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        DC_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DC_txt.setBackground(new java.awt.Color(173, 216, 230));
        DC_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Số điện thoại");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        SDT_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SDT_txt.setBackground(new java.awt.Color(173, 216, 230));
        SDT_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));

        jLabel10.setText("CCCD");
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        CCCD_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CCCD_txt.setBackground(new java.awt.Color(173, 216, 230));
        CCCD_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));

        QlaiBtn.setText("Quay lại");
        QlaiBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        QlaiBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        QlaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QlaiBtnActionPerformed(evt);
            }
        });

        ResetBtn.setText("Làm mới");
        ResetBtn.setBackground(new java.awt.Color(0, 204, 204));
        ResetBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HoTen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(DC_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(NgSinhKH, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(SDT_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CCCD_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GT_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(AddKHBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DelKHBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(QlaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NgSinhKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GT_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HoTen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DC_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SDT_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CCCD_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UpdateKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DelKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(QlaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 100, 100));

        jLabel1.setText("Danh sách khách hàng");
        jLabel1.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel1)
                .addContainerGap(504, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DelKHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelKHBtnActionPerformed
        // TODO add your handling code here:
        LocalDate date1 = NgSinhKH.getDate();
        String NgaySinh = "";
        LocalDate NgSinhLC = null;
        if(date1 != null){
            NgaySinh = date1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            NgSinhLC = LocalDate.parse(NgaySinh, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }    
        
        if(HoTen_txt.getText().isEmpty() || GT_txt.getText().isEmpty() || SDT_txt.getText().isEmpty() || DC_txt.getText().isEmpty() || CCCD_txt.getText().isEmpty() || NgaySinh.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int opt = JOptionPane.showConfirmDialog(this, "Bạn có chắc là muốn xoá thông tin khách hàng", "Sửa khách hàng", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opt == JOptionPane.YES_OPTION) {
            KhachHangModel khm = new KhachHangModel(ID, HoTen_txt.getText(), SDT_txt.getText(), DC_txt.getText(), GT_txt.getText(), NgSinhLC, null, CCCD_txt.getText());
            if(kh.XoaKH(khm) != 0){
                JOptionPane.showMessageDialog(this, "Xoá thành công");
                Reset();
                GetAllKhachHang();
            } else {
                JOptionPane.showMessageDialog(this, "Xoá thất bại", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_DelKHBtnActionPerformed

    private void UpdateKHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateKHBtnActionPerformed
        // TODO add your handling code here:
        LocalDate date1 = NgSinhKH.getDate();
        String NgaySinh = "";
        LocalDate NgSinhLC = null;
        if(date1 != null){
            NgaySinh = date1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            NgSinhLC = LocalDate.parse(NgaySinh, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }    
        
        if(HoTen_txt.getText().isEmpty() || GT_txt.getText().isEmpty() || SDT_txt.getText().isEmpty() || DC_txt.getText().isEmpty() || CCCD_txt.getText().isEmpty() || NgaySinh.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if(CheckSDT(SDT_txt.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Sai định dạng SDT", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if(CheckNumberOrNot(HoTen_txt.getText()) == true){
            JOptionPane.showMessageDialog(this, "Họ tên không chứa số", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if(CheckNumberOrNot(SDT_txt.getText()) == false || CheckNumberOrNot(CCCD_txt.getText()) == false){
            JOptionPane.showMessageDialog(this, "Lương hoặc SĐT phải là số", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
   
        int opt = JOptionPane.showConfirmDialog(this, "Bạn có chắc là muốn chỉnh sửa thông tin khách hàng", "Sửa khách hàng", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opt == JOptionPane.YES_OPTION) {
            KhachHangModel khm = new KhachHangModel(ID, HoTen_txt.getText(), SDT_txt.getText(), DC_txt.getText(), GT_txt.getText(), NgSinhLC, null, CCCD_txt.getText());
            if(kh.SuaKH(khm) != 0){
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                Reset();
                GetAllKhachHang();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_UpdateKHBtnActionPerformed

    private void AddKHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddKHBtnActionPerformed
        // TODO add your handling code here:
        LocalDate date1 = NgSinhKH.getDate();
        String NgaySinh = "";
        LocalDate NgSinhLC = null;
        if(date1 != null){
            NgaySinh = date1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            NgSinhLC = LocalDate.parse(NgaySinh, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }    
        
        if(HoTen_txt.getText().isEmpty() || GT_txt.getText().isEmpty() || SDT_txt.getText().isEmpty() || DC_txt.getText().isEmpty() || CCCD_txt.getText().isEmpty() || NgaySinh.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if(CheckSDT(SDT_txt.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Sai định dạng SDT", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if(CheckNumberOrNot(HoTen_txt.getText()) == true){
            JOptionPane.showMessageDialog(this, "Họ tên không chứa số", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if(CheckNumberOrNot(SDT_txt.getText()) == false || CheckNumberOrNot(CCCD_txt.getText()) == false){
            JOptionPane.showMessageDialog(this, "Lương hoặc SĐT phải là số", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
   
        int opt = JOptionPane.showConfirmDialog(this, "Bạn có chắc là muốn thêm thông tin khách hàng", "Thêm khách hàng", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opt == JOptionPane.YES_OPTION) {
            KhachHangModel khm = new KhachHangModel(HoTen_txt.getText(), SDT_txt.getText(), DC_txt.getText(), GT_txt.getText(), CCCD_txt.getText(), NgSinhLC, null);
            if(kh.ThemKH(khm) != 0){
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                Reset();
                GetAllKhachHang();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_AddKHBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        String search = Search_txt.getText();
        String choice =  jComboBox1.getSelectedItem().toString();
        DefaultTableModel Table_for_search = (DefaultTableModel) jTable1.getModel();
        Table_for_search.setRowCount(0);
        ArrayList<KhachHangModel> khmodel = new ArrayList<KhachHangModel>();
        if(CheckNumberOrNot(search) == false && choice.equals("Mã nhà cung cấp")){
            JOptionPane.showMessageDialog(this, "Mã khách hàng phải là số", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            khmodel = kh.TimKiemKH(choice, search);
            kh.Add(khmodel, Table_for_search);
        } 
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        Reset();
        GetAllKhachHang();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jTable1.setDefaultEditor(Object.class, null);
        try {
            int selectedRow = jTable1.getSelectedRow();
            DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
            SimpleDateFormat dtformat = new SimpleDateFormat("dd-MM-yyyy");
   
            Date date1 = dtformat.parse(temp.getValueAt(selectedRow, 2).toString());
            LocalDate NgSinhLocal = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            NgSinhKH.setDate(NgSinhLocal);
            ID = Integer.parseInt(temp.getValueAt(selectedRow, 0).toString());
            HoTen_txt.setText(temp.getValueAt(selectedRow, 1).toString());
            DC_txt.setText(temp.getValueAt(selectedRow, 3).toString());            
            SDT_txt.setText(temp.getValueAt(selectedRow, 4).toString());
            CCCD_txt.setText(temp.getValueAt(selectedRow, 5).toString());
            GT_txt.setText(temp.getValueAt(selectedRow, 7).toString());
        } catch (ParseException ex) {
            //Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void QlaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QlaiBtnActionPerformed
        // TODO add your handling code here:
        new Home(TenDNHome, MatKhauHome);
        dispose();
    }//GEN-LAST:event_QlaiBtnActionPerformed

    public void GetAllKhachHang(){
        String[] title = {"Mã KH", "Họ Tên", "Ngày sinh", "Địa chỉ", "SĐT", "CCCD", "Ngày tạo", "Giới tính"};
        table.setColumnIdentifiers(title);
        table.setRowCount(0);
        ArrayList<KhachHangModel> arrkhmodel = new ArrayList<KhachHangModel>();
        arrkhmodel = kh.getTCKhachHang();
        kh.Add(arrkhmodel, table);
        jTable1.setModel(table);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(425);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(25);
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
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddKHBtn;
    private javax.swing.JTextField CCCD_txt;
    private javax.swing.JTextField DC_txt;
    private javax.swing.JButton DelKHBtn;
    private javax.swing.JTextField GT_txt;
    private javax.swing.JTextField HoTen_txt;
    private com.github.lgooddatepicker.components.DatePicker NgSinhKH;
    private javax.swing.JButton QlaiBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField SDT_txt;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField Search_txt;
    private javax.swing.JButton UpdateKHBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
