public class Main {

    public static void main(String[] args) {
        Book oldMansWar = new Book("Old Man's War", 2005);//Здесь использовал конструктор с "this"
        System.out.println("The name of the book = " + oldMansWar.bookName);
        System.out.println("Published = " + oldMansWar.publicationYear);
        oldMansWar.setPublicationYear(2006);// Поставил сеттер здесь
        System.out.println("oldMansWar.publicationYear = " + oldMansWar.publicationYear);
        Author john = new Author("John", " Scalzi");
        System.out.println("Author's Name = " + john.getFirstName() + john.secondName);//Геттер есть здесь


        Book theBoysFromBrazil = new Book("The Boys From Brazil", 1976);
        System.out.println("The name of the book = " + theBoysFromBrazil.bookName);
        System.out.println("Published = " + theBoysFromBrazil.publicationYear);
        Author ira = new Author("Ira", " Levin");
        System.out.println("Author's name = " + ira.getFirstName() + ira.secondName);
    }
}