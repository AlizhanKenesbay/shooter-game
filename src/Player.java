import weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
            new Pistol(),
            new AssaultRifle(),
            new RPG(),
            new Slingshot(),
            new WaterGun()
        };
    }

    public void printWeaponSlots() {
        int i = 0;
        for (Weapon weapon : weaponSlots) {
            System.out.println(i + ". " + weapon.getName());
            i++;
        }
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > weaponSlots.length - 1) {
            System.out.println("Неправильное значение слота");
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}