/**
 * di
 */
public class di {

    public static void main(String[] args) {
        Character character1 = new Character(new Sword());
        character1.ActivateEquipment();
        Character character2 = new Character(new Shield());
        character2.ActivateEquipment();

    }
}
