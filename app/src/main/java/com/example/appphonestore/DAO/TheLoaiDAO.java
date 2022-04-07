package com.example.appphonestore.DAO;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.appphonestore.DATABASE.DatabaseHeper;
import com.example.appphonestore.MODEL.TheLoai;

import java.util.ArrayList;
import java.util.List;

public class TheLoaiDAO {
    DatabaseHeper createData;
    SQLiteDatabase liteDatabase;
    public TheLoaiDAO(Context context) {
        createData = new DatabaseHeper(context);
        liteDatabase = createData.getWritableDatabase();
    }
    public long ADDL(TheLoai loai) {
        ContentValues values = new ContentValues();
        values.put(TheLoai.COL_NAME_TENLS, loai.getTenL());

        return liteDatabase.insert(TheLoai.TB_NAME, null, values);
    }

    public int UPDATEL(TheLoai loai) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TheLoai.COL_NAME_TENLS, loai.getTenL());

        return liteDatabase.update(TheLoai.TB_NAME, contentValues, "maLoai=?", new String[]{String.valueOf(loai.getMaL())});
    }

    public int DELETEL(TheLoai loai) {
        return liteDatabase.delete(TheLoai.TB_NAME, "maLoai=?", new String[]{String.valueOf(loai.getMaL())});
    }

    public List<TheLoai> GETLS() {
        String dl = "SELECT * FROM LoaiSach";
        List<TheLoai> list = getdata(dl);
        return list;
    }

    public TheLoai getId(String id) {
        String sql = "SELECT * FROM LoaiSach WHERE maLoai=?";
        List<TheLoai> list = getdata(sql, id);
        return list.get(0);
    }
    @SuppressLint("Range")
    private List<TheLoai> getdata(String dl, String... Arays) {
        List<TheLoai> list = new ArrayList<>();
        Cursor cursor = liteDatabase.rawQuery(dl, Arays);
        while (cursor.moveToNext()) {
            TheLoai loai = new TheLoai();
            loai.setMaL(Integer.parseInt(cursor.getString(cursor.getColumnIndex(TheLoai.COL_NAME_MALS))));
            loai.setTenL(cursor.getString(cursor.getColumnIndex(TheLoai.COL_NAME_TENLS)));

            list.add(loai);
        }
        return list;

    }
}
