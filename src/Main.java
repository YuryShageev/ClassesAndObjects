public class Main {
    public static void main(String[] args) {
        Book oldMansWar = new Book();
        oldMansWar.bookName = "Old Man's War";
        oldMansWar.publicationYear = 2005;
        System.out.println("oldMansWar.bookName = " + oldMansWar.bookName);
        System.out.println("oldMansWar.publicationYear = " + oldMansWar.publicationYear);
        Author john = new Author();
        john.firstName = "John";
        john.secondName = "Scalzi";
        System.out.println("john.firstName = " + john.firstName);
        System.out.println("john.secondName = " + john.secondName);
    }
}