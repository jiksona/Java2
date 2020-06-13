package main.java.irakli.jikia.currency.model;

public class Currency {
    private String code;
    private double buy;
    private double sell;

    public Currency() {
    }

    public Currency(String code, double buy, double sell) {
        this.code = code;
        this.buy = buy;
        this.sell = sell;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", buy=" + buy +
                ", sell=" + sell +
                '}';
    }
}

