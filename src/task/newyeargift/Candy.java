package task.newyeargift;

public class Candy {
    private int sugarPercent;
    private int weight;

    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Candy(int sugarPercent, int weight) {
        this.sugarPercent = sugarPercent;
        this.weight = weight;
    }

    public Candy() {
    }

    public boolean findBySugarPercent(int lowerBound, int upperBound){
        return sugarPercent >= lowerBound && sugarPercent <= upperBound;
    }
}
