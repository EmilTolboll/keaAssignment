public class Tamagotchi {
    public String name;
    public int age;
    public String mood;
    public int energy;
    public int strength;
    public int speed;

    public Tamagotchi(String name,String mood, int age, int energy, int strength, int speed){
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.mood = mood;
        this.strength = strength;
        this.speed = speed;
    }

    public void play(){
        System.out.println("Ooh no I lost 2 in energy and got 1 year older and gained 2 in speed");
        this.energy -= 2;
        this.age += 1;
        this.speed += 2;
    }
    public void feed(){
        System.out.println("Wow I gained 2 in energy and got stronger");
        this.energy += 2;
        this.strength += 10;
    }

    public void sleep() {
        System.out.println("Wow I gained 10 in energy and now I am happy");
        this.energy += 10;
        this.mood = "Happy";
    }
}
