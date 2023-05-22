/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

/**
 *
 * @author ADMIN
 */
class KhachHangNuocNgoai extends HoaDon {
    private String quocTich;
    private double soLuong;
    private double donGia;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, String quocTich, double soLuong,
            double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Quốc tịch: " + quocTich);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Thành tiền: " + tinhThanhTien());
        System.out.println("----------------------");
    }
}

