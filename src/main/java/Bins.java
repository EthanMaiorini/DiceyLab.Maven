
public class Bins {
     public int start;
     public int stop;
     private int[] bin;

     public Bins(int start, int stop){
          this.bin = new int[stop-start];
          this.start = start;
          this.stop = stop;
     }

     public Integer getBin(int binNumber){
         return this.bin[binNumber-this.start];
     }



     public void incrementBin(int binNumber){
         this.bin[binNumber-this.start]++;
     }
}
