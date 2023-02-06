package lesson1;

public class Dog {
    public int weightInPounds;

    public Dog(int startingWeight) {
        weightInPounds = startingWeight;
    }

    // Non-static method, a.k.a. Instance Method.
    //Idea: If the method is going to be invoked by an instance of the class, then it should be non-static.
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }

    //  classes may have a mix of static and non-static methods
    public static Dog maxDog(Dog d1, Dog d2) {
        try {
            int weight = d1.weightInPounds;
        } catch (NullPointerException e) {
            System.out.println("d1 is empty so d1.weightInPounds returns null");
            throw new NullPointerException();
        }
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }
}

