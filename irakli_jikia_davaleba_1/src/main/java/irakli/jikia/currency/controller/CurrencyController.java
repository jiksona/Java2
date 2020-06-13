package main.java.irakli.jikia.currency.controller;


import giorgi.darakhvelidze.currency.model.Currency;
import giorgi.darakhvelidze.currency.model.Currencylist;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.List;

@Path("/currencycontroller")
public class CurrencyController {
    @GET
    @Path("/getcurrency/{code}")
    public String getCurrency(@PathParam("code")String code){
        List<Currency> currencylist = new ArrayList<>(Currencylist.showCurrency());

        String answer = "";
        for(Currency currency:currencylist){
            if (currency.getCode()==code){
                answer = currency.toString();
            }
        }

        return answer;
    }

    @GET
    @Path("/getcurrenies")
    public List<Currency> getCurrencies(){
        List<Currency> currencylist = new ArrayList<>(Currencylist.showCurrency());

        return currencylist;
    }

}


