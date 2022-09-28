package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        // Put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = num;
        boolean k = true;
        while (k){
            num = scanner.nextInt();
            if (num == 0){
                break;
            }
            else if (num>max){
                max = num;
            }

        }
        return max;
    }
    public static void main(String[] args) {

        System.out.println("Test your code here!\n");
        // Get a result of your code
        System.out.println(max());
    }
}
