package osztalyzat;
//20161222Th
public interface AlapAdat { //interfész NEM tartalmazhat végrehajtható kódot!
  String[] VEZETÉKNÉVTÖMB = {
    "Szabó", "Kovácsi", "Kis", "Nagy", "Kiss", "Friedel", "Kis-Nagy"};
  String[] KERESZTNÉVTÖMB = {
    "Attila", "Balázs", "Béla", "Sándor", "Ferenc", "Lajos", "Borisz", "Hedvig", "Éva"};
  String[] TANTÁRGYTÖMB = {
    "matematika", "informatika", "közgazdaságtan", "fizika", "programozás"};
  int JEGYMIN = 1, JEGYMAX = 5;
  //
  String getNév();
  String getTantárgy();
  int getJegy();
  
  
}//interface
