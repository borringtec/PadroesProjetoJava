package singleton;

public class LazyHolder {
    private static class InstanceHolder {
        public static LazyHolder instance = new LazyHolder();
    }

    private LazyHolder() {
        super();
    }

    public static LazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
