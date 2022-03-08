package DiceyLab;

import DiceyLab.Bins;
import DiceyLab.Dice;

public class Simulation {

private int Tosses;
private int NumDice;
private Bins bin;

   public Simulation(Integer numberOfDies,Integer numberOfTosses){
       this.NumDice = numberOfDies;
       this.Tosses = numberOfTosses;
       }

    public void runSimulation(){
        Dice dice = new Dice(this.NumDice);
        this.bin = new Bins(this.NumDice,(this.NumDice*6));
        for(int x=1;x<=this.Tosses;x++) {
            this.bin.incrementBin(dice.tossandSum());
        }
}

        public String getStars(int number){
       String result ="";
        for(int x=0;x<number;x++){
            result += "*";
        }
        return result;
        }
        public void printResults() {
            //print results from the bin
            int sum =0;
            double avg = 0.0;
            String output;
            System.out.println("***\n");
            System.out.println(" DiceyLab.Simulation of "+this.NumDice+" dice tossed for "+this.Tosses+" times.\n");
            System.out.println("***\n");
            for (int x = this.NumDice; x <= bin.stop; x++) {
                sum = this.bin.getBin(x);
                avg =(double)sum/this.Tosses;
                output = String.format("%3d : %9d    %.2f",x,sum,avg);
                //System.out.println(""+x+" "+sum+" "+avg);
                avg = avg*100;
                output = output.concat(getStars((int)avg));
                System.out.println(output);
            }
        }
}
