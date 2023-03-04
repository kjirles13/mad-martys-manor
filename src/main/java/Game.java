import gameobjects.Player;
import gameobjects.Room;
import gameobjects.Thing;
import gameobjects.utility.StringParser;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    static List<Room> map = new ArrayList<>();
    static Player player = new Player("Greg", "");


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        map.add(new Room("Office",
                "This is a dusty, dank office littered with papers.~A large ornate wooden desk sits in the" +
                        " middle of the room where Mad Marty used to plan out his twisted creations.~Let's see what's on his desk...",
                -1, -1, -1, 1));
        map.add(new Room("Foyer",
                "A large front hall with high ceilings, a grand chandelier, and an even grander main staircase." +
                        "~An ominous old wooden clock sits to the left, and it's swinging pendulum sounds like the heartbeat of " +
                        "this manor: ~tick...~tick...~tick...",
                -2, -1, 0, 2));
        map.add(new Room("Sitting Room", "A large velvet couch sits to your left with a love seat to match." +
                "~Mad Marty would have entertained guests here if he hadn't been a recluse for the last 30 years.",
                -1, -1, 1, 3));
        map.add(new Room("Art Gallery", "The walls are covered in family portraits, bizzare sketches, and " +
                "mad paintings.~Several pedestals hold eerily realistic mutated scultpures.~The room has a strong feeling " +
                "of dissonance, like the sound of a piano chord made of random keys.",
                4, -1, 2, -1));
        map.add(new Room("Grand Hall", "A huge, grandiose room on the main floor.~Made for grand parties and " +
                "entertaining, though it probably hasn't seen another soul in years.",
                5, 3, 6, -1));
        map.add(new Room("Library", "It's a large, open room, and you're struck immediately by a musty smell." +
                "~It must be the hundreds of old books packed into the towering cherry wood bookshelves that line the room." +
                "~The only door you can see in the room is the one you just came through.",
                -1, -4, -1, -1));   // when passage is unlocked, set n: 10
        map.add(new Room("Dining Hall", "A long wooden table sits in front of a large stone fireplace." +
                "~A dusty crystal chandelier hangs precariously over the seats below.~A large vase of fresh flowers sits " +
                "in the middle of the table.~Fresh flowers? There must be a garden somewhere around here...",
                -1, -1, 7, 4));
        map.add(new Room("Kitchen", "A massive island sits in the center of the room coated in a thick layer" +
                " of dust.~Who knows what's behind these cabinets...",
                9, 8, 24, 6));
        map.add(new Room("Pantry", "Nice! Food.~You better grab some of this in case you're in here for a long time...",
                7, -1, -1, -1));
        map.add(new Room("Garden", "The garden is a fragrant paradise, filled with rows of flowers, an herb " +
                "garden, and a winding path lined with ferns.~A peaceful pond filled with koi is at the center.~This garden " +
                "is so unlike the dark and foreboding Manor.",
                10, 7, -1,-1));
        map.add(new Room("Aviary", "Hmm, the door is locked, and it seems like it has been for ages.~There " +
                "must be another way in...",
                -1, 9, -1, -1));   // when passage is unlocked, set w: 5
        map.add(new Room("Upstairs Hallway", "The narrow walkway stretches out in front of you.~The walls are " +
                "lined with old metal scones that flicker and cast shadows against the walls.~The grand staircase is to your " +
                "left and there are more rooms down the hall", //11
                17, -3, 24, 18));
        map.add(new Room("Basement Hallway", "The air is cool and musty, and the sound of your footsteps echoes" +
                " off the stone walls.~Several doors line the long, cement hallway.~You can't see beyond them, but you sense " +
                "an air of mystery and danger lurking behind each one.", //12
                -1, 13, 24, 14));
        map.add(new Room("Cellar", "The room is dank and pitch black--you can't see a thing.~Maybe you can find " +
                "a light source somewhere...\n",
                12, -1, -1, -1));
        map.add(new Room("Basement Hallway", "You're further down the hallway and there are more doors, left and ahead.",
                -1, 15, 12, 16));
        map.add(new Room("Marty's Parts Room", "This room is full of bins and boxes and rickety shelves.~There " +
                "are layers of dust and cobwebs on everything.~You examine a box and find it full of false eyes and teeth." +
                "~Another box has rubber tubes, clamps, and various kinds of wire.~This must have been where Mad Marty kept " +
                "his spare toy parts.~On the west side of the room is a door marked \"LAB\" and on the east side of the room is a door to the hallway.",
                16, -1, 14, -1));
        map.add(new Room("Laboratory", "This is it: the room where all his horrid experiments took place.~The " +
                "stains all over the large stainless steal table in the middle of the room tells a bleak story.~Dismembered " +
                "parts of toys and animals are all over the place, rivaling the storage room.~The walls are lined with pointy, " +
                "evil looking utensils and tools.~You didn't even notice that group of parts hanging on the wall is moving...." +
                "~Maybe it can tell you something about this place.",
                -1, 15, 14, -1));   // when passage is unlocked, set n: 21
        map.add(new Room("Observatory", "Above your head is a dome of clear glass, making it seem like the ceiling" +
                " is glittering with tiny shimmers of light.~An enormous, old telescope sits pointed towards the night sky, almost " +
                "like it was delicately placed there.~Does this thing work?",
                -1, 11, -1, -1));
        map.add(new Room("Upstairs Hallway", "You're further down the hallway and there are more doors, left, right, and ahead.",
                20, 19, 11, 21));
        map.add(new Room("Daughter's Room", "A dollhouse and stuffed animals sit on a shelf, and a small desk with " +
                "art supplies are visible in the corner.~A small bed is made up, with a frilly pink comforter. ~This room looks " +
                "like it hasn't changed at all since his daughter died, like a memory stuck in time.",
                18, -1, -1, -1));
        map.add(new Room("Guest Room", "Looks like he didn't use this for much but for some storage.~There's a large " +
                "bed with a floral quilt, and an ornate chest of drawers.",
                -1, 18, -1, -1));
        map.add(new Room("Mad Marty's Bedroom", "A large bed sits in the middle of room with an ornate bedframe." +
                "~There's table beside the bed with a drawer.~Could there be something of interest in there?",
                -1, 22, 18, -1));  // when passage is unlocked, set n: 16
        map.add(new Room("En Suite Bathroom", "The bathroom is ornate, with gold faucets and dark, beautiful wallpaper " +
                "that is now peeling. It smells faintly of soap.~There is a clawfoot tub, filled with water and strange, eel-like " +
                "creatures swimming lazily around.~You shudder to wonder if Marty bathed in that tub.",
                21, -1, -1, -1));
        map.add(new Room("EXIT", "",
                0,0,0,0));
        map.add(new Room("Kitchen Stairwell", "This is an old creaky stairwell.~There are stairs that lead up and down.",
                11 , 12, -1, -1));

        // Set phrases
        map.get(1).setPhrase("Back in the foyer. Man, that clock gives me the creeps...");
        map.get(10).setPhrase("The aviary is filled with colorful birds, trees, and a small fountain in the center.~There are cages along" +
                " the walls, some empty and some with birds inside.");
        /** I think picking up the flashlight should increment the room order automatically so if you have it before you go to the cellar, it will just pull the phrase */
        map.get(13).setPhrase("The room smells of cold, damp earth.~You swing your flashlight around the room, revealing dirt walls and floor." +
                "~The room appears to be empty, but then you notice the glint of a reflection on the far side.");



        /** Start of Game*/

        print("\nThe infamous Mad Marty has invited you to his manor for a mysterious meeting...~" +
                            "\nPress any key to enter the manor");
        userInput.nextLine();

        enterRoom(1);

        print("Is that a pigeon flying towards you? What the hell is a pigeon doing in here?~" +
                "It looks like he has a tiny scroll attached to his leg.~" +
                "A carrier pigeon? This guy really was insane...~" +
                "You tentatively bend over and remove the scroll from its ankle");

        System.out.println("\nPress any key to read his note");
        userInput.nextLine();

        print("\nWelcome to my manor!~" +
                "I think you'll find it a very interesting place...~" +
                "My office is just over to your right. Please proceed there for our meeting.~" +
                "\t\t\t\t\t\t-MM\n~" +
                "Weird old man...~" +
                "You turn right and make your way over to the large wooden door.");

        System.out.println("\nPress any key to enter the office");
        userInput.nextLine();

        enterRoom(0);

        boolean running = true;

        while (running){
            while(true) {
                inRoomMove();
                String input = userInput.nextLine();

                List<Thing> roomContents;
                boolean validOption = false;

                while (!validOption) {
                    if (input.equals("1")) {
                        roomContents = listRoomObjects();
                        validOption = true;
                    } else if (input.equals("2")) {
                        exitRoom();
                        validOption = true;
                    } else {
                        System.out.print("That was not a valid input. Enter the number of the option >>> ");
                    }
                }

            }
        }
    }


    public static void inRoomMove(){
    System.out.println("\nWhat do you want to do now?\n" +
            " \t1. Look around\n " +
            " \t2. Exit\n");
    }

    //TODO create leaveRoom method
    public static void exitRoom(){

    }

    public static void enterRoom(int roomIndex) {
        if (roomIndex == -1) {
            System.out.println("You can't go that way!");
            return;
        } else if (roomIndex == -2) {
            roomIndex = 11;
            System.out.println("You're walking up the Grand Staircase.");
            delay(1000);
        } else if (roomIndex == -3) {
            roomIndex = 1;
            System.out.println("You're walking down the Grand Staircase.");
            delay(1000);
        }

        Room room = map.get(roomIndex);

        player.setCurrentRoom(room);

        System.out.println(String.format("\nYou're in the %s\n", room.getName()));

        delay(1000);

        /** Get phrase if counter is incremented */
        String description = room.getCounter() == 0 ? room.getDescription() : room.getPhrase();
        print(description);

        /** increment room counter */
        room.incrementCounter();
    }

    public static List<Thing> listRoomObjects(){
        List<Thing> roomContents = player.getCurrentRoom().getContents();
        int i = 1;
        for (Thing object : roomContents) {
            System.out.println(String.format("%d. %s", i, object.getName()));
            i++;
        }
        return roomContents;
    }

    private static void print(String string) {
//        String[] sections = string.split("~");
        String[] sections = StringParser.parse(string,60);
        for (int i = 0; i < sections.length; i++) {
            System.out.println(sections[i]);
            delay(1000);
            /** I think the delay before the menu pops up to let you continue reading the last line is kind of nice! */
            /*if (i+1 < sections.length) {
                delay(1000);
            }*/
        }
    }

    private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
