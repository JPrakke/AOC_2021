package day_2;

import day_1.GetData;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class SubMovement {

    public static void main(String[] args) throws FileNotFoundException {
        GetData gd= new GetData();
        String[] input = gd.getArray("./day_2/input.txt");
        challengeOne(input);
        challengeTwo(input);
    }
    public static void challengeOne(String[] input) {
        List<String> movements = new ArrayList<String>();
        int horizontalPos = 0;
        int depthPos = 0;
        int output = 0;
        for (String line : input) {
            for (String s : line.split(" "))
                movements.add(s);
        }
        for (int i = 0; i < movements.size(); i += 2) {
            if (movements.get(i).equals("forward")) {
                horizontalPos += parseInt(movements.get(i + 1));
            } else if (movements.get(i).equals("down")) {
                depthPos += parseInt(movements.get(i + 1));
            } else if (movements.get(i).equals("up")) {
                depthPos -= parseInt(movements.get(i + 1));
            }
        }
        output += depthPos * horizontalPos;
        System.out.println(output);
    }
    public static void challengeTwo(String [] input){
        List<String> movements = new ArrayList<String>();
        int horizontalPos = 0;
        int aim = 0;
        int depthPos = 0;
        int output = 0;
        for (String line : input) {
            for (String s : line.split(" "))
                movements.add(s);
        }
        for (int i = 0; i < movements.size(); i += 2) {
            if (movements.get(i).equals("forward")) {
                if (aim != 0){
                    depthPos += parseInt(movements.get(i+1)) * aim;
                }
                horizontalPos += parseInt((movements.get(i+1)));
            } else if (movements.get(i).equals("down")) {
                aim += parseInt(movements.get(i+1));
                System.out.println(aim);
            } else if (movements.get(i).equals("up")) {
                aim -= parseInt(movements.get(i + 1));
                System.out.println(aim);
            }
        }
        output += depthPos * horizontalPos;
        System.out.println(output);
    }
}
