public class Teacher extends Person implements Employee {
    private int gradeLevel; 
    private String certification; 
    private int moneyAmount = 0;
    private String employeeID;

    // Blank Teacher constructor
    publiic Teacher() {
        super(" ", 0, 0);
    }

    // Teacher constructor to take in a name, age, and phone number 
    public Teacher(String name, int age, long phoneNumber) {
        super(name, age, phoneNumber); 
    }

    // Sets the grade level that the teacher is teaching
    public void setGradeLevel(int _gradeLevel) {
        gradeLevel = _gradeLevel;
    }

    // Sets the certification the teacher has
    public void setCertification(String _certification) {
        certification = _certification;
    }

    // Returns the grade level the teacher teaches
    public int getGradeLevel() {
        return gradeLevel;
    }

    // Returns the certification the teacher has
    public String getCertification() {
        return certification; 
    }

    // Pays the teacher 
    public void payEmployee() {
        moneyAmount = moneyAmount + 100;
    }
    
    // Sets the employee ID of the teacher
    public void setEmployeeID(String _employeeID) {
        employeeID = _employeeID;
    }

    // Returns the employee ID of the teacher
    public String getEmployeeID() {
        return employeeID;
    }

    // Returns how much money the teacher has 
    public int bankAmount() {
        return moneyAmount;
    }

    // Used to return the teachers name 
    public String toString() {
        return name;
    }
}