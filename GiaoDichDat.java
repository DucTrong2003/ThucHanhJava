/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ADMIN
 */
class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(String maGd, String ngayGd, double donGia, double dienTich, String loaiDat) {
        super(maGd, ngayGd, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiDat.equals("A")) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }
}

