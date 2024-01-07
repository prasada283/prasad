class Author {
    String authorName;
    int age;
    String place;

    Author(String name, int age, String place) {
        this.authorName = name;
        this.age = age;
        this.place = place;
    }
}

class Book {
    String name;
    int price;
    Author author;

    Book(String n, int p, Author author) {
        this.name = n;
        this.price = p;
        this.author = author;
    }
}

class Main {
    public static void main(String args[]) {
        Author author = new Author("Prasad", 99, "India");
        Book b = new Book("Java for Beginners", 900, author);

        System.out.println("Book Name: " + b.name);
        System.out.println("Book Price: " + b.price);
        System.out.println("~~~~~Author Details~~~~~~");
        System.out.println("Author Name: " + b.author.authorName);
        System.out.println("Author Age: " + b.author.age);
        System.out.println("Author Place: " + b.author.place);
    }
}