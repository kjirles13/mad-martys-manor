package gameobjects;

public class Room extends Thing {
    private int n, s, e, w;

    public Room(String name, String description, int n, int s, int e, int w) {
        super(name, description);
        this.n = n;
        this.s = s;
        this.e = e;
        this.w = w;
    }
}
