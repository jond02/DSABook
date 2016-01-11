package excercises.book;

/**
 * Created by jondann on 1/10/16.
 */
public class Game {

    public static void main(String[] args){

        //R-1.2

        GameEntry[] gEntry = new GameEntry[3];

        gEntry[0] = new GameEntry(450);
        gEntry[1] = new GameEntry(600);
        gEntry[2] = new GameEntry(750);

        GameEntry[] gE2 = gEntry;

        gEntry[2].setScore(100);

        System.out.println(gEntry[2].getScore());
        System.out.println(gE2[2].getScore());

    }
}
