package ch23;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("태박산맥1","조정례"));
        library.add(new Book("태박산맥2","조정례"));
        library.add(new Book("태박산맥3","조정례"));
        library.add(new Book("태박산맥4","조정례"));
        library.add(new Book("태박산맥5","조정례"));

        for(int i=0; i<library.size();i++){
            library.get(i).showInfo();
        }
    }






}
