package ch01;


class Book{
    private String title;
    private String author;
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    @Override
    public String toString() {
        return title +"," +author;
    }
}
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("데미안"," 헤르만헤세");
        System.out.println(book);

        String srt = new String("test");
        System.out.println(srt);

        //ch01.Book@7a79be86
        //test ==> .toString()이 오버라이딩 됐기 때문에.
        //toString() 메서드를 오버라이딩 해서 자주 사용함.

    }
}
