package Puzzles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Submarine {

    private ArrayList<Integer> subx;

    private ArrayList<Integer> suby;

    public Submarine () {
        subx = new ArrayList<>();
        suby = new ArrayList<>();
        subx.add(0);
        suby.add(0);
    }

    public void move (Map<String, Integer> commandandvaluelist) {

    for (Map.Entry<String, Integer> entry: commandandvaluelist.entrySet()){
        if (entry.getKey().equals(Advent2.MoveDirection.FORWARD.getCommand())){
            subx.add(entry.getValue());

        }
        if (entry.getKey().equals(Advent2.MoveDirection.DOWN.getCommand())){
            suby.add(entry.getValue());
        }
        if(entry.getKey().equals(Advent2.MoveDirection.UP.getCommand())){
            suby.add(- entry.getValue());
        }
    //Challenge 2


    }
    }

    public ArrayList<Integer> getSubx() {
        return subx;
    }

    public ArrayList<Integer> getSuby() {
        return suby;
    }

}
