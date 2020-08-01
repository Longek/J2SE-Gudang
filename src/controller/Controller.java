/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BarangDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    public void dataketable(){
         DefaultTableModel dataModel = (DefaultTableModel) view.getjTable2().getModel();
            List list = new ArrayList<>();
            view.getjTable2().setAutoCreateColumnsFromModel(true);
            String trans ="";
            if(x==1){
                list.add("Tambah Data");
            }
            else if(x==2){
               list.add("Tambah Data");
            }
            list.add(view.getKodebarangbesar().getText());
            list.add(view.getjTextField3().getText());
            list.add(view.getjComboBox1().getSelectedItem().toString());
            list.add(view.getjComboBox2().getSelectedItem().toString());
            list.add(view.getjTextField4().getText());
            list.add(view.getjTextField5().getText());
            list.add(view.getjTextField6().getText());
            list.add(view.getjTextField7().getText());
            dataModel.addRow(list.toArray());
    }
    public void hapustable(){
        DefaultTableModel dataModel = (DefaultTableModel) tabelData.getModel(); 
            if (dataModel.getRowCount() > 0) {
                for (int i = tabelData.getRowCount() - 1; i > -1; i--) {
                    dataModel.removeRow(i);
    }
    
    public void cekBarangkotak(String kode) throws SQLException{
        
            if (barangDao.isAvailable(kode)) {
                if(barangDao.cekisi(kode)>1){
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
                }
                else{
                    JOptionPane.showMessageDialog(view, "Ini Data Barang Kecil");
                }
        } else {
            x = 2;
            JOptionPane.showMessageDialog(view, x);
            JOptionPane.showMessageDialog(view, "Data belum ada di database.\nSilahkan lengkapi data");
            view.enableComponen(true);
            view.getjButton7().setEnabled(true);
            view.getjTextField3().requestFocus();
        }
    }
     public void cekBarangkecil(String kode) throws SQLException{
        
            if (barangDao.isAvailable(kode)) {
                if(barangDao.cekisi(kode)<=1){
            x = 3;
            JOptionPane.showMessageDialog(view, x);
            barang = barangDao.getbarang(kode);
            view.getjTextField18().setText(barang.getNama());
            view.getjComboBox4().setSelectedItem(barang.getTipe());
            view.getjComboBox3().setSelectedItem(barang.getSatuan());
            view.getjTextField17().setText(""+barang.getHrg_modal());
            view.getjTextField16().setText(""+barang.getHrg_jual());
            
            view.enableComponendatakecil(false);
            view.getjButton15().setEnabled(true);
            view.getjTextField15().setEditable(true);
            view.getjTextField15().requestFocus();
                }
                else{
                    JOptionPane.showMessageDialog(view, "Ini Data Barang Besar");
                }
        } else {
            x = 4;
            JOptionPane.showMessageDialog(view, x);
            JOptionPane.showMessageDialog(view, "Data belum ada di database.\nSilahkan lengkapi data");
            view.enableComponendatakecil(true);
            view.getjButton15().setEnabled(true);
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
        barang.setId_pecah(null);
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
        else if(x==4){
        barang.setId(view.getjTextField13().getText());
        barang.setNama(view.getjTextField18().getText());
        barang.setTipe(view.getjComboBox4().getSelectedItem().toString());
        barang.setSatuan(view.getjComboBox3().getSelectedItem().toString());
        barang.setHrg_modal(Double.parseDouble(view.getjTextField17().getText()));
        barang.setHrg_jual(Double.parseDouble(view.getjTextField16().getText()));
        barang.setStok(Integer.parseInt(view.getjTextField15().getText()));
        barang.setIsi(Integer.parseInt("1"));
        barang.setId_pecah(null);
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
        else if(x==3){
            barang.setId(view.getjTextField13().getText());
            barang.setStok(Integer.parseInt(view.getjTextField15().getText()));
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
