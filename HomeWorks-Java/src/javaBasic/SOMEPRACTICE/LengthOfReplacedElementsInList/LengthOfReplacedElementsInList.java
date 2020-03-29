package javaBasic.SOMEPRACTICE.LengthOfReplacedElementsInList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LengthOfReplacedElementsInList {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 1, curr = 1;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if (i != 0) {
                if (list.get(i).equals(list.get(i - 1))) {
                    curr++;
                    max = curr > max ? curr : max;
                } else{
                    curr = 1;
                }
            }
        }
        System.out.println(max);
    }
}