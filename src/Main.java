public class Main {

    public static void main(String[] args) {
        Book oldMansWar = new Book("Old Man's War", 2005);
        System.out.println("The name of the book = " + oldMansWar.bookName);
        System.out.println("Published = " + oldMansWar.publicationYear);
        Author john = new Author("John", " Scalzi");
        System.out.println("Author's Name = " + john.firstName + john.secondName);
    }
}