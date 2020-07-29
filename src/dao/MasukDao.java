/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Masuk;
import resource.Koneksi;

/**
 *
 * @author bayug
 */
public class MasukDao {
    Connection con;
    public MasukDao(){
        con = (new Koneksi()).getConnection();
    }
    public void insert(Masuk masuk) throws SQLException{
        String sql = "Insert into rekap_masuk values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, masuk.getId_brg());
        ps.setString(2, masuk.getTgl_masuk());
        ps.setInt(3, masuk.getStok());
        ps.setString(4, masuk.getId_user());
        ps.executeUpdate();
    }
    
    public void edit(Masuk masuk)throws SQLException{
        String sql ="update rekap_masuk set stok_masuk=? where id_barang=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, masuk.getStok());
        ps.setString(2, masuk.getId_brg());
        ps.executeUpdate();
    }
    
    public void hapus(Masuk masuk) throws SQLException{
        String sql = "Delete from rekap_masuk where id_barang=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, masuk.getId_brg());
        ps.executeUpdate();
    }
}
