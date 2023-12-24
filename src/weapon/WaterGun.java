package weapon;

public class WaterGun extends Weapon {
    private String name = "Водяной пистолет";
    @Override
    public void shot() {
        System.out.println("шшш-пшик");
    }

    public String getName() {
        return name;
    }
}