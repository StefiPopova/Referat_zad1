public class Referat extends Document implements Cloneable  {
    private Author author;
    private String theme;
    private int PageNumber;

    @Override
    public String toString() {
        return "Referat{" +
                "author=" + author +
                ", theme='" + theme + '\'' +
                ", PageNumber=" + PageNumber +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public Referat(Author author, String theme, int pageNumber) {
        this.author = author;
        this.theme = theme;
        PageNumber = pageNumber;
    }

    public Referat() {
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Referat referatClone = (Referat) super.clone();
        referatClone.setAuthor((Author) author.clone());
        return referatClone;
    }
    @Override
    public void submit(){
        System.out.println("The referat has been submitted.");
        boolean isSubmitted = true;
    }
}


