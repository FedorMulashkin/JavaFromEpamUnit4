package task.newyeargift;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Candies {
    private final Candy birdMilk = new Candy(CandyType.BIRDMILK, 5, 15);
    private final Candy grillage = new Candy(CandyType.GRILLAGE, 4, 20);
    private final Candy chocolate = new Candy(CandyType.CHOCOLATE, 7, 30);
    private final Candy lollipop = new Candy(CandyType.LOLLIPOP, 10, 10);
    private final Candy caramel = new Candy(CandyType.CARAMEL, 20, 10);
    private final Candy[] candyArr = {birdMilk, grillage, chocolate, lollipop, caramel};

    public Candy getRandomCandy(){
        Random random = new Random();
        int ind = random.nextInt(0, 5);
        return candyArr[ind];
    }
}
