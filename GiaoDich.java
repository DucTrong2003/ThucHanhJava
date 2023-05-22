
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
