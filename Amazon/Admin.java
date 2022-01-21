public class Admin 
{
    static void login() 
    {
        System.out.println("\033[H\033[2J");
        System.out.print("Enter Username : ");
        String uname = Main.sc.nextLine();
        System.out.print("Enter Password : ");
        String pass = Main.sc.nextLine();
        if (uname.equals("admin") && pass.equals("1234")) 
        {
            adminpage();
        }
    }

    static void adminpage() 
    {

        System.out.println("\033[H\033[2J");
        System.out.println("Approval/Rejection");
        System.out.println("Add/Remove Merchant");
        System.out.println("Back");
        System.out.println();
        System.out.print("Choose any option : ");
        int n = Integer.parseInt(Main.sc.nextLine());
        if (n == 1) 
        {
            approve();
        } else if (n == 2) 
        {
            vendor();
        }else if(n==3)
        {
            return;
        }
    }

    public static void approve() 
    {
        for (int i = 0; i < Main.merchantList.size(); i++, System.out.print("\033[H\033[2J")) 
        {
            if (Main.merchantList.get(i).status.equals("Pending")) 
            {
                System.out.println("\033[H\033[2J");
                System.out.println("User name : " + Main.merchantList.get(i).userName);
                System.out.print("Press 1 for Approve (OR) Any other number for Rejection : ");
                int n = Integer.parseInt(Main.sc.nextLine());
                if (n == 1) 
                {
                    Main.merchantList.get(i).status = "Approved";
                    System.out.println("\033[H\033[2J");
                    System.out.printf("Merchant \"%s\" has been Approved\n", Main.merchantList.get(i).userName);
                    System.out.println();
                    System.out.println("Press enter to continue");
                    Main.sc.nextLine();
                    continue;
                } else 
                {
                    Main.merchantList.get(i).status = "Rejected";
                    System.out.println("User Rejected");
                    System.out.println("Press enter to continue");
                    Main.sc.nextLine();
                }
                System.out.println("Merchants to be Approve :- 0");
            }
        }
        adminpage();
    }

    public static void vendor() 
    {
        System.out.print("\033[H\033[2J");
        System.out.println("Add a vendor");
        System.out.println("Remove a vendor");
        System.out.println("Back");
        System.out.println();
        System.out.print("Choose any option : ");
        int opt = Integer.parseInt(Main.sc.nextLine());
        if (opt == 1) 
        {
            add();
        } else if (opt == 2) 
        {
            remove();
        } else if (opt == 3) 
        {
            return;
        } else 
        {
            System.out.println("Incorrect Choice");
            vendor();
        }
    }

    public static void add() 
    {
        System.out.print("Enter Username to be add : ");
        String username = Main.sc.nextLine();
        System.out.print("Enter Password :  ");
        String password = Main.sc.nextLine();
        Main.merchantList.add(new Merchant(username, password, "Approved"));
        System.out.println("Vendor added succesfully !!!");
        Main.sc.nextLine();
        vendor();
    }

    public static void remove() 
    {
        System.out.print("Enter Username of the User to be remove : ");
        String s = Main.sc.nextLine();
        for (int i = 0; i < Main.merchantList.size(); i++) 
        {
            if (Main.merchantList.get(i).userName.equals(s)) 
            {
                Main.merchantList.get(i).status = "Deactivated\nContact Admin";
            }
        }
        System.out.println("Vendor removed succesfully !!!");
        Main.sc.nextLine();
        vendor();
    }

}