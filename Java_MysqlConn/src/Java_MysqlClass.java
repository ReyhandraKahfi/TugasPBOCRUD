/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Java_MysqlClass {
    public static Connection konn;
    public static Statement stm;
    public String usr;

    public Java_MysqlClass(String usr) {
        this.usr = usr;
        try {
            konn=DriverManager.getConnection("jdbc:mysql://localhost:3306/databarang", "root", "");
            stm=konn.createStatement();
            JOptionPane.showMessageDialog(null,"koneksi berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(Java_MysqlClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    public static Connection getKonn() {
        return konn; 
        }

    public static void main(String[] args){
        Java_MysqlClass konek=new Java_MysqlClass("databarang");
    }
}
