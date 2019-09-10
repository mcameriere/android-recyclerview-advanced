package com.example.investmentproducts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        InvestmentProductsAdapter adapter = new InvestmentProductsAdapter(generateInvestmentProductsList());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<InvestmentProduct> generateInvestmentProductsList() {
        List<InvestmentProduct> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String productName = String.format("Product %s", i);
            if (i % 2 == 0) {
                list.add(new CustodyAccount(
                        productName,
                        "1.273,98 EUR",
                        "222 2333301 94"));
            } else {
                list.add(new PensionSavingsAccount(
                        productName,
                        "1.273,98 EUR",
                        "BE86 0354 7709 5450"));
            }
        }
        return list;
    }
}
