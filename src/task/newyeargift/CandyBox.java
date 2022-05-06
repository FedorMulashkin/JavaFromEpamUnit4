package task.newyeargift;


import java.util.ArrayList;
import java.util.List;

public class CandyBox {
    private final int maxWeight = 1000;
    private int weight = 0;
    private int candyCount = 0;
    private List<Candy> candies = new ArrayList<>();

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public boolean isNotFull() {
        boolean notFull = true;
        if (weight >= maxWeight) {
            notFull = false;
        }
        return notFull;
    }

    public void putCandyInBox(Candy candy) {
        candies.add(candy);
        weight += candy.getWeight();
        candyCount++;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "candies=" + candies +
                '}';
    }
}
