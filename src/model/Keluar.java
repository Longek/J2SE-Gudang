package model;

/**
 *
 * @author bayug
 */
public class Keluar {
//    nama tabel = penjualan
    private String id_brg;
    private String tgl_keluar;
    private int stok;
    private String id_user;

    public String getId_brg() {
        return id_brg;
    }

    public void setId_brg(String id_brg) {
        this.id_brg = id_brg;
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
    
    
}
