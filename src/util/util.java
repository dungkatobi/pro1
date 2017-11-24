/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class util {
    public static Connection getConn(){
        try {
            String connectionUrl
                = "jdbc:sqlserver://localhost:1433;databaseName=QLThuVien;user=sa;password=123";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con
                    = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static void closeCon(Connection con,ResultSet rs, PreparedStatement pst){
        try{
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(pst!=null){
                pst.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
