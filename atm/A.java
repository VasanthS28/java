import java.util.*;

public class A 
{
    private static Scanner sc;
    static int a=0;
    static int arr[]={10,10,10,10};
    static int arr1[]={2000,500,200,100};
    static int amt=0;
    static int v[]={20000,30000};
    static int w;
    static String pin1;
    static String newPin;
    static void home(){
        System.out.println("WELCOME");
        System.out.println();
        System.out.println("Admin page");
        System.out.println("User page");
        System.out.println("Exit");
        System.out.println();
        System.out.println("Enter your choice");
        a=sc.nextInt();
        switch(a)
        {
            case 1:
            adminpage();
            break;

            case 2:
            userpage();
            break;

            case 3:
            System.exit(0);

            default:
            System.out.println("Invalid Input");
            break;
        }
    }
    static void adminpage()
    {
        System.out.println("\033[H\033[2J");
        System.out.print("Enter Admin name :");
        String ad=sc.next();
        System.out.print("Enter Pin :");
        int pin=sc.nextInt();
      
        if(ad.equals("admin")&& pin==1234)
        {
            page1();
        }
        else if(ad.equals("admin1")&&pin==1007)
        {
            page1();
        }
    }

    static void page1()
    {
        // System.out.println("\033[H\033[2J");
            System.out.println("Welcome Admin !!!!");
            System.out.println();
            System.out.println("Update");
            System.out.println("Show");
            System.out.println("Back");
            System.out.println("Exit");
            System.out.println();
            System.out.println("Enter your option :");
            int b=sc.nextInt();

            switch(b){
                case 1:
                System.out.println("\033[H\033[2J");
                update();
                break;

                case 2:
                System.out.println("\033[H\033[2J");
                show();
                break;

                case 3:
                System.out.println("\033[H\033[2J");
                home();
                break;

                case 4:
                System.exit(0);

                default:
                System.out.println("Invalid Input");
            }
        }
    

    static void userpage()
    {
        System.out.println("\033[H\033[2J");
        System.out.print("Enter User name :");
        String us=sc.next();
        System.out.print("Enter Pin :");
        String pin1=sc.next();
      
        if(us.equals("vasanth")&& pin1=="2807")
        {
            w=v[0];
            page2();
        }
        else if(us.equals("santhosh")&&pin1=="3007")
        {
            w=v[1];
            page2();
        }
    }
    
    
    static int page2()
    {
        while(true)
        {   
         //System.out.println("\033[H\033[2J");
            System.out.println("Welcome !!!!");
            System.out.println();
            System.out.println("Withdraw");
            System.out.println("Balance");
            System.out.println("Pin change");
            System.out.println("Exit");
            System.out.println();
            System.out.println("Enter your option :");
            int b=sc.nextInt();

            switch(b)
            {
                case 1:
                System.out.println("\033[H\033[2J");
                withdraw();
                break;

                case 2:
                System.out.println("\033[H\033[2J");
                balance();
                break;

                case 3:
                System.out.println();
                        System.out.print("Please Enter New Pin: ");
                        String newPin = sc.next();
                        System.out.println();
                        pin1 = newPin;
                        System.out.println("Pin Changed Successfully");
                        break;

                case 4:
                System.out.println("\033[H\033[2J");
                home();
                break;

                default:
                System.out.println("Invalid Input");
            }
        }
        }

        static void withdraw()
        {
            System.out.println("\033[H\033[2J");
            System.out.println("Your current Balance : "+w);
            System.out.println();
            System.out.print("Enter the Withdraw amount :");
            amt=sc.nextInt();

            w=w-amt;

            System.out.println("\033[H\033[2J");

            System.out.println("Withdraw Succesfully !!!!");

            sc.nextLine();
            String back=sc.nextLine();
            if(back.equals(""))
            System.out.println("\033[H\033[2J");
            page2();
       
    }

        static void balance()
        {
            w=w-amt;

            System.out.println("Your balance is : "+w);

            sc.nextLine();
            String back=sc.nextLine();
            if(back.equals(""))
            System.out.println("\033[H\033[2J");
            page2();
        }
       

    static void update()
    {
        for(int i=0;i<4;i++)
        {
            System.out.print(arr1[i] + "->");
            arr[i]+=sc.nextInt();

        }
        sc.nextLine();
            String back=sc.nextLine();
            if(back.equals("")){
                System.out.println("\033[H\033[2J");
                page1();
            }

    }
    static void show()
    {
        
        int n=0;
        System.out.println("\033[H\033[2J");
        for(int i=0;i<4;i++)
        {
            System.out.println(arr1[i] + "->"+arr[i]);
            n=n+(arr[i]*(arr1[i]));
        }
        System.out.println("Amount in ATM : "+n);
        
        page1();
    
    }
    public static void main(String args[])
    {
        sc=new Scanner(System.in);
        home();
    }
}
