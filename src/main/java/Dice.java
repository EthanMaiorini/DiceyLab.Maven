

public class Dice {
    private Integer numberOfdice = 1;

    public Dice(){

    }

    public Dice(int numberOfDie){
        this.numberOfdice = numberOfDie;

    }

    public Integer tossandSum(){
        int sum = 0;
        for(int x=1;x<=this.numberOfdice;x++){
            //toss first die put into sum repeat for all dice
                  sum += (Math.random() %6)+1 ;
        }
        return sum;
    }


}
