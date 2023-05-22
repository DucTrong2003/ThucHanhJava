
class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGd, String ngayGd, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGd, ngayGd, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiNha.equals("cao cấp")) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }
}

