package com.kitabisa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kitabisa.adapter.DonasiAtasAdapter;
import com.kitabisa.model.DonasiAtasModel;
import com.kitabisa.ui.DifabelFragment;
import com.kitabisa.ui.KesehatanFragment;
import com.kitabisa.ui.LainnyaFragment;
import com.kitabisa.ui.ZakatFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rc1, rc2;
    private Context context;
    KesehatanFragment kesehatanFragment = new KesehatanFragment();
    DifabelFragment difabelFragment = new DifabelFragment();
    ZakatFragment zakatFragment = new ZakatFragment();
    LainnyaFragment lainnyaFragment = new LainnyaFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        rc1 = findViewById(R.id.rc1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_fragment, kesehatanFragment);
        fragmentTransaction.commit();

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                if (item.getItemId() == R.id.navigasi_kesehatan) {
                    fragmentTransaction.replace(R.id.nav_host_fragment, kesehatanFragment);
                } else if (item.getItemId() == R.id.navigasi_difabel) {
                    fragmentTransaction.replace(R.id.nav_host_fragment, difabelFragment);
                } else if (item.getItemId() == R.id.navigasi_zakat) {
                    fragmentTransaction.replace(R.id.nav_host_fragment, zakatFragment);
                } else {
                    fragmentTransaction.replace(R.id.nav_host_fragment, lainnyaFragment);
                }
                fragmentTransaction.commit();
                return true;
            }
        });


        DonasiAtasModel data = new DonasiAtasModel();
        List<DonasiAtasModel> objList = new ArrayList<>();
        data.setImgurl(getResources().getDrawable(R.drawable.donasi1));
        data.setJuduldonasi("Difabel Bekerjat Tanpa Kaki Demi Upah 3 Ribu/Hari");
        data.setDanaterkumpul("Rp.90.000.000");
        data.setTargetdonasi("terkumpul dari Rp.200.000.000");
        data.setTotaldonasi("427 Donasi");
        data.setTotalhari("30 Hari");
        objList.add(data);
        data = new DonasiAtasModel();
        data.setImgurl(getResources().getDrawable(R.drawable.dif));
        data.setJuduldonasi("Bantu Penjaga Rel Kereta Api Difabel Bertahan Hidup");
        data.setDanaterkumpul("Rp.23.393.747");
        data.setTargetdonasi("terkumpul dari Rp.300.000.000");
        data.setTotaldonasi("5902 Donasi");
        data.setTotalhari("30 Hari");
        objList.add(data);

        DonasiAtasAdapter adapter = new DonasiAtasAdapter(context, objList);
        rc1.setAdapter(adapter);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        rc1.setLayoutManager(layoutManager);
    }
}