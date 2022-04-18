/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1; //kemasan latihan

/**
 *
 * @author friska amelia vega
 * senin 18 04 2022
 * 12:09
 * menghubungkan java ke mysql
 */
import java.sql.*;
public class Koneksi {
    static final String driver ="com.mysql.jdbc.Driver";
    static final String db ="jdbc:mysql://localhost/friska";
    static final String user ="root";
    static final String password ="";
    
    static Connection conn;
    public static void konek (){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(db,user,password);
                System.out.println("koneksi berhasil");                
            }catch (Exception e){
        System.out.println("gagal koneksi");
    }
}
    public static void main(String[] args) {
        Koneksi.konek();
    }
}
