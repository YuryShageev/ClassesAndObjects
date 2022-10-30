public class Main {

    public static void main(String[] args) {

        Author john = new Author("John", " Scalzi ");
        Book oldMansWar = new Book("Old Man's War ", john, 2005);//Здесь использовал конструктор с "this"
        System.out.println("The name of the book = " + oldMansWar.getBookName() + john.getFirstName() + john.getSecondName() + oldMansWar.getPublicationYear());
        System.out.println("Published = " + oldMansWar.publicationYear);
        oldMansWar.setPublicationYear(2006);// Поставил сеттер здесь
        System.out.println("oldMansWar.publicationYear = " + oldMansWar.publicationYear);


        Book theBoysFromBrazil = new Book("The Boys From Brazil", new Author(" Ira", "Levin "), 1970);

        System.out.println(theBoysFromBrazil.getBookName() + theBoysFromBrazil.getAuthor() + theBoysFromBrazil.getPublicationYear());
    }
}