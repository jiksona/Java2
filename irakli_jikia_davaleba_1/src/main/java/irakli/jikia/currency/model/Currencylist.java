package main.java.irakli.jikia.currency.model;

import java.util.ArrayList;

public class Currencylist {

    private static ArrayList<Currency> currencyArrayList;

    public void CurrencytList() {
    }

    public static ArrayList<Currency> showCurrency() {
        currencyArrayList = new ArrayList<>();
        currencyArrayList.add(new Currency("USD",2.9,2.8));
        currencyArrayList.add(new Currency("EUR",3.1,3.2));
        currencyArrayList.add(new Currency("RUB",0.004,0.004));
        return currencyArrayList;
    }
}
