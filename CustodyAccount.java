package com.example.investmentproducts;

class CustodyAccount extends InvestmentProduct {
    String iban;

    CustodyAccount(String productName, String balance, String iban) {
        super(productName, balance);
        this.iban = iban;
    }

}
