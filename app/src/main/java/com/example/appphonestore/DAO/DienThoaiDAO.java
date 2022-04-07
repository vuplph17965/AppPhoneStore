package com.example.appphonestore.DAO;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.appphonestore.DATABASE.DatabaseHeper;
import com.example.appphonestore.MODEL.DienThoai;

import java.util.ArrayList;
import java.util.List;

public class DienThoaiDAO {
    SQLiteDatabase sqLiteDatabase;
    DatabaseHeper createData;

    public DienThoaiDAO(Context context) {
        createData = new DatabaseHeper(context);
        sqLiteDatabase = createData.getWritableDatabase();
    }

    public long ADDS(DienThoai dt) {
        ContentValues values = new ContentValues();
        values.put(DienThoai.COL_NAME_MALS, dt.getMas());
        values.put(DienThoai.COL_NAME_TenS, dt.getTens());
        values.put(DienThoai.COL_NAME_GIAS, dt.getGias());
        values.put(DienThoai.COL_NAME_SOLUONGs, dt.getSl());
        values.put(DienThoai.COL_NAME_NGAYNHAP, dt.getNgaynhap());
        values.put(DienThoai.COL_NAME_NOISX, dt.getNoiSX());
        return sqLiteDatabase.insert(DienThoai.TB_NAME, null, values);
    }

    public int DELETES(DienThoai dt) {
        return sqLiteDatabase.delete(DienThoai.TB_NAME, "maDT=?", new String[]{String.valueOf(dt.getMas())});
    }

    public int UPDATES(DienThoai dt) {
        ContentValues values = new ContentValues();
        values.put(DienThoai.COL_NAME_MALS, dt.getMas());
        values.put(DienThoai.COL_NAME_TenS, dt.getTens());
        values.put(DienThoai.COL_NAME_GIAS, dt.getGias());
        values.put(DienThoai.COL_NAME_SOLUONGs, dt.getSl());
        values.put(DienThoai.COL_NAME_NGAYNHAP, dt.getNgaynhap());
        values.put(DienThoai.COL_NAME_NOISX, dt.getNoiSX());
        return sqLiteDatabase.update(DienThoai.TB_NAME, values, "maDT=?", new String[]{String.valueOf(dt.getMas())});
    }

    public List<DienThoai> GETS() {
        String dl = "SELECT * FROM DienThoai";
        List<DienThoai> list = getdata(dl);
        return list;
    }

    public DienThoai getId(String id) {
        String sql = "SELECT * FROM DienThoai WHERE maDT=?";
        List<DienThoai> list = getdata(sql, id);
        return list.get(0);
    }

    @SuppressLint("Range")
    private List<DienThoai> getdata(String dl, String... Arays /* có hoặc không nhiều phần tử*/) {
        List<DienThoai> list = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.rawQuery(dl, Arays);
        while (cursor.moveToNext()) {
            DienThoai dt = new DienThoai();
            dt.setMas(Integer.parseInt(cursor.getString(cursor.getColumnIndex(DienThoai.COL_NAME_MAS))));
            dt.setMal(Integer.parseInt(cursor.getString(cursor.getColumnIndex(DienThoai.COL_NAME_MALS))));
            dt.setTens(cursor.getString(cursor.getColumnIndex(DienThoai.COL_NAME_TenS)));
            dt.setNoiSX(cursor.getString(cursor.getColumnIndex(DienThoai.COL_NAME_NOISX)));
            dt.setSl(Integer.parseInt(cursor.getString(cursor.getColumnIndex(DienThoai.COL_NAME_SOLUONGs))));
            dt.setNgaynhap(cursor.getString(cursor.getColumnIndex(DienThoai.COL_NAME_NGAYNHAP)));
            dt.setGias(Integer.parseInt(cursor.getString(cursor.getColumnIndex(DienThoai.COL_NAME_GIAS))));

            list.add(dt);
        }
        return list;
    }
}
