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
public class Item {
    private Product sanPham;
    private int soLuong;
    private double donGia;

    public Item() {
    }

    public Item(Product sanPham, int soLuong, double donGia) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public Product getSanPham() {
        return sanPham;
    }

    public void setSanPham(Product sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    
    
    
}
