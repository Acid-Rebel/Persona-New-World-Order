package RPG;


class Shinjiro
{
    public static void main()
    {
        BASE SS=new BASE();
        while(true)
        {

            int hp=500;//500
            int sp=500;//500
            int medicine=3;
            int Shinjiro=1000;//700
            int k=0;
            System.out.println("HP = "+hp+"/"+500);
            System.out.println("SP = "+sp+"/"+500);
            System.out.println("Shinjiro = "+Shinjiro+"/1000");
            System.out.println("----------------------------------------------");
            while(Shinjiro>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=SS.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Shinjiro-=35;
                        if(Shinjiro<=0)
                        {
                            Shinjiro=0;
                        }
                        System.out.println("You hit Shinjiro and caused a damage of 35hp");
                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        SS.sc.nextLine();
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
                        Shinjiro-=45;
                        if(Shinjiro<=0)
                        {
                            Shinjiro=0;
                        }
                        System.out.println("You the Shinjiro and caused a damage of 45hp");
                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        SS.sc.nextLine();
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
                        Shinjiro-=35;
                        if(Shinjiro<=0)
                        {
                            Shinjiro=0;
                        }
                        System.out.println("You charmed Shinjiro and caused a damage of 35hp");

                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        SS.sc.nextLine();
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
                        Shinjiro-=45;
                        if(Shinjiro<=0)
                        {
                            Shinjiro=0;
                        }
                        System.out.println("You charmed Shinjiro and caused a damage of 45hp");
                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        SS.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==500)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        if(medicine==0)
                        {
                            System.out.println("No medicines left.... Try something else");
                            continue;
                        }
                        hp=500;
                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        SS.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Shinjiro<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        SS.mhp+=30;
                        SS.msp+=30;
                        System.out.println("Max HP ="+SS.mhp);
                        System.out.println("Max SP ="+SS.msp);
                        return;
                    }
                }
                else
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("Shinjiro hits you with a force of shadow....");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Shinjiro creates a wraith torrent....");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Shinjiro creates a rupture in space...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                    }
                    else if(b>=9)
                    {
                        System.out.println("Shinjiro summons a night star");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }

                        System.out.println("HP = "+hp+"/"+500);
                        System.out.println("SP = "+sp+"/"+500);
                        System.out.println("Shinjiro = "+Shinjiro+"/1000");
                        System.out.println("----------------------------------------------");
                    }
                    k=0;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to try again");
                        System.out.println("----------------------------------------------");
                        SS.sc.nextLine();
                        continue;        
                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... /nPress any to try again.....");
                        SS.sc.nextLine();
                        continue;  
                    }
                }
            }
        }
    }
}