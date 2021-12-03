package Puzzles;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main (String[] args) throws IOException {


        File input = new File("/Users/adrianleonhard/Downloads/input.txt");
        Scanner reader = new Scanner(input);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (reader.hasNextInt()) {
            numbers.add(reader.nextInt());
        }
        reader.close();
        int counter = 0;
        for (int i = 0 ; numbers.size() - 3 > i ; i++){
            if (numbers.get(i) + numbers.get(i+1) + numbers.get(i+2) < numbers.get(i+1) + numbers.get(i+2) + numbers.get(i+3)){
                ++counter;
            }
        }
        System.out.println(counter);

/*
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(("/Users/adrianleonhard/Downloads/input.txt"))))) {
            String line;
            int counter = 0;
            for (String s : br) {
                String currentline = br.readLine();
                if (Integer.parseInt(line) < Integer.parseInt(currentline)){
                    ++counter;
                }
            }
            System.out.println(counter);
        }
*/
    }
}
