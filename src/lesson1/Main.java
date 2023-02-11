package lesson1;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);
        dogs[0].makeNoise();
        dogs[1].makeNoise();

        System.out.print(Dog.maxDog(dogs[0], dogs[1]));

        Dog poppa = new Dog(10);
        poppa.bark();
//        Dog.bark();     // Non-static method 'bark()' cannot be referenced from a static context
        poppa.runFast();
        Dog.runFast();

        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog = new Dog(150);

        Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smallDog;
        manyDogs[1] = hugeDog;
        manyDogs[2] = new Dog(130);

        int i = 0;
        while (i < manyDogs.length) {
            // i == 3, Cannot read field "weightInPounds" because "d1" is null
            Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
            i = i + 1;
        }




    }
}