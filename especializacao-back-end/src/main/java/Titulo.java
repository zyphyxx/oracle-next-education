

public class Titulo {


    String title;

    Long year;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
