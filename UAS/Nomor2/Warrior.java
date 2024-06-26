package UAS.Nomor2;

public class Warrior extends Hero {
  public int strength = 50; 
  public double damage;

  @Override
  public void calculateDamage() {
      damage = 0.5 * strength;
      System.out.println("Warrior damage: " + damage);
  }

  @Override
  public void heal() {
      vitality += 20; 
      System.out.println("Heal Warior adalah 20. Vitality saat ini: " + vitality);
  }
}
