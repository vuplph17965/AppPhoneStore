package com.example.appphonestore.MODEL;

public class HoaDon {
    private int maHD;

    private String ngaymua;

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(String ngaymua) {
        this.ngaymua = ngaymua;
    }

    public HoaDon(int maHD, String ngaymua) {
        this.maHD = maHD;
        this.ngaymua = ngaymua;
    }

    public HoaDon() {
    }

    public static final String TB_NAME = "HoaDon";
    public static final String COL_NAME_MAHD = "maHoaDon";
    public static final String COL_NAME_NM = "ngaymua";
//    "maHoaDon INTEGER PRIMARY KEY AUTOINCREMENT, " +
//            "ngaymua TEXT NOT NULL)";
}
