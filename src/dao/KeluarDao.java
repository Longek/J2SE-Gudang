/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Keluar;
import resource.Koneksi;

/**
 *
 * @author bayug
 */
public class KeluarDao {
    Connection con;
    public KeluarDao() {
        con = (new Koneksi()).getConnection();
    }
    
    public void insert(Keluar keluar ) throws SQLException{
        String sql = "insert into penjualan values(?,now(),?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, keluar.getId_brg());
        ps.setInt(2, keluar.getStok());
        ps.setString(3, keluar.getId_user());   
        ps.executeUpdate();
    }
    public void delete(Keluar keluar) throws SQLException{
        String sql = "delete from penjualan where id_barang=? and tgl_jual=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, keluar.getId_brg());
        ps.setString(2, keluar.getTgl_keluar());
        ps.executeUpdate();
    }
     public DefaultTableModel tablepenjualan() {
        DefaultTableModel tableModel = new DefaultTableModel(); tableModel.setRowCount(0); tableModel.setColumnCount(0);
        tableModel.addColumn("Tanggal/Time");tableModel.addColumn("ID"); tableModel.addColumn("Nama Barang"); tableModel.addColumn("Tipe"); 
        tableModel.addColumn("Stok"); tableModel.addColumn("User");
        try {
            ResultSet rs = con.createStatement().executeQuery("select penjualan.tgl_jual,penjualan.id_barang, barang.nama_barang,barang.tipe_barang,penjualan.stok_terjual,user.nama_user "
                    + " from penjualan,barang,user where penjualan.id_barang = barang.id_barang"
                    + " and user.id_user = penjualan.id_user and date(tgl_jual) = date(now())");
            while (rs.next()) {
                Object[] isi = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                    rs.getString(5), rs.getString(6)};
                tableModel.addRow(isi);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tableModel;
    }
      public DefaultTableModel tablepenjualankemarin() {
        DefaultTableModel tableModel = new DefaultTableModel(); tableModel.setRowCount(0); tableModel.setColumnCount(0);
        tableModel.addColumn("Tanggal/Time");tableModel.addColumn("ID"); tableModel.addColumn("Nama Barang"); tableModel.addColumn("Tipe"); 
        tableModel.addColumn("Stok"); tableModel.addColumn("User");
        try {
            ResultSet rs = con.createStatement().executeQuery("select penjualan.tgl_jual,penjualan.id_barang, barang.nama_barang,barang.tipe_barang,penjualan.stok_terjual,user.nama_user "
                    + " from penjualan,barang,user where penjualan.id_barang = barang.id_barang"
                    + " and user.id_user = penjualan.id_user and date(tgl_jual) = date(now()) - interval 1 day");
            while (rs.next()) {
                Object[] isi = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                    rs.getString(5), rs.getString(6)};
                tableModel.addRow(isi);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return tableModel;
    }
      

}
