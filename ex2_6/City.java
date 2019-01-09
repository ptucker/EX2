public class City {
    protected String name;
    protected String state;
    protected ArrayList<Building> buildingArray = new ArrayList<Building>(); // ArrayList of all the buildings
    protected ArrayList<Person> personArray = new ArrayList<Person>(); // ArrayList of all the people
    protected ArrayList<Person> employees = new ArrayList<Person>(); // ArrayList of all the employees

    // Blank city constructor
    public City() {
        name = " ";
        state = " ";
    }

    // City constructor that sets its name and state 
    public City(String _name, String _state) {
        name = _name;
        state = _state;
    }

    // Adds a building to the city
    public void addBuilding(Building b) {
        cityArray.add(b);
    }

    // Outputs the names of all the buildings
    public void outputBuildingNames() {
        System.out.println(buildlingArray);
    }

    // Outputs all the peoples names in the city
    public void outputPersonNames () {
        System.out.println(personArray);
    }

    // Outputs all of the employees names in the city
   public void payEmployees() {
       for(int i = 0; i < employees.size(); i++) {
           employees[i].payEmployee();
       }
   }
}