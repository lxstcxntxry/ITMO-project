package help;

public abstract class MasksAbstract implements MasksInterface {
    private String name;
    private boolean window;

    public MasksAbstract(String name, Boolean window) {
        this.name = name;
        this.window = window;
    }

    @Override
    public boolean inWindow() {
        return window;
    }

    @Override
    public String getName() {
        return name;
    }
}
