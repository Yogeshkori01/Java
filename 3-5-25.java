// public class Laptop {
//     String brand;
//     int ram;
//     double price;

//     public Laptop(String brand, int ram, double price) {
//         this.brand = brand;
//         this.ram = ram;
//         this.price = price;
//     }

//     public void display() {
//         System.out.println("Brand: " + brand);
//         System.out.println("RAM: " + ram + " GB");
//         System.out.println("Price: $" + price);
//     }

//     public static void main(String[] args) {
//         Laptop laptop1 = new Laptop("Dell", 16, 899.99);
//         laptop1.display();
//     }
// }

// public class Calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public int subtract(int a, int b) {
//         return a - b;
//     }

//     public int multiply(int a, int b) {
//         return a * b;
//     }

//     public double divide(int a, int b) {
//         return (double) a / b;
//     }

//     public static void main(String[] args) {
//         Calculator calc = new Calculator();

//         int x = 20;
//         int y = 5;

//         System.out.println("Addition: " + calc.add(x, y));
//         System.out.println("Subtraction: " + calc.subtract(x, y));
//         System.out.println("Multiplication: " + calc.multiply(x, y));
//         System.out.println("Division: " + calc.divide(x, y));
//     }
// }

public class Movie {
    String name;
    double rating;
    int releaseYear;

    public Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Release Year: " + releaseYear);
        System.out.println();
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("your fault", 8.8, 2010);
        Movie m2 = new Movie("squid game", 8.1, 2021);
        Movie m3 = new Movie("kesari", 7.9, 2022);
        Movie m4 = new Movie("Oppenheimer", 9.0, 2023);
        Movie m5 = new Movie("my fault", 8.4, 2019);

        Movie[] movies = {m1, m2, m3, m4, m5};

        System.out.println("Movies released after 2020:\n");

        for (Movie movie : movies) {
            if (movie.releaseYear > 2020) {
                movie.display();
            }
        }
    }
}
