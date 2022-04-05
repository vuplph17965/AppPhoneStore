package com.example.appphonestore.MODEL;

public class HoaDonChiTiet {
    private int maHDCT;
    private HoaDon hoaDon;
    private DienThoai dt;
    private int soLuongMua;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int maHDCT, HoaDon hoaDon, DienThoai dt, int soLuongMua) {
        this.maHDCT = maHDCT;
        this.hoaDon = hoaDon;
        this.dt = dt;
        this.soLuongMua = soLuongMua;
    }

    public int getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(int maHDCT) {
        this.maHDCT = maHDCT;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public DienThoai getDt() {
        return dt;
    }

    public void setDt(DienThoai dt) {
        this.dt = dt;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    //    String tb_hdct =
//            "create table HoaDonChiTiet (" +
//                    "maHoaDonChitiet INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                    "Soluongmua INT NOT NULL, " +
//                    "maHoaDon INTEGER REFERENCES HoaDon(maHoaDon) , " +
//                    "maDT INTEGER REFERENCES DienThoai(maDT) )";
public static final String TB_NAME = "HoaDonChiTiet";
    public static final String COL_MAhd = "maHoaDonChiTiet";
    public static final String COL_slm = "SoLuongMua";

}
