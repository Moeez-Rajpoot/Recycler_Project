package com.example.lab6_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arraycontact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.contact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       // ContactModel model= new ContactModel(R.drawable.pic, "zulkefal","123456789");

        arraycontact.add(new ContactModel(R.drawable.a, "Calippo Cola","Rs:250"));
        arraycontact.add(new ContactModel(R.drawable.b, "Wall's Mini Bites","Rs:200"));
        arraycontact.add(new ContactModel(R.drawable.c, "Viennetta Chocolate Yule ","Rs:300"));
        arraycontact.add(new ContactModel(R.drawable.d, "Viennetta Birthday ","Rs:275"));
        arraycontact.add(new ContactModel(R.drawable.e, "Solero Red Berries","Rs:420"));
        arraycontact.add(new ContactModel(R.drawable.f, "Solero Exotic Single","Rs:70"));
        arraycontact.add(new ContactModel(R.drawable.g, "Magnum Bites Classic","Rs:450"));
        arraycontact.add(new ContactModel(R.drawable.h, "Guuud Raspberry Greek","Rs:350"));
        arraycontact.add(new ContactModel(R.drawable.i, "Guuud Passion Fruit","Rs:370"));
        arraycontact.add(new ContactModel(R.drawable.j, "FEAST SINGLE","Rs:80"));
        arraycontact.add(new ContactModel(R.drawable.k, "Cornetto Mint Single","Rs:85"));
        arraycontact.add(new ContactModel(R.drawable.l, "Faisal","Rs:240"));
        arraycontact.add(new ContactModel(R.drawable.m, "Calippo Orange","Rs:300"));

        RecyclerContactAdapter adapter= new RecyclerContactAdapter(this, arraycontact);
        recyclerView.setAdapter(adapter);
    }
}