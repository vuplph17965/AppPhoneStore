package com.example.appphonestore.MODEL;

public class DienThoai {
    int mas;
    String tens;
    int gias;
    int sl;
    String ngaynhap;
    String noiSX;

    public DienThoai(int mas, String tens, int gias, int sl, String ngaynhap, String noiSX) {
        this.mas = mas;
        this.tens = tens;
        this.gias = gias;
        this.sl = sl;
        this.ngaynhap = ngaynhap;
        this.noiSX = noiSX;
    }

    public DienThoai() {
    }

    public int getMas() {
        return mas;
    }

    public void setMas(int mas) {
        this.mas = mas;
    }

    public String getTens() {
        return tens;
    }

    public void setTens(String tens) {
        this.tens = tens;
    }

    public int getGias() {
        return gias;
    }

    public void setGias(int gias) {
        this.gias = gias;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getNoiSX() {
        return noiSX;
    }

    public void setNoiSX(String noiSX) {
        this.noiSX = noiSX;
    }

    public static String getTbName() {
        return TB_NAME;
    }

    public static String getColNameMas() {
        return COL_NAME_MAS;
    }

    public static String getCOL_NAME_TenS() {
        return COL_NAME_TenS;
    }

    public static String getColNameGias() {
        return COL_NAME_GIAS;
    }

    public static String getCOL_NAME_SOLUONGs() {
        return COL_NAME_SOLUONGs;
    }

    public static String getColNameNgaynhap() {
        return COL_NAME_NGAYNHAP;
    }

    public static String getColNameNoisx() {
        return COL_NAME_NOISX;
    }

    public static String getColNameMals() {
        return COL_NAME_MALS;
    }

    public static final String TB_NAME = "DienThoai";
    public static final String COL_NAME_MAS = "maDT";
    public static final String COL_NAME_TenS = "tenDT";
    public static final String COL_NAME_GIAS = "gia";
    public static final String COL_NAME_SOLUONGs = "soLuong";
    public static final String COL_NAME_NGAYNHAP = "ngayNhap";
    public static final String COL_NAME_NOISX = "NoiSX";
    public static final String COL_NAME_MALS = "maLoai";
//    "maDT INTEGER PRIMARY KEY AUTOINCREMENT, " +
//            "tenDT TEXT NOT NULL, " +
//            "gia FLOAT NOT NULL, " +
//            "soLuong INT NOT NULL, " +
//            "ngayNhap DATE NOT NULL, " +
//            "NoiSx TEXT NOT NULL, " +
//            "maLoai INTEGER REFERENCES LoaiDt(maLoai))";
}
