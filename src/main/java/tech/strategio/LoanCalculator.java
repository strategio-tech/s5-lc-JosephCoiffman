package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * This method calculates the amount that a person who is paying 10%
     * of remaing loan will have to pay and how much is left over for three months.
     * @param amount of loan
     * @return the amount left after three months
     */
    static int getRemainingAmountIn3Months(int amount) {
        for(int x = 0; x < 3; x++){
            amount = amount - (amount / 10);
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
