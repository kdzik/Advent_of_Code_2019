package aoc.kdzik.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    public void initDay2() throws FileNotFoundException {
        File file = new File("src/aoc/kdzik/day2/data.txt");
        Scanner scanner = new Scanner(file).useDelimiter(",");
        ArrayList<Integer> numbers = new ArrayList<>();

        while(scanner.hasNext()){
            int pom = scanner.nextInt();
            numbers.add(pom);
        }
        scanThrough(numbers);
        printList(numbers);
    }

    public void printList(ArrayList<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i)+",");
        }
    }

    private void swap(ArrayList<Integer> numbers){
       numbers.set(1, 12);
       numbers.set(2, 2);
    }

    private void scanThrough(ArrayList<Integer> numbers){
        int index = 0;
        boolean end = false;
        swap(numbers);
        while(index < numbers.size() && end == false){
            switch(numbers.get(index)){
                case 1:
                    int sum = 0;
                    sum += numbers.get(numbers.get(index+1));
                    sum += numbers.get(numbers.get(index+2));
                    numbers.set(numbers.get(index+3), sum);
                    index+=4;
                    break;
                case 2:
                    int mult = 0;
                    mult = numbers.get(numbers.get(index+1))*numbers.get(numbers.get(index+2));
                    numbers.set(numbers.get(index+3), mult);
                    index+=4;
                    break;
                case 99:
                    end = true;
                    break;
            }
        }
    }

}
