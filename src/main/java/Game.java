import gameobjects.Room;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static void main(String[] args) {
        List<Room> map = new ArrayList<>();

        map.add(new Room("Office",
                "This is a dusty, dank office littered with papers. A large ornate wooden desk sits in the middle of the room where Mad Marty used to plan out his twisted creations. Let's see what's on his desk...",
                -1, -1, -1, 1));
        map.add(new Room("Foyer",
                "A large front hall with high ceilings, a grand chandelier, and an even grander main staircase. An ominous old wooden clock sits to the left, and it's swinging pendulum sounds like the heartbeat of this manor: tick...tick...tick...",
                2, -1, 0, 3));
        map.add(new Room("Grand Staircase",
                "",
                -1, -1, -1, -1));







        map.get(1).setPhrase("Back in the foyer. Man, that clock gives me the creeps...");


    }
}
