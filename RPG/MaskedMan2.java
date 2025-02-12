package RPG;

class MaskedMan2
{
    public static void main()
    {
        BASE MM2 = new BASE();
        while(true)
        {

            int hp=MM2.mhp;
            int sp=MM2.msp;
            int medicine=MM2.mmedicine;
            int khp=MM2.kmhp;
            int ksp=MM2.kmsp;
            int kmedicine=MM2.kmmedicine;
            int jhp=MM2.jmhp;
            int jsp=MM2.jmsp;
            int jmedicine=MM2.jmmedicine;
            int Masked_Man=900;
            int k=0;
            System.out.println("HP = "+hp+"/"+MM2.mhp);
            System.out.println("SP = "+sp+"/"+MM2.msp);
            System.out.println("Masked Man = "+Masked_Man+"/900");
            System.out.println("----------------------------------------------");
            while(Masked_Man>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=MM2.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Masked_Man-=35;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("You hit the Masked Man and caused a damage of 35hp");
                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=45;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("You hit the Masked Man and caused a damage of 45hp");
                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=35;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("You charmed the Masked Man and caused a damage of 35hp");

                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=45;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("You charmed the Masked_Man and caused a damage of 45hp");
                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==MM2.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        hp=MM2.mhp;
                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        MM2.mhp+=30;
                        MM2.msp+=30;
                        System.out.println("Max HP ="+MM2.mhp);
                        System.out.println("Max SP ="+MM2.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        MM2.kmhp+=30;
                        MM2.kmsp+=30;
                        System.out.println("Max HP ="+MM2.kmhp);
                        System.out.println("Max SP ="+MM2.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        MM2.jmhp+=30;
                        MM2.jmsp+=30;
                        System.out.println("Max HP ="+MM2.jmhp);
                        System.out.println("Max SP ="+MM2.jmsp);
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
                    String cc=MM2.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(khp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        khp-=10;
                        Masked_Man-=30;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Kasumi hit the Masked Man and caused a damage of 30hp");
                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=35;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Kasumi hit the Masked Man and caused a damage of 35hp");
                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=45;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Kasumi charmed the Masked Man and caused a damage of 45hp");

                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=50;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Kasumi charmed the Masked Man and caused a damage of 50hp");
                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(khp==MM2.kmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        khp=MM2.kmhp;
                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        MM2.mhp+=30;
                        MM2.msp+=30;
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        MM2.kmhp+=30;
                        MM2.kmsp+=30;
                        System.out.println("Max HP ="+MM2.kmhp);
                        System.out.println("Max SP ="+MM2.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        MM2.jmhp+=30;
                        MM2.jmsp+=30;
                        System.out.println("Max HP ="+MM2.jmhp);
                        System.out.println("Max SP ="+MM2.jmsp);
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
                    String cc=MM2.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(jhp<=15)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        jhp-=10;
                        Masked_Man-=45;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Junpei hit the Masked Man and caused a damage of 45hp");
                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=50;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Junpei hit the Masked Man and caused a damage of 50hp");
                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=25;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Junpei charmed the Masked Man and caused a damage of 30hp");

                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        Masked_Man-=35;
                        if(Masked_Man<=0)
                        {
                            Masked_Man=0;
                        }
                        System.out.println("Junpei charmed the Masked Man and caused a damage of 35hp");
                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(jhp==MM2.jmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        jhp=MM2.jmhp;
                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        MM2.sc.nextLine();
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
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        MM2.mhp+=30;
                        MM2.msp+=30;
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        MM2.kmhp+=30;
                        MM2.kmsp+=30;
                        System.out.println("Max HP ="+MM2.kmhp);
                        System.out.println("Max SP ="+MM2.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        MM2.jmhp+=30;
                        MM2.jmsp+=30;
                        System.out.println("Max HP ="+MM2.jmhp);
                        System.out.println("Max SP ="+MM2.jmsp);
                        return;
                    }
                }
                else if(k==3)
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("The Masked Man throws a shadow ball at you...");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("The Masked Man slashes you with a wraith claw....");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("The Masked Man creates a black hole...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("The Masked Man summons an evening star....");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+MM2.mhp);
                        System.out.println("SP = "+sp+"/"+MM2.msp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    k=4;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        MM2.sc.nextLine();
                        continue;

                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... \nPress any key to continue......");
                        MM2.sc.nextLine();
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
                        System.out.println("The Masked Man throws a shadow ball at Kasumi...");
                        khp-=10;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("The Masked Man slashes Kasumi with a wraith claw....");
                        khp-=15;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("The Masked Man creates a black hole...");
                        khp-=20;  
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println("The Masked Man summons an evening star....");                        
                        khp-=35;
                        if(khp<=0)
                        {
                            khp=0;
                        }
                        System.out.println("HP = "+khp+"/"+MM2.kmhp);
                        System.out.println("SP = "+ksp+"/"+MM2.kmsp);
                        System.out.println("Masked_Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    k=5;
                    if(khp<=0)
                    {
                        khp=0;
                        System.out.println("Kasumi is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        MM2.sc.nextLine();
                    }
                    else if(khp<=10&&ksp<15&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        MM2.sc.nextLine();                 
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
                        System.out.println("The Masked Man throws a shadow ball at Junpei...");
                        jhp-=10;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("The Masked Man slashes Junpei with a wraith claw....");
                        jhp-=15;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("The Masked Man creates a black hole...");
                        jhp-=20;  
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    else if(b>=9)
                    {
                        System.out.println(" The Masked Man summons an evening star....");                        
                        jhp-=35;
                        if(jhp<=0)
                        {
                            jhp=0;
                        }
                        System.out.println("HP = "+jhp+"/"+MM2.jmhp);
                        System.out.println("SP = "+jsp+"/"+MM2.jmsp);
                        System.out.println("Masked_Man = "+Masked_Man+"/900");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        MM2.sc.nextLine();
                    }
                    k=0;
                    if(jhp<=0)
                    {
                        jhp=0;
                        System.out.println("Junpei is dead.....");
                        System.out.println("Press any key to continue.....");
                        System.out.println("----------------------------------------------");
                        MM2.sc.nextLine();
                    }
                    else if(jhp<=15&&jsp<10&&kmedicine==0)
                    {
                        System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                        MM2.sc.nextLine();                 
                    }
                }
            }
        }
    }
}