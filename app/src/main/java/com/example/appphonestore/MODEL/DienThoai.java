package com.example.appphonestore.MODEL;

public class DienThoai {
    int mas;
    String tens;
    int mal;
    int gias;
    int sl;
    String ngaynhap;
    String noiSX;

    public DienThoai(int mas, String tens, int mal, int gias, int sl, String ngaynhap, String noiSX) {
        this.mas = mas;
        this.tens = tens;
        this.mal = mal;
        this.gias = gias;
        this.sl = sl;
        this.ngaynhap = ngaynhap;
        this.noiSX = noiSX;
    }

    public int getMal() {
        return mal;
    }

    public void setMal(int mal) {
        this.mal = mal;
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
