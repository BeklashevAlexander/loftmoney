package com.example.loftmoney;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loftmoney.cells.MoneyCellAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView ItemsView;

    private MoneyCellAdapter moneyCellAdapter = new MoneyCellAdapter();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_click_me);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddItemActivity.class);
                startActivity(intent);
            }
        });
    }

    private void configureRecyclerView() {
        itemsView = findViewById(R.id.itemsView);


    }
}