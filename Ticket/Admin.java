public class Admin 
{
    String trainname;
    String route;
    String station;
    
    public Admin(String trainname, String route, String station) 
    {
        this.trainname = trainname;
        this.route = route;
        this.station = station;
    }

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
        System.out.println("1.User Authentication");
        System.out.println("2.Add Trains ,Routes and Stations");
        System.out.println("3.Declares Seat Available");
        System.out.println("4.Back");
        System.out.println();
        System.out.print("Choose any option : ");
        int n = Integer.parseInt(Main.sc.nextLine());
        if (n == 1) 
        {
            approve();
        } 
        else if (n == 2) 
        {
            train();
        }
        else if(n==3)
        {
            declare();
        }
        else if(n==4){
            return;
        }
    }

    public static void approve() 
    {
        for (int i = 0; i < Main.userList.size(); i++, System.out.print("\033[H\033[2J")) 
        {
            if (Main.userList.get(i).status.equals("Pending")) 
            {
                System.out.println("\033[H\033[2J");
                System.out.println("User name : " + Main.userList.get(i).userName);
                System.out.print("Press 1 for Approve (OR) Any other number for Rejection : ");
                int n = Integer.parseInt(Main.sc.nextLine());
                if (n == 1) 
                {
                    Main.userList.get(i).status = "Approved";
                    System.out.println("\033[H\033[2J");
                    System.out.printf("User \"%s\" has been Approved\n", Main.userList.get(i).userName);
                    System.out.println();
                    System.out.println("Press enter to continue");
                    Main.sc.nextLine();
                    continue;
                } 
                else 
                {
                    Main.userList.get(i).status = "Rejected";
                    System.out.println("User Rejected");
                    System.out.println("Press enter to continue");
                    Main.sc.nextLine();
                }
                System.out.println("User to be Approve :- 0");
            }
        }
        adminpage();
    }

    public static void train() 
    {
        System.out.print("\033[H\033[2J");
        System.out.println("Add a Train");
        System.out.println("Remove a Train");
        System.out.println("Back");
        System.out.println();
        System.out.print("Choose any option : ");
        int opt = Integer.parseInt(Main.sc.nextLine());
        if (opt == 1) 
        {
            add();
        } 
        else if (opt == 2) 
        {
            remove();
        } 
        else if (opt == 3) 
        {
            return;
        } 
        else 
        {
            System.out.println("Incorrect Choice");
            train();
        }
    }

    public static void add() 
    {
        System.out.print("Enter Train Name : ");
        String trainname = Main.sc.nextLine();
        System.out.print("Enter Route :  ");
        String route = Main.sc.nextLine();
        System.out.print("Enter no. of Stations : ");
        String station =Main.sc.nextLine();
        Main.adList.add(new Admin(trainname,route,station));
        System.out.println();
        System.out.println("Added Successfully !!!!!");
        Main.sc.nextLine();
        train();
    }

    public static void remove() 
    {
        System.out.print("Enter the train name to be remove : ");
        String s = Main.sc.nextLine();
        for (int i = 0; i < Main.adList.size()-1; i++) 
        {
            if (Main.adList.get(i).trainname.equals(s)) 
            {
                Main.adList.get(0).trainname = "";
                Main.adList.get(1).route = "";
                Main.adList.get(2).station ="";
            }
        }
        System.out.println("Train removed succesfully !!!");
        Main.sc.nextLine();
        train();
    }

    public static void declare(){

    }
}