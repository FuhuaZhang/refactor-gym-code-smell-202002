package cc.xpbootcamp.code_smell_recognise.$22;

public class License {
    private Motorist motorist;
    private int points = 0;

    public void setMotorist(Motorist motorist) {
        this.motorist = motorist;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints (int points) {
        this.points += points;
    }

    public String getSummary() {
        return motorist.getTitle() + " " + motorist.getFirstName()
                + " " + motorist.getFirstName() + ", " + Integer.toString(getPoints());
    }
}
