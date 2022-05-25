
package entity;

public class Customer {
    private int MaKH;
    private String TenKH;
    private String DiaChi;
    private String phone;
    private String Email;

    public Customer() {
    }

    public Customer(int MaKH, String TenKH, String DiaChi, String phone, String Email) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.phone = phone;
        this.Email = Email;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Customer{" + "MaKH=" + MaKH + ", TenKH=" + TenKH + ", DiaChi=" + DiaChi + ", phone=" + phone + ", Email=" + Email + '}';
    }

    
}
