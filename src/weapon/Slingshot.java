package weapon;

public class Slingshot extends Weapon {
    private String name = "Рогатка";
    @Override
    public void shot() {
        System.out.println("швырь-швырь");
    }

    public String getName() {
        return name;
    }
}