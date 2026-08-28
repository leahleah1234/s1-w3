public class ScoreMain {
    public static void main(String[] args) {
    Score s = new Score(25);
    System.out.println("Your score is " + s.getScore());

    Score s1 = new Score(10);
    s1.increase(17);
    s1.decrease(29);
    System.out.println("Your score is " + s1.getScore());

    }

}