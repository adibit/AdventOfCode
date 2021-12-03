package Puzzles;

import java.io.*;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

public class Advent2 {

    enum MoveDirection {
        FORWARD("forward"),
        UP("up"),
        DOWN("down");

        private final String command;

        MoveDirection(String command) {
            this.command = command;
        }

        public String getCommand() {
            return this.command;
        }

        @Override
        public String toString() {
            return command;
        }
    }

    public static void main(String[] args) throws IOException {

        Translator translator = new Translator();

        //TEXT IO - TAKE INPUT AND SAVE IT INTO AN ARRAYLIST
        File input = new File("/Users/adrianleonhard/Downloads/input (1).txt");
        Scanner reader = new Scanner(input);
        ArrayList<String> codesample = new ArrayList<>();
        while (reader.hasNextLine()) {
            codesample.add(reader.nextLine());
        }
        reader.close();

        System.out.println(codesample);
        // SENDOND PART OF CODE - ENUM

        List<MoveDirection> moveDirectionList = new ArrayList<>();
        moveDirectionList.add(MoveDirection.FORWARD);
        moveDirectionList.add(MoveDirection.DOWN);
        moveDirectionList.add(MoveDirection.UP);
        System.out.println(moveDirectionList);

        translator.commandTranslation(moveDirectionList, codesample);

            /*  patternString: Search pattern to find commands and values. While values are optional.

            / Regex for Group 1: "Any valid command"(variable command). Retrieved from the InputValidator Hashmap containing all commands.
            / Regex for Group 2: Check if there is a space followed by any number of digits. Group 2 is optional.
            */

    }
}
