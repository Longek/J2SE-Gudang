package model;

/**
 *
 * @author bayug
 */
public class Barang {
//    nama tabel = barang
    private String id;
    private String nama;
    private String tipe;
    private String satuan;
    private double hrg_modal;
    private double hrg_jual;
    private int stok;
    private int isi;
    private String id_pecah;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public double getHrg_modal() {
        return hrg_modal;
    }

    public void setHrg_modal(double hrg_modal) {
        this.hrg_modal = hrg_modal;
    }

    public double getHrg_jual() {
        return hrg_jual;
    }

    public void setHrg_jual(double hrg_jual) {
        this.hrg_jual = hrg_jual;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getIsi() {
        return isi;
    }

    public void setIsi(int isi) {
        this.isi = isi;
    }

    public String getId_pecah() {
        return id_pecah;
    }

    public void setId_pecah(String id_pecah) {
        this.id_pecah = id_pecah;
    }
    
}
