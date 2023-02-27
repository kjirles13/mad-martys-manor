package gameobjects;

public abstract class Thing {
    private String name, description;

    public Thing(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected Thing() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
