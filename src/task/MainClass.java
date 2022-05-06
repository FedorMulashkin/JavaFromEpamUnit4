package task;

import task.newyeargift.Candies;
import task.newyeargift.Candy;
import task.newyeargift.CandyBox;
import task.newyeargift.CandyType;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        CandyBox candyBox = new CandyBox();
        Candies candies = new Candies();
        while(candyBox.isNotFull()){
            candyBox.putCandyInBox(candies.getRandomCandy());
        }
        System.out.println(candyBox);
        System.out.println(candyBox.getCandyCount());
        System.out.println(candyBox.getWeight());
    }
}
