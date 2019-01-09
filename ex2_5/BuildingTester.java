public class BuildingTester {
    public static void main(String[] args) {
        School s1 = new School("Whitworth", "300 W Hawthorne Rd Spokane, WA");
        Kid k1 = new Kid("Jacob", 19, 4259749743L);
        Teacher t1 = new Teacher("Travis", 19, 5093891301L);
        s1.addPerson(k1);
        s1.addPerson(t1);
        s1.outputPersons();
    }
}