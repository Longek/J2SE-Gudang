package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import resource.Koneksi;

/**
 *
 * @author hanif
 */
public class FormBarang extends javax.swing.JFrame {

    /**
     * Creates new form FormBarang
     */
    Connection con;
    Controller controller;
    CardLayout cardLayout;
    UpdateTable updateTable;
    public FormBarang() {
        initComponents();
        controller = new Controller(this);
        cardLayout = (CardLayout)(panelKanan.getLayout());
        cardLayout.show(panelKanan, "cardHome");
        jLabel43.setVisible(false);
        jLabel18.setVisible(false);
        jTextField12.setEditable(false);
        staring();
        controller.jam_digital();
        jButton21.setEnabled(false);
        jLabel50.setVisible(false);
        jLabel51.setVisible(false);
        jLabel52.setVisible(false);
        jDateChooser1.setCalendar(Calendar.getInstance());

//        namabarang();
    }

    public JLabel getjLabel50() {
        return jLabel50;
    }

    public JLabel getjLabel51() {
        return jLabel51;
    }

    public JLabel getjLabel52() {
        return jLabel52;
    }

    public JTable getTblKeluar() {
        return tblKeluar;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JTable getjTable2() {
        return jTable2;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public JTextField getKodebarangbesar() {
        return kodebarangbesar;
    }

    public JTextField getjTextField2() {
        return kodebarangbesar;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }

    public JTextField getjTextField5() {
        return jTextField5;
    }

    public void setjTextField5(JTextField jTextField5) {
        this.jTextField5 = jTextField5;
    }

    public JTextField getjTextField7() {
        return jTextField7;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.jTextField7 = jTextField7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JTextField getjTextField15() {
        return jTextField15;
    }

    public void setjTextField15(JTextField jTextField15) {
        this.jTextField15 = jTextField15;
    }

    public JTextField getjTextField16() {
        return jTextField16;
    }

    public void setjTextField16(JTextField jTextField16) {
        this.jTextField16 = jTextField16;
    }

    public JTextField getjTextField17() {
        return jTextField17;
    }

    public void setjTextField17(JTextField jTextField17) {
        this.jTextField17 = jTextField17;
    }

    public JTextField getjTextField18() {
        return jTextField18;
    }

    public void setjTextField18(JTextField jTextField18) {
        this.jTextField18 = jTextField18;
    }

    public JComboBox<String> getjComboBox3() {
        return jComboBox3;
    }

    public void setjComboBox3(JComboBox<String> jComboBox3) {
        this.jComboBox3 = jComboBox3;
    }

    public JComboBox<String> getjComboBox4() {
        return jComboBox4;
    }

    public void setjComboBox4(JComboBox<String> jComboBox4) {
        this.jComboBox4 = jComboBox4;
    }

    public JTextField getjTextField13() {
        return jTextField13;
    }

    public JButton getjButton15() {
        return jButton15;
    }

    public JTextField getjTextField21() {
        return jTextField21;
    }

    public JLabel getjLabel31() {
        return jLabel31;
    }

    public JTextField getjTextField20() {
        return jTextField20;
    }

    public JLabel getjLabel40() {
        return jLabel40;
    }

    public JComboBox<String> getjComboBox6() {
        return jComboBox6;
    }

    public JTextField getjTextField8() {
        return jTextField8;
    }

    public JTextField getjTextField9() {
        return jTextField9;
    }

    public JTextField getjTextField10() {
        return jTextField10;
    }

    public JTextField getjTextField11() {
        return jTextField11;
    }

    public JTextField getjTextField12() {
        return jTextField12;
    }

    public JTextField getjTextField19() {
        return jTextField19;
    }

    public JTextField getjTextField22() {
        return jTextField22;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public JLabel getjLabel42() {
        return jLabel42;
    }

    public JLabel getjLabel43() {
        return jLabel43;
    }

    public void setjLabel43(JLabel jLabel43) {
        this.jLabel43 = jLabel43;
    }

    public JLabel getjLabel46() {
        return jLabel46;
    }

    public void setjLabel46(JLabel jLabel46) {
        this.jLabel46 = jLabel46;
    }

    public JLabel getjLabel47() {
        return jLabel47;
    }

    public void setjLabel47(JLabel jLabel47) {
        this.jLabel47 = jLabel47;
    }

    public JLabel getjLabel38() {
        return jLabel38;
    }

    public void setjLabel38(JLabel jLabel38) {
        this.jLabel38 = jLabel38;
    }

    public JTextField getKd_keluar() {
        return kd_keluar;
    }

    public void setKd_keluar(JTextField kd_keluar) {
        this.kd_keluar = kd_keluar;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        panekKiri = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        labelhome = new javax.swing.JLabel();
        btbhdata = new keeptoo.KButton();
        bhome = new keeptoo.KButton();
        bunboxing = new keeptoo.KButton();
        bukeluar = new keeptoo.KButton();
        laporan = new keeptoo.KButton();
        bexit = new keeptoo.KButton();
        panelKanan = new javax.swing.JPanel();
        cardUnboxing = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton11 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField20 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jTextField21 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cardTambahData = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        kodebarangbesar = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        btnhapus = new keeptoo.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        cardHome = new javax.swing.JPanel();
        btnSrSptPTrans1 = new keeptoo.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        btn_transaksi2 = new keeptoo.KButton();
        btn_transaksi3 = new keeptoo.KButton();
        cardLaporan = new javax.swing.JPanel();
        laporan1 = new keeptoo.KButton();
        btnSideTrans14 = new keeptoo.KButton();
        btnSideTrans12 = new keeptoo.KButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel53 = new javax.swing.JLabel();
        btnSideTrans13 = new keeptoo.KButton();
        cardkeluar = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        kd_keluar = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKeluar = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        tanggal = new com.toedter.calendar.JDateChooser();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 152, 92));

        jSplitPane1.setBackground(new java.awt.Color(102, 102, 102));
        jSplitPane1.setBorder(null);

        panekKiri.setBackground(new java.awt.Color(33, 152, 92));

        jPanel5.setBackground(new java.awt.Color(48, 204, 126));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Admin");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Gudang");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("jam");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gudang.png"))); // NOI18N
        labelhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelhomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelhome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelhome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btbhdata.setBackground(new java.awt.Color(33, 152, 92));
        btbhdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconAdd.png")));
        btbhdata.setText("           Barang Masuk");
        btbhdata.setToolTipText("");
        btbhdata.setAlignmentY(0.0F);
        btbhdata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btbhdata.setHideActionText(true);
        btbhdata.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btbhdata.setIconTextGap(25);
        btbhdata.setkBackGroundColor(new java.awt.Color(33, 152, 92));
        btbhdata.setkBorderRadius(0);
        btbhdata.setkEndColor(new java.awt.Color(33, 152, 92));
        btbhdata.setkHoverEndColor(new java.awt.Color(33, 152, 92));
        btbhdata.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btbhdata.setkHoverStartColor(new java.awt.Color(0, 175, 115));
        btbhdata.setkPressedColor(new java.awt.Color(204, 204, 204));
        btbhdata.setkSelectedColor(new java.awt.Color(0, 175, 115));
        btbhdata.setkStartColor(new java.awt.Color(33, 152, 92));
        btbhdata.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btbhdata.setMaximumSize(new java.awt.Dimension(230, 50));
        btbhdata.setMinimumSize(new java.awt.Dimension(230, 50));
        btbhdata.setPreferredSize(new java.awt.Dimension(230, 50));
        btbhdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbhdataActionPerformed(evt);
            }
        });

        bhome.setBackground(new java.awt.Color(33, 152, 92));
        bhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconHome.png"))); // NOI18N);
    bhome.setText("Home");
    bhome.setToolTipText("");
    bhome.setAlignmentY(0.0F);
    bhome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    bhome.setHideActionText(true);
    bhome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    bhome.setIconTextGap(25);
    bhome.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    bhome.setkBorderRadius(0);
    bhome.setkEndColor(new java.awt.Color(33, 152, 92));
    bhome.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    bhome.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    bhome.setkHoverStartColor(new java.awt.Color(0, 175, 115));
    bhome.setkPressedColor(new java.awt.Color(204, 204, 204));
    bhome.setkSelectedColor(new java.awt.Color(0, 175, 115));
    bhome.setkStartColor(new java.awt.Color(33, 152, 92));
    bhome.setMargin(new java.awt.Insets(0, 0, 0, 0));
    bhome.setMaximumSize(new java.awt.Dimension(230, 50));
    bhome.setMinimumSize(new java.awt.Dimension(230, 50));
    bhome.setPreferredSize(new java.awt.Dimension(230, 50));
    bhome.setSelected(true);
    bhome.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bhomeActionPerformed(evt);
        }
    });

    bunboxing.setBackground(new java.awt.Color(33, 152, 92));
    bunboxing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconWarehouse.png")));
    bunboxing.setText("       Buka Kotak");
    bunboxing.setToolTipText("");
    bunboxing.setAlignmentY(0.0F);
    bunboxing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    bunboxing.setHideActionText(true);
    bunboxing.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    bunboxing.setIconTextGap(25);
    bunboxing.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    bunboxing.setkBorderRadius(0);
    bunboxing.setkEndColor(new java.awt.Color(33, 152, 92));
    bunboxing.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    bunboxing.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    bunboxing.setkHoverStartColor(new java.awt.Color(0, 175, 115));
    bunboxing.setkPressedColor(new java.awt.Color(204, 204, 204));
    bunboxing.setkSelectedColor(new java.awt.Color(0, 175, 115));
    bunboxing.setkStartColor(new java.awt.Color(33, 152, 92));
    bunboxing.setMargin(new java.awt.Insets(0, 0, 0, 0));
    bunboxing.setMaximumSize(new java.awt.Dimension(230, 50));
    bunboxing.setMinimumSize(new java.awt.Dimension(230, 50));
    bunboxing.setPreferredSize(new java.awt.Dimension(230, 50));
    bunboxing.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bunboxingActionPerformed(evt);
        }
    });

    bukeluar.setBackground(new java.awt.Color(33, 152, 92));
    bukeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconPromo.png")));
    bukeluar.setText("            Barang Keluar");
    bukeluar.setToolTipText("");
    bukeluar.setAlignmentY(0.0F);
    bukeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    bukeluar.setHideActionText(true);
    bukeluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    bukeluar.setIconTextGap(25);
    bukeluar.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    bukeluar.setkBorderRadius(0);
    bukeluar.setkEndColor(new java.awt.Color(33, 152, 92));
    bukeluar.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    bukeluar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    bukeluar.setkHoverStartColor(new java.awt.Color(0, 175, 115));
    bukeluar.setkPressedColor(new java.awt.Color(204, 204, 204));
    bukeluar.setkSelectedColor(new java.awt.Color(0, 175, 115));
    bukeluar.setkStartColor(new java.awt.Color(33, 152, 92));
    bukeluar.setMargin(new java.awt.Insets(0, 0, 0, 0));
    bukeluar.setMaximumSize(new java.awt.Dimension(230, 50));
    bukeluar.setMinimumSize(new java.awt.Dimension(230, 50));
    bukeluar.setPreferredSize(new java.awt.Dimension(230, 50));
    bukeluar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bukeluarActionPerformed(evt);
        }
    });

    laporan.setBackground(new java.awt.Color(33, 152, 92));
    laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconReport.png")));
    laporan.setText("   Laporan");
    laporan.setToolTipText("");
    laporan.setAlignmentY(0.0F);
    laporan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    laporan.setHideActionText(true);
    laporan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    laporan.setIconTextGap(25);
    laporan.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    laporan.setkBorderRadius(0);
    laporan.setkEndColor(new java.awt.Color(33, 152, 92));
    laporan.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    laporan.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    laporan.setkHoverStartColor(new java.awt.Color(0, 175, 115));
    laporan.setkPressedColor(new java.awt.Color(204, 204, 204));
    laporan.setkSelectedColor(new java.awt.Color(0, 175, 115));
    laporan.setkStartColor(new java.awt.Color(33, 152, 92));
    laporan.setMargin(new java.awt.Insets(0, 0, 0, 0));
    laporan.setMaximumSize(new java.awt.Dimension(230, 50));
    laporan.setMinimumSize(new java.awt.Dimension(230, 50));
    laporan.setPreferredSize(new java.awt.Dimension(230, 50));
    laporan.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            laporanActionPerformed(evt);
        }
    });

    bexit.setBackground(new java.awt.Color(33, 152, 92));
    bexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconLogout.png")));
    bexit.setText("Exit");
    bexit.setToolTipText("");
    bexit.setAlignmentY(0.0F);
    bexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    bexit.setHideActionText(true);
    bexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    bexit.setIconTextGap(25);
    bexit.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    bexit.setkBorderRadius(0);
    bexit.setkEndColor(new java.awt.Color(33, 152, 92));
    bexit.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    bexit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    bexit.setkHoverStartColor(new java.awt.Color(0, 175, 115));
    bexit.setkPressedColor(new java.awt.Color(204, 204, 204));
    bexit.setkSelectedColor(new java.awt.Color(0, 175, 115));
    bexit.setkStartColor(new java.awt.Color(33, 152, 92));
    bexit.setMargin(new java.awt.Insets(0, 0, 0, 0));
    bexit.setMaximumSize(new java.awt.Dimension(230, 50));
    bexit.setMinimumSize(new java.awt.Dimension(230, 50));
    bexit.setPreferredSize(new java.awt.Dimension(230, 50));
    bexit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bexitActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout panekKiriLayout = new javax.swing.GroupLayout(panekKiri);
    panekKiri.setLayout(panekKiriLayout);
    panekKiriLayout.setHorizontalGroup(
        panekKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(panekKiriLayout.createSequentialGroup()
            .addGroup(panekKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(bukeluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(bunboxing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(bhome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btbhdata, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(laporan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(0, 0, Short.MAX_VALUE))
        .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );
    panekKiriLayout.setVerticalGroup(
        panekKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panekKiriLayout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(bhome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(btbhdata, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(bunboxing, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(bukeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(216, Short.MAX_VALUE))
    );

    jSplitPane1.setLeftComponent(panekKiri);

    panelKanan.setBackground(new java.awt.Color(102, 102, 102));
    panelKanan.setLayout(new java.awt.CardLayout());

    cardUnboxing.setBackground(new java.awt.Color(102, 102, 102));

    jPanel3.setBackground(new java.awt.Color(102, 102, 102));
    jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
    jLabel11.setText("Satuan Besar");

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("Kode");

    jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    jLabel15.setText("Nama");

    jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setText("Tipe");

    jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
    jLabel17.setText("Satuan");

    jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel25.setForeground(new java.awt.Color(255, 255, 255));
    jLabel25.setText("Harga Modal");

    jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel26.setForeground(new java.awt.Color(255, 255, 255));
    jLabel26.setText("Harga Jual");

    jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel28.setForeground(new java.awt.Color(255, 255, 255));
    jLabel28.setText("Banyak");

    jButton11.setText("Simpan");
    jButton11.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton11ActionPerformed(evt);
        }
    });

    jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pcs", "buah" }));

    jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton17.setText("add");

    jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton18.setText("cek");

    jPanel4.setBackground(new java.awt.Color(102, 102, 102));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kotak", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

    jTextField20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton19.setText("cek");
    jButton19.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton19ActionPerformed(evt);
        }
    });

    jTextField21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel29.setForeground(new java.awt.Color(255, 255, 255));
    jLabel29.setText("Nama");

    jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel30.setForeground(new java.awt.Color(255, 255, 255));
    jLabel30.setText("Kode");

    jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel27.setForeground(new java.awt.Color(255, 255, 255));
    jLabel27.setText("Isi Per Kotak    ");

    jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel31.setForeground(new java.awt.Color(255, 255, 255));
    jLabel31.setText(" -");

    jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel32.setForeground(new java.awt.Color(255, 255, 255));
    jLabel32.setText("Banyak dibuka");

    jTextField22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField22.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField22ActionPerformed(evt);
        }
    });
    jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField22KeyReleased(evt);
        }
    });

    jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel41.setForeground(new java.awt.Color(255, 255, 255));
    jLabel41.setText("Banyak           ");

    jLabel42.setBackground(new java.awt.Color(102, 102, 102));
    jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel42.setForeground(new java.awt.Color(255, 255, 255));
    jLabel42.setText(" -");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(189, 189, 189))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGap(199, 199, 199))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel30)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton19))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel29)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel41)
                .addComponent(jLabel42))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel27)
                .addComponent(jLabel31))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel32)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel33.setForeground(new java.awt.Color(255, 255, 255));
    jLabel33.setText(" -");

    jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel40.setForeground(new java.awt.Color(255, 255, 255));
    jLabel40.setText("-");

    jLabel18.setText("1");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButton11))
                                    .addGap(259, 259, 259)
                                    .addComponent(jLabel18))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel11)
            .addGap(18, 18, 18)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton18))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel15)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel16)
                .addComponent(jLabel40))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17))
                .addComponent(jLabel17))
            .addGap(17, 17, 17)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel25)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel26)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel28)
                .addComponent(jLabel33)
                .addComponent(jLabel18))
            .addGap(20, 20, 20)
            .addComponent(jButton11)
            .addGap(18, 18, 18)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(196, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout cardUnboxingLayout = new javax.swing.GroupLayout(cardUnboxing);
    cardUnboxing.setLayout(cardUnboxingLayout);
    cardUnboxingLayout.setHorizontalGroup(
        cardUnboxingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(cardUnboxingLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    cardUnboxingLayout.setVerticalGroup(
        cardUnboxingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(cardUnboxingLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelKanan.add(cardUnboxing, "cardUnboxing");

    cardTambahData.setBackground(new java.awt.Color(102, 102, 102));

    jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
    jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jPanel2.setBackground(new java.awt.Color(102, 102, 102));

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Satuan Besar");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(240, 240, 240));
    jLabel3.setText("Kode");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(240, 240, 240));
    jLabel4.setText("Nama");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(240, 240, 240));
    jLabel5.setText("Tipe");

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(240, 240, 240));
    jLabel6.setText("Satuan");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(240, 240, 240));
    jLabel7.setText("Harga Modal");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(240, 240, 240));
    jLabel8.setText("Harga Jual");

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(240, 240, 240));
    jLabel9.setText("Banyak");

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(240, 240, 240));
    jLabel10.setText("Isi per kotak");

    jButton7.setText("Simpan");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });

    kodebarangbesar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    kodebarangbesar.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            kodebarangbesarKeyPressed(evt);
        }
    });

    jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField3KeyReleased(evt);
        }
    });

    jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "makanan", "minuman", "shampo", "sabun" }));

    jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dus", "lusin", "slof", " " }));

    jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField4KeyReleased(evt);
        }
    });

    jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField5KeyReleased(evt);
        }
    });

    jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField6KeyReleased(evt);
        }
    });

    jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField7ActionPerformed(evt);
        }
    });
    jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField7KeyReleased(evt);
        }
    });

    jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton8.setText("add");

    jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton9.setText("add");

    jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton10.setText("cek");
    jButton10.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton10ActionPerformed(evt);
        }
    });

    jTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Transaksi", "ID", "Nama", "Tipe", "Satuan", "Modal", "Harga Jual", "Banyak", "Isi"
        }
    ));
    jTable2.setIntercellSpacing(new java.awt.Dimension(2, 2));
    jTable2.setRowHeight(25);
    jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable2MouseClicked(evt);
        }
    });
    jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            jTable2KeyPressed(evt);
        }
    });
    jScrollPane2.setViewportView(jTable2);

    jButton1.setText("Selesai");

    jButton5.setText("Batal");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

    jLabel50.setText("jLabel50");

    jLabel51.setText("jLabel51");

    jLabel52.setText("jLabel52");

    btnhapus.setText("Hapus");
    btnhapus.setAlignmentY(0.0F);
    btnhapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnhapus.setHideActionText(true);
    btnhapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnhapus.setIconTextGap(25);
    btnhapus.setkBorderRadius(0);
    btnhapus.setkEndColor(new java.awt.Color(217, 93, 93));
    btnhapus.setkHoverEndColor(new java.awt.Color(0, 102, 51));
    btnhapus.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    btnhapus.setkHoverStartColor(new java.awt.Color(0, 102, 51));
    btnhapus.setkIndicatorThickness(0);
    btnhapus.setkPressedColor(new java.awt.Color(204, 204, 204));
    btnhapus.setkSelectedColor(new java.awt.Color(0, 102, 51));
    btnhapus.setkStartColor(new java.awt.Color(212, 74, 74));
    btnhapus.setMargin(new java.awt.Insets(0, 0, 0, 0));
    btnhapus.setMaximumSize(new java.awt.Dimension(67, 37));
    btnhapus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnhapusActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField3)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField4)
                                                .addComponent(jTextField5)
                                                .addComponent(jTextField6)
                                                .addComponent(jTextField7)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kodebarangbesar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton5)
                                    .addGap(114, 114, 114)
                                    .addComponent(jButton1)))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel51)
                                .addComponent(jLabel52))
                            .addGap(53, 53, 53))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel50)
                            .addGap(80, 80, 80)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(kodebarangbesar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton1)
                        .addComponent(jButton5)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel50)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel51)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel52))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18)
            .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(179, 179, 179))
    );

    jTabbedPane1.addTab("Data Kotak", jPanel2);

    jPanel1.setBackground(new java.awt.Color(102, 102, 102));

    jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(240, 240, 240));
    jLabel13.setText("Satuan Kecil");

    jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(240, 240, 240));
    jLabel14.setText("Kode");

    jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField13KeyReleased(evt);
        }
    });

    jButton12.setText("cek");
    jButton12.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton12ActionPerformed(evt);
        }
    });

    jTextField15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField15KeyReleased(evt);
        }
    });

    jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel19.setForeground(new java.awt.Color(240, 240, 240));
    jLabel19.setText("Banyak");

    jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel20.setForeground(new java.awt.Color(240, 240, 240));
    jLabel20.setText("Harga Jual");

    jTextField16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField16KeyReleased(evt);
        }
    });

    jTextField17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField17KeyReleased(evt);
        }
    });

    jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel21.setForeground(new java.awt.Color(240, 240, 240));
    jLabel21.setText("Harga Modal");

    jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel22.setForeground(new java.awt.Color(240, 240, 240));
    jLabel22.setText("Satuan");

    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bungkus", "botol", "sachet", " " }));

    jButton13.setText("add");

    jButton14.setText("add");

    jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "makanan", "minuman", "shampo", "sabun", " " }));

    jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel23.setForeground(new java.awt.Color(240, 240, 240));
    jLabel23.setText("Tipe");

    jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel24.setForeground(new java.awt.Color(240, 240, 240));
    jLabel24.setText("Nama");

    jTextField18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField18KeyReleased(evt);
        }
    });

    jButton15.setText("Simpan");
    jButton15.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton15ActionPerformed(evt);
        }
    });

    jButton4.setText("Batal");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField18)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton15)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4)))))
                    .addGap(0, 926, Short.MAX_VALUE))
                .addComponent(jSeparator2))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel13)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton12))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel24)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel23)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton14))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel21)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel19)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(49, 49, 49)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton15)
                .addComponent(jButton4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(328, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Data Kecil", jPanel1);

    javax.swing.GroupLayout cardTambahDataLayout = new javax.swing.GroupLayout(cardTambahData);
    cardTambahData.setLayout(cardTambahDataLayout);
    cardTambahDataLayout.setHorizontalGroup(
        cardTambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(cardTambahDataLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jTabbedPane1)
            .addContainerGap())
    );
    cardTambahDataLayout.setVerticalGroup(
        cardTambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(cardTambahDataLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jTabbedPane1)
            .addContainerGap())
    );

    panelKanan.add(cardTambahData, "cardTambahData");

    cardHome.setBackground(new java.awt.Color(102, 102, 102));

    btnSrSptPTrans1.setText("Cari");
    btnSrSptPTrans1.setAlignmentY(0.0F);
    btnSrSptPTrans1.setHideActionText(true);
    btnSrSptPTrans1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnSrSptPTrans1.setIconTextGap(25);
    btnSrSptPTrans1.setkBorderRadius(0);
    btnSrSptPTrans1.setkEndColor(new java.awt.Color(0, 153, 51));
    btnSrSptPTrans1.setkHoverEndColor(new java.awt.Color(0, 102, 51));
    btnSrSptPTrans1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    btnSrSptPTrans1.setkHoverStartColor(new java.awt.Color(0, 102, 51));
    btnSrSptPTrans1.setkIndicatorThickness(0);
    btnSrSptPTrans1.setkPressedColor(new java.awt.Color(204, 204, 204));
    btnSrSptPTrans1.setkSelectedColor(new java.awt.Color(0, 102, 51));
    btnSrSptPTrans1.setkStartColor(new java.awt.Color(33, 152, 92));
    btnSrSptPTrans1.setMargin(new java.awt.Insets(0, 0, 0, 0));
    btnSrSptPTrans1.setMaximumSize(new java.awt.Dimension(67, 37));
    btnSrSptPTrans1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSrSptPTrans1ActionPerformed(evt);
        }
    });

    jTable1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jTable1.setIntercellSpacing(new java.awt.Dimension(3, 3));
    jTable1.setRowHeight(25);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Data Barang");

    jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField1KeyReleased(evt);
        }
    });

    jLabel43.setText("jLabel43");

    btn_transaksi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconEdit.png")));
    btn_transaksi2.setText("           Ubah Barang");
    btn_transaksi2.setAlignmentY(0.0F);
    btn_transaksi2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btn_transaksi2.setHideActionText(true);
    btn_transaksi2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn_transaksi2.setIconTextGap(25);
    btn_transaksi2.setkBorderRadius(0);
    btn_transaksi2.setkEndColor(new java.awt.Color(81, 150, 176));
    btn_transaksi2.setkHoverEndColor(new java.awt.Color(0, 102, 51));
    btn_transaksi2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    btn_transaksi2.setkHoverStartColor(new java.awt.Color(0, 102, 51));
    btn_transaksi2.setkIndicatorThickness(0);
    btn_transaksi2.setkPressedColor(new java.awt.Color(204, 204, 204));
    btn_transaksi2.setkSelectedColor(new java.awt.Color(0, 102, 51));
    btn_transaksi2.setkStartColor(new java.awt.Color(28, 110, 130));
    btn_transaksi2.setMargin(new java.awt.Insets(0, 0, 0, 0));
    btn_transaksi2.setMaximumSize(new java.awt.Dimension(67, 37));
    btn_transaksi2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_transaksi2ActionPerformed(evt);
        }
    });

    btn_transaksi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconDel.png")));
    btn_transaksi3.setText("        Hapus Barang");
    btn_transaksi3.setAlignmentY(0.0F);
    btn_transaksi3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btn_transaksi3.setHideActionText(true);
    btn_transaksi3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn_transaksi3.setIconTextGap(25);
    btn_transaksi3.setkBorderRadius(0);
    btn_transaksi3.setkEndColor(new java.awt.Color(217, 93, 93));
    btn_transaksi3.setkHoverEndColor(new java.awt.Color(0, 102, 51));
    btn_transaksi3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    btn_transaksi3.setkHoverStartColor(new java.awt.Color(0, 102, 51));
    btn_transaksi3.setkIndicatorThickness(0);
    btn_transaksi3.setkPressedColor(new java.awt.Color(204, 204, 204));
    btn_transaksi3.setkSelectedColor(new java.awt.Color(0, 102, 51));
    btn_transaksi3.setkStartColor(new java.awt.Color(212, 74, 74));
    btn_transaksi3.setMargin(new java.awt.Insets(0, 0, 0, 0));
    btn_transaksi3.setMaximumSize(new java.awt.Dimension(67, 37));
    btn_transaksi3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_transaksi3ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout cardHomeLayout = new javax.swing.GroupLayout(cardHome);
    cardHome.setLayout(cardHomeLayout);
    cardHomeLayout.setHorizontalGroup(
        cardHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1)
        .addGroup(cardHomeLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(cardHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardHomeLayout.createSequentialGroup()
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSrSptPTrans1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                    .addComponent(btn_transaksi2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58)
                    .addComponent(btn_transaksi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                    .addComponent(jLabel43)
                    .addGap(111, 111, 111))
                .addGroup(cardHomeLayout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    cardHomeLayout.setVerticalGroup(
        cardHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardHomeLayout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(jLabel1)
            .addGap(14, 14, 14)
            .addGroup(cardHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardHomeLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel43))
                .addGroup(cardHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSrSptPTrans1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_transaksi2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_transaksi3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(28, 28, 28)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
    );

    panelKanan.add(cardHome, "cardHome");

    cardLaporan.setBackground(new java.awt.Color(102, 102, 102));

    laporan1.setBackground(new java.awt.Color(33, 152, 92));
    laporan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconReport.png")));
    laporan1.setText("             Grafik Semua Penjualan");
    laporan1.setToolTipText("");
    laporan1.setAlignmentY(0.0F);
    laporan1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    laporan1.setHideActionText(true);
    laporan1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    laporan1.setIconTextGap(25);
    laporan1.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    laporan1.setkBorderRadius(0);
    laporan1.setkEndColor(new java.awt.Color(33, 152, 92));
    laporan1.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    laporan1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    laporan1.setkHoverStartColor(new java.awt.Color(204, 204, 0));
    laporan1.setkPressedColor(new java.awt.Color(204, 204, 204));
    laporan1.setkSelectedColor(new java.awt.Color(0, 175, 115));
    laporan1.setkStartColor(new java.awt.Color(33, 152, 92));
    laporan1.setMargin(new java.awt.Insets(0, 0, 0, 0));
    laporan1.setMaximumSize(new java.awt.Dimension(230, 50));
    laporan1.setMinimumSize(new java.awt.Dimension(230, 50));
    laporan1.setPreferredSize(new java.awt.Dimension(230, 50));
    laporan1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            laporan1ActionPerformed(evt);
        }
    });

    btnSideTrans14.setBackground(new java.awt.Color(33, 152, 92));
    btnSideTrans14.setText("Cetak Bulanan");
    btnSideTrans14.setToolTipText("");
    btnSideTrans14.setAlignmentY(0.0F);
    btnSideTrans14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnSideTrans14.setHideActionText(true);
    btnSideTrans14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnSideTrans14.setIconTextGap(25);
    btnSideTrans14.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    btnSideTrans14.setkBorderRadius(0);
    btnSideTrans14.setkEndColor(new java.awt.Color(33, 152, 92));
    btnSideTrans14.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    btnSideTrans14.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    btnSideTrans14.setkHoverStartColor(new java.awt.Color(0, 175, 115));
    btnSideTrans14.setkPressedColor(new java.awt.Color(204, 204, 204));
    btnSideTrans14.setkSelectedColor(new java.awt.Color(0, 175, 115));
    btnSideTrans14.setkStartColor(new java.awt.Color(33, 152, 92));
    btnSideTrans14.setMargin(new java.awt.Insets(0, 0, 0, 0));
    btnSideTrans14.setMaximumSize(new java.awt.Dimension(230, 50));
    btnSideTrans14.setMinimumSize(new java.awt.Dimension(230, 50));
    btnSideTrans14.setPreferredSize(new java.awt.Dimension(230, 50));
    btnSideTrans14.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSideTrans14ActionPerformed(evt);
        }
    });

    btnSideTrans12.setBackground(new java.awt.Color(33, 152, 92));
    btnSideTrans12.setText("Cetak Harian");
    btnSideTrans12.setToolTipText("");
    btnSideTrans12.setAlignmentY(0.0F);
    btnSideTrans12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnSideTrans12.setHideActionText(true);
    btnSideTrans12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnSideTrans12.setIconTextGap(25);
    btnSideTrans12.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    btnSideTrans12.setkBorderRadius(0);
    btnSideTrans12.setkEndColor(new java.awt.Color(33, 152, 92));
    btnSideTrans12.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    btnSideTrans12.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    btnSideTrans12.setkHoverStartColor(new java.awt.Color(0, 175, 115));
    btnSideTrans12.setkPressedColor(new java.awt.Color(204, 204, 204));
    btnSideTrans12.setkSelectedColor(new java.awt.Color(0, 175, 115));
    btnSideTrans12.setkStartColor(new java.awt.Color(33, 152, 92));
    btnSideTrans12.setMargin(new java.awt.Insets(0, 0, 0, 0));
    btnSideTrans12.setMaximumSize(new java.awt.Dimension(230, 50));
    btnSideTrans12.setMinimumSize(new java.awt.Dimension(230, 50));
    btnSideTrans12.setPreferredSize(new java.awt.Dimension(230, 50));
    btnSideTrans12.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSideTrans12ActionPerformed(evt);
        }
    });

    jTable3.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPane4.setViewportView(jTable3);

    jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel49.setForeground(new java.awt.Color(255, 255, 255));
    jLabel49.setText("Cetak Laporan");

    jDateChooser1.setDateFormatString("d MMM, yyyy");
    jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

    jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel53.setForeground(new java.awt.Color(255, 255, 255));
    jLabel53.setText("Data Penjualan Perbulan");

    btnSideTrans13.setBackground(new java.awt.Color(33, 152, 92));
    btnSideTrans13.setText("Tampilkan Data");
    btnSideTrans13.setToolTipText("");
    btnSideTrans13.setAlignmentY(0.0F);
    btnSideTrans13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnSideTrans13.setHideActionText(true);
    btnSideTrans13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnSideTrans13.setIconTextGap(25);
    btnSideTrans13.setkBackGroundColor(new java.awt.Color(33, 152, 92));
    btnSideTrans13.setkBorderRadius(0);
    btnSideTrans13.setkEndColor(new java.awt.Color(33, 152, 92));
    btnSideTrans13.setkHoverEndColor(new java.awt.Color(33, 152, 92));
    btnSideTrans13.setkHoverForeGround(new java.awt.Color(255, 255, 255));
    btnSideTrans13.setkHoverStartColor(new java.awt.Color(0, 175, 115));
    btnSideTrans13.setkPressedColor(new java.awt.Color(204, 204, 204));
    btnSideTrans13.setkSelectedColor(new java.awt.Color(0, 175, 115));
    btnSideTrans13.setkStartColor(new java.awt.Color(33, 152, 92));
    btnSideTrans13.setMargin(new java.awt.Insets(0, 0, 0, 0));
    btnSideTrans13.setMaximumSize(new java.awt.Dimension(230, 50));
    btnSideTrans13.setMinimumSize(new java.awt.Dimension(230, 50));
    btnSideTrans13.setPreferredSize(new java.awt.Dimension(230, 50));
    btnSideTrans13.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSideTrans13ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout cardLaporanLayout = new javax.swing.GroupLayout(cardLaporan);
    cardLaporan.setLayout(cardLaporanLayout);
    cardLaporanLayout.setHorizontalGroup(
        cardLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(cardLaporanLayout.createSequentialGroup()
            .addGap(47, 47, 47)
            .addGroup(cardLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laporan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardLaporanLayout.createSequentialGroup()
                        .addComponent(btnSideTrans12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSideTrans14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(cardLaporanLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel49))
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
            .addGroup(cardLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(cardLaporanLayout.createSequentialGroup()
                    .addComponent(btnSideTrans13, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(146, 146, 146)
                    .addComponent(jLabel53)))
            .addGap(33, 33, 33))
    );
    cardLaporanLayout.setVerticalGroup(
        cardLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardLaporanLayout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(cardLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardLaporanLayout.createSequentialGroup()
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79)
                    .addComponent(laporan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(77, 77, 77)
                    .addComponent(jLabel49)
                    .addGap(18, 18, 18)
                    .addGroup(cardLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSideTrans12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSideTrans14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(cardLaporanLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(cardLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel53)
                        .addComponent(btnSideTrans13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(176, Short.MAX_VALUE))
    );

    panelKanan.add(cardLaporan, "cardLaporan");

    cardkeluar.setBackground(new java.awt.Color(102, 102, 102));

    jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel34.setForeground(new java.awt.Color(240, 240, 240));
    jLabel34.setText("Kode");

    jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel35.setForeground(new java.awt.Color(240, 240, 240));
    jLabel35.setText("Nama");

    jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel36.setForeground(new java.awt.Color(240, 240, 240));
    jLabel36.setText("Banyak");

    kd_keluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    kd_keluar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            kd_keluarActionPerformed(evt);
        }
    });

    jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

    jTextField19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            jTextField19KeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField19KeyReleased(evt);
        }
    });

    jButton20.setText("cek");
    jButton20.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton20ActionPerformed(evt);
        }
    });

    tblKeluar.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    tblKeluar.setIntercellSpacing(new java.awt.Dimension(2, 2));
    tblKeluar.setRowHeight(25);
    jScrollPane3.setViewportView(tblKeluar);

    jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel44.setForeground(new java.awt.Color(240, 240, 240));
    jLabel44.setText("Tipe");

    jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel45.setForeground(new java.awt.Color(240, 240, 240));
    jLabel45.setText("Satuan");

    jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel46.setForeground(new java.awt.Color(240, 240, 240));
    jLabel46.setText("-");

    jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel47.setForeground(new java.awt.Color(240, 240, 240));
    jLabel47.setText("-");

    jButton21.setText("Input");
    jButton21.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton21ActionPerformed(evt);
        }
    });

    jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel48.setForeground(new java.awt.Color(240, 240, 240));
    jLabel48.setText("Barang Keluar");

    jButton22.setText("Batal");
    jButton22.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton22ActionPerformed(evt);
        }
    });

    jButton23.setText("Hari Ini");
    jButton23.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton23ActionPerformed(evt);
        }
    });

    jButton24.setText("Kemaren");
    jButton24.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton24ActionPerformed(evt);
        }
    });

    tanggal.setDateFormatString("dd - MMMM - yyyy");
    tanggal.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tanggalMouseClicked(evt);
        }
    });
    tanggal.addInputMethodListener(new java.awt.event.InputMethodListener() {
        public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            tanggalInputMethodTextChanged(evt);
        }
        public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
        }
    });

    javax.swing.GroupLayout cardkeluarLayout = new javax.swing.GroupLayout(cardkeluar);
    cardkeluar.setLayout(cardkeluarLayout);
    cardkeluarLayout.setHorizontalGroup(
        cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane3)
        .addGroup(cardkeluarLayout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardkeluarLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jButton21)
                    .addGap(18, 18, 18)
                    .addComponent(jButton22))
                .addGroup(cardkeluarLayout.createSequentialGroup()
                    .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(jLabel44)
                        .addComponent(jLabel45)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cardkeluarLayout.createSequentialGroup()
                            .addComponent(kd_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(cardkeluarLayout.createSequentialGroup()
            .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardkeluarLayout.createSequentialGroup()
                    .addGap(247, 247, 247)
                    .addComponent(jButton23)
                    .addGap(18, 18, 18)
                    .addComponent(jButton24)
                    .addGap(30, 30, 30)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cardkeluarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel48))
                .addGroup(cardkeluarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, Short.MAX_VALUE))
    );
    cardkeluarLayout.setVerticalGroup(
        cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(cardkeluarLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jLabel48)
            .addGap(18, 18, 18)
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(9, 9, 9)
            .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardkeluarLayout.createSequentialGroup()
                    .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(jButton20)
                        .addComponent(kd_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel44)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(jLabel47))
                    .addGap(13, 13, 13)
                    .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton21)
                        .addComponent(jButton22)))
                .addGroup(cardkeluarLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jLabel46)))
            .addGap(22, 22, 22)
            .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardkeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton24))
                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
    );

    panelKanan.add(cardkeluar, "cardkeluar");

    jSplitPane1.setRightComponent(panelKanan);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jSplitPane1)
            .addGap(0, 0, 0))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jSplitPane1)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        controller.searchOnBarang(jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            controller.cekBarangkotak(kodebarangbesar.getText());
            jButton7.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void kodebarangbesarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodebarangbesarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
                controller.cekBarangkotak(kodebarangbesar.getText());
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_kodebarangbesarKeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        controller.dataketable();
        controller.inupdate();
        kosong();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        validasi();
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        validasi();
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        validasi();

    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        validasi();

    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        validasi();
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       try {
            controller.cekBarangkecil(jTextField13.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        controller.inupdate();
        kosong2();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        validasi2();
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jTextField18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyReleased
         validasi2();
    }//GEN-LAST:event_jTextField18KeyReleased

    private void jTextField17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyReleased
        validasi2();
    }//GEN-LAST:event_jTextField17KeyReleased

    private void jTextField16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyReleased
        validasi2();
    }//GEN-LAST:event_jTextField16KeyReleased

    private void jTextField15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyReleased
        validasi2();
    }//GEN-LAST:event_jTextField15KeyReleased

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try {
            controller.cekbukakotak(jTextField20.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyReleased
        try {
            String validasi =   "^[a-zA-Z ]+$";
            if(jTextField22.getText().equals("") || String.valueOf(jTextField22.getText()).matches(validasi)){
                jLabel33.setText("-");
                jButton11.setEnabled(false);
            }
            else{
            jLabel33.setText(""+controller.isibuka(Integer.parseInt(jTextField22.getText())));
            
            jButton11.setEnabled(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField22KeyReleased

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String validasi =  "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
        if (String.valueOf(jTextField22.getText()).matches(validasi)){
            int b = Integer.parseInt(jLabel42.getText());
            int a = Integer.parseInt(jTextField22.getText());
            if(a<=b){
            controller.updateidpecahan();
            controller.datapecah();
            controller.kurangstokk();
            jTextField20.setText("");
            opnunbox();
            }else{
                JOptionPane.showMessageDialog(null, "Banyak yang dibuka Melebihi Stok");
            }
        }else{
              jLabel33.setText("-");
                jButton11.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        kosong2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        kosong();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        try {
            kd_keluar.setEditable(false);
            controller.cekbarangjual(kd_keluar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       kosong3();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       controller.slctTblKeluar();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        controller.slctTblKeluarkemarin();
        jButton24.setSelected(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void tanggalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tanggalMouseClicked

    }//GEN-LAST:event_tanggalMouseClicked

    private void tanggalInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tanggalInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalInputMethodTextChanged

    private void btbhdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbhdataActionPerformed
          cardLayout.show(panelKanan, "cardTambahData");
          bhome.setSelected(false);
          btbhdata.setSelected(true);
          bunboxing.setSelected(false);
          bukeluar.setSelected(false);   
          laporan.setSelected(false);          

    }//GEN-LAST:event_btbhdataActionPerformed

    private void bhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhomeActionPerformed
              cardLayout.show(panelKanan, "cardHome");
              bhome.setSelected(true);
              btbhdata.setSelected(false);
              bunboxing.setSelected(false);
              bukeluar.setSelected(false);
              laporan.setSelected(false);
    }//GEN-LAST:event_bhomeActionPerformed

    private void bunboxingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bunboxingActionPerformed
         cardLayout.show(panelKanan, "cardUnboxing");
          bhome.setSelected(false);
          btbhdata.setSelected(false);
          bunboxing.setSelected(true);
          bukeluar.setSelected(false);
          laporan.setSelected(false);
    }//GEN-LAST:event_bunboxingActionPerformed

    private void bukeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukeluarActionPerformed
         cardLayout.show(panelKanan, "cardkeluar");   
          bhome.setSelected(false);
          btbhdata.setSelected(false);
          bunboxing.setSelected(false);
          bukeluar.setSelected(true);
          laporan.setSelected(false);
          
    }//GEN-LAST:event_bukeluarActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
        cardLayout.show(panelKanan, "cardLaporan");
        bhome.setSelected(false);
        btbhdata.setSelected(false);
        bunboxing.setSelected(false);
        bukeluar.setSelected(false);
        laporan.setSelected(true);
    }//GEN-LAST:event_laporanActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bexitActionPerformed

    private void btnSrSptPTrans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrSptPTrans1ActionPerformed
        controller.searchOnBarang(jTextField1.getText());
    }//GEN-LAST:event_btnSrSptPTrans1ActionPerformed

    private void btn_transaksi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksi2ActionPerformed
        if(jTable1.getSelectedRow()>0){
        int baris = jTable1.getSelectedRow(); 
        UpdateTable ut = new UpdateTable(this, rootPaneCheckingEnabled, jTable1.getValueAt(baris, 0).toString());
         
         
        ut.getKodebarangbesar().setText(jTable1.getValueAt(baris, 0).toString());
        ut.getjTextField3().setText(jTable1.getValueAt(baris, 1).toString());
        ut.getjComboBox1().setSelectedItem(jTable1.getValueAt(baris, 2).toString());
        ut.getjComboBox2().setSelectedItem(jTable1.getValueAt(baris, 3).toString());
        ut.getjTextField4().setText(jTable1.getValueAt(baris, 4).toString());
        ut.getjTextField5().setText(jTable1.getValueAt(baris, 5).toString());
        ut.getjTextField6().setText(jTable1.getValueAt(baris, 6).toString());
        ut.getjTextField7().setText(jTable1.getValueAt(baris, 7).toString());
        ut.show();
        }else{
            JOptionPane.showMessageDialog(null, "Pilih Data Di Table !!");
        }
    }//GEN-LAST:event_btn_transaksi2ActionPerformed

    private void btn_transaksi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksi3ActionPerformed
        if(jTable1.getSelectedRow()>0){
        int baris = jTable1.getSelectedRow(); 
         jLabel43.setText(jTable1.getValueAt(baris, 0).toString());
                    String[] options = {"Ya", "Tidak"}; 
            int result = JOptionPane.showOptionDialog(
               null,
               "Yakin Menghapus Data "+jTable1.getValueAt(baris, 1).toString()+"?", 
               "Hapus Data",            
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,     //no custom icon
               options,  //button titles
               options[0] //default button
            );
            if(result == JOptionPane.YES_OPTION){
                controller.delete();
            }else if (result == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, jTable1.getValueAt(baris, 1).toString()+" Batal Di Hapus");
            }else {
               
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih Data Di Table !!");

        }
    }//GEN-LAST:event_btn_transaksi3ActionPerformed

    private void kd_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kd_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kd_keluarActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        controller.insertkeluar();
        controller.slctTblKeluar();
        kosong3();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19KeyPressed

    private void jTextField19KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyReleased
        validasi3();
    }//GEN-LAST:event_jTextField19KeyReleased

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        
    }//GEN-LAST:event_jTable2KeyPressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int baris = jTable2.getSelectedRow(); 
        jLabel50.setText(jTable2.getValueAt(baris, 0).toString());
        jLabel51.setText(jTable2.getValueAt(baris, 1).toString());
        jLabel52.setText(jTable2.getValueAt(baris, 7).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        controller.hapusbaru();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void labelhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelhomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelhomeMouseClicked

    private void labelhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelhomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelhomeMouseEntered

    private void labelhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelhomeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelhomeMouseExited

    private void laporan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporan1ActionPerformed
         con = (new Koneksi().getConnection());
        try {
            String qq = "SELECT date(tgl_jual)as tgl ,sum(stok_terjual) as banyak FROM penjualan group by tgl";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(con, qq);
            JFreeChart chart = ChartFactory.createLineChart("Grafik Laporan", "tgl","stok", dataset, PlotOrientation.VERTICAL,false,true,true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Grafik Laporan", chart);
            frame.setVisible(true);
            frame.setSize(1000,600);
            frame.setLocationRelativeTo(this);
            frame.setAlwaysOnTop(true);
           
        } catch (Exception e) {
        }
    }//GEN-LAST:event_laporan1ActionPerformed

    private void btnSideTrans14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSideTrans14ActionPerformed
//        printLaporanBulanan();
    }//GEN-LAST:event_btnSideTrans14ActionPerformed

    private void btnSideTrans12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSideTrans12ActionPerformed
