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
}
