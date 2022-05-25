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
public class Order {
    private int MaHD;
    private String MaMV;
    private String MaKH;
    private String NgayLapHD;
    private double Tien;
    private double TongSoTien;

    public Order() {
    }

    public Order(int MaHD, String MaMV, String MaKH, String NgayLapHD, double Tien, double TongSoTien) {
        this.MaHD = MaHD;
        this.MaMV = MaMV;
        this.MaKH = MaKH;
        this.NgayLapHD = NgayLapHD;
        this.Tien = Tien;
        this.TongSoTien = TongSoTien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaMV() {
        return MaMV;
    }

    public void setMaMV(String MaMV) {
        this.MaMV = MaMV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(String NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

    public double getTien() {
        return Tien;
    }

    public void setTien(double Tien) {
        this.Tien = Tien;
    }

    public double getTongSoTien() {
        return TongSoTien;
    }

    public void setTongSoTien(double TongSoTien) {
        this.TongSoTien = TongSoTien;
    }

    
    
}
