package classandinterface;

public interface Readable {
    default void read() {
        System.out.println("Default reading behavior...");
    }
}
