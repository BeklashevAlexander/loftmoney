package com.example.loftmoney;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loftmoney.cells.MoneyCellAdapter;
import com.example.loftmoney.cells.MoneyItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView ItemsView;

    private MoneyCellAdapter moneyCellAdapter = new MoneyCellAdapter();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateMoney();


        Button btn = findViewById(R.id.btn_click_me);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddItemActivity.class);
                startActivity(intent);
            }
        });
    }

    private void generateMoney() {
        List<MoneyItem> moneyItems = new ArrayList<>();
        moneyItems.add(new MoneyItem(title: "PS5", value: "30000P"));
        moneyItems.add(new MoneyItem(title: "Salary", value: "300000"));

        moneyCellAdapter.setData(moneyItems);



    }

    private void configureRecyclerView() {
        itemsView = findViewById(R.id.itemsView);
        itemsView.setAdapter(moneySellAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, reversLayout:false);

        itemsView.setLayoutManager(layoutManager);



    }
}