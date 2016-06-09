package com.yss;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is IntelliJ Community Version 16.1.1");
        String [] employee = {"Youssouyf", "Amadou", "Nnaba"};
        int [][] workHourss = new  int[employee.length][5];
        double wage = 8.99;
        Random valAleatroire = new Random();
        DecimalFormat df =  new DecimalFormat("0.00 kr");


        for (int i = 0; i < workHourss.length ; i++) {
            int weeklyHours = 0;

            System.out.print(employee[i] + " Worked ");
            for (int j = 0; j <workHourss[0].length; j++) {
                workHourss[i][j] = valAleatroire.nextInt(8);

                weeklyHours += workHourss[i][j];

            }
            double weeklyPay =  weeklyHours*wage;

            System.out.println(weeklyHours + " hours per week  at " + wage + " per hours and got " + df.format(weeklyPay));

        }

        Products p =  new Products("Banana", 1, "334.5");
        System.out.println(p);
        Account  firstAccount = new Account("Credit Account", "34.45");
        System.out.println("------------- Print Account ------------------- ");
        System.out.println(firstAccount.toString());





    }
}
