
abstract class Animal {
    String name;
    int age;

    public abstract void makeNoise();
}


class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Miyav!");
    }
}


class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Hav!");
    }
}


class Lion extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Röhr!");
    }
}
