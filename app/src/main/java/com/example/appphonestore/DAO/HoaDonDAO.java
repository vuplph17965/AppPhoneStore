package com.example.appphonestore.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.appphonestore.DATABASE.DatabaseHeper;
import com.example.appphonestore.MODEL.HoaDon;

import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO {
    SQLiteDatabase sqlite;
    DatabaseHeper createData;

    public HoaDonDAO(Context context) {
        createData = new DatabaseHeper(context);
        sqlite = createData.getWritableDatabase();
    }
    public long ADD(HoaDon hoaDon) {
        ContentValues values = new ContentValues();
        values.put(HoaDon.COL_NAME_MAHD, hoaDon.getMaHD());
        values.put(HoaDon.COL_NAME_NM, hoaDon.getNgaymua());

        return sqlite.insert("HoaDon", null, values);
    }

    public int DELETE(HoaDon hoaDon) {
        return sqlite.delete( HoaDon.TB_NAME, "maHD=?", new String[]{String.valueOf(hoaDon.getMaHD())});
    }

    public int UPDATE(HoaDon hoaDon) {
        ContentValues values = new ContentValues();
        values.put(HoaDon.COL_NAME_MAHD, hoaDon.getMaHD());
        values.put(HoaDon.COL_NAME_NM, hoaDon.getNgaymua());

        return sqlite.delete( HoaDon.TB_NAME, "maHD=?", new String[]{String.valueOf(hoaDon.getMaHD())});
    }


    public HoaDon getID(String id) {
        String sql = "SELECT * FROM HoaDon WHERE maHD=?";
        List<HoaDon> list = getData(sql, id);
        return list.get(0);
    }

    public List<HoaDon> GETPM() {
        String sql = "SELECT * FROM PhieuMuon";
        List<HoaDon> list = getData(sql);
        return list;
    }

    // getData viet kieu List để sd nhiều lần
    private List<HoaDon> getData(String sql, String... Arays) {
        List<HoaDon> list = new ArrayList<>();
        Cursor cursor = sqlite.rawQuery(sql, Arays);
        while (cursor.moveToNext()) {
            HoaDon hoadon= new HoaDon();


            list.add(hoadon);
        }
        return list;

    }
}
