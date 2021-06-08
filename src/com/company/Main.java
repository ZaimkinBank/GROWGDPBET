package com.company;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        economic germany = new economic(3861, "germany");
        economic UK =  new economic(2914, "UK");
        economic france =  new economic(2718, "france");
        economic italia =  new economic(2004, "italia");
        economic Spane = new economic(1393, "Spane");
        economic [] EU = new economic [] {germany, UK, france, italia, Spane};
        for (int i = 0; i < 1000; i++) {
            System.out.println(2021 + i + " YEAR  -------------");
            economic.sort(EU);
            economic.grow(EU);
            Thread.sleep(3000);
        }
    }
}
