package academy.prog;

import java.math.BigDecimal;
import java.util.Scanner;

public class Console {


    public static void consoleResult() {
        Scanner console = new Scanner(System.in);
        System.out.println("Hello! It`s a good idea to buy bitcoins now!");
        System.out.println("What is Bitcoin price today? Please, enter the course");
        BigDecimal BitcoinPrice = console.nextBigDecimal();
        System.out.println("Please, enter the sum of dollars, which you want to sell");
        BigDecimal sumOfDollars = console.nextBigDecimal();
        System.out.println("Bitcoin price today is: " + BitcoinPrice);
        System.out.println("You have : " + sumOfDollars + " $");
        System.out.println("-----------------------");
        double value = sumOfDollars.doubleValue() / BitcoinPrice.doubleValue();
        String result = String.format("You can buy %.7f BTC", value);
        System.out.println(result);
        System.out.println("");
        System.out.println("Thank you for using our program!");

    }


}
