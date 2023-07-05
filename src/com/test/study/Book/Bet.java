package com.test.study.Book;

import java.util.Arrays;
import java.util.Scanner;

public class Bet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = scanner.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 1; i <= n; ++i) numbers[i - 1] = i;

        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            int r = (int) Math.random() * n;
            res[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            --n;
        }

        Arrays.sort(res);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int m : res) {
            System.out.println(m);
        }

    }

}