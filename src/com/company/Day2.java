package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Day2 {
    public int rockPaperSci(){
//        HashMap<Character, Character> input_hm = new HashMap<Character, Character>();
        String input = "A Y\n" +
                "B X\n" +
                "C Z";
        String[] user_input = input.split("\n");
        String input1;
        String input2;
//        user_input[0] = round;
        String round;
        round = Arrays.toString(user_input);
        System.out.println(" This is the output : " + round);
        System.out.println(" This is the output : " + round.indexOf("A"));




        return 0;
    }

}
