import singleton.*;
import strategy.*;
import facade.Facade;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Lazy lazy = Lazy.getInstance();
        System.out.println(lazy);
        lazy = Lazy.getInstance();
        System.out.println(lazy);
        Eager eager = Eager.getInstance();
        System.out.println(eager);
        eager = Eager.getInstance();
        System.out.println(eager);
        LazyHolder lazyHolder = LazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolder.getInstance();
        System.out.println(lazyHolder);
        // Strategy
        Action moveSlowly = new MoveSlowly();
        Action moveNormally = new MoveNormally();
        Action moveFast = new MoveFast();
        Robot robot = new Robot();
        robot.setAction(moveSlowly);
        robot.move();
        robot.move();
        robot.move();
        robot.setAction(moveNormally);
        robot.move();
        robot.move();
        robot.setAction(moveFast);
        robot.move();
        robot.move();
        // Facade
        Facade facade = new Facade();
        facade.migrate("Rafael", "49270000");
    }
}
