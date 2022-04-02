package com.example.appphonestore.DATABASE;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHeper extends SQLiteOpenHelper {
    private static final String DB_NAME = "PHONESTORE.db";
    private static final int VERSION = 2;
    public DatabaseHeper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String tb_nv =
                "create table NhanVien (" +
                        "username TEXT PRIMARY KEY UNIQUE, " +
                        "hoTen TEXT NOT NULL, " +
                        "pass TEXT NOT NULL,"+
                        "sdt TEXT NOT NULL,"+
                         "email TEXT NOT NULL)";

        db.execSQL(tb_nv);
        //Bảng Loại
        String tb_l =
                "create table LoaiDt (" +
                        "maLoai INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "Mota TEXT NOT NULL, " +
                        "tenLoai TEXT UNIQUE NOT NULL)";
        db.execSQL(tb_l);

        String tb_DienThoai =
                "create table DienThoai (" +
                        "maDT INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "tenDT TEXT NOT NULL, " +
                        "gia INTEGER NOT NULL, " +
                        "soLuong INT NOT NULL, " +
                        "ngayNhap TEXT NOT NULL, " +
                        "NoiSx TEXT NOT NULL, " +
                        "maLoai INTEGER REFERENCES LoaiDt(maLoai))";
        db.execSQL(tb_DienThoai);
        String tb_hd =
                "create table HoaDon (" +
                        "maHoaDon INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "ngaymua TEXT NOT NULL)";
        db.execSQL(tb_hd);


        String tb_hdct =
                "create table HoaDonChiTiet (" +
                        "maHoaDonChitiet INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "Soluongmua INT NOT NULL, " +
                        "maHoaDon INTEGER REFERENCES HoaDon(maHoaDon) , " +
                        "maDT INTEGER REFERENCES DienThoai(maDT) )";
        db.execSQL(tb_hdct);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String dropTablenv = "drop table if exists NhanVien";
        db.execSQL(dropTablenv);
        String dropTableLoaiDt = "drop table if exists LoaiDT";
        db.execSQL(dropTableLoaiDt);
        String dropTableDienThoai = "drop table if exists DienThoai";
        db.execSQL(dropTableDienThoai);
        String dropTablehoadon = "drop table if exists HoaDon";
        db.execSQL(dropTablehoadon);
        String dropTablehoadonchi  = "drop table if exists HoaDonChiTiet";
        db.execSQL(dropTablehoadonchi);

        onCreate(db);
    }
}
