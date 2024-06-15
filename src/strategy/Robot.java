package strategy;

public class Robot {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void move() {
        action.move();
    }
}
