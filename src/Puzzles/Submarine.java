package Puzzles;

import java.util.ArrayList;
import java.util.Map;

public class Submarine {

    private ArrayList<Integer> subx;

    private ArrayList<Integer> suby;

    private ArrayList<Integer> subaim;



    public Submarine () {
        subx = new ArrayList<>();
        suby = new ArrayList<>();
        subaim = new ArrayList<>();
        subaim.add(0);
        subx.add(0);
        suby.add(0);
    }

    public void move (Map<String, Integer> commandandvaluelist) {

    for (Map.Entry<String, Integer> entry: commandandvaluelist.entrySet()){
        if (entry.getKey().equals(Advent2.MoveDirection.FORWARD.getCommand())){
            subx.set(0, subx.get(0) + entry.getValue());
            suby.set(0, suby.get(0) + (entry.getValue() * subaim.get(0)));
        }
        if (entry.getKey().equals(Advent2.MoveDirection.DOWN.getCommand())){
            //suby.set(0, suby.get(0) + entry.getValue());
            subaim.set(0, subaim.get(0) + entry.getValue());
        }
        if(entry.getKey().equals(Advent2.MoveDirection.UP.getCommand())){
            //suby.set(0, suby.get(0) - entry.getValue());
            subaim.set(0, subaim.get(0) - entry.getValue());
        }




    }
    }

    public ArrayList<Integer> getSubx() {
        return subx;
    }

    public ArrayList<Integer> getSuby() {
        return suby;
    }

    public ArrayList<Integer> getSubaim() {
        return subaim;
}
}
