package weapon;

public class RPG extends Weapon {
    private String name = "РПГ";
    @Override
    public void shot() {
        System.out.println("БУУМ");
    }

    public String getName() {
        return name;
    }
}