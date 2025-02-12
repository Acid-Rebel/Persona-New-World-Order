package RPG;


class MaskedMan1
{
    public static void main()
    {
        BASE MM1=new BASE();
        while(true)
        {
            int hp=MM1.mhp;
            int sp=MM1.msp;
            int medicine=MM1.mmedicine;
            int khp=MM1.kmhp;
            int ksp=MM1.kmsp;
            int kmedicine=MM1.kmmedicine;
            int Masked_Man=1500;
            int k=0;
            System.out.println("HP = "+hp+"/"+MM1.mhp);
            System.out.println("SP = "+sp+"/"+MM1.msp);
            System.out.println("Masked Man = "+Masked_Man+"/1500");
            System.out.println("----------------------------------------------");
            while(Masked_Man>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=MM1.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Masked_Man-=1;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("You hit the Masked Man and caused a damage of 1hp");
                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM1.sc.nextLine();
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
                        Masked_Man-=2;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("You hit the Masked Man and caused a damage of 2hp");
                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM1.sc.nextLine();
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
                        Masked_Man-=1;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("You charmed the Masked Man and caused a damage of 1hp");

                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM1.sc.nextLine();
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
                        Masked_Man-=2;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("You charmed the Masked_Man and caused a damage of 2hp");
                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==MM1.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        hp=MM1.mhp;
                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        MM1.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Masked_Man<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 10");
                        MM1.mhp+=10;
                        MM1.msp+=10;
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 10");
                        MM1.kmhp+=10;
                        MM1.kmsp+=10;
                        System.out.println("Max HP ="+MM1.mhp);
                        System.out.println("Max SP ="+MM1.msp);
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
                    String cc=MM1.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(khp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        khp-=10;
                        Masked_Man-=1;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Kasumi hit the Masked Man and caused a damage of 1hp");
                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM1.sc.nextLine();
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
                        Masked_Man-=2;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Kasumi hit the Masked Man and caused a damage of 2hp");
                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM1.sc.nextLine();
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
                        Masked_Man-=1;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Kasumi charmed the Masked Man and caused a damage of 1hp");

                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM1.sc.nextLine();
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
                        Masked_Man-=2;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Kasumi charmed the Masked Man and caused a damage of 2hp");
                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(khp==MM1.kmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        khp=MM1.kmhp;
                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        MM1.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Masked_Man<=0)
                    {
                        System.out.println("You are not suppsoed to win but OK");
                        System.out.println("Your Max HP, Max SP is incresed by 10");
                        MM1.mhp+=10;
                        MM1.msp+=10;
                        System.out.println("Max HP ="+MM1.mhp);
                        System.out.println("Max SP ="+MM1.msp);
                        return;
                    }
                }
                else if(k==2)
                {
                    int b=(int)(Math.random()*10);
                    System.out.println("Masked Man:\"Is that the best you can do?\"");
                    if(b>=0 && b<=2)
                    {
                        System.out.println("The Masked Man throws a shadow ball at you...");
                        hp-=50;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("The Masked Man slashes you with a wraith claw....");
                        hp-=50;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("The Masked Man creates a black hole...");
                        hp-=50;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("The Masked Man summons an evening star....");                        
                        hp-=50;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+MM1.mhp);
                        System.out.println("SP = "+sp+"/"+MM1.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                    }
                    k=3;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are defeated.....");

                        MM1.sc.nextLine();
                        return;

                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... \n1.Press any key to continue");
                        MM1.sc.nextLine();
                    }
                }
                else if(k==3)
                {
                    if(khp<=0)
                    {
                        k=0;
                        continue;
                    }
                    System.out.println("Masked Man:\"You think you can save the world with strength like that?\"");
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("The Masked Man throws a shadow ball at Kasumi...");
                        khp-=50;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("The Masked Man slashes Kasumi with a wraith claw....");
                        khp-=50;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("he Masked Man creates a black hole...");
                        khp-=50;  
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("The Masked Man summons an evening star....");                     
                        khp-=50;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+MM1.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM1.kmsp);
                        System.out.println("Masked_Man = "+Masked_Man+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM1.sc.nextLine();
                    }
                    k=0;
                    if(khp<=0)
                    {
                        khp=0;
                        System.out.println("Kasumi is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        MM1.sc.nextLine();
                        continue;
                    }
                    else if(khp<=10&&ksp<15&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        MM1.sc.nextLine();
                        continue;
                    }
                }
            }
        }
    }
}