import java.util.ArrayList;
import java.util.Scanner;

class Main{

   static ArrayList<User> userList = new ArrayList<>();
   static ArrayList<Admin> adList = new ArrayList<>();

    static Scanner sc;
    public static void main(String args[]) {
        sc = new Scanner(System.in);
        int a = 0;
        do{
            System.out.println("\033[H\033[2J");
        System.out.println("~~~~~~ Welcome to Ticket Booking Portal ~~~~~~");
        System.out.println();
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println("3. Exit");
        System.out.println();
        System.out.print("Enter your option : ");
        a =Integer.parseInt(sc.nextLine());
        switch (a) {
            case 1:
                Admin.login();
                break;
            case 2:
                User.loginpage();
                break;
            case 3:
                System.exit(0);

            default:
                System.out.println("Invalid input");
        }
    }while(true);

    }
}