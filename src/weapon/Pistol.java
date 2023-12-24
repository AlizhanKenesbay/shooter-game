package weapon;

public class Pistol extends Weapon {
    private String name = "Пистолет";
    @Override
    public void shot() {
        System.out.println("бах-бах");
    }

    public String getName() {
        return name;
    }
}