package gameobjects;

public class Creature extends Thing{
    private String responseOne;
    private String responseTwo;
    private String responseThree;
    private String responseFour;
    private String responseFive;

    public Creature(String name, String description) {
        super(name, description);
    }

    public String getResponseOne() {
        return responseOne;
    }

    public void setResponseOne(String responseOne) {
        this.responseOne = responseOne;
    }

    public String getResponseTwo() {
        return responseTwo;
    }

    public void setResponseTwo(String responseTwo) {
        this.responseTwo = responseTwo;
    }

    public String getResponseThree() {
        return responseThree;
    }

    public void setResponseThree(String responseThree) {
        this.responseThree = responseThree;
    }

    public String getResponseFour() {
        return responseFour;
    }

    public void setResponseFour(String responseFour) {
        this.responseFour = responseFour;
    }

    public String getResponseFive() {
        return responseFive;
    }

    public void setResponseFive(String responseFive) {
        this.responseFive = responseFive;
    }

}
