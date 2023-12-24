import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.printf("У игрока %d слотов с оружием,"
                + " введите номер, чтобы выстрелить из выбранного оружия,"
                + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );

        int slot;

        while (true) {
            System.out.println("Введите номер слота с оружем: ");
            player.printWeaponSlots();
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            } else {
                player.shotWithWeapon(slot);
            }
        }
    }
}