package classandinterface;

public class Book implements Readable {
    private final String name; // Biến name được đặt private để tuân theo encapsulation

    public Book(String name) {
        this.name = name;
    }

//    @Override
//    public void read() {
//        System.out.println("Reading a book: " + name);
//    }

    public static void main(String[] args) {
        // Variable name in camelCase
        Book booker = new Book("John Doe");
        booker.read();
    }
}
