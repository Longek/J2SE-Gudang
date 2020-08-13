/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BarangDao;
import dao.KeluarDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Barang;
import model.Keluar;
import resource.Koneksi;
import view.FormBarang;
import view.UpdateTable;

/**
 *
 * @author bayug
 */
public class Controller {
    FormBarang view;
    UpdateTable view2;
    Barang barang;
    Keluar keluar;
    BarangDao barangDao;
    KeluarDao keluarDao;
    Koneksi k;
    int x =0;
    Connection con;
    
    public Controller(FormBarang view){
        this.view = view;
        barangDao = new BarangDao();
        keluarDao = new KeluarDao();
        k = new Koneksi();
        con = k.getConnection();
        view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
        view.getjTable3().setModel(keluarDao.tablepenjualan());
    }
    public Controller(UpdateTable view2){
        this.view2 = view2;
        barangDao = new BarangDao();
        k = new Koneksi();
        con = k.getConnection();
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
//    public void hapustable(){
//        DefaultTableModel dataModel = (DefaultTableModel) tabelData.getModel(); 
//            if (tabelData.getRowCount() > 0) {
//                for (int i = tabelData.getRowCount() - 1; i > -1; i--) {
//                    dataModel.removeRow(i);
//    }
    
    public void cekBarangkotak(String kode) throws SQLException{
        
            if (barangDao.isAvailable(kode)) {
                if(barangDao.cekisi(kode)>1){
            x = 1;
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
            barangDao.insertrekam(barang);
            barangDao.insert(barang);
             JOptionPane.showMessageDialog(null, "Entry OK"); 
              view.getjTable1().setModel(barangDao.selectAllDataToTableModel());             
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
                barangDao.insertrekam(barang);
                barangDao.tambahbarang(barang);
                JOptionPane.showMessageDialog(null, "Entry OK"); 
                 view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
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
              view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
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
                 view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
                x=0;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error "+ex);
                x=0;

            }
        }

    }
    
    public void cekbukakotak(String kode) throws SQLException{
        if(barangDao.isAvailable(kode) && barangDao.cekisi(kode)>1){
            cekpecahan(kode);
             barang = barangDao.getbarang(kode);
            view.getjTextField21().setText(barang.getNama());
            view.getjLabel31().setText(""+barang.getIsi());
            view.getjLabel40().setText(barang.getTipe());
            view.getjLabel42().setText(""+barang.getStok());
        }else{
            
        }
    }
    public void cekpecahan(String kode) throws SQLException{
        JOptionPane.showMessageDialog(view, barangDao.isAvailablepecah(kode));
        String code = barangDao.isAvailablepecah(kode);
        if(code == null){
            x=7;
            view.enableunbox(true);
            JOptionPane.showMessageDialog(view, "Data Pecahan Belom Ada \n Silahkan Di Lengkapi");
        }else{
           
             x=6;
             view.opnunbox();
             view.getjTextField22().setEditable(true);
            barang = barangDao.getbarang(barangDao.isAvailablepecah(kode));
            view.getjTextField8().setText(barangDao.isAvailablepecah(kode));
            view.getjTextField9().setText(barang.getNama());
            view.getjTextField10().setText(""+barang.getHrg_modal());
            view.getjTextField11().setText(""+barang.getHrg_jual());
        }
        
    }
    public int isibuka(int banyak) throws SQLException{
        int isibanyak =0;
        isibanyak = banyak * (barangDao.cekisi(view.getjTextField20().getText()));
        return isibanyak;
    }
    public void datapecah() {
        barang = new Barang();
        if(x==6){
            barang.setId(view.getjTextField8().getText());
            barang.setStok(Integer.parseInt(view.getjLabel33().getText()));
            try {
                barangDao.tambahbarang(barang);
                 view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
                x=0;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                x=0;

            }
        }
        else if(x==7){
            barang.setId(view.getjTextField8().getText());
            barang.setNama(view.getjTextField9().getText());
            barang.setTipe(view.getjLabel40().getText());
            barang.setSatuan(view.getjComboBox6().getSelectedItem().toString());
            barang.setHrg_modal(Double.parseDouble(view.getjTextField10().getText()));
            barang.setHrg_jual(Double.parseDouble(view.getjTextField11().getText()));
            barang.setStok(Integer.parseInt(view.getjLabel33().getText()));
            barang.setIsi(Integer.parseInt(view.getjLabel18().getText()));
            barang.setId_pecah(null);
            try {
                barangDao.inputpecah(barang);
                updateidpecahan();
                 view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
                x=0;

            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                x=0;           
            }
        }
    }
    public void updateidpecahan(){
        barang = new Barang();
        barang.setId_pecah(view.getjTextField8().getText());
        barang.setId(view.getjTextField20().getText());
        try {
            barangDao.updateidpecah(barang);
             view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
             
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        barang = new Barang();
        barang.setNama(view2.getjTextField3().getText());
        barang.setTipe(view2.getjComboBox1().getSelectedItem().toString());
        barang.setSatuan(view2.getjComboBox2().getSelectedItem().toString());
        barang.setHrg_modal(Double.parseDouble(view2.getjTextField4().getText()));
        barang.setHrg_jual(Double.parseDouble(view2.getjTextField5().getText()));
        barang.setStok(Integer.parseInt(view2.getjTextField6().getText()));
        barang.setIsi(Integer.parseInt(view2.getjTextField7().getText()));
        barang.setId(view2.getKodebarangbesar().getText());
        barang.setKodelama(view2.kodelama);
        try {
            barangDao.update(barang);
             
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updatetable(){
        view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
    }
    public void delete(){
        barang = new Barang();
        barang.setId(view.getjLabel43().getText());
        try {
            barangDao.delete(barang);
            JOptionPane.showMessageDialog(view, "Berhasil Terhapus");
            view.getjTable1().setModel(barangDao.selectAllDataToTableModel());
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void kurangstokk(){
        barang = new Barang();
        barang.setId(view.getjTextField20().getText());
        barang.setStok(Integer.parseInt(view.getjTextField22().getText()));
        try {
            barangDao.kurangstok(barang);
            view.getjTable1().setModel(barangDao.selectAllDataToTableModel());

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertkeluar(){
        keluar = new Keluar();
        keluar.setId_brg(view.getKd_keluar().getText());
        keluar.setStok(Integer.parseInt(view.getjTextField19().getText()));
        keluar.setId_user("hanif");
        try {
            keluarDao = new KeluarDao();
            keluarDao.insert(keluar);
            JOptionPane.showMessageDialog(view, "Entry Oke");
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(view, ex);
        }
    }
    public void cekbarangjual(String kode) throws SQLException{
         if(barangDao.isAvailable(kode)){
        barang = barangDao.getbarang(kode);
            view.getjTextField12().setText(barang.getNama());
            view.getjLabel46().setText(barang.getTipe());
            view.getjLabel47().setText(barang.getSatuan());
         }else{
             JOptionPane.showMessageDialog(view, "Data Barang Tidak Ada");
         }
    }
    public void jam_digital() {
        int waktumulai =0;
        new Thread(){
            @Override
            public void run(){
              while(waktumulai == 0){
                Calendar kalender = new GregorianCalendar();
                    int jam = kalender.get(Calendar.HOUR);
                    int menit = kalender.get(Calendar.MINUTE);
                    int detik = kalender.get(Calendar.SECOND);
                    int AM_PM = kalender.get(Calendar.AM_PM);
                    String siang_malam ="";
             if(AM_PM == 1){
                    siang_malam="PM"; 
             }else{
                    siang_malam = "AM";   
                  }
             String time = jam + ":" + menit + ":" + detik + " " + siang_malam;
             view.getjLabel38().setText(time);               
              }  
            }
        }.start();
    }
}
