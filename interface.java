interface Walkable {
    void walk();
}

interface Runnable {
    void run();
}

class Human implements Walkable, Runnable {
    public void walk() {
        System.out.println("Human is walking.");
    }

    public void run() {
        System.out.println("Human is running.");
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Human human = new Human();
//         human.walk();
//         human.run();
//     }
// }

interface A {
    void display();
}

interface B {
    void display();
}

class Demo implements A, B {
    public void display() {
        System.out.println("Display method from Demo class.");
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Demo demo = new Demo();
//         demo.display();
//     }
// }
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}



