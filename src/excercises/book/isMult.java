package excercises.book;

/**
 * Created by jondann on 1/10/16.
 */
public class isMult {

    //R-1.3

    public static void main(String[] args){

        boolean x = isMultiple(0, 100);

        System.out.println(x);

    }

    /**
     * Check if n is a multiple of m
     * @param n long
     * @param m long
     * @return boolean
     */

    private static boolean isMultiple(long n, long m){

        if (n != 0 && m != 0){

            //check if there is not a remainder when dividing
            if (m % n == 0){
                return true;
            } else {
                return false;
            }

        }
        //a zero was entered
        return false;
    }

}
