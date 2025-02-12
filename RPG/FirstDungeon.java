package RPG;


class FirstDungeon
{
    public static void main()
    {
        BASE FirstD=new BASE();
        DungeonFight1 DF1= new DungeonFight1();
        for(int i=1;i<=3;i++)
        {
            if(i==1)
            {
                System.out.println("You see two corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                String c=FirstD.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=FirstD.sc.nextLine();
                }
                System.out.println("You enter corridor "+c+"............");
                FirstD.sc.nextLine();
                System.out.println("................");
                FirstD.sc.nextLine();
                System.out.println("................");
                FirstD.sc.nextLine();
                System.out.println("................");
                FirstD.sc.nextLine();
            }
            else if(i==2)
            {
                System.out.println("You see three corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                System.out.println("3.Enter corridor 3");
                String c=FirstD.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=FirstD.sc.nextLine();
                }
                System.out.println("You enter corridor "+c);
                FirstD.sc.nextLine();;
                System.out.println("................");
                FirstD.sc.nextLine();
                System.out.println("................");
                FirstD.sc.nextLine();
                System.out.println("................");
                FirstD.sc.nextLine();
                if(c.equals("2"))
                {
                    DF1.main();                
                }
            }
            else if(i==3)
            {
                System.out.println("You see sees four corridors branching");
                System.out.println("1.Enter corridor 1");
                System.out.println("2.Enter corridor 2");
                System.out.println("3.Enter corridor 3");
                System.out.println("4.Enter corridor 4");
                String c=FirstD.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false  && c.equals("4")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=FirstD.sc.nextLine();
                }
                System.out.println("You enter corridor "+c);
                FirstD.sc.nextLine();
                System.out.println("................");
                FirstD.sc.nextLine();;
                System.out.println("................");
                FirstD.sc.nextLine();
                System.out.println("................");
                FirstD.sc.nextLine();
                if(c.equals("4")||c.equals("2"))
                {
                    DF1.main();
                }
            }
        }
    }
}