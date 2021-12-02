package day_1;

import java.io.FileNotFoundException;

import static java.lang.Integer.parseInt;

public class SonarSweep {
    public static void main(String[] args)throws FileNotFoundException {
        String[] input = GetData.getArray();
        int counter = 0;
        for(int i=0;i<input.length-1;i++){
            if(parseInt(input[i]) < parseInt(input[i+1])){
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
