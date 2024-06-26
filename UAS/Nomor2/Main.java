package UAS.Nomor2;

public class Main {
  public static void main(String[] args) {
      Warrior warrior = new Warrior();
      warrior.vitality = 100;
      warrior.calculateDamage();
      warrior.heal();

      System.out.println("\n");
      
      Mage mage = new Mage();
      mage.vitality = 80;
      mage.calculateDamage();
      mage.heal();
      
      System.out.println("\n");
      
      Assassin assassin = new Assassin();
      assassin.vitality = 60;
      assassin.calculateDamage();
      assassin.heal();
      }
    
      }