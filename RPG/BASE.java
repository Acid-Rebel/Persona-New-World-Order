package RPG;


import java.util.*;
public class BASE
{
    public static Scanner sc=new Scanner(System.in);
    public static String name="";
    public static int mhp=150;
    public static int msp=150;
    public static int mmedicine=2;
    public static int kmhp=200;
    public static int kmsp=250;
    public static int kmmedicine=2;
    public static int jmhp=250;
    public static int jmsp=200;
    public static int jmmedicine=2;

    public void Intro()
    {
        IntroB II=new IntroB();
        II.main();
    }

    public void Amagi_Park()
    {
        AmagiPark AG=new AmagiPark();
        AG.main();
    }  

    public void Tatsuya_lab()
    {
        TatsuyaLab TTL=new TatsuyaLab();
        TTL.main();
    }

    public void Babel()
    {
        BabelB B=new BabelB();
        B.main();
    } 
    
    public void Credits()
    {
        CreditsM C=new CreditsM();
        C.main();
    }
}