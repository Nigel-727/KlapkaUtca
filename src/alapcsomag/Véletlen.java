// Alkalom03_nov19Sz
package alapcsomag;

public class Véletlen {

  public static void main(String[] args) {
//    double v = Math.random();
//    System.out.println(v); //[0..1)
//    System.out.println(v*10); //[0..10)
//    System.out.println(v*90); //[0..90)
//    System.out.println(v*90 + 1); //[1..91)
//    System.out.println((int)(v*90+1)); //[1..90] //TODO: v*(B-A+1) + A
//      int a = 1, b = 90; //peremfeltétel: a<=b
//      int v = (int)(Math.random()*(b-a+1)+a);
//      System.out.println(v);
//      int a = 1, b = 6; //kockadobás
//      int v = (int)(Math.random()*(b-a+1)+a);
//      int a = 10, b = 99; //kétjegyű szám
//      int v = (int)(Math.random()*(b-a+1)+a);
//      int a = 32, b = 127; //ascii
//      int v = (int)(Math.random()*(b-a+1)+a);
//      System.out.println((char)v);

//      kétjegyű páros
//      int v = (int)(Math.random()*45)*2+10;
//      System.out.println(v);
    //kétjegyű páros, másképpen
//    int v = (int) (Math.random() * (49 - 5 + 1) + 5) * 2;
//    System.out.println(v);
  //kétjegyű plan
    int v = (int) (Math.random() * 45) * 2 + 11;
    System.out.println(v);
    //alső és felső határ KÖZÖTT véletlen PÁROS számot generálni
    int a=10, b=30; //a<=b
    System.out.println(a+" és "+b+" közötti véletlen páros szám: ");
    int szám=(int)(Math.random()*((b-a+1)/2)) * 2 + a + a%2; //TODO: házi feladat
    System.out.println(szám);
    
  }
}
