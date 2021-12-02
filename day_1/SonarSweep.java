package day_1;

import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;

public class SonarSweep {
    public static void main(String[] args)throws FileNotFoundException {
        String[] input = GetData.getArray();
        challengeOne(input);
        challengeTwo(input);
    }
    public static void challengeOne(String[] input){
        int counter = 0;
        for(int i=0;i<input.length-1;i++){
            if(parseInt(input[i]) < parseInt(input[i+1])){
                counter ++;
            }
        }
        System.out.println(counter);
    }
    public static void challengeTwo(String[] input) {
        int oldSum = 0;
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++){
                for (int y = i+2; y <input.length; y++){
                    int sum = parseInt(input[i])+parseInt(input[j])+parseInt(input[y]);
                    if(sum>oldSum && oldSum!= 0){
                        counter ++;
                    }
                    oldSum = sum;
                    break;
                }
                break;
            }
        }
        System.out.println(counter);
    }

}
