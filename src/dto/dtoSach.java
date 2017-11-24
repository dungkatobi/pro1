/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author USER
 */
public class dtoSach {
    private String mash;
    private String matl;
    private String mavt;
    private String tensach;
    private String noidung;
    private int sotrang;
    private String tacgia;
    private String ngonngu;
    private String nhaxuatban;
    private String ngaymuasach;
    private String giathue;
    private boolean tontai;

    public dtoSach() {
    }

    public dtoSach(String mash, String matl, String mavt, String tensach, String noidung, int sotrang, String tacgia, String ngonngu, String nhaxuatban, String ngaymuasach, String giathue, boolean tontai) {
        this.mash = mash;
        this.matl = matl;
        this.mavt = mavt;
        this.tensach = tensach;
        this.noidung = noidung;
        this.sotrang = sotrang;
        this.tacgia = tacgia;
        this.ngonngu = ngonngu;
        this.nhaxuatban = nhaxuatban;
        this.ngaymuasach = ngaymuasach;
        this.giathue = giathue;
        this.tontai = tontai;
    }

    public String getMash() {
        return mash;
    }

    public void setMash(String mash) {
        this.mash = mash;
    }

    public String getMatl() {
        return matl;
    }

    public void setMatl(String matl) {
        this.matl = matl;
    }

    public String getMavt() {
        return mavt;
    }

    public void setMavt(String mavt) {
        this.mavt = mavt;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getNgaymuasach() {
        return ngaymuasach;
    }

    public void setNgaymuasach(String ngaymuasach) {
        this.ngaymuasach = ngaymuasach;
    }

    public String getGiathue() {
        return giathue;
    }

    public void setGiathue(String giathue) {
        this.giathue = giathue;
    }

    public boolean isTontai() {
        return tontai;
    }

    public void setTontai(boolean tontai) {
        this.tontai = tontai;
    }
    
}
