package RPG;


class Kyouma
{
    public static void main()
    {
        while(true)
        {
            BASE KY=new BASE();
            int hp=KY.mhp;
            int sp=KY.msp;
            int medicine=KY.mmedicine;
            int khp=KY.kmhp;
            int ksp=KY.kmsp;
            int kmedicine=KY.kmmedicine;
            int jhp=KY.jmhp;
            int jsp=KY.jmsp;
            int jmedicine=KY.jmmedicine;
            int Houin_Kyouma=750;
            int k=0;
            System.out.println("HP = "+hp+"/"+KY.mhp);
            System.out.println("SP = "+sp+"/"+KY.msp);
            System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
            System.out.println("----------------------------------------------");
            while(Houin_Kyouma>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=KY.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Houin_Kyouma-=25;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("You hit Houin Kyouma and caused a damage of 25hp");
                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
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
                        Houin_Kyouma-=35;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("You hit Houin Kyouma and caused a damage of 35hp");
                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
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
                        Houin_Kyouma-=25;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("You charmed Houin Kyouma and caused a damage of 25hp");

                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
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
                        Houin_Kyouma-=35;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("You charmed the Houin_Kyouma and caused a damage of 35hp");
                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==KY.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        hp=KY.mhp;
                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Houin_Kyouma<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        KY.mhp+=30;
                        KY.msp+=30;
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        KY.kmhp+=30;
                        KY.kmsp+=30;
                        System.out.println("Max HP ="+KY.kmhp);
                        System.out.println("Max SP ="+KY.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        KY.jmhp+=30;
                        KY.jmsp+=30;
                        System.out.println("Max HP ="+KY.jmhp);
                        System.out.println("Max SP ="+KY.jmsp);
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
                    String cc=KY.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(khp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        khp-=10;
                        Houin_Kyouma-=20;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("Kasumi hit Houin Kyouma and caused a damage of 20hp");
                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
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
                        Houin_Kyouma-=25;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("Kasumi hit Houin Kyouma and caused a damage of 25hp");
                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
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
                        Houin_Kyouma-=35;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("Kasumi charmed Houin Kyouma and caused a damage of 35hp");

                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
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
                        Houin_Kyouma-=40;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("Kasumi charmed Houin Kyouma and caused a damage of 40hp");
                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(khp==KY.kmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        khp=KY.kmhp;
                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Houin_Kyouma<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        KY.mhp+=30;
                        KY.msp+=30;
                        System.out.println("Max HP ="+KY.mhp);
                        System.out.println("Max SP ="+KY.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        KY.kmhp+=30;
                        KY.kmsp+=30;
                        System.out.println("Max HP ="+KY.kmhp);
                        System.out.println("Max SP ="+KY.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        KY.jmhp+=30;
                        KY.jmsp+=30;
                        System.out.println("Max HP ="+KY.jmhp);
                        System.out.println("Max SP ="+KY.jmsp);
                        return;
                    }
                }
                else if(k==2)
                {
                    if(jhp<=0)
                    {
                        k++;
                        continue;
                    }
                    System.out.println("Junpei's Turn");
                    System.out.println("1.Strike(15hp)\n2.Slash(20hp)\n3.Magic 1(10sp)\n4.Magic 2(15sp)\n5.Use Medicine"+"(x"+jmedicine+")");
                    String cc=KY.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(jhp<=15)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        jhp-=15;
                        Houin_Kyouma-=35;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("Junpei hit Houin Kyouma and caused a damage of 35hp");
                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("2"))
                    {

                        if(jhp<=20)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }

                        jhp-=20;
                        Houin_Kyouma-=40;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("Junpei hit Houin Kyouma and caused a damage of 40hp");
                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
                        k++;
                    }

                    else if(cc.equals("3"))
                    {
                        if(jsp<10)
                        {
                            System.out.println("Low SP... Try something else");
                            continue;
                        }

                        jsp-=10;
                        Houin_Kyouma-=20;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("Junpei charmed Houin Kyouma and caused a damage of 20hp");

                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("4"))
                    {

                        if(jsp<15)
                        {
                            System.out.println("Low SP... Try something else");
                            continue;
                        }

                        jsp-=15;
                        Houin_Kyouma-=25;
                        if(Houin_Kyouma<=0)
                        {
                            Houin_Kyouma=0;
                        }
                        System.out.println("Junpei charmed Houin Kyouma and caused a damage of 25hp");
                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(jhp==KY.jmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        jhp=KY.jmhp;
                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        KY.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Houin_Kyouma<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        KY.mhp+=30;
                        KY.msp+=30;
                        System.out.println("Max HP ="+KY.mhp);
                        System.out.println("Max SP ="+KY.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        KY.kmhp+=30;
                        KY.kmsp+=30;
                        System.out.println("Max HP ="+KY.kmhp);
                        System.out.println("Max SP ="+KY.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        KY.jmhp+=30;
                        KY.jmsp+=30;
                        System.out.println("Max HP ="+KY.jmhp);
                        System.out.println("Max SP ="+KY.jmsp);
                        return;
                    }
                }
                else if(k==3)
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("Houin Kyouma cleaved you with his swords...");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Houin Kyouma shot you with a dark pulse....");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Houin Kyouma caused an earthquake...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Houin Kyouma struck you with lightning....");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+KY.mhp);
                        System.out.println("SP = "+sp+"/"+KY.msp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    k=4;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        KY.sc.nextLine();
                        continue;

                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... \nPress any key to continue......");
                        KY.sc.nextLine();
                        continue;
                    }
                }

                else if(k==4)
                {
                    if(khp<=0)
                    {
                        k=5;
                        continue;
                    }

                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("Houin Kyouma cleaved Kasumi with his swords...");
                        khp-=10;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Houin Kyouma shot Kasumi with a dark pulse....");
                        khp-=15;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Houin Kyouma caused an earthquake...");
                        khp-=20;  
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Houin Kyouma struck Kasumi with lightning....");                        
                        khp-=35;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+KY.kmhp);
                        System.out.println("SP = "+ksp+"/"+KY.kmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    k=5;
                    if(khp<=0)
                    {
                        khp=0;
                        System.out.println("Kasumi is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        KY.sc.nextLine();
                    }
                    else if(khp<=10&&ksp<15&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        KY.sc.nextLine();                 
                    }
                }
                else if(k==5)
                {
                    if(jhp<=0)
                    {
                        k=0;
                        continue;
                    }

                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("Houin Kyouma cleaved Junpei with his swords...");
                        jhp-=10;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Houin Kyouma shot Junpei with a dark pulse....");
                        jhp-=15;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Houin Kyouma caused an earthquake...");
                        jhp-=20;  
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Houin Kyouma struck Junpei with lightning....");                        
                        jhp-=35;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+KY.jmhp);
                        System.out.println("SP = "+jsp+"/"+KY.jmsp);
                        System.out.println("Houin_Kyouma = "+Houin_Kyouma+"/750");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        KY.sc.nextLine();
                    }
                    k=0;
                    if(jhp<=0)
                    {
                        jhp=0;
                        System.out.println("Junpei is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        KY.sc.nextLine();
                    }
                    else if(jhp<=15&&jsp<10&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        KY.sc.nextLine();                 
                    }
                }
            }
        }
    }
}