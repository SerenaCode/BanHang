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
public class OrderDetail {
    private int MaHD;
    private String maSP;
    private int DonGia;
    private int soLuong;
    private double GiamGia;
    private int ThanhTien;

    public OrderDetail() {
    }

    public OrderDetail(int MaHD, String maSP, int DonGia, int soLuong, double GiamGia, int ThanhTien) {
        this.MaHD = MaHD;
        this.maSP = maSP;
        this.DonGia = DonGia;
        this.soLuong = soLuong;
        this.GiamGia = GiamGia;
        this.ThanhTien = ThanhTien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    
    
}
