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
        for(int x=1;x<=Tosses;x++) {
            bin.incrementBin(dice.tossandSum());
        }
}
        public void printresults() {
            //print results from the bin
            int sum =0;
            double avg = 0.0;
            int diceCount = 0;
            System.out.println("***\n");
            System.out.println(" Simulation of "+this.NumDice+" dice tossed for "+this.Tosses+" times.\n");
            System.out.println("***\n");
            for (int x = 0; x < bin.stop; x++) {
                diceCount = x+this.NumDice;
                sum = this.bin.getBin(x);
                avg = sum/this.Tosses;
                System.out.println(diceCount+" :%10d"+sum+" :"+ " %.2f"+avg);
            }
        }
}
