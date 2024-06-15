package strategy;

public class MoveSlowly implements Action {
    @Override
    public void move() {
        System.out.println("Movendo-se lentamente...");
    }
}
