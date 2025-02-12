package RPG;

class Dungeon4Fight2
{
    public static void main()
    {
        BASE D4F2=new BASE();
        while(true)
        {
            System.out.println("You have encounterd an Enemy......");
            System.out.println("1.Fight\n2.Run Away");
            String c=D4F2.sc.nextLine();
            while(c.equals("1")==false && c.equals("2")==false)
            {
                System.out.println("Input mismatch....Try again...");
                c=D4F2.sc.nextLine();
            }
            if(c.equals("1"))
            {
                int hp=D4F2.mhp;
                int sp=D4F2.msp;
                int medicine=D4F2.mmedicine;
                int khp=D4F2.kmhp;
                int ksp=D4F2.kmsp;
                int kmedicine=D4F2.kmmedicine;
                int jhp=D4F2.jmhp;
                int jsp=D4F2.jmsp;
                int jmedicine=D4F2.jmmedicine;
                int Angel=750;
                int k=0;
                System.out.println("HP = "+hp+"/"+D4F2.mhp);
                System.out.println("SP = "+sp+"/"+D4F2.msp);
                System.out.println("Angel = "+Angel+"/750");
                System.out.println("----------------------------------------------");
                while(Angel>0 && hp>0)
                {

                    if(k==0)
                    {
                        System.out.println("Your Turn");
                        System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                        String cc=D4F2.sc.nextLine();

                        if(cc.equals("1"))
                        {
                            if(hp<=10)
                            {
                                System.out.println("Low HP... Try something else");
                                continue;
                            }
                            hp-=10;
                            Angel-=30;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("You hit the Angel and caused a damage of 30hp");
                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=40;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("You hit the Angel and caused a damage of 40hp");
                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=30;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("You charmed the Angel and caused a damage of 30hp");

                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=40;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("You charmed the Angel and caused a damage of 40hp");
                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("5"))
                        {
                            if(hp==D4F2.mhp)
                            {
                                System.out.println("HP already full...");
                                continue;
                            }
                            hp=D4F2.mhp;
                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Medicine taken......");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
                            medicine--;
                            k++;
                        }
                        else
                        {
                            System.out.println("Input mismatch try again...");
                            continue;
                        }

                        if(Angel<=0)
                        {
                            System.out.println("You Win");
                            System.out.println("Your Max HP, Max SP is incresed by 30");
                            D4F2.mhp+=30;
                            D4F2.msp+=30;
                            System.out.println("Max HP ="+D4F2.mhp);
                            System.out.println("Max SP ="+D4F2.msp);
                            System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                            D4F2.kmhp+=30;
                            D4F2.kmsp+=30;
                            System.out.println("Max HP ="+D4F2.kmhp);
                            System.out.println("Max SP ="+D4F2.kmsp);
                            System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                            D4F2.jmhp+=30;
                            D4F2.jmsp+=30;
                            System.out.println("Max HP ="+D4F2.jmhp);
                            System.out.println("Max SP ="+D4F2.jmsp);
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
                        String cc=D4F2.sc.nextLine();

                        if(cc.equals("1"))
                        {
                            if(khp<=10)
                            {
                                System.out.println("Low HP... Try something else");
                                continue;
                            }
                            khp-=10;
                            Angel-=25;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("Kasumi hit the Angel and caused a damage of 25hp");
                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=30;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("Kasumi hit the Angel and caused a damage of 30hp");
                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=40;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("Kasumi charmed the Angel and caused a damage of 40hp");

                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=45;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("Kasumi charmed the Angel and caused a damage of 45hp");
                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("5"))
                        {
                            if(khp==D4F2.kmhp)
                            {
                                System.out.println("HP already full...");
                                continue;
                            }
                            khp=D4F2.kmhp;
                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Medicine taken......");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
                            medicine--;
                            k++;
                        }
                        else
                        {
                            System.out.println("Input mismatch try again...");
                            continue;
                        }

                        if(Angel<=0)
                        {
                            System.out.println("You Win");
                            System.out.println("Your Max HP, Max SP is incresed by 30");
                            D4F2.mhp+=30;
                            D4F2.msp+=30;
                            System.out.println("Max HP ="+D4F2.mhp);
                            System.out.println("Max SP ="+D4F2.msp);
                            System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                            D4F2.kmhp+=30;
                            D4F2.kmsp+=30;
                            System.out.println("Max HP ="+D4F2.kmhp);
                            System.out.println("Max SP ="+D4F2.kmsp);
                            System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                            D4F2.jmhp+=30;
                            D4F2.jmsp+=30;
                            System.out.println("Max HP ="+D4F2.jmhp);
                            System.out.println("Max SP ="+D4F2.jmsp);
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
                        System.out.println("1.Strike(15hp)\n2.Slash(20hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+jmedicine+")");
                        String cc=D4F2.sc.nextLine();

                        if(cc.equals("1"))
                        {
                            if(jhp<=15)
                            {
                                System.out.println("Low HP... Try something else");
                                continue;
                            }
                            jhp-=15;
                            Angel-=40;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("Junpei hit the Angel and caused a damage of 40hp");
                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=45;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("Junpei hit the Angel and caused a damage of 45hp");
                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=25;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("Junpei charmed the Angel and caused a damage of 25hp");

                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
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
                            Angel-=30;
                            if(Angel<=0)
                            {
                                Angel=0;
                            }
                            System.out.println("Junpei charmed the Angel and caused a damage of 30hp");
                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                            k++;
                        }
                        else if(cc.equals("5"))
                        {
                            if(jhp==D4F2.jmhp)
                            {
                                System.out.println("HP already full...");
                                continue;
                            }
                            jhp=D4F2.jmhp;
                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Medicine taken......");
                            System.out.println("Press any key to continue.....");
                            D4F2.sc.nextLine();
                            medicine--;
                            k++;
                        }
                        else
                        {
                            System.out.println("Input mismatch try again...");
                            continue;
                        }

                        if(Angel<=0)
                        {
                            System.out.println("You Win");
                            System.out.println("Your Max HP, Max SP is incresed by 30");
                            D4F2.mhp+=30;
                            D4F2.msp+=30;
                            System.out.println("Max HP ="+D4F2.mhp);
                            System.out.println("Max SP ="+D4F2.msp);
                            System.out.println("Kasumi's Max HP, Max SP is incresed by 30");
                            D4F2.kmhp+=30;
                            D4F2.kmsp+=30;
                            System.out.println("Max HP ="+D4F2.kmhp);
                            System.out.println("Max SP ="+D4F2.kmsp);
                            System.out.println("Junpei's Max HP, Max SP is incresed by 30");
                            D4F2.jmhp+=30;
                            D4F2.jmsp+=30;
                            System.out.println("Max HP ="+D4F2.jmhp);
                            System.out.println("Max SP ="+D4F2.jmsp);
                            return;
                        }
                    }
                    else if(k==3)
                    {
                        int b=(int)(Math.random()*10);
                        if(b>=0 && b<=2)
                        {
                            System.out.println("The Angel stabbed you with a sword....");
                            hp-=10;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        else if(b>=3 && b<=5)
                        {
                            System.out.println("The Angel blinded you with holy light....");
                            hp-=15;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }

                        else if(b>=6 && b<=8)
                        {

                            System.out.println("The Angel shot lightrays at you...");
                            hp-=20;  
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        else if(b>=9)
                        {
                            System.out.println("The Angel threw down spears of light on you....");                        
                            hp-=35;
                            if(hp<=0)
                            {
                                hp=0;
                            }
                            System.out.println("HP = "+hp+"/"+D4F2.mhp);
                            System.out.println("SP = "+sp+"/"+D4F2.msp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        k=4;
                        if(hp<=0)
                        {
                            hp=0;
                            System.out.println("You are dead.....");
                            System.out.println("\n1.Trygain\n2.Abort");
                            System.out.println("----------------------------------------------");
                            c=D4F2.sc.nextLine();
                            while(c.equals("1")==false && c.equals("2")==false)
                            {
                                System.out.println("Input mismatch....Try again...");
                                c=D4F2.sc.nextLine();
                            }

                        }
                        else if(hp<=10&&sp<10&&medicine==0)
                        {
                            System.out.println("Very low points to do anything.... \n1.Trygain\n2.Abort");
                            c=D4F2.sc.nextLine();
                            while(c.equals("1")==false && c.equals("2")==false)
                            {
                                System.out.println("Input mismatch....Try again...");
                                c=D4F2.sc.nextLine();
                            }
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
                            System.out.println("The Angel stabbed Kasumi with a sword....");
                            khp-=10;
                            if(khp<=0)
                            {
                                khp=0;
                            }
                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        else if(b>=3 && b<=5)
                        {

                            System.out.println("The Angel blinded Kasumi with holy light....");
                            khp-=15;
                            if(khp<=0)
                            {
                                khp=0;
                            }
                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }

                        else if(b>=6 && b<=8)
                        {

                            System.out.println("The Angel shot lightrays at Kasumi...");
                            khp-=20;  
                            if(khp<=0)
                            {
                                khp=0;
                            }
                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        else if(b>=9)
                        {
                            System.out.println("The Angel threw down spears of light on Kasumi....");                        
                            khp-=35;
                            if(khp<=0)
                            {
                                khp=0;
                            }
                            System.out.println("HP = "+khp+"/"+D4F2.kmhp);
                            System.out.println("SP = "+ksp+"/"+D4F2.kmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        k=5;
                        if(khp<=0)
                        {
                            khp=0;
                            System.out.println("Kasumi is dead.....");
                            System.out.println("Press any key to continue.....");
                            System.out.println("----------------------------------------------");
                            D4F2.sc.nextLine();
                        }
                        else if(khp<=10&&ksp<15&&kmedicine==0)
                        {
                            System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                            D4F2.sc.nextLine();                 
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
                            System.out.println("The Angel stabbed Junpei with a sword....");
                            jhp-=10;
                            if(jhp<=0)
                            {
                                jhp=0;
                            }
                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        else if(b>=3 && b<=5)
                        {

                            System.out.println("The Angel blinded Junpei with holy light....");
                            jhp-=15;
                            if(jhp<=0)
                            {
                                jhp=0;
                            }
                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }

                        else if(b>=6 && b<=8)
                        {

                            System.out.println("The Angel shot lightrays at Junpei...");
                            jhp-=20;  
                            if(jhp<=0)
                            {
                                jhp=0;
                            }
                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        else if(b>=9)
                        {
                            System.out.println("The Angel threw down spears of light on Junpei....");                        
                            jhp-=35;
                            if(jhp<=0)
                            {
                                jhp=0;
                            }
                            System.out.println("HP = "+jhp+"/"+D4F2.jmhp);
                            System.out.println("SP = "+jsp+"/"+D4F2.jmsp);
                            System.out.println("Angel = "+Angel+"/750");
                            System.out.println("----------------------------------------------");
                            System.out.println("Press any key to continue.....");

                            D4F2.sc.nextLine();
                        }
                        k=0;
                        if(jhp<=0)
                        {
                            jhp=0;
                            System.out.println("Junpei is dead.....");
                            System.out.println("Press any key to continue.....");
                            System.out.println("----------------------------------------------");
                            D4F2.sc.nextLine();
                        }
                        else if(jhp<=15&&jsp<10&&kmedicine==0)
                        {
                            System.out.println("Very low points for to do anything.... \nPress any key to continue...");
                            D4F2.sc.nextLine();                 
                        }
                    }
                }
            }
            if (c.equals("2"))
            {
                System.out.println("You decided to run away");
                System.out.println("Press any key to continue");
                D4F2.sc.nextLine();
                return;
            }
        }
    }
}