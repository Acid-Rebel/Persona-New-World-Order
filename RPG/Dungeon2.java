package RPG;


class Dungeon2
{
    public static void main()
    {
        BASE D2=new BASE();
        DungeonFight2 DDF2=new DungeonFight2();
        for(int i=1;i<=3;i++)
        {
            if(i==1)
            {
                System.out.println("You see two paths branching");
                System.out.println("1.Enter path 1(left)");
                System.out.println("2.Enter path 2 (right)");
                String c=D2.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D2.sc.nextLine();
                }
                System.out.println("You enter path "+c+"............");
                D2.sc.nextLine();
                System.out.println("................");
                D2.sc.nextLine();
                System.out.println("................");
                D2.sc.nextLine();
                System.out.println("................");
                D2.sc.nextLine();
            }
            else if(i==2)
            {
                System.out.println("You see three paths branching");
                System.out.println("1.Enter path 1(left)");
                System.out.println("2.Enter path 2(right)");
                System.out.println("3.Enter path 3(straight)");
                String c=D2.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D2.sc.nextLine();
                }
                System.out.println("You enter path "+c);
                D2.sc.nextLine();;
                System.out.println("................");
                D2.sc.nextLine();
                System.out.println("................");
                D2.sc.nextLine();
                System.out.println("................");
                D2.sc.nextLine();
                if(c.equals("1")||c.equals("3"))
                {
                    DDF2.main();
                }
            }
            else if(i==3)
            {
                System.out.println("You see four paths branching");
                System.out.println("1.Enter path 1(left)");
                System.out.println("2.Enter path 2(right)");
                System.out.println("3.Enter path 3(straight)");
                System.out.println("4.Enter path 4(corner)");
                String c=D2.sc.nextLine();
                while(c.equals("1")==false && c.equals("2")==false && c.equals("3")==false  && c.equals("4")==false)
                {
                    System.out.println("Input mismatch try agan....");
                    c=D2.sc.nextLine();
                }
                System.out.println("You enter path "+c);
                D2.sc.nextLine();
                System.out.println("................");
                D2.sc.nextLine();;
                System.out.println("................");
                D2.sc.nextLine();
                System.out.println("................");
                D2.sc.nextLine();
                if(c.equals("4")||c.equals("2")||c.equals("3"))
                {
                    DDF2.main();
                }
            }
        }
    }
}