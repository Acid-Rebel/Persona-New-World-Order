package RPG;


class Boss1
{
    public static void main()
    {
        while(true)
        {
            BASE B1=new BASE();
            int hp=B1.mhp;
            int sp=B1.msp;
            int medicine=B1.mmedicine;
            int Belphegor=300;
            int k=0;
            System.out.println("HP = "+hp+"/"+B1.mhp);
            System.out.println("SP = "+sp+"/"+B1.msp);
            System.out.println("Belphegor = "+Belphegor+"/300");
            System.out.println("----------------------------------------------");
            while(Belphegor>0 && hp>0)
            {

                if(k==0)
                {
                    System.out.println("Your Turn");
                    System.out.println("1.Strike(10hp)\n2.Slash(15hp)\n3.Magic 1(10sp)\n4.Magic 2(15 sp)\n5.Use Medicine"+"(x"+medicine+")");
                    String cc=B1.sc.nextLine();

                    if(cc.equals("1"))
                    {
                        if(hp<=10)
                        {
                            System.out.println("Low HP... Try something else");
                            continue;
                        }
                        hp-=10;
                        Belphegor-=15;
                        if(Belphegor<=0)
                        {
                            Belphegor=0;
                        }
                        System.out.println("You hit Belphegor and caused a damage of 15hp");
                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        B1.sc.nextLine();
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
                        Belphegor-=25;
                        if(Belphegor<=0)
                        {
                            Belphegor=0;
                        }
                        System.out.println("You hit Belphegor and caused a damage of 25hp");
                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        B1.sc.nextLine();
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
                        Belphegor-=15;
                        if(Belphegor<=0)
                        {
                            Belphegor=0;
                        }
                        System.out.println("You charmed Belphegor and caused a damage of 15hp");

                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");
                        B1.sc.nextLine();
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
                        Belphegor-=25;
                        if(Belphegor<=0)
                        {
                            Belphegor=0;
                        }
                        System.out.println("You charmed Belphegor and caused a damage of 25hp");
                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                        System.out.println("Press any key to continue.....");

                        B1.sc.nextLine();
                        k++;
                    }
                    else if(cc.equals("5"))
                    {
                        if(hp==B1.mhp)
                        {
                            System.out.println("HP already full...");
                            continue;
                        }
                        if(medicine==0)
                        {
                            System.out.println("No medicines left.... Try something else");
                            continue;
                        }
                        hp=B1.mhp;
                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                        System.out.println("Medicine taken......");
                        System.out.println("Press any key to continue.....");
                        B1.sc.nextLine();
                        medicine--;
                        k++;
                    }
                    else
                    {
                        System.out.println("Input mismatch try again...");
                        continue;
                    }

                    if(Belphegor<=0)
                    {
                        System.out.println("You Win");
                        System.out.println("Your Max HP, Max SP is incresed by 20");
                        B1.mhp+=20;
                        B1.msp+=20;
                        System.out.println("Max HP ="+B1.mhp);
                        System.out.println("Max SP ="+B1.msp);
                        return;
                    }
                }
                else
                {
                    int b=(int)(Math.random()*10);
                    if(b>=0 && b<=2)
                    {
                        System.out.println("Belphegor breathes ice at you....");
                        hp-=10;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                    }
                    else if(b>=3 && b<=5)
                    {

                        System.out.println("The Belphegor roars at you....");
                        hp-=15;
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                    }

                    else if(b>=6 && b<=8)
                    {

                        System.out.println("The Belphegor crashes icicles on you...");
                        hp-=20;  
                        if(hp<=0)
                        {
                            hp=0;
                        }
                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                    }
                    else if(b>=9)
                    {
                        System.out.println("The Belphegor throws his toilet");                        
                        hp-=35;
                        if(hp<=0)
                        {
                            hp=0;
                        }

                        System.out.println("HP = "+hp+"/"+B1.mhp);
                        System.out.println("SP = "+sp+"/"+B1.msp);
                        System.out.println("Belphegor = "+Belphegor+"/300");
                        System.out.println("----------------------------------------------");
                    }
                    k=0;
                    if(hp<=0)
                    {
                        hp=0;
                        System.out.println("You are dead.....");
                        System.out.println("Press any key to try again");
                        System.out.println("----------------------------------------------");
                        B1.sc.nextLine();
                        continue;        
                    }
                    else if(hp<=10&&sp<10&&medicine==0)
                    {
                        System.out.println("Very low points to do anything.... /nPress any to try again.....");
                        B1.sc.nextLine();
                        continue;  
                    }
                }
            }
        }
    }
}