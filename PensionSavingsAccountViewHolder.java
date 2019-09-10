package com.example.investmentproducts;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class PensionSavingsAccountViewHolder extends RecyclerView.ViewHolder {

    private final TextView textView;
    private final TextView accountNumber;

    PensionSavingsAccountViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        accountNumber = itemView.findViewById(R.id.tvAccountNumber);
    }

    void bindData(PensionSavingsAccount product) {
        textView.setText(product.productName);
        accountNumber.setText(product.iban);
    }
}
