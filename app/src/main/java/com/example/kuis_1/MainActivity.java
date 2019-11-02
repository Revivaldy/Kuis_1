package com.example.kuis_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Ke_lAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    TextView txt_nama, txt_status, txt_kel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new Ke_lAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);


        txt_kel = findViewById(R.id.txt_sil);

        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/Slowly One.ttf");
        txt_kel.setTypeface(customfont);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.bapak),"Petrus Satian","Ayah"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.mama),"Serina","Ibu"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.findy),"Findy Christian Golden Muchtar","Kakak"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.foto),"Firmanda Revivaldy Muchtar","Saya"));
    }
}
