package gameobjects;

import java.util.ArrayList;
import java.util.List;

public class Actor extends Thing{
    private List<Thing> backpack;

    public Actor(String name, String description) {
        super(name, description);
        this.backpack = new ArrayList<>();
    }

    public List<Thing> getBackpack() {
        return backpack;
    }

    public void setBackpack(List<Thing> backpack) {
        this.backpack = backpack;
    }

    public void addObject(Thing item) {
        backpack.add(item);
    }
}
