package osztalyzat;

public class TantargyAtlag {
  private String tantárgy;
  private double átlag;
  //

  public TantargyAtlag(String tantárgy, double átlag) {
    this.tantárgy = tantárgy;
    this.átlag = átlag;
  } //tfh. OK

  public String getTantárgy() {
    return tantárgy;
  }

  public double getÁtlag() {
    return átlag;
  }
//TODO (hf) stringformat utasításkupacoknak utánanézni
  @Override
  public String toString() {
    return "Tantárgy{ "
            + "név: " + tantárgy + ", "
            + "átlag: " + extra.Format.left(átlag, 0, 4) 
            + "}"
            ;
  }
  
  
}
