/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author 7bvod
 */
public class Product {
    private int maSP;
    private String tenSP;
    private String maLoaiSP;
    private String donViTinh;
    private int donGia;
    private int soLuong;
    public String img;
    private boolean discontinued;
    private String moTa;
    private int sell_ID;
    

    public Product() {
    }

    public Product(int maSP, String tenSP, String maLoaiSP, String donViTinh, int donGia, int soLuong, String img, boolean discontinued, String moTa, int sell_ID) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maLoaiSP = maLoaiSP;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.img = img;
        this.discontinued = discontinued;
        this.moTa = moTa;
        this.sell_ID = sell_ID;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSell_ID() {
        return sell_ID;
    }

    public void setSell_ID(int sell_ID) {
        this.sell_ID = sell_ID;
    }

    @Override
    public String toString() {
        return "Product{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", maLoaiSP=" + maLoaiSP + ", donViTinh=" + donViTinh + ", donGia=" + donGia + ", soLuong=" + soLuong + ", img=" + img + ", discontinued=" + discontinued + ", moTa=" + moTa + ", sell_ID=" + sell_ID + '}';
    }

    


   
    
    
}
