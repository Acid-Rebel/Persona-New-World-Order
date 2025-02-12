package RPG;


class Dungeon4Part3
{
    public static void main()
    {
        BASE D4P3=new BASE();
        Dungeon4Fight2 D4F3=new Dungeon4Fight2();
        for(int i=1;i<=8;i++)
        {
            if(i==1)
            {
                System.out.println("You see two corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");

                String c=D4P3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D4P3.sc.nextLine();
                }
                System.out.println("You enter corridor "+c+"............");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
            }
            else if(i==2)
            {
                System.out.println("You see two stairs branching");
                System.out.println("1.Climb stairs 1");
                System.out.println("2.Climb stairs 2");

                String c=D4P3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D4P3.sc.nextLine();
                }
                System.out.println("You climb stairs "+c+"............");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
            }
            else if(i==3)
            {
                System.out.println("You see three corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                System.out.println("3.Enter corridor 3");
                String c=D4P3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D4P3.sc.nextLine();
                }
                System.out.println("You enter corridor "+c);
                D4P3.sc.nextLine();;
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                if(c.equals("1"))
                {
                    D4F3.main();
                }
            }
            else if(i==4)
            {
                System.out.println("You see three stairs branching");
                System.out.println("1.Climb stairs 1");
                System.out.println("2.Climb stairs  2");
                System.out.println("3.Climb stairs  3");
                String c=D4P3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D4P3.sc.nextLine();
                }
                System.out.println("You Climb stairs  "+c);
                D4P3.sc.nextLine();;
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                if(c.equals("2"))
                {
                    D4F3.main();
                }
            }
            else if(i==5)
            {
                System.out.println("You see sees four corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                System.out.println("3.Enter corridor 3");
                System.out.println("4.Enter corridor 4");
                String c=D4P3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false  && c.equals("4")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D4P3.sc.nextLine();
                }
                System.out.println("You enter corridor "+c);
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();;
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                if(c.equals("3")||c.equals("2")||c.equals("4"))
                {
                    D4F3.main();
                }
            }
            else if(i==6)
            {
                System.out.println("You see sees four stairs branching");
                System.out.println("1.Climb stairs 1");
                System.out.println("2.Climb stairs 2");
                System.out.println("3.Climb stairs 3");
                System.out.println("4.Climb stairs 4");
                String c=D4P3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false  && c.equals("4")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D4P3.sc.nextLine();
                }
                System.out.println("You Climb stairs "+c);
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();;
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                if(c.equals("2")||c.equals("3")||c.equals("1"))
                {
                    D4F3.main();
                }
            }
            else if(i==7)
            {
                System.out.println("You see sees five corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                System.out.println("3.Enter corridor 3");
                System.out.println("4.Enter corridor 4");
                System.out.println("5.Enter corridor 5");
                String c=D4P3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false  && c.equals("4")==false&& c.equals("5")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D4P3.sc.nextLine();
                }
                System.out.println("You enter corridor "+c);
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();;
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                if(c.equals("4")||c.equals("2")||c.equals("5")||c.equals("3"))
                {
                    D4F3.main();
                }
            }
            else if(i==8)
            {
                System.out.println("You see sees five stairs branching");
                System.out.println("1.Climb stairs 1");
                System.out.println("2.Climb stairs 2");
                System.out.println("3.Climb stairs 3");
                System.out.println("4.Climb stairs 4");
                System.out.println("5.Climb stairs 5");
                String c=D4P3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false  && c.equals("4")==false&& c.equals("5")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D4P3.sc.nextLine();
                }
                System.out.println("You Climb stairs "+c);
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();;
                System.out.println("................");
                D4P3.sc.nextLine();
                System.out.println("................");
                D4P3.sc.nextLine();
                if(c.equals("5")||c.equals("2")||c.equals("1")||c.equals("4"))
                {
                    D4F3.main();
                }
            }
        }
    }
}