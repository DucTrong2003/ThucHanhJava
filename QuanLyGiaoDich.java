/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
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

    public void xuatGiaoDichThang9Nam2013() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngayGd.contains("09/2013")) {
                System.out.println("Mã giao dịch: " + giaoDich.maGd);
                System.out.println("Ngày giao dịch: " + giaoDich.ngayGd);
                System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
                System.out.println("=================================");
            }
        }
    }

 public static void main(String[] args) {
        QuanLyGiaoDich qlgd = new QuanLyGiaoDich();

        GiaoDichDat gdDat1 = new GiaoDichDat("GD001", "01/09/2013", 100, 200, "A");
        GiaoDichDat gdDat2 = new GiaoDichDat("GD002", "02/09/2013", 150, 300, "B");
        GiaoDichNha gdNha1 = new GiaoDichNha("GD003", "03/09/2013", 200, 150, "cao cấp", "123 ABC Street");
        GiaoDichNha gdNha2 = new GiaoDichNha("GD004", "04/09/2013", 180, 200, "thường", "456 XYZ Street");

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

        System.out.println("Các giao dịch tháng 9 năm 2013:");
        qlgd.xuatGiaoDichThang9Nam2013();
    }
}