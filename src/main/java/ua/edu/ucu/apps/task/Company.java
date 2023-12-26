package ua.edu.ucu.apps.task;

public class Company {
    private String name;
    private String description;
    private String logo;

    public Company(String name, String description, String logo) {
        this.name = name;
        this.description = description;
        this.logo = logo;
    }

    @Override
    public String toString() {
        String newstr = "Company{" 
            +
                "name='"
            + 
                name 
            + 
                '\''
            +
                ", description='" 
            + 
                description 
            + 
                '\'' 
            +
                ", logo='" 
            + 
                logo 
            + 
                '\'' 
            +
                '}';
        return newstr;
    }
}
