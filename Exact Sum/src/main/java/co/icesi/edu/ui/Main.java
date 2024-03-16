package co.icesi.edu.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = read.readLine()) != null && !line.equals("")) {
            int n = Integer.parseInt(line);
            int[] books = new int[n];
            String[] bookesS = read.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                books[i] = Integer.parseInt(bookesS[i]);
            }
            int money = Integer.parseInt(read.readLine());

            int[] result = findBooks(books, money);

            System.out.println("Peter should buy books whose prices are " + result[0] + " and " + result[1] + ".");
            System.out.println();
        }
        read.close();
    }

    public static int[] findBooks(int[] books, int money) {
        int[] result = new int[2];
        Arrays.sort(books);
        int i = 0;
        int j = books.length - 1;
        while (i < j) {
            int sum = books[i] + books[j];
            if (sum == money) {
                result[0] = books[i];
                result[1] = books[j];
                i++;
                j--;
            } else if (sum < money) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }


//    private static void sortBooksByPrice(int[] books) {
//        for (int i = 0; i < books.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < books.length; j++) {
//                if (books[j] < books[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = books[minIndex];
//            books[minIndex] = books[i];
//            books[i] = temp;
//        }
//    }
}
