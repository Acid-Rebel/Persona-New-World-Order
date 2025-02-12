package RPG;

class FirstBattle
{
    public static void main()
    {
        BASE First=new BASE();
        while(true)
        {
            
            int hp=First.mhp;
            int sp=First.msp;
            int medicine=First.mmedicine;
            int Shadow=250;
            int k=0;
            System.out.println("HP = "+hp+"/"+First.mhp);
            System.out.println("SP = "+sp+"/"+First.msp);
            System.out.println("Shadow = "+Shadow+"/250");
            System.out.println("----------------------------------------------");
            while(Shadow>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=First.sc.nextLine();
                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Shadow-=15;
                        if(Shadow<=0)
                        {
                            Shadow=0;
                        }
                        System.out.println("You hit the Monster and caused a damage of 15hp");
                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        First.sc.nextLine();
                        k++;
                    }

                    else if(cc.equals("2"))
                    {
                        if(hp<=15)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=15;
                        Shadow-=25;
                        if(Shadow<=0)
                        {
                            Shadow=0;
                        }
                        System.out.println("You hit the Monster and caused a damage of 25hp");
                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        First.sc.nextLine();
                        k++;
                    }

                    else if(cc.equals("3"))
                    {
                        if(sp<10)
                        {
                            System.out.println("Low SP... Try something else");
                            continue;
                        }
                        sp-=10;
                        Shadow-=15;
                        if(Shadow<=0)
                        {
                            Shadow=0;
                        }
                        System.out.println("You charmed the Monster and caused a damage of 15hp");

                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        First.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("4"))
                    {
                        if(sp<15)
                        {
                            System.out.println("Low SP... Try something else");
                            continue;
                        }
                        sp-=15;
                        Shadow-=25;
                        if(Shadow<=0)
                        {
                            Shadow=0;
                        }
                        System.out.println("You charmed the Monster and caused a damage of 25hp");
                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        First.sc.nextLine();
                        k++;
                    }

                    else if(cc.equals("5"))
                    {
                        if(hp==First.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        if(medicine==0)
                        {
                            System.out.println("No medicines left.... Try something else");
                            continue;
                        }
                        hp=First.mhp;
                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        First.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Shadow<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Press any key to continue.....");
                        First.sc.nextLine();
                        return;
                    }
                }
                else
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("The Monster just smashed you...");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("The Monster just turned of all the lights... you are blind....");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("The Monster just threw a X ray machine at you...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                    }
                    else if(b>=9)
                    {
                        System.out.println("The Shadow just mocked you... you are emotionally damaged");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }

                        System.out.println("HP = "+hp+"/"+First.mhp);
                        System.out.println("SP = "+sp+"/"+First.msp);
                        System.out.println("Monster = "+Shadow+"/250");
                        System.out.println("----------------------------------------------");
                    }
                    k=0;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to try again");
                        System.out.println("----------------------------------------------");
                        First.sc.nextLine();
                        continue;        
                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... /nPress any to try again.....");
                        First.sc.nextLine();
                        continue;  
                    }
                }
            }
        }
    }
}