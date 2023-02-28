package gameobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room extends Thing {
    private int n, s, e, w;
    private Map<String, String> transitions;
    private List<Thing> contents;
    private int counter;
    private String phrase;

    public Room(String name, String description, int n, int s, int e, int w) {
        super(name, description);
        this.n = n;
        this.s = s;
        this.e = e;
        this.w = w;
        this.contents = new ArrayList<>();
        transitions = new HashMap<>();
        this.counter = 0;
        this.phrase = "";
    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        counter++;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getN() {
        return n;
    }

    public int getS() {
        return s;
    }

    public int getE() {
        return e;
    }

    public int getW() {
        return w;
    }

    public List<Thing> getContents() {
        return contents;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setContents(List<Thing> contents) {
        this.contents = contents;
    }

    public void addObject(Thing item){
        contents.add(item);
    }

    public void dropObject(Thing item){
        contents.remove(item);
    }

    public String getTransition(String direction) {
        String transition = transitions.get(direction);
        if (transition == null) return "";
        else return transition;
    }

    public void addTransition(String direction, String text) {
        transitions.put(direction, text);
    }


}
