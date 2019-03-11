package internshala;

public class Student {
    private String name;
    private double CGPA;
    private int token;
    Student(String name,double CGPA,int token)
    {
        this.name = name;
        this.CGPA = CGPA;
        this.token = token;
    }
    public String getName()
    {
        return this.name;
    }
    public double getCGPA()
    {
        return this.CGPA;
    }

    public int getToken() {
        return token;
    }
}
