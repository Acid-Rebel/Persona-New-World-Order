package RPG;


class Lucifer
{
    public static void main()
    {
        BASE L=new BASE();
        while(true)
        {

            int hp=L.mhp;
            int sp=L.msp;
            int medicine=L.mmedicine;
            int khp=L.kmhp;
            int ksp=L.kmsp;
            int kmedicine=L.kmmedicine;
            int jhp=L.jmhp;
            int jsp=L.jmsp;
            int jmedicine=L.jmmedicine;
            int Lucifer=1500;
            int k=0;
            System.out.println("HP = "+hp+"/"+L.mhp);
            System.out.println("SP = "+sp+"/"+L.msp);
            System.out.println("Lucifer = "+Lucifer+"/1500");
            System.out.println("----------------------------------------------");
            while(Lucifer>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=L.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Lucifer-=35;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("You hit Lucifer and caused a damage of 35hp");
                        System.out.println("HP = "+hp+"/"+L.mhp);
                        System.out.println("SP = "+sp+"/"+L.msp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
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
                        Lucifer-=45;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("You hit Lucifer and caused a damage of 45hp");
                        System.out.println("HP = "+hp+"/"+L.mhp);
                        System.out.println("SP = "+sp+"/"+L.msp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
                        k++;
                    }

                    else if(cc.equals("3"))
                    {
                        if(sp<10)
                        {
                            System.out.println("Low SP... Try something else");
                            continue;
                        }

                        sp-=15;
                        Lucifer-=35;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("You charmed Lucifer and caused a damage of 35hp");

                        System.out.println("HP = "+hp+"/"+L.mhp);
                        System.out.println("SP = "+sp+"/"+L.msp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
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
                        Lucifer-=45;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("You charmed Lucifer and caused a damage of 45hp");
                        System.out.println("HP = "+hp+"/"+L.mhp);
                        System.out.println("SP = "+sp+"/"+L.msp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        L.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==L.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        hp=L.mhp;
                        System.out.println("HP = "+hp+"/"+L.mhp);
                        System.out.println("SP = "+sp+"/"+L.msp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Lucifer<=0)
                    {
                        System.out.println("You Win");
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
                    String cc=L.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(khp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        khp-=10;
                        Lucifer-=30;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("Kasumi hit Lucifer and caused a damage of 30hp");
                        System.out.println("HP = "+khp+"/"+L.kmhp);
                        System.out.println("SP = "+ksp+"/"+L.kmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
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
                        Lucifer-=35;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("Kasumi hit Lucifer and caused a damage of 35hp");
                        System.out.println("HP = "+khp+"/"+L.kmhp);
                        System.out.println("SP = "+ksp+"/"+L.kmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
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
                        Lucifer-=45;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("Kasumi charmed Lucifer and caused a damage of 45hp");

                        System.out.println("HP = "+khp+"/"+L.kmhp);
                        System.out.println("SP = "+ksp+"/"+L.kmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
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
                        Lucifer-=50;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("Kasumi charmed Lucifer and caused a damage of 50hp");
                        System.out.println("HP = "+khp+"/"+L.kmhp);
                        System.out.println("SP = "+ksp+"/"+L.kmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        L.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(khp==L.kmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        khp=L.kmhp;
                        System.out.println("HP = "+khp+"/"+L.kmhp);
                        System.out.println("SP = "+ksp+"/"+L.kmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Lucifer<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        L.mhp+=30;
                        L.msp+=30;
                        System.out.println("Max HP ="+L.mhp);
                        System.out.println("Max SP ="+L.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        L.kmhp+=30;
                        L.kmsp+=30;
                        System.out.println("Max HP ="+L.kmhp);
                        System.out.println("Max SP ="+L.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        L.jmhp+=30;
                        L.jmsp+=30;
                        System.out.println("Max HP ="+L.jmhp);
                        System.out.println("Max SP ="+L.jmsp);
                        return;
                    }
                }

                if(k==2)
                {
                    if(jhp<=0)
                    {
                        k++;
                        continue;
                    }
                    System.out.println("Junpei's Turn");
                    System.out.println("1.Strike(15hp)\n2.Slash(20hp)\n3.Magic 1(10sp)\n4.Magic 2(15sp)\n5.Use Medicine"+"(x"+jmedicine+")");
                    String cc=L.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(jhp<=15)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        jhp-=15;
                        Lucifer-=45;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("Junpei hit Lucifer and caused a damage of 45hp");
                        System.out.println("HP = "+jhp+"/"+L.jmhp);
                        System.out.println("SP = "+jsp+"/"+L.jmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
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
                        Lucifer-=50;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("Junpei hit Lucifer and caused a damage of 50hp");
                        System.out.println("HP = "+jhp+"/"+L.jmhp);
                        System.out.println("SP = "+jsp+"/"+L.jmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
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
                        Lucifer-=35;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("Junpei charmed Lucifer and caused a damage of 30hp");

                        System.out.println("HP = "+jhp+"/"+L.jmhp);
                        System.out.println("SP = "+jsp+"/"+L.jmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
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
                        Lucifer-=35;
                        if(Lucifer<=0)
                        {
                            Lucifer=0;
                        }
                        System.out.println("Junpei charmed Lucifer and caused a damage of 35hp");
                        System.out.println("HP = "+jhp+"/"+L.jmhp);
                        System.out.println("SP = "+jsp+"/"+L.jmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        L.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(jhp==L.jmhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        jhp=L.jmhp;
                        System.out.println("HP = "+jhp+"/"+L.jmhp);
                        System.out.println("SP = "+jsp+"/"+L.jmsp);
                        System.out.println("Lucifer = "+Lucifer+"/1500");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        L.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Lucifer<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 30");
                        L.mhp+=30;
                        L.msp+=30;
                        System.out.println("Max HP ="+L.mhp);
                        System.out.println("Max SP ="+L.msp);
                        System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                        L.kmhp+=30;
                        L.kmsp+=30;
                        System.out.println("Max HP ="+L.kmhp);
                        System.out.println("Max SP ="+L.kmsp);
                        System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                        L.jmhp+=30;
                        L.jmsp+=30;
                        System.out.println("Max HP ="+L.jmhp);
                        System.out.println("Max SP ="+L.jmsp);
                        return;
                    }
                }
                if(k==3)
                {
                    for(int i=1;i<=2;i++)
                    {
                        if(k==3)
                        {
                            int b=(int)(Math.random()*10);
                            if(b>=0 && b<=2)
                            {
                                System.out.println("Lucifer: \"The world shall crumble by my hand!\"");
                                System.out.println("Lucifer crushed you in his hand...");
                                hp-=10;
                                if(hp<=0)
                                {
                                    hp=0;
                                }
                                System.out.println("HP = "+hp+"/"+L.mhp);
                                System.out.println("SP = "+sp+"/"+L.msp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=3 && b<=4)
                            {
                                System.out.println("Lucifer: \"My eyes see through your sins!\"");
                                System.out.println("Lucifer shot you with a laser beam...");
                                hp-=15;
                                if(hp<=0)
                                {
                                    hp=0;
                                }
                                System.out.println("HP = "+hp+"/"+L.mhp);
                                System.out.println("SP = "+sp+"/"+L.msp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }

                            else if(b>=5 && b<=6)
                            {
                                System.out.println("Lucifer: \"Burn mortals, in the depths of Hell!\"");
                                System.out.println("Lucifer created a storm of hell fire...");
                                hp-=20;  
                                if(hp<=0)
                                {
                                    hp=0;
                                }
                                System.out.println("HP = "+hp+"/"+L.mhp);
                                System.out.println("SP = "+sp+"/"+L.msp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=7&&b<=8)
                            {
                                System.out.println("Lucifer: \"May cureses rain down upon you!\"");
                                System.out.println("Lucifer bought down a meteor shower upon you...");                        
                                hp-=35;
                                if(hp<=0)
                                {
                                    hp=0;
                                }
                                System.out.println("HP = "+hp+"/"+L.mhp);
                                System.out.println("SP = "+sp+"/"+L.msp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=9)
                            {
                                System.out.println("Lucifer: \"The New World Order shall be born anew!\"");
                                System.out.println("Lucifer created a morning star...");                        
                                hp-=45;
                                if(hp<=0)
                                {
                                    hp=0;
                                }
                                System.out.println("HP = "+hp+"/"+L.mhp);
                                System.out.println("SP = "+sp+"/"+L.msp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            k=4;
                            if(hp<=0)
                            {
                                hp=0;
                                System.out.println("You are dead.....");
                                System.out.println("Press any key to continue.....");
                                System.out.println("----------------------------------------------");
                                L.sc.nextLine();
                                continue;

                            }
                            else if(hp<=10&&sp<10&&medicine==0)
                            {
                                System.out.println("Very low points to do anything.... \nPress any key to continue......");
                                L.sc.nextLine();
                                continue;
                            }
                        }

                        if(k==4)
                        {
                            if(khp<=0)
                            {
                                k=5;
                                continue;
                            }

                            int b=(int)(Math.random()*10);
                            if(b>=0 && b<=2)
                            {
                                System.out.println("Lucifer: \"The world shall crumble by my hand!\"");
                                System.out.println("Lucifer crushed Kasumi in his hand...");
                                khp-=10;
                                if(khp<=0)
                                {
                                    khp=0;
                                }
                                System.out.println("HP = "+khp+"/"+L.kmhp);
                                System.out.println("SP = "+ksp+"/"+L.kmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=3 && b<=4)
                            {
                                System.out.println("Lucifer: \"My eyes see through your sins!\"");
                                System.out.println("Lucifer shot Kasumi with a laser beam...");
                                khp-=15;
                                if(khp<=0)
                                {
                                    khp=0;
                                }
                                System.out.println("HP = "+khp+"/"+L.kmhp);
                                System.out.println("SP = "+ksp+"/"+L.kmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }

                            else if(b>=5 && b<=6)
                            {
                                System.out.println("Lucifer: \"Burn mortals, in the depths of Hell!\"");
                                System.out.println("Lucifer created a storm of hell fire...");
                                khp-=20;  
                                if(khp<=0)
                                {
                                    khp=0;
                                }
                                System.out.println("HP = "+khp+"/"+L.kmhp);
                                System.out.println("SP = "+ksp+"/"+L.kmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=7 && b<=8)
                            {
                                System.out.println("Lucifer: \"May cureses rain down upon you!\"");
                                System.out.println("Lucifer bought down a meteor shower upon Kasumi...");                        
                                khp-=35;
                                if(khp<=0)
                                {
                                    khp=0;
                                }
                                System.out.println("HP = "+khp+"/"+L.kmhp);
                                System.out.println("SP = "+ksp+"/"+L.kmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=9)
                            {
                                System.out.println("Lucifer: \"The New World Order shall be born anew!\"");
                                System.out.println("Lucifer created a morning star...");                        
                                khp-=45;
                                if(khp<=0)
                                {
                                    khp=0;
                                }
                                System.out.println("HP = "+khp+"/"+L.kmhp);
                                System.out.println("SP = "+ksp+"/"+L.kmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            k=5;
                            if(khp<=0)
                            {
                                khp=0;
                                System.out.println("Kasumi is dead.....");
                                System.out.println("Press any key to continue.....");
                                System.out.println("----------------------------------------------");
                                L.sc.nextLine();
                            }
                            else if(khp<=10&&ksp<15&&kmedicine==0)
                            {
                                System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                                L.sc.nextLine();                 
                            }
                        }
                        if(k==5)
                        {
                            if(jhp<=0)
                            {
                                k=0;
                                continue;
                            }

                            int b=(int)(Math.random()*10);
                            if(b>=0 && b<=2)
                            {
                                System.out.println("Lucifer: \"The world shall crumble by my hand!\"");
                                System.out.println("Lucifer crushed Junpei in his hand...");
                                jhp-=10;
                                if(jhp<=0)
                                {
                                    jhp=0;
                                }
                                System.out.println("HP = "+jhp+"/"+L.jmhp);
                                System.out.println("SP = "+jsp+"/"+L.jmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=3 && b<=4)
                            {
                                System.out.println("Lucifer: \"My eyes see through your sins!\"");
                                System.out.println("Lucifer shot Junpei with a laser beam...");
                                jhp-=15;
                                if(jhp<=0)
                                {
                                    jhp=0;
                                }
                                System.out.println("HP = "+jhp+"/"+L.jmhp);
                                System.out.println("SP = "+jsp+"/"+L.jmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }

                            else if(b>=5 && b<=6)
                            {
                                System.out.println("Lucifer: \"Burn mortals, in the depths of Hell!\"");
                                System.out.println("Lucifer created a storm of hell fire...");
                                jhp-=20;  
                                if(jhp<=0)
                                {
                                    jhp=0;
                                }
                                System.out.println("HP = "+jhp+"/"+L.jmhp);
                                System.out.println("SP = "+jsp+"/"+L.jmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=7 && b<=8)
                            {
                                System.out.println("Lucifer: \"May cureses rain down upon you!\"");
                                System.out.println("Lucifer bought down a meteor shower upon Junpei...");                        
                                jhp-=35;
                                if(jhp<=0)
                                {
                                    jhp=0;
                                }
                                System.out.println("HP = "+jhp+"/"+L.jmhp);
                                System.out.println("SP = "+jsp+"/"+L.jmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            else if(b>=9)
                            {
                                System.out.println("Lucifer: \"The New World Order shall be born anew!\"");
                                System.out.println("Lucifer created a morning star...");                        
                                jhp-=45;
                                if(jhp<=0)
                                {
                                    jhp=0;
                                }
                                System.out.println("HP = "+jhp+"/"+L.jmhp);
                                System.out.println("SP = "+jsp+"/"+L.jmsp);
                                System.out.println("Lucifer = "+Lucifer+"/1500");
                                System.out.println("----------------------------------------------");
                                System.out.println("Press any key to continue.....");

                                L.sc.nextLine();
                            }
                            k=3;
                            if(jhp<=0)
                            {
                                jhp=0;
                                System.out.println("Junpei is dead.....");
                                System.out.println("Press any key to continue.....");
                                System.out.println("----------------------------------------------");
                                L.sc.nextLine();
                            }
                            else if(jhp<=15&&jsp<10&&kmedicine==0)
                            {
                                System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                                L.sc.nextLine();                 
                            }
                        }

                    }
                    k=0;
                }
            }
        }
    }
}