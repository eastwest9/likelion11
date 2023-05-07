class Animal{
    int age;
    String species;
    String name;
    void makeSound(){
        System.out.println("동물은 소리를 낸다");
    }
}
class Cat extends Animal{
    Cat(String n, int a){
        super.age = a;
        super.name = n;
        species = "Cat";
    }
    @Override
    void makeSound() {
        System.out.println("야옹");
    }
}
class Dog extends Animal{
    Dog(String n, int a){
        super.age = a;
        super.name = n;
        species = "Dog";
    }
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}

public class pra4 {
    public static void main(String[] args) {
        Animal cat = new Cat("영희",4);
        cat.makeSound();

        Animal dog = new Dog("철수",2);
        dog.makeSound();

    }
}
