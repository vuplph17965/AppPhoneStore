package com.example.appphonestore.DAO;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.appphonestore.DATABASE.DatabaseHeper;
import com.example.appphonestore.MODEL.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungDAO {
    SQLiteDatabase sqlite;
    DatabaseHeper createData;

    public NguoiDungDAO(Context context) {
        createData = new DatabaseHeper(context);
        sqlite = createData.getWritableDatabase();
    }

    public void OPEN() {
        sqlite = createData.getWritableDatabase();
    }

    public void Close() {
        createData.close();
    }

    public long ADDNV(NguoiDung nhanVien) {
        ContentValues values = new ContentValues();
        values.put(NguoiDung.COL_MANV, nhanVien.getUsername());
        values.put(NguoiDung.COL_TENNV, nhanVien.getHoten());
        values.put(NguoiDung.COL_MK, nhanVien.getPass());
        values.put(NguoiDung.COL_Email, nhanVien.getEmail());
        values.put(NguoiDung.COL_SDT, nhanVien.getSdt());
        return sqlite.insert(NguoiDung.TB_NAME, null, values);
    }

    public int UPDATE(NguoiDung nhanVien) {
        ContentValues values = new ContentValues();
        values.put(NguoiDung.COL_MANV, nhanVien.getUsername());
        values.put(NguoiDung.COL_TENNV, nhanVien.getHoten());
        values.put(NguoiDung.COL_MK, nhanVien.getPass());
        values.put(NguoiDung.COL_Email, nhanVien.getEmail());
        values.put(NguoiDung.COL_SDT, nhanVien.getSdt());
        return sqlite.update(NguoiDung.TB_NAME, values, "username=?", new String[]{nhanVien.getUsername()});
    }
    public int Thaypass(NguoiDung nhanVien) {
        ContentValues values = new ContentValues();
        values.put(NguoiDung.COL_MK, nhanVien.getPass());
        return sqlite.update(NguoiDung.TB_NAME, values, "username=?", new String[]{nhanVien.getUsername()});
    }

    public int DELETE(String mNV) {
        return sqlite.delete(NguoiDung.TB_NAME, "username=?", new String[]{mNV});
    }

    public NguoiDung getId(String maNV) {
        String selectId = "SELECT * FROM NhanVien WHERE username=?";
        List<NguoiDung> list = getdata(selectId, maNV);
        return list.get(0);
    }
    public int getUserName(String user) {
        String dl = "SELECT * FROM NhanVien WHERE username=? ";
        List<NguoiDung> list = getdata(dl, user);
        if (list.size() == 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public List<NguoiDung> GETNV() {
        String select = "SELECT* FROM NhanVien";
        return getdata(select);
    }

    @SuppressLint("Range")
    private List<NguoiDung> getdata(String sql, String... selection) {
        List<NguoiDung> list = new ArrayList<>();
        Cursor cursor = sqlite.rawQuery(sql, selection);
        while (cursor.moveToNext()) {
            NguoiDung nhanVien = new NguoiDung();
            nhanVien.setUsername(cursor.getString(cursor.getColumnIndex(NguoiDung.COL_MANV)));
            nhanVien.setHoten(cursor.getString(cursor.getColumnIndex(NguoiDung.COL_TENNV)));
            nhanVien.setPass(cursor.getString(cursor.getColumnIndex(NguoiDung.COL_MK)));
            nhanVien.setEmail(cursor.getString(cursor.getColumnIndex(NguoiDung.COL_Email)));
            nhanVien.setSdt(cursor.getString(cursor.getColumnIndex(NguoiDung.COL_SDT)));
            list.add(nhanVien);
        }
        return list;
    }

    public int getlogin(String user, String pass) {
        String dl = "SELECT * FROM NhanVien WHERE username=? AND pass=?";
        List<NguoiDung> list = getdata(dl, user, pass);
        if (list.size() == 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
