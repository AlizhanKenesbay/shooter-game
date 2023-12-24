package weapon;

public class AssaultRifle extends Weapon {
     String name = "Автомат";
    @Override
    public void shot() {
        System.out.println("тра-та-та-та-та");
    }

    public String getName() {
        return name;
    }
}