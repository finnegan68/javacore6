package module3.task3;


public class CollageStudent extends Student{
    private String collegeName;
    private int rating;
    private long id;

    public CollageStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollageStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollageStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setId(long id) {
        this.id = id;
    }
}
