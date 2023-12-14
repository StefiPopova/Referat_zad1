public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Referat referat = new Referat();
        referat.setTheme("Liberty");
        referat.setPageNumber(235);
        Author author = new Author();
        author.setName("Jack Jones ");
        referat.setAuthor(author);

        Referat referat1 = (Referat) referat.clone();

        referat1.getAuthor().setName("Matilda John");
        referat1.submit();

        Referat referat2 = (Referat) referat.clone();
        referat2.getAuthor().setName("Alex Miler");
        referat2.submit();

        Referat referat3 = (Referat) referat.clone();
        referat3.getAuthor().setName("Silvia Mac");
        referat3.submit();

        System.out.println(referat);
        System.out.println(referat1);
        System.out.println(referat2);
        System.out.println(referat3);
    }
}
