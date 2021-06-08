package com.company;

import java.util.Random;

public class economic {
    double GDP;
    String name;


    public economic( double GDP, String name ) {
        this.GDP = GDP;
        this.name = name;
    }

    public static void grow( economic [] arr ){
        for (int i = 0; i < arr.length; i++)
            arr[i].GDP = arr[i].GDP * (1 + new Random().nextDouble() / 10);
    }

    public static void sort( economic [] arr ){
        for (int i = 0;  i < arr.length; i++)
            System.out.println(i + 1 + "." + arr[i].name + " " + (int) arr[i].GDP);

        double tmp;
        String temp;

        for (int j = 0; j < 5; j++)
            for (int i = 0; i < arr.length - 1; i++)
                if ( arr[i].GDP < arr[i + 1].GDP ){
                    tmp = arr[i].GDP;
                    temp = arr[i].name;
                    arr[i].GDP = arr[i + 1].GDP;
                    arr[i].name = arr[i + 1].name;
                    arr[i + 1].GDP  = tmp;
                    arr[i + 1].name  = temp;
                }
    }
}
