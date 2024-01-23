package number1stream;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String city;
    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Person() {
    }

    public Person(String name, int age, String gender, String city, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.occupation = occupation;
    }
}


  /* STREAM QUESTIONS

    Find the names of all female individuals.
        Find the average age of people in London.
        Find the occupations of people older than 35.
        Find the names of the first two people in the list
        Find the oldest person's age
        Check if there is any person whose occupation is "Teacher".
        Find the names of people in Paris sorted in reverse alphabetical order.
        Find the number of males in the list of people.
        Find the average age of people in London
        Find the names of people who are between 30 and 40 years old (inclusive).
        Check if all people in the list have a city value assigned.
        Check if any person's name ends with "y"
        Find the maximum age among people younger than 40
        Find the occupations of people whose names start with the letter "A".
        Create a comma-separated string of all unique cities in the list.*/

