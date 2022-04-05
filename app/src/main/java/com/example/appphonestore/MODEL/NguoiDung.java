package com.example.appphonestore.MODEL;

public class NguoiDung {
    String username;
    String Hoten;
    String pass;
    String sdt;
    String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NguoiDung(String username, String hoten, String pass, String sdt, String email) {
        this.username = username;
        Hoten = hoten;
        this.pass = pass;
        this.sdt = sdt;
        this.email = email;
    }

    public NguoiDung() {
    }

    //    String tb_nv =
//            "create table NhanVien (" +
//                    "username TEXT PRIMARY KEY UNIQUE, " +
//                    "hoTen TEXT NOT NULL, " +
//                    "pass TEXT NOT NULL,"+
//                    "sdt TEXT NOT NULL,"+
//                    "email TEXT NOT NULL)";
public static final String TB_NAME = "Nhanvien";
    public static final String COL_MANV = "username";
    public static final String COL_TENNV = "hoTen";
    public static final String COL_MK = "pass";
    public static final String COL_SDT = "sdt";
    public static final String COL_Email = "email";
}
