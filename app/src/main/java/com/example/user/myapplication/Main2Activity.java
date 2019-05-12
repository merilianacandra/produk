package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<Produk> lsProduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lsProduk = new ArrayList<>();
        lsProduk.add(new Produk("Pot Bunga Kotak Susunnnnnnnnnnnnnn mmmmmmmmm mmmmm", R.drawable.a1));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a2));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a3));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a4));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a5));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a1));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a2));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a3));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a4));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a5));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a1));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a2));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a3));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a4));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a5));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a1));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a2));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a3));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a4));
        lsProduk.add(new Produk("Pot Bunga Kotak Susu", R.drawable.a5));


        RecyclerView produkrv = findViewById(R.id.produk_list);
        ProdukAdapter produkAdapter = new ProdukAdapter(this, lsProduk);
        produkrv.setLayoutManager(new GridLayoutManager(this, 3));
        produkrv.setAdapter(produkAdapter);

    }
}
