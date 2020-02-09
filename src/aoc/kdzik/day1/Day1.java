package aoc.kdzik.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

    private static long sum1, sum2;

    public void initDay1() throws FileNotFoundException {
        File data = new File("src/aoc/kdzik/day1/data.txt");
        Scanner scanner = new Scanner(data);
        sum1 = 0;   //FIRST SOLUTION SUM
        sum2 = 0;   //SECOND SOLUTION SUM
        int pom;

        while (scanner.hasNextLine()) {
            pom = Integer.parseInt(scanner.nextLine());
            firstPart(pom);
            secondPart(pom);
        }
        System.out.println("=====DAY 1=====");
        System.out.println("Solution 1: " + sum1);
        System.out.println("Solution 2: " + sum2);
        System.out.println("===============");
        scanner.close();
    }

    private static void firstPart(int pom) {
        pom /= 3;
        pom -= 2;
        sum1 += pom;
    }

    private static void secondPart(int pom) {
        while (pom >= 0) {
            pom /= 3;
            pom -= 2;
            if (pom >= 0) {
                sum2 += pom;
            }
        }
    }
}