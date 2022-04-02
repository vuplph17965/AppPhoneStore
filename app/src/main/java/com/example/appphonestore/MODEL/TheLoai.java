package com.example.appphonestore.MODEL;

public class TheLoai {
    private int maL;
    private String tenL;
    private String Mota;
    public static final String TB_NAME = "LoaiDT";
    public static final String COL_NAME_MALS = "maLoai";
    public static final String COL_NAME_TENLS = "tenLoai";
    public static final String COL_NAME_NCC = "Mota";

    public TheLoai(int maL, String tenL, String mota) {
        this.maL = maL;
        this.tenL = tenL;
        Mota = mota;
    }

    public TheLoai() {
    }

    public int getMaL() {
        return maL;
    }

    public void setMaL(int maL) {
        this.maL = maL;
    }

    public String getTenL() {
        return tenL;
    }

    public void setTenL(String tenL) {
        this.tenL = tenL;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    //    "maLoai INTEGER PRIMARY KEY AUTOINCREMENT, " +
//            "Mota TEXT NOT NULL, " +
//            "tenLoai TEXT UNIQUE NOT NULL)";
}
