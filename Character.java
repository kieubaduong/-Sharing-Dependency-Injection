public class Character {
   private Equipment equipment;
   public Character(Equipment equipment){
       this.equipment = equipment;
   }
   public void ActivateEquipment(){
    equipment.ActivateSkill();
   }
}



                