
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Penguin penguin = new Penguin("Kudah", "gray", 22, "penguin", true, false, true);
        penguin.toRun();
        penguin.toFly();
        penguin.toSwim();
        System.out.println();

        Cat slon = new Cat("Murzik", "white", 8, true, "hz", 4, "cat", true, false, false);
        slon.toRun();
        slon.toFly();
        slon.toSwim();
        System.out.println();

        Dog mamonth = new Dog("Morty", "yellow", 2, false, "Jeeraph", 4, "dog", true, false, true);
        mamonth.toRun();
        mamonth.toFly();
        mamonth.toSwim();
        System.out.println();
    }
}
