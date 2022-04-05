package com.example.appphonestore.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.appphonestore.DATABASE.DatabaseHeper;
import com.example.appphonestore.MODEL.DienThoai;

public class DienThoaiDAO {

    SQLiteDatabase database;

    public DienThoaiDAO(Context context) {
        DatabaseHeper databaseHeper = new DatabaseHeper(context);
        database = databaseHeper.getWritableDatabase();
    }

    public long Add(DienThoai dienThoai) {
        ContentValues values = new ContentValues();
        values.put(DienThoai.COL_NAME_MAS, dienThoai.getMaDT());
        values.put(DienThoai.COL_NAME_TenS, dienThoai.getTenDT());
        values.put(DienThoai.COL_NAME_GIAS, dienThoai.getGiaDT());
        values.put(DienThoai.COL_NAME_SOLUONGs, dienThoai.getSl());
        values.put(DienThoai.COL_NAME_NGAYNHAP, dienThoai.getNgaynhap());
        values.put(DienThoai.);
    }
}
