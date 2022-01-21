class User
{
    static int x = 100;
    String userName;
    String password;
    static String uname;
    static String pass;
    static String pro;
    static int quan;
    String status="Pending";

    public User(String username, String password) 
    {
        this.userName = username;
        this.password = password;
    }

    public User(String username, String password, String status) 
    {
        this.userName = username;
        this.password = password;
        this.status = status;
    }

    static void loginpage()
    {
        System.out.println("\033[H\033[2J");
        System.out.println("New User");
        System.out.println("Existing User");
        System.out.println("Back");
        System.out.println();
        System.out.print("Choose your option :");
        int n=Integer.parseInt(Main.sc.nextLine());
        if(n==1)
        {
            signup();
        }
        else if(n==2)
        {
            userLogin();
        }
        else if(n==3)
        {
            return;
        }
        else
        {
            System.out.println("Invalid Input !");
            loginpage();
        }
    }

    static void signup()
    {
        System.out.println("\033[H\033[2J");
        System.out.print("Enter Name : ");
        uname=Main.sc.nextLine();
        System.out.print("Enter password for new user : ");
        pass = Main.sc.nextLine();

        Main.userList.add(new User(uname,pass));

        System.out.println("\033[H\033[2J");

        System.out.println("Please wait.....");
        System.out.println("Waiting for Admin's approval.......");
        Main.sc.nextLine();
    }

    static void userLogin()
    {
        System.out.println("\033[H\033[2J");
        System.out.print("Enter User name : ");
        String username = Main.sc.nextLine();
        System.out.print("Enter Password : ");
        String password = Main.sc.nextLine();

        if(username.equals(uname) && password.equals(pass))
        {
            System.out.println("\033[H\033[2J");
            System.out.println("User logged in succesfully....");
            Main.sc.nextLine();
            product();

        }
        else
        {
            System.out.println("\033[H\033[2J");
            System.out.println("Invalid input !!!");
            Main.sc.nextLine();
            loginpage();
        }
    }
        static void product()
        {
            System.out.println("View Tickets");
            System.out.println("Book Tickets");
            System.out.println("Back");
            System.out.println();
            System.out.print("Enter your choise : ");
            int s=Main.sc.nextInt();

            if(s==1)
            {
                view();
            }
            else if(s==2)
            {
                book();
            }
            else
            {
                loginpage();
            }
        }   

        static void view()
        {
            for(int i=0;i<Main.adList.size()-1;i++){
            if(Main.adList.get(i).trainname != ""){
                System.out.println(Main.adList.get(0).trainname);
            }
            else{
                System.out.println("Train not available....");
            }
        }
            
            Main.sc.nextLine();
        }
        static void book()
        {
            System.out.println("\033[H\033[2J");
        }
}