public class Book {

    String bookName;

    int publicationYear;

    public static Book nameTheBook(String bookName, int publicationYear) {
        Book oldMansWar = new Book();
        oldMansWar.bookName = bookName;
        oldMansWar.publicationYear = publicationYear;
        return oldMansWar;
    }


}
