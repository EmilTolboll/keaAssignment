public class Cat extends Tamagotchi {
    public Cat(String name,String mood, int age, int energy,int strength,int speed){
        super(name,mood,age,energy,strength,speed);
    }

    @Override
    public void feed() {
        System.out.println("Wow I gained 3 in energy");
        this.energy += 3;
    }

    public void animalSound(){
        System.out.println("miauw");
    }
}
