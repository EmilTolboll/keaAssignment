public class Dog extends Tamagotchi {
    public Dog(String name,String mood, int age, int energy,int strength,int speed){
        super(name,mood,age,energy,strength,speed);
    }

    @Override
    public void feed() {
        System.out.println("Wow I gained 1 in energy");
        this.energy += 1;
    }

    public void animalSound(){
        System.out.println("vuf");
    }
}