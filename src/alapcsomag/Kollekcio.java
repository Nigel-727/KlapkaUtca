package alapcsomag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
//20161220Tu gyakorlat
public class Kollekcio { 
  public static void main(String[] args) {
    System.out.println("Ötöslottó-szelvény [ezúttal halmazzal]: ");
//    HashSet<Integer> szelvény = new HashSet<>();
//    TreeSet<Integer> szelvény = new TreeSet<>();
    TreeSet<Integer> szelvény = new TreeSet<>(
        new Comparator<Integer>() {
        @Override
        public int compare(Integer i1, Integer i2) {
          return i2-i1;
        }      
    });
    //"kétsoros lottószelvény"
    while (szelvény.size() < 5) 
      szelvény.add((int)(Math.random()*90+1));
//    Collections.sort(szelvény); //szintaktikai hiba; HashSet-et nem lehet rendezni
    System.out.println(szelvény);
  }
  
  public static void main3(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>(); //alapból 10 elemnek foglal helyet (10-es blokkonként)
    for (int i = 1; i <= 8; i++) {
      lista.add(i);
      lista.add(i);      
    }
//    Collections.sort(lista);
    Collections.shuffle(lista);
/*    
    ArrayList<Integer> lista2 = new ArrayList<>(); //null;
    lista2.addAll(lista);
    //
    System.out.println("lista.get(3): " + lista.get(3));
    lista.set(3, 20); //hanyadik elemet, mire
    System.out.println("lista.get(3): " + lista.get(3));
    
    System.out.println("lista2: " + lista2);
*/
    System.out.println("lista : " + lista);
    Integer[] tömb = new Integer[lista.size()]; //null;
    tömb = lista.toArray(tömb);
    System.out.println(tömb[3]);
  }
          
  public static void main2(String[] args) {
    System.out.print("Ötöslottó-szelvény: ");
    ArrayList<Integer> szelvény = new ArrayList<>(); //<>: gyémánt operátor
//    szelvény.add(5);
//    szelvény.add(44);
    while (szelvény.size()<5) { //String: .length; van ahol: count; itt: .size()
      int tipp = (int)(Math.random()*90+1);
      if (!szelvény.contains(tipp)) //memóriaszivárgó
        szelvény.add(tipp);
    }
    Collections.sort(szelvény);
    //
    System.out.println(
            szelvény+"\n"+
            szelvény.toString() //zárójelpár nélkül
                    .substring(1, szelvény.toString().length()-1)
    );
    Collections.shuffle(szelvény); //összekever
    System.out.println(szelvény);
  }
}

/*
    List //mint egy tömb: index, db-szám, .add(), .get(), .size()
    Set //halmaz (minden eleme különböző: 1 elemet 1x tud tartalmazni, sorrend nélkül)
    Map //külcs<->érték pár hozzárendelések
    //nem foglalkozunk velük (obsolete collections):
    Vector //helyette: ArrayList
    HashSet //rendezetlen halmas
    TreeSet //rendezettt halmaz
*/