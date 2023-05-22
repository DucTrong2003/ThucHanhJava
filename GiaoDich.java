/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ADMIN
 */
class GiaoDich {
    protected String maGd;
    protected String ngayGd;
    protected double donGia;
    protected double dienTich;

    public GiaoDich(String maGd, String ngayGd, double donGia, double dienTich) {
        this.maGd = maGd;
        this.ngayGd = ngayGd;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public double tinhThanhTien() {
        return dienTich * donGia;
    }
}
