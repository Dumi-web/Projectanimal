public class Main {
    public static void main(String[]args){
    Cat cat = new Cat();
        cat.eat();
        cat.sound();

    Dog dog = new Dog();
        dog.eat();
        dog.sound();

    Home home =new Home();
    Dog dog1 = new Dog();
    Cat cat1 = new Cat();

    home.adoptPet(cat1);
    home.makeAllSounds();
    home.adoptPet(dog1);
    home.makeAllSounds();
}

}
