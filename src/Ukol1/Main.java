package Ukol1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            System.out.print(text.charAt(i) + ": " + (int)a + "; ");
            sum+=a;
        }
        System.out.println("\nSoucet: "+sum);
    }
}
