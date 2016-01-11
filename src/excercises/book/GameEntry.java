package excercises.book;

/**
 * Created by jondann on 1/10/16.
 */
public class GameEntry {

    private int score;

    public GameEntry(){

    }

    public GameEntry(int score){
        this.score = score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

}
