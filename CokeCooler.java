public class CokeCooler {
    private int Cokes; 

    public CokeCooler(){
        Cokes = 100; 
    }

    public CokeCooler(int a){
        Cokes = a;
    }

    public void drink(int amt){
        Cokes -= amt; 
    }

    public void refill(int amt){
        Cokes += amt; 
    }

    public int cokeCount(){ //ask dad difference b/w this and print 
        return Cokes;
    }

    public void printState(){
        System.out.println("Cokes amount: " + Cokes);
    }
}