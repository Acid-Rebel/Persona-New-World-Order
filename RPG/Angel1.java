package RPG;


class Angel1
{
    public static void main()
    {
        while(true)
        {
            BASE A1=new BASE();
            int hp=A1.mhp;
            int sp=A1.msp;
            int medicine=A1.mmedicine;
            int khp=A1.kmhp;
            int ksp=A1.kmsp;
            int kmedicine=A1.kmmedicine;
            int jhp=A1.jmhp;
            int jsp=A1.jmsp;
            int jmedicine=A1.jmmedicine;
            int Archangel=850;
            int k=0;
            System.out.println("HP = "+hp+"/"+A1.mhp);
            System.out.println("SP = "+sp+"/"+A1.msp);
            System.out.println("Archangel = "+Archangel+"/850");
            System.out.println("----------------------------------------------");
            while(Archangel>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=A1.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Archangel-=30;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("You hit the Archangel and caused a damage of 30hp");
                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=40;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("You hit the Archangel and caused a damage of 40hp");
                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=30;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("You charmed the Archangel and caused a damage of 30hp");

                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=40;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("You charmed the Archangel and caused a damage of 40hp");
                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==A1.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        hp=A1.mhp;
                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Archangel<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A1.mhp+=30;
                        A1.msp+=30;
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A1.kmhp+=30;
                        A1.kmsp+=30;
                        System.out.println("Max HP ="+A1.kmhp);
                        System.out.println("Max SP ="+A1.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A1.jmhp+=30;
                        A1.jmsp+=30;
                        System.out.println("Max HP ="+A1.jmhp);
                        System.out.println("Max SP ="+A1.jmsp);
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
                    String cc=A1.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(khp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        khp-=10;
                        Archangel-=25;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("Kasumi hit the Archangel and caused a damage of 25hp");
                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=30;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("Kasumi hit the Archangel and caused a damage of 30hp");
                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=40;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("Kasumi charmed the Archangel and caused a damage of 40hp");

                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=45;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("Kasumi charmed the Archangel and caused a damage of 45hp");
                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(khp==A1.kmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        khp=A1.kmhp;
                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Archangel<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A1.mhp+=30;
                        A1.msp+=30;
                        
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A1.kmhp+=30;
                        A1.kmsp+=30;
                        System.out.println("Max HP ="+A1.kmhp);
                        System.out.println("Max SP ="+A1.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A1.jmhp+=30;
                        A1.jmsp+=30;
                        System.out.println("Max HP ="+A1.jmhp);
                        System.out.println("Max SP ="+A1.jmsp);
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
                    String cc=A1.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(jhp<=15)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        jhp-=15;
                        Archangel-=40;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("Junpei hit the Archangel and caused a damage of 40hp");
                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.jmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=45;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("Junpei hit the Archangel and caused a damage of 45hp");
                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.jmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=25;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("Junpei charmed the Archangel and caused a damage of 25hp");

                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
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
                        Archangel-=30;
                        if(Archangel<=0)
                        {
                            Archangel=0;
                        }
                        System.out.println("Junpei charmed the Archangel and caused a damage of 30hp");
                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(jhp==A1.jmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        jhp=A1.jmhp;
                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.jmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        A1.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Archangel<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        A1.mhp+=30;
                        A1.msp+=30;
                        System.out.println("Max HP ="+A1.mhp);
                        System.out.println("Max SP ="+A1.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        A1.kmhp+=30;
                        A1.kmsp+=30;
                        System.out.println("Max HP ="+A1.kmhp);
                        System.out.println("Max SP ="+A1.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        A1.jmhp+=30;
                        A1.jmsp+=30;
                        System.out.println("Max HP ="+A1.jmhp);
                        System.out.println("Max SP ="+A1.jmsp);
                        return;
                    }
                }
                else if(k==3)
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("Archangel sliced you with his blade...");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Archangel blew a gust of wind at you...");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Archangel shot you with an arrow of wind...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Archangel slashes you with his sword of pure light...");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+A1.mhp);
                        System.out.println("SP = "+sp+"/"+A1.msp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    k=4;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A1.sc.nextLine();
                        continue;

                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... \nPress any key to continue......");
                        A1.sc.nextLine();
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
                        System.out.println("Archangel sliced Kasumi with his blade...");
                        khp-=10;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Archangel blew a gust of wind at Kasumi...");
                        khp-=15;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Archangel shot Kasumi with an arrow of wind...");
                        khp-=20;  
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Archangel slashes Kasumi with his sword of pure light...");                        
                        khp-=35;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+A1.kmhp);
                        System.out.println("SP = "+ksp+"/"+A1.kmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    k=5;
                    if(khp<=0)
                    {
                        khp=0;
                        System.out.println("Kasumi is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A1.sc.nextLine();
                    }
                    else if(khp<=10&&ksp<15&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        A1.sc.nextLine();                 
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
                        System.out.println("Archangel sliced Junpei with his blade...");
                        jhp-=10;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.jmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("Archangel blew a gust of wind at Junpei...");
                        jhp-=15;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.jmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("Archangel shot Junpei with an arrow of wind...");
                        jhp-=20;  
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.jmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("Archangel slashes Junpei with his sword of pure light...");                        
                        jhp-=35;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+A1.jmhp);
                        System.out.println("SP = "+jsp+"/"+A1.jmsp);
                        System.out.println("Archangel = "+Archangel+"/850");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        A1.sc.nextLine();
                    }
                    k=0;
                    if(jhp<=0)
                    {
                        jhp=0;
                        System.out.println("Junpei is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        A1.sc.nextLine();
                    }
                    else if(jhp<=15&&jsp<10&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        A1.sc.nextLine();                 
                    }
                }
            }
        }
    }
}