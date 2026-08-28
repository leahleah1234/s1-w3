public class Score {
    private int Score; 

    public Score(int a){
        Score = a; 
    }

    public Score(){
        Score = 25; 
    }

    public void increase(int amt){
        Score += amt; 
    }

    public void decrease(int amt){
        Score -= amt;
    }

    public int getScore(){
        return Score;
    }

}