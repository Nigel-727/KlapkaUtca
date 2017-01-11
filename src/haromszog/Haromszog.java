package haromszog;

import java.util.Arrays;

public class Haromszog 
  /*extends Object*/ 
  implements Comparable<Haromszog> { //szakértő
  
  private int a, b, c;

  public Haromszog(int a, int b, int c)
      throws IllegalArgumentException { //programozó jelzése a programozónak (opcionális)
      //a, b, c megegyező mértékegységű
    if (a<=0)
      throw new IllegalArgumentException("Hiba: a="+a+"<=0");
    if (b<=0)
      throw new IllegalArgumentException("Hiba: b="+b+"<=0");
    if (c<=0)
      throw new IllegalArgumentException("Hiba: c="+c+"<=0");
    if (!megszerkeszthető(a, b, c))
      throw new IllegalArgumentException("Hiba: nincs háromszög");
    this.a = a;
    this.b = b;
    this.c = c;
  }

  //@Override //ez NEM override!
  public boolean equals(Haromszog h) {
    if (null==h) //:)
      return false; 
/*    
    //#1
    return (this.kerület()==h.kerület() //ez a praktikus sorrend
            && this.terület()==h.terület()); 
*/
    //#2
/*    
    int[] h1Tömb = {a, b, c}, //#ilovejava
            h2Tömb = {h.getA(), h.getB(), h.getC()}; //:)
    Arrays.sort(h1Tömb); 
    Arrays.sort(h2Tömb);
//    int db = 0;
//    for (int i = 0; i < h1Tömb.length; i++) 
//      if (h1Tömb[i]==h2Tömb[i])
//        db++;
    int i = 0;
    while (i<h1Tömb.length && h1Tömb[i]==h2Tömb[i])
      i++;
    return i==h1Tömb.length;
//    return db==h1Tömb.length;
*/    
    //#3
    return a+b+c == h.a+h.b+h.c 
            && a*b*c == h.a*h.b*h.c;
  } //equals(Haromszog)

  /*  @Override
  public boolean equals(Object o) {
    if (o instanceof Haromszog)
      return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    return false;
  }*/

  private static boolean megszerkeszthető(int a, int b, int c) {
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return (a+b>c && a+c>b && b+c>a);
  }
  public int getA() {
    return a;
  }
  public int getB() {
    return b;
  }
  public int getC() {
    return c;
  }
  public int kerület() {
    return a+b+c;
  }
  public double terület() {
    double s=(kerület()/2.0);
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
//  public int compareTo(Haromszog h) {  //Comparable interfészből
//    return 0; //TODO
//  }
  //interfészben nincs végrehajtható kód; csak public/static/final van

  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }

  public void setC(int c) {
    this.c = c;
  }

  @Override
  public String toString() {
    return "Háromszög{a="
            +this.a+", b="
            +getB()+", c="
            +c+", K= "
            +kerület()+", T= "
            +terület()+"}";
//    return super.toString(); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public int compareTo(Haromszog h) {
    double t1 = terület(), t2 = h.terület();
    return t1<t2 ? -1 : t1==t2 ? 0 : +1;
//    return new Double(t1).compareTo(t2);
//    return new Integer(3).compareTo(4);
  }
}