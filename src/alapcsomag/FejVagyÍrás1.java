// Alkalom06_nov27V
package alapcsomag;

public class FejVagyÍrás1 {
  public static void main(String[] args) {
    final int N = 10000;
    System.out.print("Pénzérme "+N+" db feldobásából ");
    int fejDb=0;
    for(int db=1; db<=N; db++) {
//    if((int)(Math.random()*2)==1) // 1 -> fej
      if((Math.random()<0.5)) // [0, 0.5] -> fej
        fejDb++;
    }  
    System.out.println(fejDb+" db fej és "+
      (N-fejDb)+" írás volt.");
  }
}