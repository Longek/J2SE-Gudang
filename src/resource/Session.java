/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

/**
 *
 * @author bayug
 */
public class Session {
    private static String id_user;
    private static String nama_user;
    public static void setuserLogin(String id_user,String nama_user){
        Session.id_user = id_user;
        Session.nama_user = nama_user;
    }
    public String getIdUSer(){
        return id_user;
    }
    
    public String namauser(){
        return nama_user;
    }
    
}
