package RPG;


class Angel3
{
    public static void main()
    {
        BASE A3=new BASE();
        while(true)
        {

            int hp=A3.mhp;
            int sp=A3.msp;
            int medicine=A3.mmedicine;
            int khp=A3.kmhp;
            int ksp=A3.kmsp;
            int kmedicine=A3.kmmedicine;
            int jhp=A3.jmhp;
            int jsp=A3.jmsp;
            int jmedicine=A3.jmmedicine;
            int Metatron=850;
            int k=0;
            System.out.println("HP = "+hp+"/"+A3.mhp);
            System.out.println("SP = "+sp+"/"+A3.msp);
            System.out.println("Metatron = "+Metatron+"/850");
            System.out.println("----------------------------------------------");
            while(Metatron>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=A3.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Metatron-=30;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("You hit the Metatron and caused a damage of 30hp");
                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=40;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("You hit the Metatron and caused a damage of 40hp");
                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=30;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("You charmed the Metatron and caused a damage of 30hp");

                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=40;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("You charmed the Metatron and caused a damage of 40hp");
                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==A3.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        hp=A3.mhp;
                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Metatron<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A3.mhp+=30;
                        A3.msp+=30;
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A3.kmhp+=30;
                        A3.kmsp+=30;
                        System.out.println("Max HP ="+A3.kmhp);
                        System.out.println("Max SP ="+A3.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A3.jmhp+=30;
                        A3.jmsp+=30;
                        System.out.println("Max HP ="+A3.jmhp);
                        System.out.println("Max SP ="+A3.jmsp);
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
                    String cc=A3.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(khp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        khp-=10;
                        Metatron-=25;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("Kasumi hit the Metatron and caused a damage of 25hp");
                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=30;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("Kasumi hit the Metatron and caused a damage of 30hp");
                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=40;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("Kasumi charmed the Metatron and caused a damage of 40hp");

                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=45;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("Kasumi charmed the Metatron and caused a damage of 45hp");
                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(khp==A3.kmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        khp=A3.kmhp;
                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Metatron<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A3.mhp+=30;
                        A3.msp+=30;
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A3.kmhp+=30;
                        A3.kmsp+=30;
                        System.out.println("Max HP ="+A3.kmhp);
                        System.out.println("Max SP ="+A3.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A3.jmhp+=30;
                        A3.jmsp+=30;
                        System.out.println("Max HP ="+A3.jmhp);
                        System.out.println("Max SP ="+A3.jmsp);
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
                    String cc=A3.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(jhp<=15)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        jhp-=15;
                        Metatron-=40;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("Junpei hit the Metatron and caused a damage of 40hp");
                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=45;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("Junpei hit the Metatron and caused a damage of 45hp");
                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=25;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("Junpei charmed the Metatron and caused a damage of 25hp");

                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
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
                        Metatron-=30;
                        if(Metatron<=0)
                        {
                            Metatron=0;
                        }
                        System.out.println("Junpei charmed the Metatron and caused a damage of 30hp");
                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(jhp==A3.jmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        jhp=A3.jmhp;
                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A3.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Metatron<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A3.mhp+=30;
                        A3.msp+=30;
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A3.kmhp+=30;
                        A3.kmsp+=30;
                        System.out.println("Max HP ="+A3.kmhp);
                        System.out.println("Max SP ="+A3.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A3.jmhp+=30;
                        A3.jmsp+=30;
                        System.out.println("Max HP ="+A3.jmhp);
                        System.out.println("Max SP ="+A3.jmsp);
                        return;
                    }
                }
                else if(k==3)
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("Metatron punches you...");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Metatron shoots arrows of light at you....");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Metatron throws an energy ball at you...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Metatron rains down spears of light at you...");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A3.mhp);
                        System.out.println("SP = "+sp+"/"+A3.msp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    k=4;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A3.sc.nextLine();
                        continue;

                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... \nPress any key to continue......");
                        A3.sc.nextLine();
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
                        System.out.println("Metatron punches Kasumi...");
                        khp-=10;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Metatron shoots arrows of light at Kasumi....");
                        khp-=15;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Metatron throws an energy ball at Kasumi...");
                        khp-=20;  
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Metatron rains down spears of light at Kasumi...");                        
                        khp-=35;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A3.kmhp);
                        System.out.println("SP = "+ksp+"/"+A3.kmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    k=5;
                    if(khp<=0)
                    {
                        khp=0;
                        System.out.println("Kasumi is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A3.sc.nextLine();
                    }
                    else if(khp<=10&&ksp<15&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        A3.sc.nextLine();                 
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
                        System.out.println("Metatron punches Junpei...");
                        jhp-=10;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Metatron shoots arrows of light at Junpei....");
                        jhp-=15;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Metatron throws an energy ball at Junpei...");
                        jhp-=20;  
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Metatron rains down spears of light at Junpei...");                        
                        jhp-=35;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A3.jmhp);
                        System.out.println("SP = "+jsp+"/"+A3.jmsp);
                        System.out.println("Metatron = "+Metatron+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A3.sc.nextLine();
                    }
                    k=0;
                    if(jhp<=0)
                    {
                        jhp=0;
                        System.out.println("Junpei is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A3.sc.nextLine();
                    }
                    else if(jhp<=15&&jsp<10&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        A3.sc.nextLine();                 
                    }
                }
            }
        }
    }
}