import java.util.Scanner;
public class Login {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Username : ");
        String userName=scanner.nextLine();
        System.out.println("Password : ");
        String passWord=scanner.nextLine();
        System.out.println("Email : ");
        String email=scanner.nextLine();
        System.out.println("Contact number: ");
        long contact=scanner.nextLong();

        System.out.println("Your Username : "+userName);
        System.out.println("Your Password : "+passWord);
        System.out.println("Your Email : "+email);
        System.out.println("Your Contact number : "+contact);
    }

}
