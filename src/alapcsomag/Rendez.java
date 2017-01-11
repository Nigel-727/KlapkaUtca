package alapcsomag; //20161210Sa

public class Rendez {

  public static void main(String[] args) {
    char[] betűTömb = new char[100];
    System.out.println("A tömbelemek eredeti sorrendje:");
    for (int i = 0; i < betűTömb.length; i++) {
      betűTömb[i]=
              (char)(
//                150-i //csökkenő
//                150-'a' //állandó
//                'a'+i //növekvő
                Math.random()*('z'-'a'+1) + 'a'  
              );      
      System.out.print(betűTömb[i]);
    }
    System.out.println();
    //
    int ciklusSzám=0, csereSzám=0;
    for (int i = 0; i < betűTömb.length-1; i++) {
      for (int j = i+1; j < betűTömb.length; j++) {
        ciklusSzám++;
        if (betűTömb[i]>betűTömb[j]) { //növekvő sorrend
//        if (betűTömb[i]<betűTömb[j]) { //csökkenő
          csereSzám++; //kb a cikluszám 1/5-e
          char csere=betűTömb[i];
          betűTömb[i]=betűTömb[j];
          betűTömb[j]=csere;
        }
      }
    }
    System.out.println("ciklusszám: "+ciklusSzám);
    System.out.println("csereszám: "+csereSzám);
    //
    System.out.println("A tömbelemek rendezett sorrendje:");
    for (int i = 0; i < betűTömb.length; i++) {
      System.out.print(betűTömb[i]);
    }
    System.out.println();
    
  }
}