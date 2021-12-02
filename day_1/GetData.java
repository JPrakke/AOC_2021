package day_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class GetData {
    public static void main(String[] args)  {

    }
    public static String[] getArray() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("./day_1/input.txt"));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        String[] arr = lines.toArray(new String[0]);
        return arr.clone();
    }
}
