package com.example.appphonestore.MODEL;

public class DienThoai {
    int maDT;
    String tenDT;
    int giaDT;
    int sl;
    String ngaynhap;
    String noiSX;

    public DienThoai(int maDT, String tenDT, int giaDT, int sl, String ngaynhap, String noiSX) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.giaDT = giaDT;
        this.sl = sl;
        this.ngaynhap = ngaynhap;
        this.noiSX = noiSX;
    }

    public DienThoai() {
    }

    public int getMaDT() {
        return maDT;
    }

    public void setMaDT(int maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public int getGiaDT() {
        return giaDT;
    }

    public void setGiaDT(int giaDT) {
        this.giaDT = giaDT;
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
