package com.org.App;

public class Application {
    public static void main(String[] args) {
        System.out.println("start");
        ServerEx serverex = new ServerEx();

        serverex.goServerMain();


        System.out.println("return 0");

    }
}
