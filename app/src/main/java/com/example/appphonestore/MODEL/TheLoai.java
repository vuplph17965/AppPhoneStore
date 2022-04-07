package com.example.appphonestore.MODEL;

public class TheLoai {
    private int maL;
    private String tenL;
    public static final String TB_NAME = "LoaiDT";
    public static final String COL_NAME_MALS = "maLoai";
    public static final String COL_NAME_TENLS = "tenLoai";

    public TheLoai(int maL, String tenL) {
        this.maL = maL;
        this.tenL = tenL;
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


    //    "maLoai INTEGER PRIMARY KEY AUTOINCREMENT, " +
//            "tenLoai TEXT UNIQUE NOT NULL)";
}
