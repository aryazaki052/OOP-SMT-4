package UAS.Nomor2;
public abstract class Hero {
  public int vitality;

  public void heal() {
      vitality += 10;
      System.out.println("Hero healed by 10. Current vitality: " + vitality);
  }

  public abstract void calculateDamage();                
}
