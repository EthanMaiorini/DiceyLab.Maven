package DiceyLab;

import java.util.Random;
import java.util.stream.IntStream;

public class Dice {
    private Integer numberOfdice;

    public Dice(){
         this(1);
    }

    public Dice(int numberOfDie){
        this.numberOfdice = numberOfDie;

    }

    public Integer tossandSum(){
        int sum = 0;
        Random ran = new Random();
        int roll;
        for(int x = 1; x<=this.numberOfdice; x++){
            roll = (ran.nextInt(6)) +1;
            //toss first die put into sum repeat for all dice
                  sum += roll;
        }
        return sum;
    }


}
