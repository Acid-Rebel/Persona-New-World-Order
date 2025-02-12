package RPG;


class DungeonFight3
{
    public static void main()
    {
        BASE DF3=new BASE();
        while(true)
        {
            System.out.println("You have encounterd a Zombie......");
            System.out.println("1.Fight\n2.Run Away");
            String c=DF3.sc.nextLine();
            while(c.equals("1")==false && c.equals("2")==false)
            {
                System.out.println("Input mismatch....Try again...");
                c=DF3.sc.nextLine();
            }
            if(c.equals("1"))
            {
                int hp=DF3.mhp;
                int sp=DF3.msp;
                int medicine=DF3.mmedicine;
                int khp=DF3.kmhp;
                int ksp=DF3.kmsp;
                int kmedicine=DF3.kmmedicine;
                int Zombie=500;
                int k=0;
                System.out.println("HP = "+hp+"/"+DF3.mhp);
                System.out.println("SP = "+sp+"/"+DF3.msp);
                System.out.println("Zombie = "+Zombie+"/500");
                System.out.println("----------------------------------------------");
                while(Zombie>0 && hp>0)
                {

                    if(k==0)
                    {
                        System.out.println("Your Turn");
                        System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                        String cc=DF3.sc.nextLine();

                        if(cc.equals("1"))
                        {
                            if(hp<=10)
                            {
                                System.out.println("Low HP... Try something else");
                                continue;
                            }
                            hp-=10;
                            Zombie-=25;
                            if(Zombie<=0)
                            {
                                Zombie=0;
                            }
                            System.out.println("You hit the Zombie and caused a damage of 25hp");
                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF3.sc.nextLine();
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
                            Zombie-=35;
                            if(Zombie<=0)
                            {
                                Zombie=0;
                            }
                            System.out.println("You hit the Zombie and caused a damage of 35hp");
                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF3.sc.nextLine();
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
                            Zombie-=25;
                            if(Zombie<=0)
                            {
                                Zombie=0;
                            }
                            System.out.println("You charmed the Zombie and caused a damage of 25hp");

                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF3.sc.nextLine();
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
                            Zombie-=35;
                            if(Zombie<=0)
                            {
                                Zombie=0;
                            }
                            System.out.println("You charmed the Zombie and caused a damage of 35hp");
                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("5"))
                        {
                            if(hp==DF3.mhp)
                            {
                                System.out.println("HP already full...");
                                continue;
                            }
                            hp=DF3.mhp;
                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Medicine taken......");
                            System.out.println("Press any key to continue.....");
                            DF3.sc.nextLine();
                            medicine--;
                            k++;
                        }
                        else
                        {
                            System.out.println("Input mismatch try again...");
                            continue;
                        }

                        if(Zombie<=0)
                        {
                            System.out.println("You Win");
                            System.out.println("Your Max HP, Max SP is incresed by 20");
                            DF3.mhp+=20;
                            DF3.msp+=20;
                            System.out.println("Kasumi's Max HP, Max SP is incresed by 20");
                            DF3.kmhp+=20;
                            DF3.kmsp+=20;
                            System.out.println("Max HP ="+DF3.kmhp);
                            System.out.println("Max SP ="+DF3.kmsp);
                            return;
                        }
                    }
                    else if(k==1)
                    {
                        if(khp<=0)
                        {
                            k++;
                            continue;
                        }
                        System.out.println("Kasumi's Turn");
                        System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(15sp)\n4.Magic 2(20sp)\n5.Use Medicine"+"(x"+kmedicine+")");
                        String cc=DF3.sc.nextLine();

                        if(cc.equals("1"))
                        {
                            if(khp<=10)
                            {
                                System.out.println("Low HP... Try something else");
                                continue;
                            }
                            khp-=10;
                            Zombie-=20;
                            if(Zombie<=0)
                            {
                                Zombie=0;
                            }
                            System.out.println("Kasumi hit the Zombie and caused a damage of 20hp");
                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF3.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("2"))
                        {

                            if(khp<=15)
                            {
                                System.out.println("Low HP... Try something else");
                                continue;
                            }

                            khp-=15;
                            Zombie-=25;
                            if(Zombie<=0)
                            {
                                Zombie=0;
                            }
                            System.out.println("Kasumi hit the Zombie and caused a damage of 25hp");
                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF3.sc.nextLine();
                            k++;
                        }

                        else if(cc.equals("3"))
                        {
                            if(ksp<15)
                            {
                                System.out.println("Low SP... Try something else");
                                continue;
                            }

                            ksp-=15;
                            Zombie-=35;
                            if(Zombie<=0)
                            {
                                Zombie=0;
                            }
                            System.out.println("Kasumi charmed the Zombie and caused a damage of 35hp");

                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            DF3.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("4"))
                        {

                            if(ksp<20)
                            {
                                System.out.println("Low SP... Try something else");
                                continue;
                            }

                            ksp-=20;
                            Zombie-=40;
                            if(Zombie<=0)
                            {
                                Zombie=0;
                            }
                            System.out.println("Kasumi charmed the Zombie and caused a damage of 40hp");
                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("5"))
                        {
                            if(khp==DF3.kmhp)
                            {
                                System.out.println("HP already full...");
                                continue;
                            }
                            khp=DF3.kmhp;
                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Medicine taken......");
                            System.out.println("Press any key to continue.....");
                            DF3.sc.nextLine();
                            medicine--;
                            k++;
                        }
                        else
                        {
                            System.out.println("Input mismatch try again...");
                            continue;
                        }

                        if(Zombie<=0)
                        {
                            System.out.println("You Win");
                            System.out.println("Your Max HP, Max SP is incresed by 20");
                            DF3.mhp+=20;
                            DF3.msp+=20;
                            System.out.println("Kasumi's Max HP, Max SP is incresed by 20");
                            DF3.kmhp+=20;
                            DF3.kmsp+=20;
                            System.out.println("Max HP ="+DF3.kmhp);
                            System.out.println("Max SP ="+DF3.kmsp);
                            return;
                        }
                    }
                    else if(k==2)
                    {
                        int b=(int)(Math.random()*10);
                        if(b>=0 && b<=2)
                        {
                            System.out.println("The Zombie slapped you...");
                            hp-=10;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                        }
                        else if(b>=3 && b<=5)
                        {

                            System.out.println("The zombie threw rocks at you....");
                            hp-=15;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                        }

                        else if(b>=6 && b<=8)
                        {

                            System.out.println("The zombie vomitted acid on you...");
                            hp-=20;  
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                        }
                        else if(b>=9)
                        {
                            System.out.println("The zombie pulled off an all out attack on You....");                        
                            hp-=35;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+DF3.mhp);
                            System.out.println("SP = "+sp+"/"+DF3.msp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                        }
                        k=4;
                        if(hp<=0)
                        {
                            hp=0;
                            System.out.println("You are dead.....");
                            System.out.println("\n1.Trygain\n2.Abort");
                            System.out.println("----------------------------------------------");
                            c=DF3.sc.nextLine();
                            while(c.equals("1")==false && c.equals("2")==false)
                            {
                                System.out.println("Input mismatch....Try again...");
                                c=DF3.sc.nextLine();
                            }

                        }
                        else if(hp<=10&&sp<10&&medicine==0)
                        {
                            System.out.println("Very low points to do anything.... \n1.Trygain\n2.Abort");
                            c=DF3.sc.nextLine();
                            while(c.equals("1")==false && c.equals("2")==false)
                            {
                                System.out.println("Input mismatch....Try again...");
                                c=DF3.sc.nextLine();
                            }
                        }
                    }
                    else if(k==4)
                    {
                        if(khp<=0)
                        {
                            k=0;
                            continue;
                        }

                        int b=(int)(Math.random()*10);
                        if(b>=0 && b<=2)
                        {
                            System.out.println("The Zombie slapped Kasumi...");
                            khp-=10;
                            if(khp<=0)
                            {
                                khp=0;
                            }
                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                        }
                        else if(b>=3 && b<=5)
                        {

                            System.out.println("The zombie threw rocks at Kasumi....");
                            khp-=15;
                            if(khp<=0)
                            {
                                khp=0;
                            }
                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                        }

                        else if(b>=6 && b<=8)
                        {

                            System.out.println("The zombie vomitted acid on Kasumi...");
                            khp-=20;  
                            if(khp<=0)
                            {
                                khp=0;
                            }
                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                        }
                        else if(b>=9)
                        {
                            System.out.println("The zombie pulled off an all out attack on Kasumi....");                        
                            khp-=35;
                            if(khp<=0)
                            {
                                khp=0;
                            }
                            System.out.println("HP = "+khp+"/"+DF3.kmhp);
                            System.out.println("SP = "+ksp+"/"+DF3.kmsp);
                            System.out.println("Zombie = "+Zombie+"/500");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            DF3.sc.nextLine();
                        }
                        k=0;
                        if(khp<=0)
                        {
                            khp=0;
                            System.out.println("Kasumi is dead.....");
                            System.out.println("Press any key to continue.....");
                            System.out.println("----------------------------------------------");
                            DF3.sc.nextLine();
                        }
                        else if(khp<=10&&ksp<15&&kmedicine==0)
                        {
                            System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                            DF3.sc.nextLine();                 
                        }
                    }
                }
            }
            if (c.equals("2"))
            {
                System.out.println("You decided to run away");
                System.out.println("Press any key to continue");
                DF3.sc.nextLine();
                return;
            }
        }
    }
}