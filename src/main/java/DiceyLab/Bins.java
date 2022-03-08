package DiceyLab;

public class Bins {
     public int start;
     public int stop;
     private int[] bin;

     public Bins(int start, int stop){
          this.bin = new int[stop+1];
          this.start = start;
          this.stop = stop;
          for(int x =0;x<= stop;x++){
               bin[x] = 0;
          }
     }

     public Integer getBin(int binNumber){
         return this.bin[binNumber];
     }



     public void incrementBin(int binNumber){
          this.bin[binNumber] +=1;


     }
}
