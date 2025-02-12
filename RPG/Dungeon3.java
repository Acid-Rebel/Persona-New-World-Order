package RPG;


class Dungeon3
{
    public static void main()
    {
        BASE D3=new BASE();
        DungeonFight3 DDF3=new DungeonFight3();
        for(int i=1;i<=4;i++)
        {
            if(i==1)
            {
                System.out.println("You see two corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                String c=D3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D3.sc.nextLine();
                }
                System.out.println("You enter corridor "+c+"............");
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();
            }
            else if(i==2)
            {
                System.out.println("You see three corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                System.out.println("3.Enter corridor 3");
                String c=D3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D3.sc.nextLine();
                }
                System.out.println("You enter corridor "+c);
                D3.sc.nextLine();;
                System.out.println("................");
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();
                if(c.equals("2"))
                {
                    DDF3.main();
                }
            }
            else if(i==3)
            {
                System.out.println("You see sees four corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                System.out.println("3.Enter corridor 3");
                System.out.println("4.Enter corridor 4");
                String c=D3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false  && c.equals("4")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D3.sc.nextLine();
                }
                System.out.println("You enter corridor "+c);
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();;
                System.out.println("................");
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();
                if(c.equals("4")||c.equals("2")||c.equals("1"))
                {
                    DDF3.main();
                }
            }
            else if(i==4)
            {
                System.out.println("You see sees five corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                System.out.println("3.Enter corridor 3");
                System.out.println("4.Enter corridor 4");
                System.out.println("5.Enter corridor 5");
                String c=D3.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false  && c.equals("4")==false&& c.equals("5")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D3.sc.nextLine();
                }
                System.out.println("You enter corridor "+c);
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();;
                System.out.println("................");
                D3.sc.nextLine();
                System.out.println("................");
                D3.sc.nextLine();
                if(c.equals("5")||c.equals("2")||c.equals("1")||c.equals("3"))
                {
                    DDF3.main();
                }
            }
        }

    }
}