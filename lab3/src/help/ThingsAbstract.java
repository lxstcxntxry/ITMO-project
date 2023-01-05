package help;

public abstract class ThingsAbstract implements ThingsInterface {
    private String name;

    public ThingsAbstract(String name) {
        this.name = name;
    }

    @Override
    public boolean getWindow() {
        return true;
    }

    @Override
    public boolean getPuppet() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}