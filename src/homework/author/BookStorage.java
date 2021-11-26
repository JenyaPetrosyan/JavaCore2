package homework.Author;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
        return null;
    }

    public void serchBooksByAutor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                System.out.println(books[i]);


            }
        }
    }

    public int countbooksByAuthor(String keyword) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(keyword)) {
                count++;
            }
        }
        return count;
    }

    public void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];

        }
        size--;
    }

    public void deleteBYAuthor(String email) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                delete(i);


            }
        }
    }
      public void deleteAuthur(String email) {
        for (int i =1; i < size; i++) {
           if (books[i].getAuthor().getEmail().equals(email)){
                 delete(i);
            }
       }
      }
    public void deleteBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                delete(i);
                System.out.println("Book has been deleted");
            }
        }

    }

}





