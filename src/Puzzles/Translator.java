package Puzzles;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Translator {

    Submarine sub;

    public Translator( ) {

        this.sub = new Submarine();

    }

    boolean foundCommand = false;
    public void commandTranslation (List<Advent2.MoveDirection> command, ArrayList<String> input) {


        for (String entry : input) {
            Map<String, Integer> commandandvaluelist = new HashMap<>();

            int movement = 0;
            String patternSpaceAndNumber = "(\\s\\d+)";
            String regExp = "[a-zA-Z]+";
            String patternString = "(" + regExp + ")" + patternSpaceAndNumber;
            Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(entry);
            if (matcher.matches()) {
                foundCommand = true;
                String commandName = matcher.group(1).toLowerCase(); //saving commandName as lower case string for further operations
                String commandValue = matcher.group(2);
                if (commandValue != null) {
                    commandValue = commandValue.trim();
                    movement = parseInt(commandValue);
                }

                commandandvaluelist.put(commandName,movement);

            }

            if (!foundCommand) {
                System.err.println("Invalid command");
            }

            sub.move(commandandvaluelist);

        }
        System.out.println(sub.getSubx() + "Sub x");
        System.out.println(sub.getSuby() + "Sub y");
        System.out.println(sub.getSubx().get(0) * sub.getSuby().get(0));
        /*
        double sum = sub.getSubx().stream()
                .mapToDouble(a -> a)
                .sum();

        System.out.println(sub.getSubx() + "Sum x");

        double sum1 = sub.getSuby().stream()
                .mapToDouble(a -> a)
                .sum();

        double sumaim = sub.getSubaim().stream()
                .mapToDouble(a -> a)
                .sum();


        System.out.println(sub.getSuby() + "Sum y");
        System.out.println(sum * sum1 + "x * y");

         */
        System.out.println(sub.getSubaim() +"Sum aim");
    }
}