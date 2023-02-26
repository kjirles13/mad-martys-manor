import gameobjects.Player;
import gameobjects.Room;

import java.util.ArrayList;
import java.util.List;

public class Game {

    static List<Room> map = new ArrayList<>();
    static Player player = new Player("Greg", "");

    public static void main(String[] args) {


        map.add(new Room("Office",
                "This is a dusty, dank office littered with papers.\nA large ornate wooden desk sits in the middle of the room where Mad Marty used to plan out his twisted creations.\nLet's see what's on his desk...",
                -1, -1, -1, 1));
        map.add(new Room("Foyer",
                "A large front hall with high ceilings, a grand chandelier, and an even\ngrander main staircase. An ominous old wooden clock sits to the left,\nand its swinging pendulum sounds like the heartbeat of this manor...\ntick...tick...tick...",
                -2, -1, 0, 2));
        map.add(new Room("Sitting Room", "A large velvet couch sits to your left with a love seat to match. Mad Marty would have entertained guests here if he hadn't been a recluse for the last 30 years.",
                -1, -1, 1, 3));
        map.add(new Room("Art Gallery", "",
                4, -1, 2, -1));
        map.add(new Room("Grand Hall", "",
                5, 3, 6, -1));
        map.add(new Room("Library", "",
                -1, -4, -1, -1));   // when passage is unlocked, set n: 10
        map.add(new Room("Dining Hall", "",
                -1, -1, 7, 4));
        map.add(new Room("Kitchen", "",
                9, 8, 24, 6));
        map.add(new Room("Pantry", "",
                7, -1, -1, -1));
        map.add(new Room("Garden", "",
                10, 7, -1,-1));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));
        map.add(new Room("", "",
                0,0,0,0));





        map.get(1).setPhrase("Back in the foyer. Man, that clock gives me the creeps...");


        enterRoom(1);
        enterRoom(-2);
    }

    public static void enterRoom(int roomIndex) {
        if (roomIndex == -1) {
            System.out.println("You can't go that way!");
            return;
        } else if (roomIndex == -2) {
            roomIndex = 11;
            System.out.println("You're walking up the Grand Staircase.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } else if (roomIndex == -3) {
            roomIndex = 1;
            System.out.println("You're walking down the Grand Staircase.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        Room room = map.get(roomIndex);
        player.setCurrentRoom(room);

        System.out.println("You're in the " + room.getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println(room.getDescription());
    }
}
