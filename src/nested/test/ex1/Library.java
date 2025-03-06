package nested.test.ex1;

public class Library {
    private int size;
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
        this.size = 0;
    }

    public void addBook(String bookName, String author) {

        //검증 로직 먼저 처리
        if(size >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        //정상 로직 처리
        books[size++] = new Book(bookName, author);

//        if(size < books.length) {
//            books[size++] = new Book(bookName, author);
//        }else{
//            System.out.println("도서관 저장 공간이 부족합니다.");
//        }

    }

    public void showBooks() {
        System.out.println("==책 목록 출력==");
        for(int i = 0; i < size; i++) {
            System.out.println("도서 제목: " + books[i].bookName  + ", 저자: " + books[i].author);
        }
    }

    private static class Book {
        private String bookName;
        private String author;

        public Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }
    }

}
