
package thuchanh4;
import java.util.ArrayList;
import java.util.List;


class QuanLyHoaDon {
    private List<HoaDon> danhSachHoaDon;

    public QuanLyHoaDon() {
        danhSachHoaDon = new ArrayList<>();
    }

    public void themHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void xuatDanhSachHoaDon() {
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.xuatThongTin();
        }
    }

    public int demSoLuongKhachHangNoiDia() {
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNoiDia) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienKhachHangNuocNgoai() {
        double tongThanhTien = 0;
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                tongThanhTien += hoaDon.tinhThanhTien();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return tongThanhTien / count;
    }

    public void xuatHoaDonThang5Nam2023() {
        System.out.println("Hoá đơn trong tháng 05 năm 2023:");
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.ngayRaHoaDon.contains("05/2023")) {
                hoaDon.xuatThongTin();
            }
        }
    }

 public static void main(String[] args) {
        QuanLyHoaDon qlhd = new QuanLyHoaDon();

       KhachHangNoiDia khachHang1 = new KhachHangNoiDia("msKH1", "Bùi Đức Trọng ", "19/05/2023", "sinh hoạt",
                100, 5000, 50);
        KhachHangNoiDia khachHang2 = new KhachHangNoiDia("msKH2", "Trần Thái Thiên", "20/05/2023", "kinh doanh",
                150, 6000, 80);
        KhachHangNuocNgoai khachHang3 = new KhachHangNuocNgoai("msKH3", "Tony Tèo", "25/05/2023", "QUANCAM",
                200, 7000);

        qlhd.themHoaDon(khachHang1);
        qlhd.themHoaDon(khachHang2);
        qlhd.themHoaDon(khachHang3);

        qlhd.xuatDanhSachHoaDon();

        int soLuongKhachHangNoiDia = qlhd.demSoLuongKhachHangNoiDia();
        System.out.println("Tổng số lượng khách hàng Nội Địa : " + soLuongKhachHangNoiDia);

        double trungBinhThanhTienKhachHangNuocNgoai = qlhd.tinhTrungBinhThanhTienKhachHangNuocNgoai();
        System.out.println("Trung bình thành tiền khách hàng nước ngoài: " + trungBinhThanhTienKhachHangNuocNgoai);

        qlhd.xuatHoaDonThang5Nam2023();
    }
}

