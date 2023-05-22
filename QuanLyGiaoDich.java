

import java.util.ArrayList;
import java.util.List;


public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public void xuatDanhSachGiaoDich() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            System.out.println("Mã giao dịch: " + giaoDich.maGd);
            System.out.println("Ngày giao dịch: " + giaoDich.ngayGd);
            System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
            System.out.println("=================================");
        }
    }

    public int demSoLuongGiaoDichDat() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongGiaoDichNha() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichNha) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienGiaoDichDat() {
        double sum = 0;
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                sum += giaoDich.tinhThanhTien();
                count++;
            }
        }
        return sum / count;
    }

    public void xuatGiaoDichThang5Nam2023() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngayGd.contains("05/2023")) {
                System.out.println("Mã giao dịch: " + giaoDich.maGd);
                System.out.println("Ngày giao dịch: " + giaoDich.ngayGd);
                System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
                System.out.println("=================================");
            }
        }
    }

 public static void main(String[] args) {
        QuanLyGiaoDich qlgd = new QuanLyGiaoDich();

        GiaoDichDat gdDat1 = new GiaoDichDat("MSDD1", "19/05/2023", 100, 200, "A");
        GiaoDichDat gdDat2 = new GiaoDichDat("MSDD2", "20/05/2023", 150, 300, "B");
        GiaoDichNha gdNha1 = new GiaoDichNha("MSDD3", "21/05/2023", 200, 150, "cao cấp", "123 ABC Street");
        GiaoDichNha gdNha2 = new GiaoDichNha("MSDD4", "22/05/2023", 180, 200, "thường", "456 XYZ Street");

        qlgd.themGiaoDich(gdDat1);
        qlgd.themGiaoDich(gdDat2);
        qlgd.themGiaoDich(gdNha1);
        qlgd.themGiaoDich(gdNha2);

        qlgd.xuatDanhSachGiaoDich();

        int soLuongGiaoDichDat = qlgd.demSoLuongGiaoDichDat();
        int soLuongGiaoDichNha = qlgd.demSoLuongGiaoDichNha();
        double trungBinhThanhTienGiaoDichDat = qlgd.tinhTrungBinhThanhTienGiaoDichDat();

        System.out.println("Số lượng giao dịch đất: " + soLuongGiaoDichDat);
        System.out.println("Số lượng giao dịch nhà: " + soLuongGiaoDichNha);
        System.out.println("Trung bình thành tiền giao dịch đất: " + trungBinhThanhTienGiaoDichDat);

        System.out.println("Các giao dịch tháng 5 năm 2023:");
        qlgd.xuatGiaoDichThang5Nam2023();
    }
}
