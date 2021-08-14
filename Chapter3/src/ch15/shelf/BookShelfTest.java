package ch15.shelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백산맥1");
        bookQueue.enQueue("태백산맥2");
        bookQueue.enQueue("태백산맥3");
        bookQueue.enQueue("태백산맥4");
        bookQueue.enQueue("태백산맥5");

        for (int i =0; i<5; i++){
            System.out.println(bookQueue.getSize());
            System.out.println(bookQueue.deQueue());
        }


    }
}
