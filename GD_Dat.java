

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

