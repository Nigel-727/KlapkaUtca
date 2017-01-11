package osztalyzat;
//20161222Th
public class Eredmeny implements AlapAdat { //POJO (=szakértő)
  private String név=null, //null: megkülönböztetni h vmi 1. vagy többedik
          tantárgy=null; //jelenti h fel van mentve a tárgyból
  private int jegy=JEGYMIN-1, azonosító;
  private static int példányszámláló = 0;
  
  public Eredmeny() {
    azonosító = ++példányszámláló; // vagy: ++Eredmeny.példányszámláló; singleton lett belőle
    név = getNév();
    tantárgy = getTantárgy();
    jegy = getJegy();
  }

  @Override
  public String toString() {
    return "Eredmény{"
//            +azonosító
            +" név: "+név
            +" tantárgy: "+tantárgy
            +" jegy: "+jegy
            +" }"
            ;
//    return super.toString(); //To change body of generated methods, choose Tools | Templates.
  }
  
  @Override
  public String getNév() {
    if (név!=null) //MUSZÁJ hogy csak 1x, a legelső alkalommal állítsuk be a nevét
      return név;
    String vezetékNév = VEZETÉKNÉVTÖMB[(int)(Math.random()*VEZETÉKNÉVTÖMB.length)];
    String keresztNév = KERESZTNÉVTÖMB[(int)(Math.random()*KERESZTNÉVTÖMB.length)];
    return vezetékNév + " " + keresztNév;
  }
  
  @Override
  public String getTantárgy() {
    if (tantárgy!=null)
      return tantárgy;
    return TANTÁRGYTÖMB[(int)(Math.random()*TANTÁRGYTÖMB.length)];
  }

  @Override
  public int getJegy() {
    if (JEGYMIN<=jegy && jegy<=JEGYMAX)
      return jegy;
    return (int)(Math.random()*(JEGYMAX-JEGYMIN+1)+JEGYMIN);
  }

} //class AlapAdat
