package singleton;

public class Eager {
    private static Eager instance = new Eager();

    private Eager() {
        super();
    }

    public static Eager getInstance() {
        return instance;
    }
}
