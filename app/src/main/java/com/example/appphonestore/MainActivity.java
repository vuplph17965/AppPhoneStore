package com.example.appphonestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.appphonestore.FRAGMENT.Fragment_DienThoai;
import com.example.appphonestore.FRAGMENT.Fragment_GioiThieu;
import com.example.appphonestore.FRAGMENT.Fragment_HangDienThoai;
import com.example.appphonestore.FRAGMENT.Fragment_HoaDon;
import com.example.appphonestore.FRAGMENT.Fragment_TaiKhoan;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);

        FragmentManager manager = getSupportFragmentManager();
        Fragment_DienThoai fragment_dienThoai = new Fragment_DienThoai();
        manager.beginTransaction()
                .replace(R.id.frContainerView, fragment_dienThoai)
                .commit();

        NavigationView nv = findViewById(R.id.nvView);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager manager = getSupportFragmentManager();

                switch (item.getItemId()) {
                    case R.id.nav_DienThoai:
                        setTitle("Điện Thoại");
                        Fragment_DienThoai fragment_dienThoai = new Fragment_DienThoai();
                        manager.beginTransaction()
                                .replace(R.id.frContainerView, fragment_dienThoai)
                                .commit();
                        break;
                    case R.id.nav_HoaDon:
                        setTitle("Hóa Đơn");
                        Fragment_HoaDon fragment_hoaDon = new Fragment_HoaDon();
                        manager.beginTransaction()
                                .replace(R.id.frContainerView, fragment_hoaDon)
                                .commit();
                        break;
                    case R.id.nav_TaiKhoan:
                        setTitle("Tài Khoản");
                        Fragment_TaiKhoan fragment_taiKhoan = new Fragment_TaiKhoan();
                        manager.beginTransaction()
                                .replace(R.id.frContainerView, fragment_taiKhoan)
                                .commit();
                        break;
                    case R.id.nav_HangDT:
                        setTitle("Hãng Điện Thoại");
                        Fragment_HangDienThoai fragment_hangDienThoai = new Fragment_HangDienThoai();
                        manager.beginTransaction()
                                .replace(R.id.frContainerView, fragment_hangDienThoai)
                                .commit();
                        break;
                    case R.id.nav_GioiThieu:
                        setTitle("Giới Thiệu");
                        Fragment_GioiThieu fragment_gioiThieu = new Fragment_GioiThieu();
                        manager.beginTransaction()
                                .replace(R.id.frContainerView, fragment_gioiThieu)
                                .commit();
                        break;
                    case R.id.nav_DangXuat:
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                        finish();
                        break;
                }

                drawerLayout.closeDrawers();

                return false;
            }

        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==android.R.id.home)
            drawerLayout.openDrawer(GravityCompat.START);

        return super.onOptionsItemSelected(item);
    }
}