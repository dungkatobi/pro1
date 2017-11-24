/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.dtoNhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import util.util;

/**
 *
 * @author USER
 */
public class daoNhanVien {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

    public daoNhanVien() {
    }

    public dtoNhanVien login(String manv, String pass) {
        try {
            con = util.getConn();
            String StrSql = "Select * from [NHANVIEN] where MANV =? and pass =?";
            pst = con.prepareStatement(StrSql);
            pst.setString(1, manv);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            if (rs.next()) {
                dtoNhanVien dto = new dtoNhanVien();
                return dto;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            util.closeCon(con, rs, pst);
        }
        return null;
    }
    public ArrayList<Vector> Load() {
        ArrayList<Vector> av = new ArrayList<>();
        try {
            con = util.getConn();
            String sql = "Select * FROM NHANVIEN";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Vector v = new Vector<>();
                v.add(rs.getString("MANV"));
                v.add(rs.getString("PASS"));
                v.add(rs.getString("TENNV"));
                v.add(rs.getString("DIACHI"));
                v.add(rs.getString("DIENTHOAI"));
                v.add(rs.getBoolean("GIOITINH"));
                av.add(v);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            util.closeCon(con, rs, pst);
        }
        System.out.println(av.size());
        return av;
    }
}
