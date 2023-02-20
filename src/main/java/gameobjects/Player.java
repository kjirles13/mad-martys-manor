package gameobjects;

import java.util.ArrayList;
import java.util.List;

public class Player extends Thing{
    private List<Thing> backpack;
    private Room currentRoom;
    private Room previousRoom;

    public Player(String name, String description) {
        super(name, description);
        this.backpack = new ArrayList<>();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room room) {
        previousRoom = currentRoom;
        currentRoom = room;
    }

    public Room getPreviousRoom() {
        return previousRoom;
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
