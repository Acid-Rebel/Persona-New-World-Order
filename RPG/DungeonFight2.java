package RPG;


class DungeonFight2
{
    public static void main()
    {
        BASE DF2=new BASE();
        while(true)
        {

            System.out.println("You have encounterd a Wolf......");
            System.out.println("1.Fight\n2.Run Away");
            String c=DF2.sc.nextLine();
            while(c.equals("1")==false && c.equals("2")==false)
            {
                System.out.println("Input mismatch....Try again...");
                c=DF2.sc.nextLine();
            }
            if(c.equals("1"))
            {
                int hp=DF2.mhp;
                int sp=DF2.msp;
                int medicine=DF2.mmedicine;
                int Wolf=300;
                int k=0;
                System.out.println("HP = "+hp+"/"+DF2.mhp);
                System.out.println("SP = "+sp+"/"+DF2.msp);
                System.out.println("Wolf = "+Wolf+"/300");
                System.out.println("----------------------------------------------");
                while(Wolf>0 && hp>0)
                {

                    if(k==0)
                    {
                        System.out.println("Your Turn");
                        System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                        String cc=DF2.sc.nextLine();

                        if(cc.equals("1"))
                        {
                            if(hp<=10)
                            {
                                System.out.println("Low HP... Try something else");
                                continue;
                            }
                            hp-=10;
                            Wolf-=20;
                            if(Wolf<=0)
                            {
                                Wolf=0;
                            }
                            System.out.println("You hit the Wolf and caused a damage of 20hp");
                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF2.sc.nextLine();
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
                            Wolf-=30;
                            if(Wolf<=0)
                            {
                                Wolf=0;
                            }
                            System.out.println("You hit the Wolf and caused a damage of 30hp");
                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF2.sc.nextLine();
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
                            Wolf-=20;
                            if(Wolf<=0)
                            {
                                Wolf=0;
                            }
                            System.out.println("You charmed the Wolf and caused a damage of 20hp");

                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF2.sc.nextLine();
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
                            Wolf-=30;
                            if(Wolf<=0)
                            {
                                Wolf=0;
                            }
                            System.out.println("You charmed the Wolf and caused a damage of 30hp");
                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF2.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("5"))
                        {
                            if(hp==DF2.mhp)
                            {
                                System.out.println("HP already full...");
                                continue;
                            }
                            hp=DF2.mhp;
                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                            System.out.println("Medicine taken......");
                            System.out.println("Press any key to continue.....");
                            DF2.sc.nextLine();
                            medicine--;
                            k++;
                        }
                        else
                        {
                            System.out.println("Input mismatch try again...");
                            continue;
                        }

                        if(Wolf<=0)
                        {
                            System.out.println("You Win");
                            System.out.println("Your Max HP, Max SP is incresed by 20");
                            DF2.mhp+=20;
                            DF2.msp+=20;
                            System.out.println("Max HP ="+DF2.mhp);
                            System.out.println("Max SP ="+DF2.msp);
                            return;
                        }
                    }
                    else
                    {
                        int b=(int)(Math.random()*10);
                        if(b>=0 && b<=2)
                        {
                            System.out.println("The Wolf pounced at you...");
                            hp-=10;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                        }
                        else if(b>=3 && b<=5)
                        {

                            System.out.println("The Wolf DF2.scratched you....");
                            hp-=15;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                        }

                        else if(b>=6 && b<=8)
                        {

                            System.out.println("The Wolf shot a fireball at you...");
                            hp-=20;  
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                        }
                        else if(b>=9)
                        {
                            System.out.println("The Wolf crunched you....");                        
                            hp-=35;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+DF2.mhp);
                            System.out.println("SP = "+sp+"/"+DF2.msp);
                            System.out.println("Wolf = "+Wolf+"/300");
                            System.out.println("----------------------------------------------");
                        }
                        k=0;
                        if(hp<=0)
                        {
                            hp=0;
                            System.out.println("You are dead.....");
                            System.out.println("\n1.Trygain\n2.Abort");
                            System.out.println("----------------------------------------------");
                            c=DF2.sc.nextLine();
                            while(c.equals("1")==false && c.equals("2")==false)
                            {
                                System.out.println("Input mismatch....Try again...");
                                c=DF2.sc.nextLine();
                            }

                        }
                        else if(hp<=10&&sp<10&&medicine==0)
                        {
                            System.out.println("Very low points to do anything.... \n1.Trygain\n2.Abort");
                            c=DF2.sc.nextLine();
                            while(c.equals("1")==false && c.equals("2")==false)
                            {
                                System.out.println("Input mismatch....Try again...");
                                c=DF2.sc.nextLine();
                            }
                        }
                    }
                }
            }
            if (c.equals("2"))
            {
                System.out.println("You decided to run away");
                System.out.println("Press any key to continue");
                DF2.sc.nextLine();
                return;
            }
        }
    }
}