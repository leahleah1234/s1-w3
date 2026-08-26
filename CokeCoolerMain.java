public class CokeCoolerMain {
    public static void main(String[] args) {
        CokeCooler c = new CokeCooler();
        CokeCooler c2 = new CokeCooler();

        System.out.println(c.cokeCount());
        
        c.drink(20);
        c2.drink(30);

        c.refill(60);
        c2.refill(150);
        System.out.println("C1: ");// ask 
        c.printState();
        
        System.out.println("C2 : ");
        c2.printState();
    }
}
