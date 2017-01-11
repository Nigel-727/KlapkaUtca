// Alkalom05_nov24Cs
package alapcsomag;

import java.util.Random;

public class HelloWorldJavitott {
    
    public static void main(String[] args) {
    Random random = new Random();
    random.setSeed(-229985452);
//    random.setSeed(-229985451);


    String word = "";
    int k;
    while ((k=random.nextInt(27)) != 0) {
        word += ((char)('`' + k));
        System.out.println(k + " --> " +
                ('`' + k) + " --> karakterrel: " + (char)('`' + k));
        //k = random.nextInt(27);      
        }
    System.out.println("Összeillesztve: " + word);
    
    random.setSeed(-147909649);
    word = "";
    k = random.nextInt(27);
    while (k != 0) {
        word += ((char)('`' + k));
        System.out.println(k + " --> " +
                ('`' + k) + " --> karakterrel: " + (char)('`' + k));
        k = random.nextInt(27);      
        }
    System.out.println("Összeillesztve: " + word);
    }
}

