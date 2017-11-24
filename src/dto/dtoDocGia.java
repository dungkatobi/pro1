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
public class dtoDocGia {
    private String madg,tendg,namsinh,nghenghiep,ngaycapthe,ngayhethan,diachi;
    private boolean gioitinh;

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getTendg() {
        return tendg;
    }

    public void setTendg(String tendg) {
        this.tendg = tendg;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getNghenghiep() {
        return nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        this.nghenghiep = nghenghiep;
    }

    public String getNgaycapthe() {
        return ngaycapthe;
    }

    public void setNgaycapthe(String ngaycapthe) {
        this.ngaycapthe = ngaycapthe;
    }

    public String getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(String ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public dtoDocGia(String madg, String tendg, String namsinh, String nghenghiep, String ngaycapthe, String ngayhethan, String diachi, boolean gioitinh) {
        this.madg = madg;
        this.tendg = tendg;
        this.namsinh = namsinh;
        this.nghenghiep = nghenghiep;
        this.ngaycapthe = ngaycapthe;
        this.ngayhethan = ngayhethan;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public dtoDocGia() {
    }
}
