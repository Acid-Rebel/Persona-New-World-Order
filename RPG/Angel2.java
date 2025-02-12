package RPG;


class Angel2
{
    public static void main()
    {
        BASE A2=new BASE();
        while(true)
        {

            int hp=A2.mhp;
            int sp=A2.msp;
            int medicine=A2.mmedicine;
            int khp=A2.kmhp;
            int ksp=A2.kmsp;
            int kmedicine=A2.kmmedicine;
            int jhp=A2.jmhp;
            int jsp=A2.jmsp;
            int jmedicine=A2.jmmedicine;
            int Beelzebub=850;
            int k=0;
            System.out.println("HP = "+hp+"/"+A2.mhp);
            System.out.println("SP = "+sp+"/"+A2.msp);
            System.out.println("Beelzebub = "+Beelzebub+"/850");
            System.out.println("----------------------------------------------");
            while(Beelzebub>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=A2.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Beelzebub-=30;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("You hit the Beelzebub and caused a damage of 30hp");
                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=40;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("You hit the Beelzebub and caused a damage of 40hp");
                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=30;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("You charmed the Beelzebub and caused a damage of 30hp");

                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=40;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("You charmed the Beelzebub and caused a damage of 40hp");
                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==A2.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        hp=A2.mhp;
                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Beelzebub<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A2.mhp+=30;
                        A2.msp+=30;
                        System.out.println("Max HP ="+A2.mhp);
                        System.out.println("Max SP ="+A2.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A2.kmhp+=30;
                        A2.kmsp+=30;
                        System.out.println("Max HP ="+A2.kmhp);
                        System.out.println("Max SP ="+A2.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A2.jmhp+=30;
                        A2.jmsp+=30;
                        System.out.println("Max HP ="+A2.jmhp);
                        System.out.println("Max SP ="+A2.jmsp);
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
                    String cc=A2.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(khp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        khp-=10;
                        Beelzebub-=25;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("Kasumi hit the Beelzebub and caused a damage of 25hp");
                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=30;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("Kasumi hit the Beelzebub and caused a damage of 30hp");
                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=40;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("Kasumi charmed the Beelzebub and caused a damage of 40hp");

                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=45;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("Kasumi charmed the Beelzebub and caused a damage of 45hp");
                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(khp==A2.kmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        khp=A2.kmhp;
                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Beelzebub<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A2.mhp+=30;
                        A2.msp+=30;
                        System.out.println("Max HP ="+A2.mhp);
                        System.out.println("Max SP ="+A2.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A2.kmhp+=30;
                        A2.kmsp+=30;
                        System.out.println("Max HP ="+A2.kmhp);
                        System.out.println("Max SP ="+A2.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A2.jmhp+=30;
                        A2.jmsp+=30;
                        System.out.println("Max HP ="+A2.jmhp);
                        System.out.println("Max SP ="+A2.jmsp);
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
                    String cc=A2.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(jhp<=15)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        jhp-=15;
                        Beelzebub-=40;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("Junpei hit the Beelzebub and caused a damage of 40hp");
                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+jsp+"/"+A2.jmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=45;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("Junpei hit the Beelzebub and caused a damage of 45hp");
                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=25;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("Junpei charmed the Beelzebub and caused a damage of 25hp");

                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+jsp+"/"+A2.jmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
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
                        Beelzebub-=30;
                        if(Beelzebub<=0)
                        {
                            Beelzebub=0;
                        }
                        System.out.println("Junpei charmed the Beelzebub and caused a damage of 30hp");
                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+jsp+"/"+A2.jmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(jhp==A2.jmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        jhp=A2.jmhp;
                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+jsp+"/"+A2.jmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A2.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Beelzebub<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A2.mhp+=30;
                        A2.msp+=30;
                        System.out.println("Max HP ="+A2.mhp);
                        System.out.println("Max SP ="+A2.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A2.kmhp+=30;
                        A2.kmsp+=30;
                        System.out.println("Max HP ="+A2.kmhp);
                        System.out.println("Max SP ="+A2.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A2.jmhp+=30;
                        A2.jmsp+=30;
                        System.out.println("Max HP ="+A2.jmhp);
                        System.out.println("Max SP ="+A2.jmsp);
                        return;
                    }
                }
                else if(k==3)
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("Beelzebub hits you with his staff...");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Beelzebub cuts you with it's wing");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Beelzebub curses you with dark energy...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Beelzebub aims an onslaught of flies at you...");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A2.mhp);
                        System.out.println("SP = "+sp+"/"+A2.msp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    k=4;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A2.sc.nextLine();
                        continue;

                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... \nPress any key to continue......");
                        A2.sc.nextLine();
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
                        System.out.println("Beelzebub hits Kasumi with his staff...");
                        khp-=10;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Beelzebub cuts Kasumi with it's wing");
                        khp-=15;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Beelzebub curses Kasumi with dark energy...");
                        khp-=20;  
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Beelzebub aims an onslaught of flies at Kasumi...");                        
                        khp-=35;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A2.kmhp);
                        System.out.println("SP = "+ksp+"/"+A2.kmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    k=5;
                    if(khp<=0)
                    {
                        khp=0;
                        System.out.println("Kasumi is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A2.sc.nextLine();
                    }
                    else if(khp<=10&&ksp<15&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        A2.sc.nextLine();                 
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
                        System.out.println("Beelzebub hits Junpei with his staff...");
                        jhp-=10;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+jsp+"/"+A2.jmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Beelzebub cuts Jupei with it's wing");
                        jhp-=15;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+jsp+"/"+A2.jmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Beelzebub curses Junpei with dark energy...");
                        jhp-=20;  
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+jsp+"/"+A2.jmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Beelzebub aims an onslaught of flies at Junpei...");                        
                        jhp-=35;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A2.jmhp);
                        System.out.println("SP = "+jsp+"/"+A2.jmsp);
                        System.out.println("Beelzebub = "+Beelzebub+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A2.sc.nextLine();
                    }
                    k=0;
                    if(jhp<=0)
                    {
                        jhp=0;
                        System.out.println("Junpei is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A2.sc.nextLine();
                    }
                    else if(jhp<=15&&jsp<10&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        A2.sc.nextLine();                 
                    }
                }
            }
        }
    }
}