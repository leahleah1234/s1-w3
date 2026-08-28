public class Refillable {
    private int amount; 

    public Refillable(){
        amount = 10;
    }

    public Refillable(int amt){
        amount = amt; 
    }

    public void increase(int a){
        amount += a;
    }

     public void decrease (int a){
        amount -= a;
    }

    public int getAmount(){
        return amount; 
    }
}
