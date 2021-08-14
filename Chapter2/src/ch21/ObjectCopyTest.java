package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book [] library = new Book[5];
        Book [] copylib = new Book[5];

        library [0] = new Book("태백산맥1","조정례");
        library [1] = new Book("태백산맥2","조정례");
        library [2] = new Book("태백산맥3","조정례");
        library [3] = new Book("태백산맥4","조정례");
        library [4] = new Book("태백산맥5","조정례");

        System.arraycopy(library,0,copylib,0,5);
        //주소가 똑같다 == 얕은 복사 ==> 둘 중 하나를 수정하면 둘다 수정됨
        library[0].setAuthor("태희");
        System.out.println("==library==");
        for(Book book : library){
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("==copy library==");
        for(Book book : copylib){
            System.out.println(book);
            book.showInfo();
        }
        //같이 바뀜
        System.out.println(library[0].getAuthor()+copylib[0].getAuthor());

        //깊은 복사
        copylib[0] = new Book();
        copylib[1] = new Book();
        copylib[2] = new Book();
        copylib[3] = new Book();
        copylib[4] = new Book();
        for(int i=0; i<copylib.length; i++){
            copylib[i].setAuthor(library[i].getAuthor());
            copylib[i].setTitle(library[i].getTitle());
        }
        library[2].setAuthor("오잉");
        library[2].setTitle("집에가고싶다.");
        System.out.println("깊은 복사");
        System.out.println("==library==");
        for(Book book : library){
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("==copy library==");
        for(Book book : copylib){
            System.out.println(book);
            book.showInfo();
        }
    }
}