//        printLaporanHarian();
    }//GEN-LAST:event_btnSideTrans12ActionPerformed

    private void btnSideTrans13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSideTrans13ActionPerformed
        
    }//GEN-LAST:event_btnSideTrans13ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton bexit;
    private keeptoo.KButton bhome;
    private keeptoo.KButton btbhdata;
    private keeptoo.KButton btnSideTrans12;
    private keeptoo.KButton btnSideTrans13;
    private keeptoo.KButton btnSideTrans14;
    private keeptoo.KButton btnSrSptPTrans1;
    private keeptoo.KButton btn_transaksi2;
    private keeptoo.KButton btn_transaksi3;
    private keeptoo.KButton btnhapus;
    private keeptoo.KButton bukeluar;
    private keeptoo.KButton bunboxing;
    private javax.swing.JPanel cardHome;
    private javax.swing.JPanel cardLaporan;
    private javax.swing.JPanel cardTambahData;
    private javax.swing.JPanel cardUnboxing;
    private javax.swing.JPanel cardkeluar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField kd_keluar;
    private javax.swing.JTextField kodebarangbesar;
    private javax.swing.JLabel labelhome;
    private keeptoo.KButton laporan;
    private keeptoo.KButton laporan1;
    private javax.swing.JPanel panekKiri;
    private javax.swing.JPanel panelKanan;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTable tblKeluar;
    // End of variables declaration//GEN-END:variables

    
    public void opnunbox(){
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jLabel31.setText("-");
        jLabel33.setText("-");
        jLabel42.setText("-");
        jLabel40.setText("-");
        enableunbox(false);
    }
    public void enableunbox(boolean inup){
        jTextField8.setEditable(inup);
        jTextField9.setEditable(inup);
        jTextField10.setEditable(inup);
        jTextField11.setEditable(inup);
        jTextField21.setEditable(inup);
        jTextField22.setEditable(inup);
        jButton11.setEnabled(inup);
        jComboBox6.setEnabled(inup);
        
    }
    public void opnTmbhBarang(){
        kodebarangbesar.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedItem("");
        jComboBox2.setSelectedItem("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        
        jTextField13.setText("");
        jComboBox3.setSelectedItem("");
        jComboBox4.setSelectedItem("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        
        enableComponen(false);
        enableComponendatakecil(false);
        jButton7.setEnabled(false);
        
    }
    
    public void enableComponen(boolean inup){
        jTextField3.setEditable(inup);
        jComboBox1.setEnabled(inup);
        jComboBox2.setEnabled(inup);
        jTextField4.setEditable(inup);
        jTextField5.setEditable(inup);
        jTextField6.setEditable(inup);
        jTextField7.setEditable(inup);
        jButton8.setEnabled(inup);
        jButton9.setEnabled(inup);
    }
     public void enableComponendatakecil(boolean inup){
        jComboBox3.setEnabled(inup);
        jComboBox4.setEnabled(inup);
        jTextField18.setEditable(inup);
        jTextField17.setEditable(inup);
        jTextField16.setEditable(inup);
        jTextField15.setEditable(inup);
        jButton15.setEnabled(inup);
    }
    
    private void staring(){
        opnTmbhBarang();
        opnunbox();
    }
    
    public void validasi(){
        String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
         if (String.valueOf(jTextField6.getText()).matches(regex) && String.valueOf(jTextField4.getText()).matches(regex) &&
                 String.valueOf(jTextField5.getText()).matches(regex) && String.valueOf(jTextField7.getText()).matches(regex) && jTextField3.getText().length() != 0
                 && jTextField4.getText().length() != 0 && jTextField5.getText().length() != 0
                 && jTextField6.getText().length() != 0 && jTextField7.getText().length() != 0) {
            jButton7.setEnabled(true);
        }
        else{
            jButton7.setEnabled(false);


        }
    }
    public void validasi2(){
        String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
         if (String.valueOf(jTextField15.getText()).matches(regex) && String.valueOf(jTextField16.getText()).matches(regex) &&
                 String.valueOf(jTextField17.getText()).matches(regex) && jTextField13.getText().length() != 0
                 && jTextField18.getText().length() != 0 && jTextField15.getText().length() != 0
                 && jTextField16.getText().length() != 0 && jTextField17.getText().length() != 0) {
            jButton15.setEnabled(true);
        }
        else{
            jButton15.setEnabled(false);


        }
    }
    
    public void kosong(){
        kodebarangbesar.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }
    public void kosong2(){
        jTextField13.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        
         
        
    }
    public void kosong3(){
        kd_keluar.setText("");
        jTextField12.setText("");
        jTextField19.setText("");
        jLabel46.setText("-");
        jLabel47.setText("-");
    }
    public void validasi3(){
         String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
         if (String.valueOf(jTextField19.getText()).matches(regex) && !jTextField19.getText().equals("")) {
            jButton21.setEnabled(true);
        }else{
            jButton21.setEnabled(false);
        }
    }
    
//    public void namabarang(){
//        try {
//            con = (new Koneksi()).getConnection();
//            String sql = "select nama_barang from barang";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//           
//                while(rs.next()){
//                    jComboBox5.addItem(rs.getString("nama_barang"));
//                }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public void grafikperbarang(){
//        if(jComboBox5.getSelectedItem().equals("-")){
//            
//        }else{
//         try {                                            
//                   con = (new Koneksi().getConnection());
//                   String sql = "select id_barang from barang where nama_barang='"+jComboBox5.getSelectedItem().toString()+"' limit 1";
//                   PreparedStatement ps = con.prepareStatement(sql);
//                   ResultSet rs = ps.executeQuery();
//                   String kode = "";
//                   while(rs.next()){
//                       kode = rs.getString(1);
//                   
//                       String qq = "SELECT date(tgl_jual)as tgl ,sum(stok_terjual) as banyak FROM penjualan where id_barang='"+kode+"' group by tgl";
//                       JDBCCategoryDataset dataset = new JDBCCategoryDataset(con, qq);
//                       JFreeChart chart = ChartFactory.createLineChart("Grafik Laporan", "tgl","stok", dataset, PlotOrientation.VERTICAL,false,false,false);
//                       BarRenderer renderer = null;
//                       CategoryPlot plot = null;
//                       renderer = new BarRenderer();
//                       ChartFrame frame1 = new ChartFrame("Grafik Laporan", chart);
//                       frame1.setVisible(true);
//                       frame1.setSize(1000,600);
//                       frame1.setLocationRelativeTo(this);
//                       frame1.setAlwaysOnTop(true);
//                   }
//               } catch (SQLException ex) {
//                   Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
//               }       
//        }
    }
    
    
    
}
