package com.example.investmentproducts;

class PensionSavingsAccount extends InvestmentProduct {
    String iban;

    PensionSavingsAccount(String productName, String balance, String iban) {
        super(productName, balance);
        this.iban = iban;
    }

}
