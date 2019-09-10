package com.example.investmentproducts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InvestmentProductsAdapter extends RecyclerView.Adapter {
    InvestmentProductsAdapter(List<InvestmentProduct> products) {
        this.products = products;
    }

    private List<InvestmentProduct> products;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        if (viewType == R.layout.item_custody_account) {
            return new CustodyAccountViewHolder(view);
        } else {
            return new PensionSavingsAccountViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        InvestmentProduct product = products.get(position);
        if (product instanceof CustodyAccount) {
            CustodyAccountViewHolder viewHolder = (CustodyAccountViewHolder)holder;
            viewHolder.bindData((CustodyAccount) products.get(position));
        } else {
            PensionSavingsAccountViewHolder viewHolder = (PensionSavingsAccountViewHolder) holder;
            viewHolder.bindData((PensionSavingsAccount) product);
        }
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    @Override
    public int getItemViewType(int position) {
        InvestmentProduct product = products.get(position);
        if (product instanceof CustodyAccount) {
            return R.layout.item_custody_account;
        } else {
            return R.layout.item_pension_savings_account;
        }
    }

}
