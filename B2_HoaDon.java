
class HoaDon {
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoaDon;

    public HoaDon(String maKhachHang, String hoTen, String ngayRaHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double tinhThanhTien() {
        return 0;
    }

    public void xuatThongTin() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày ra hoá đơn: " + ngayRaHoaDon);
    }
}

class KhachHangVietNam extends HoaDon {
    private String doiTuongKhachHang;
    private double soLuong;
    private double donGia;
    private double dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, String doiTuongKhachHang,
            double soLuong, double donGia, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien;
        if (soLuong <= dinhMuc) {
            thanhTien = soLuong * donGia;
        } else {
            thanhTien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
        return thanhTien;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Đối tượng khách hàng: " + doiTuongKhachHang);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Định mức: " + dinhMuc);
        System.out.println("Thành tiền: " + tinhThanhTien());
        System.out.println("----------------------");
    }
}



   
