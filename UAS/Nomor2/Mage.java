package UAS.Nomor2;

public class Mage extends Hero {
  public int intelligence = 40; 
  public double damage;

  @Override
  public void calculateDamage() {
      damage = 2.0 * intelligence;
      System.out.println("Mage damage: " + damage);
  }

  @Override
  public void heal() {
      vitality += 15; 
      System.out.println("Heal Mage 15. Vitality saat ini: " + vitality);
  }
}
