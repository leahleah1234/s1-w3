public class RefillableMain {
    public static void main(String[] args) {
        Refillable r = new Refillable(25);
        r.increase(10);
        r.decrease(13);
        System.out.println(r.getAmount());
    }
}
