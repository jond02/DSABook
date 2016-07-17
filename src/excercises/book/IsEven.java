package excercises.book;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by jondann on 7/16/16.
 */
public class IsEven {

    public static void main(String[] args){
        System.out.println(isEven(20));
        System.out.println(removePunc("Let's try, Mike!"));
    }

    private static boolean isEven(int i){
        return (i & 1) == 0;
    }

    private static String removePunc(String string){

        HashSet<String> puncs = new HashSet<>(Arrays.asList(",", "!", "'"));
        StringBuilder s = new StringBuilder(string);
        for (int i = 0; i < s.length(); i++){
            if (puncs.contains(s.substring(i, i + 1))){
                s.deleteCharAt(i);
            }
        }
        return s.toString();
    }

}
