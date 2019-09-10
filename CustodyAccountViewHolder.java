package com.example.investmentproducts;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class CustodyAccountViewHolder extends RecyclerView.ViewHolder {

    private final TextView textView;
    private final TextView tvAccountNumber;
    private final TextView tvBalance;

    CustodyAccountViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        tvAccountNumber = itemView.findViewById(R.id.tvAccountNumber);
        tvBalance = itemView.findViewById(R.id.tvBalance);
    }

    void bindData(CustodyAccount product) {
        textView.setText(product.productName);
        tvAccountNumber.setText(product.iban);
        tvBalance.setText(product.balance);
    }
}
