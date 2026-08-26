public class CandyJarMain {
    public static void main(String[] args) {
        CandyJar c = new CandyJar();
        CandyJar c2 = new CandyJar(20);

        c.eat(4);
        c2.eat(6);

        c.refill(12);
        c2.refill(30);
        System.out.println("C1: ");
        c.printState();

        System.out.println("C2 : ");
        c2.printState();
    }
}
