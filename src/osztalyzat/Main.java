package osztalyzat;
//20161222Th
import java.util.ArrayList;

public class Main {
  
  private static double tantárgyÁtlag(
    ArrayList<Eredmeny> eredményLista, String tantárgyNév) {
    //
    int jegyÖsszeg = 0, tantárgyDb = 0;
    for (int i = 0; i < eredményLista.size(); i++) {
      if (eredményLista.get(i).getTantárgy().equals(tantárgyNév)) {
              jegyÖsszeg += eredményLista.get(i).getJegy();
              tantárgyDb++;
      }
    }
    return 0<tantárgyDb ? 
            (double)jegyÖsszeg / tantárgyDb : 
            0.0;
  }
  
  private static void statTop3KönnyűTantárgy(ArrayList<Eredmeny> eredményLista) {
    //lehetne: a tárgy, amiből a legtöbben teljesítenek az átlaguk felett
    //vagy másképpen:
    TantargyAtlag[] tömb = new TantargyAtlag[AlapAdat.TANTÁRGYTÖMB.length];
    for (int i = 0; i < tömb.length; i++) {
      tömb[i] = new TantargyAtlag(
              AlapAdat.TANTÁRGYTÖMB[i], 
              tantárgyÁtlag(eredményLista, AlapAdat.TANTÁRGYTÖMB[i])
      );
      System.out.println(tömb[i]);
    } //for
  } //class stat...
  
  public static void main(String[] args) {
    ArrayList<Eredmeny> eredményLista = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      eredményLista.add(new Eredmeny()); //tesztválasz: "sehogy nem teszek listába objektumot, csak a referenciáját teszem bele"
    }
    System.out.println("Az eredmények listája:");
//    for (Eredmeny eredmeny : eredményLista) {
//      System.out.println(eredmeny);
//    }
    for (int i = 0; i < 3; i++) {
      System.out.println(eredményLista.get(i));
    }
    System.out.println("...");
    for (int i = eredményLista.size()-3; i < eredményLista.size(); i++) {
      System.out.println(eredményLista.get(i));
    }
    statTop3KönnyűTantárgy(eredményLista);
  }
  
  public static void main2(String[] args) {
    Eredmeny e = new Eredmeny();
    System.out.println(e);
    System.out.println(e.getNév());
    System.out.println(e);
    System.out.println(e.getNév());
  }

  
}
