package RPG;


class Kasumi
{
    public static void main()
    {
        BASE K=new BASE();
        while(true)
        {

            int hp=K.mhp;
            int sp=K.msp;
            int medicine=K.mmedicine;
            int Queen_Frost=400;
            int k=0;
            System.out.println("HP = "+hp+"/"+K.mhp);
            System.out.println("SP = "+sp+"/"+K.msp);
            System.out.println("Queen Frost = "+Queen_Frost+"/400");
            System.out.println("----------------------------------------------");
            while(Queen_Frost>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=K.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Queen_Frost-=20;
                        if(Queen_Frost<=0)
                        {
                            Queen_Frost=0;
                        }
                        System.out.println("You hit the Queen Frost and caused a damage of 20hp");
                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        K.sc.nextLine();
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
                        Queen_Frost-=30;
                        if(Queen_Frost<=0)
                        {
                            Queen_Frost=0;
                        }
                        System.out.println("You hit the Queen Frost and caused a damage of 30hp");
                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        K.sc.nextLine();
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
                        Queen_Frost-=20;
                        if(Queen_Frost<=0)
                        {
                            Queen_Frost=0;
                        }
                        System.out.println("You charmed the Queen Frost and caused a damage of 20hp");

                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        K.sc.nextLine();
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
                        Queen_Frost-=30;
                        if(Queen_Frost<=0)
                        {
                            Queen_Frost=0;
                        }
                        System.out.println("You charmed the Queen Frost and caused a damage of 30hp");
                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        K.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==K.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        if(medicine==0)
                        {
                            System.out.println("No medicines left.... Try something else");
                            continue;
                        }
                        hp=K.mhp;
                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        K.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Queen_Frost<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 20");
                        K.mhp+=20;
                        K.msp+=20;
                        System.out.println("Max HP ="+K.mhp);
                        System.out.println("Max SP ="+K.msp);
                        return;
                    }
                }
                else
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("The Queen stabs you with her ice spear...");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("The Queen sends her Jack Frost army at you....");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("The Queen drops an avalanche at you...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                    }
                    else if(b>=9)
                    {
                        System.out.println("The Queen creates a frozen tundra....");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }

                        System.out.println("HP = "+hp+"/"+K.mhp);
                        System.out.println("SP = "+sp+"/"+K.msp);
                        System.out.println("Queen Frost = "+Queen_Frost+"/400");
                        System.out.println("----------------------------------------------");
                    }
                    k=0;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to try again");
                        System.out.println("----------------------------------------------");
                        K.sc.nextLine();
                        continue;        
                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... /nPress any to try again.....");
                        K.sc.nextLine();
                        continue;  
                    }
                }
            }
        }
    }
}