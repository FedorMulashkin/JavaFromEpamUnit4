package task.newyeargift;

import java.util.Comparator;

public class Candy implements Comparable<Candy> {
    private CandyType candyType;
    private int sugarPercent;
    private int weight;

    public CandyType getCandyType() {
        return candyType;
    }

    public void setName(CandyType name) {
        this.candyType = name;
    }

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

    public Candy(CandyType candyType, int sugarPercent, int weight) {
        this.candyType = candyType;
        this.sugarPercent = sugarPercent;
        this.weight = weight;
    }

    public Candy() {
    }

    public boolean findBySugarPercent(int lowerBound, int upperBound) {
        return sugarPercent >= lowerBound && sugarPercent <= upperBound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candy candy = (Candy) o;

        if (sugarPercent != candy.sugarPercent) return false;
        if (weight != candy.weight) return false;
        return candyType.equals(candy.getCandyType());
    }

    @Override
    public int hashCode() {
        int result = candyType.hashCode();
        result = 31 * result + sugarPercent;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "candyType='" + candyType + '\'' +
                ", sugarPercent=" + sugarPercent +
                ", weight=" + weight +
                "}\n";
    }

    @Override
    public int compareTo(Candy o) {
        int result = Integer.compare(this.weight, o.getWeight());
        if (result == 0) {
            result = Integer.compare(this.sugarPercent, o.getSugarPercent());
        }
        return result;
    }

    public class WeightComparator implements Comparator<Candy> {
        @Override
        public int compare(Candy o1, Candy o2) {
            return Integer.compare(o1.getWeight(), o2.getWeight());
        }
    }

    public class SugarPercentComparator implements Comparator<Candy> {
        @Override
        public int compare(Candy o1, Candy o2) {
            return Integer.compare(o1.getSugarPercent(), o2.getSugarPercent());
        }
    }

}
