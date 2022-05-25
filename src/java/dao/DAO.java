/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Cart;
import entity.Category;
import entity.Customer;
import entity.Item;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 7bvod
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    //list product tra ve tat ca san pham
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "Select * from SanPham";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (SQLException e) {
        }

        return list;
    }

    public List<Product> getProductByMaLoaiSP(String maLoaiSP) {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham where MaLoaiSP= ?";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, maLoaiSP);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public Product getProductByMaSP(String maSP) {

        String query = "select * from SanPham where maSP = ?";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, maSP);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10));
            }
        } catch (Exception e) {
        }
        return null;

    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from LoaiSanPham";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Product> searchByTenSP(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham where [tenSP] like ?";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public Account login(String user, String pass) {
        String query = "select * from account\n"
                + "where [user] = ? \n"
                + "and [pass] = ?";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Account checkAccountExist(String user) {
        String query = "select * from account\n"
                + "where [user] = ? \n";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void signup(String user, String pass) {
        String query = "insert into account \n"
                + "values(?, ?, 0, 0)";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public List<Product> getProductBySellId(int id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham where sell_ID = ?";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public void deleteProduct(String pid) {
        String query = "delete from SanPham\n"
                + "where maSP = ?";

        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertProduct(String tenSP,
            String maLoaiSP, String donViTinh, String donGia,
            String soLuong, String img, String discontinued,
            String moTa, int sellid) {
        String query = "insert into SanPham(tenSP,maLoaiSP, donViTinh, donGia, soLuong, img, Discontinued, moTa, sell_ID)\n"
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);

            ps.setString(1, tenSP);
            ps.setString(2, maLoaiSP);
            ps.setString(3, donViTinh);
            ps.setString(4, donGia);
            ps.setString(5, soLuong);
            ps.setString(6, img);
            ps.setString(7, discontinued);
            ps.setString(8, moTa);
            ps.setInt(9, sellid);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editProduct(String tenSP,
            String maLoaiSP, String donViTinh, String donGia,
            String soLuong, String img, String discontinued,
            String moTa, String maSP) {
        String query = "update SanPham\n"
                + "set tenSP = ?,\n"
                + "maLoaiSP = ?,\n"
                + "donViTinh = ?,\n"
                + "donGia = ?,\n"
                + "soLuong = ?,\n"
                + "img = ?,\n"
                + "Discontinued = ?,\n"
                + "moTa = ?\n"
                + "where maSP = ?";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, tenSP);
            ps.setString(2, maLoaiSP);
            ps.setString(3, donViTinh);
            ps.setString(4, donGia);
            ps.setString(5, soLuong);
            ps.setString(6, img);
            ps.setString(7, discontinued);
            ps.setString(8, moTa);
            ps.setString(9, maSP);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getTotalAccount() {
        String query = "select COUNT(*) from SanPham";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public void addOrder(Customer u, Cart cart) {
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();
        try {
            //add vào bảng order
            String sql = "insert into HoaDon values(?, ?, ?, ?, ?, ?)";
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 01);
            ps.setInt(2, u.getMaKH());
            ps.setString(3, date);
            ps.setDouble(4, 0);
            ps.setInt(5, 0);
            ps.setDouble(6, cart.getTotalMoney());
            ps.executeUpdate();

            // Lấy ra Id của Order vừa add
            String sql1 = "select top 1 MaHD from HoaDon\n"
                    + "order by MaHD desc";
            PreparedStatement st1 = conn.prepareStatement(sql1);
            rs = ps.executeQuery();

            // Add vào bảng order detail
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : cart.getItems()) {
                    String sql2 = "insert into HoaDonChiTiet \n"
                            + "values(?, ?, ?, ?, ?, ?)";
                    PreparedStatement ps2 = conn.prepareStatement(sql2);
                    ps2.setInt(1, oid);
                    ps2.setInt(2, i.getSanPham().getMaSP());
                    ps2.setInt(3, (int) i.getDonGia());
                    ps2.setInt(4, i.getSoLuong());
                    ps2.setDouble(5, 0);
                    ps2.setDouble(6, i.getDonGia() * i.getSoLuong());
                    ps2.executeUpdate();
                }
            }

        } catch (Exception e) {
        }
    }

    public List<Product> getAllProductSortList() {
        List<Product> list = new ArrayList<>();
        String query = "Select * from SanPham order by donGia";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (SQLException e) {
        }

        return list;
    }
    public List<Product> getAllProductSortListDown() {
        List<Product> list = new ArrayList<>();
        String query = "Select * from SanPham order by donGia DESC";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (SQLException e) {
        }

        return list;
    }
    public List<Product> getAllProductSortNameDown() {
        List<Product> list = new ArrayList<>();
        String query = "Select * from SanPham order by tenSP DESC";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (SQLException e) {
        }

        return list;
    }
    public List<Product> getAllProductSortNameUp() {
        List<Product> list = new ArrayList<>();
        String query = "Select * from SanPham order by tenSP ";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        true,
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (SQLException e) {
        }

        return list;
    }
    
    
    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "Select * from account";
        try {
            conn = new DBContext().connection; // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)));
                        
            }
        } catch (SQLException e) {
        }

        return list;
    }

}
