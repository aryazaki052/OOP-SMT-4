package UAS.Nomor2;

public class Assassin extends Hero {
  public int agility = 30; 
  public double damage;

  @Override
  public void calculateDamage() {
      damage = 10.0 * agility;
      System.out.println("Assassin damage: " + damage);
  }

  @Override
  public void heal() {
      vitality += 10; 
      System.out.println("Heal Assasins 10. Vitality saat ini: " + vitality);
  }
}