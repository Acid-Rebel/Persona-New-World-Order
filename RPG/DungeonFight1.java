package RPG;


class DungeonFight1
{
    public static void main()
    {
        BASE F1=new BASE();
        while(true)
        {
            System.out.println("You have encounterd an Enemy......");
            System.out.println("1.Fight\n2.Run Away");
            String c=F1.sc.nextLine();
            while(c.equals("1")==false && c.equals("2")==false)
            {
                System.out.println("Input mismatch....Try again...");
                c=F1.sc.nextLine();
            }
            if(c.equals("1"))
            {
                int hp=F1.mhp;
                int sp=F1.msp;
                int medicine=F1.mmedicine;
                int Monster=250;
                int k=0;
                System.out.println("HP = "+hp+"/"+F1.mhp);
                System.out.println("SP = "+sp+"/"+F1.msp);
                System.out.println("Monster = "+Monster+"/250");
                System.out.println("----------------------------------------------");
                while(Monster>0 && hp>0)
                {

                    if(k==0)
                    {
                        System.out.println("Your Turn");
                        System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                        String cc=F1.sc.nextLine();

                        if(cc.equals("1"))
                        {
                            if(hp<=10)
                            {
                                System.out.println("Low HP... Try something else");
                                continue;
                            }
                            hp-=10;
                            Monster-=15;
                            if(Monster<=0)
                            {
                                Monster=0;
                            }
                            System.out.println("You hit the Monster and caused a damage of 15hp");
                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            F1.sc.nextLine();
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
                            Monster-=25;
                            if(Monster<=0)
                            {
                                Monster=0;
                            }
                            System.out.println("You hit the Monster and caused a damage of 25hp");
                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            F1.sc.nextLine();
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
                            Monster-=15;
                            if(Monster<=0)
                            {
                                Monster=0;
                            }
                            System.out.println("You charmed the Monster and caused a damage of 15hp");

                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            F1.sc.nextLine();
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
                            Monster-=25;
                            if(Monster<=0)
                            {
                                Monster=0;
                            }
                            System.out.println("You charmed the Monster and caused a damage of 25hp");
                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            F1.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("5"))
                        {
                            if(hp==F1.mhp)
                            {
                                System.out.println("HP already full...");
                                continue;
                            }
                            hp=F1.mhp;
                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
                            System.out.println("----------------------------------------------");
                            System.out.println("Medicine taken......");
                            System.out.println("Press any key to continue.....");
                            F1.sc.nextLine();
                            medicine--;
                            k++;
                        }
                        else
                        {
                            System.out.println("Input mismatch try again...");
                            continue;
                        }

                        if(Monster<=0)
                        {
                            System.out.println("You Win");
                            System.out.println("Your Max HP, Max SP is incresed by 10");
                            F1.mhp+=10;
                            F1.msp+=10;
                            System.out.println("Max HP ="+F1.mhp);
                            System.out.println("Max SP ="+F1.msp);
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
                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
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
                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
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
                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
                            System.out.println("----------------------------------------------");
                        }
                        else if(b>=9)
                        {
                            System.out.println("The Monster just mocked you... you are emotionally damaged");                        
                            hp-=35;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+F1.mhp);
                            System.out.println("SP = "+sp+"/"+F1.msp);
                            System.out.println("Monster = "+Monster+"/250");
                            System.out.println("----------------------------------------------");
                        }
                        k=0;
                        if(hp<=0)
                        {
                            hp=0;
                            System.out.println("You are dead.....");
                            System.out.println("\n1.Trygain\n2.Abort");
                            System.out.println("----------------------------------------------");
                            c=F1.sc.nextLine();
                            while(c.equals("1")==false && c.equals("2")==false)
                            {
                                System.out.println("Input mismatch....Try again...");
                                c=F1.sc.nextLine();
                            }

                        }
                        else if(hp<=10&&sp<10&&medicine==0)
                        {
                            System.out.println("Very low points to do anything.... \n1.Trygain\n2.Abort");
                            c=F1.sc.nextLine();
                            while(c.equals("1")==false && c.equals("2")==false)
                            {
                                System.out.println("Input mismatch....Try again...");
                                c=F1.sc.nextLine();
                            }
                        }
                    }
                }
            }
            if (c.equals("2"))
            {
                System.out.println("You decided to run away");
                System.out.println("Press any key to continue");
                F1.sc.nextLine();
                return;
            }
        }
    }
}