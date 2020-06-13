package main.java.irakli.jikia.currency.controller;

import giorgi.darakhvelidze.currency.model.Currency;
import giorgi.darakhvelidze.currency.model.Currencylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Currency> currencylist = Currencylist.showCurrency();
        System.out.println(currencylist);
    }
}
