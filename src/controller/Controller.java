/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BarangDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Barang;
import resource.Koneksi;
import view.FormBarang;

/**
 *
 * @author bayug
 */
public class Controller {
    FormBarang view;
    Barang barang;
    BarangDao barangDao;
    Koneksi k;
    int x =0;
    Connection con;
    
    public Controller(FormBarang view){
        this.view = view;
        barangDao = new BarangDao();
        k = new Koneksi();
        con = k.getConnection();
        view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
    }
    
    public void searchOnBarang(String word) {
        view.getjTable1().setModel(barangDao.searchByAllToTable(word));
    }
    
    public void cekBarang(String kode) throws SQLException{
        
            if (barangDao.isAvailable(kode)) {
            x = 1;
            JOptionPane.showMessageDialog(view, x);
            barang = barangDao.getbarang(kode);
            view.getjTextField3().setText(barang.getNama());
            view.getjComboBox1().setSelectedItem(barang.getTipe());
            view.getjComboBox2().setSelectedItem(barang.getSatuan());
            view.getjTextField4().setText(""+barang.getHrg_modal());
            view.getjTextField5().setText(""+barang.getHrg_jual());
            view.getjTextField7().setText(""+barang.getIsi());
            
            view.enableComponen(false);
            view.getjButton7().setEnabled(true);
            view.getjTextField6().setEditable(true);
            view.getjTextField6().requestFocus();
        } else {
            x = 2;
            JOptionPane.showMessageDialog(view, x);
            JOptionPane.showMessageDialog(view, "Data belum ada di database.\nSilahkan lengkapi data");
            view.enableComponen(true);
            view.getjButton7().setEnabled(true);
            view.getjTextField3().requestFocus();
        }
    }
    
    public void inupdate(){
        barang = new Barang();
        if(x==2){
        barang.setId(view.getKodebarangbesar().getText());
        barang.setNama(view.getjTextField3().getText());
        barang.setTipe(view.getjComboBox1().getSelectedItem().toString());
        barang.setSatuan(view.getjComboBox2().getSelectedItem().toString());
        barang.setHrg_modal(Double.parseDouble(view.getjTextField4().getText()));
        barang.setHrg_jual(Double.parseDouble(view.getjTextField5().getText()));
        barang.setStok(Integer.parseInt(view.getjTextField6().getText()));
        barang.setIsi(Integer.parseInt(view.getjTextField7().getText()));
        barang.setId_pecah("NULL");
        try {
            barangDao.insert(barang);
             JOptionPane.showMessageDialog(null, "Entry OK"); 
             x = 0;
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Error "+ex); 
             x=0;
        }
        }
        else if(x==1){
            barang.setId(view.getKodebarangbesar().getText());
            barang.setStok(Integer.parseInt(view.getjTextField6().getText()));
            try {
                barangDao.tambahbarang(barang);
                JOptionPane.showMessageDialog(null, "Entry OK"); 
                x=0;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error "+ex);
                x=0;

            }
        }

    }
}
