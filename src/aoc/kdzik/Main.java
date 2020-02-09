package aoc.kdzik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static long sum1, sum2;

    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("src/com/company/data.txt");
        Scanner scanner = new Scanner(data);
        sum1 = 0;   //FIRST SOLUTION SUM
        sum2 = 0;   //SECOND SOLUTION SUM
        int pom;

        while(scanner.hasNextLine()){
            pom = Integer.parseInt(scanner.nextLine());
            firstPart(pom);
            secondPart(pom);
        }
        System.out.println("Solution 1: " + sum1);
        System.out.println("Solution 2: " + sum2);
        scanner.close();
    }

    private static void firstPart(int pom){
        pom /= 3;
        pom -= 2;
        sum1 += pom;
    }

    private static void secondPart(int pom){
        while(pom >= 0) {
            pom /= 3;
            pom -= 2;
            if(pom >= 0) {
                sum2 += pom;
            }
        }
    }
}
