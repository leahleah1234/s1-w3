public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c = new Classroom("Mr. Leah", 40, 25);
        Classroom c1 = new Classroom("Mr. Morris");


        c1.setDesks(30);
        c1.printState();
    }
}
