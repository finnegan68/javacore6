package module3.task1;


public class Bird {

    private String name;
    private String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    public String walk(){
        return "I am walking";
    }
    public String fly(){
        return "I am flying";
    }
    public String sing(){
        return "I am singing";
    }
    public String getClassName(){
        return "I am Bird";
    }
}
