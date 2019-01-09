public class PeopleTester {
    public static void main(String[] args) {
        Police p1 = new Police("Jacob", 19, 4259749743L); 
        p1.setRole(Police.Role.Patrol);
        System.out.println("Role: " + p1.getRole());
        System.out.println("Name: " + p1.getName());

        Teacher t1 = new Teacher("Travis", 40, 5093891301L);
        t1.setGradeLevel(12);
        System.out.println("Grade Level: " + t1.getGradeLevel());
        t1.payEmployee(75);
        System.out.println("The teacher has: " + t1.bankAmount());

        Kid k1 = new Kid("Caleb", 12, 8081112222L);
        k1.setFavCandy("Snickers");
        System.out.println("Favorite Candy: " + k1.getFavCandy());
        
    }
}