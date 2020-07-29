/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        String sql = "Insert into penjualan values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, keluar.getId_brg());
        ps.setString(2, keluar.getTgl_keluar());
        ps.setInt(3, keluar.getStok());
        ps.setString(4, keluar.getId_user());
        ps.executeUpdate();
    }
    public void delete(Keluar keluar) throws SQLException{
        String sql = "delete from penjualan where id_barang=? and tgl_jual=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, keluar.getId_brg());
        ps.setString(2, keluar.getTgl_keluar());
        ps.executeUpdate();
    }
}
