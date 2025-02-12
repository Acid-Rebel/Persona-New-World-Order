package RPG;


class IntroB
{
    public static void main()
    {
        BASE IN=new BASE();
        String arr1[] = {"It was the edge of dusk. The orange rays of sunlight illuminated the silent landscape.",
                "Men and women of all ages, tired from the day's activities, sauntered exhaustedly.",
                "A lone high school student walked towards the hospital. \nHe went up to the counter and asked the beautiful nurse for the room number of a specific patient.", 
                "Nurse: \"Yes, sir. Please fill up this form then I'll lead you to your room.\""};
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
            IN.sc.nextLine();
        }
        System.out.println("Enter your name");
        IN.name=IN.sc.nextLine();

        while(IN.name.equals(""))
        {
            System.out.println("Please enter your name gain");
            IN.name=IN.sc.nextLine();
        } 

        String arr2[] ={

                "Nurse: \"Right This Way Sir\"",
                "The nurse led "+IN.name+" through the chilly corridors. The cacophany of chattering of the patients filled the vanilla white corridors",
                "Room number 420. Through the door was "+IN.name+"'s closest friend, Shinjiro Tatsumi.",
                "The two had known each other since preschool and were inseparable. Unfortunately, Shinjiro fell ill a year ago and had been bedridden ever since",
                "Shinjiro: \"Thanks for coming\", a weak voice came from the curtains.",
                "His gaunt figure emphasised his weakness. The skin plastered on his bones were grey and his ash coloured hair covered his sea-blue eyes. \nShinjiro gave a warm smile.",
                IN.name+": \"Not like I can just leave you alone.\"",
                "Shinjiro: \"I know you won't.\"",
                "Shinjiro difficulty adjusted himself to see his best friend properly.",
                IN.name+": \"Relax. You'll be fine soon. The doctors are doing the best they can.\"",
                "Shinjiro: \"Well, look at the state that I'm in now! Do you think they're making any progress?!\"",
                "Shinjiro began coughing spasmodically, deep red blood pouring out of his mouth and dripping onto his skeleton-like hands.",
                IN.name+": \"Crap! I'll call the nur-\"",
                "Shinjiro: \"No, I'm fine. I can handle myself.\"",
                "As "+IN.name+" moved towards Shinjiro's bed, a sharp, piercing pain shot through his head. It was as though a spear stabbed straight through his brain.",
                IN.name+" screamed in agony, holding his forehead as tightly as possible.",
                "Shinjiro: \"Hey, are you alright?\"",
                IN.name+": \"I'm okay. Just need some fresh air.\"",
                IN.name+" wobbled out of the hospital room, his steps unbalanced. The whole world seemed upside down and his vision was blurry.",
                "He could not comprehend the atmosphere he was taking in. But once he reached outside, he thought that he had entered a dream.",
                "The sky was painted violet with streaks of orange slicing through it. The streetlights glew red and spotlighted the chaos that ensewed.",
                "People screamed in fear and pain as groutesque monsters attacked them and tore their bodies like butter. \nCalling the scene a nightmare would have been an understatement.",
                IN.name+" stared in shock at what was going on. He froze in place trying to take in what was going on. But he could not comprehend it. \nOnly one though ran through his mind... ",
                "Was Shinjiro safe?",
                "He dashed right back into the hospital, or at least it was a hospital.",
                "Never-ending corridors; flickering lights; Winding pathways. There was not a single human in sight. \nHowever, not a shred of this weirdness registerd in "+IN.name+"'s mind.",
                "He just kept running and running.",
                "Monster: \"Raargh!\", A monster stopped "+IN.name+" in his tracks. It held a huge club the size of a human's body.",
                "Saliva dropped from it growling mouth. \nFear grew in "+IN.name+" seeing a creature straight from his nightmares appear right in front of his eyes. He wanted to run away... But just then",
                "Unknown Voice: \"Are you going to run away?\"",
                "The piercing headache shot back through his cranium.",
                "Unknown Voice: \"Are you just going to leave your friend to die?\"",
                "\"No!\" "+IN.name+" shouted with determination. There was no more fear left in him no more. ",
                "Unknown Voice: \"Then let out your rage!\"",
                "\"Aaaarrh!\" The power inside "+IN.name+" released into its full form. An ethereal figure appeared behind him, glowing.",
                "The figure prepared its stance as "+IN.name+" pointed towards the monster.",
                IN.name+": \"Perish!\""};

        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
            IN.sc.nextLine();
        }
        FirstBattle aa=new FirstBattle();
        aa.main();

        String arr3[] = {
                IN.name+": \"Huff. Huff. Huff.\","+IN.name+" breathed out with exhaustion.",
                "Although he was exhausted, his adrenaline kept him going.",
                "In front of him were four branching paths."};
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
            IN.sc.nextLine();
        }
        FirstDungeon bb=new FirstDungeon();
        bb.main();
        String arr4[] = {
                "Finally, his destination was right at arms length.",
                "As he creaked the door open, he felt a heavy presence compressing the atmosphere.",
                "Worrying about his friends safety, "+IN.name+" dashed right into the room.",
                "But what he entered was was no ordinary room...",
                "Moonlight shone on the sentry-like gravestones. \nLuscious green grass covered the ground.",
                "At the center stood a lone businessman.",
                IN.name+" moved cautiosly closer to the businessman, keeping a defensive stance.",
                "Businessman: \"No matter how much I worked, I could never achieve success.\"",
                "Businessman: \"Even when I worked myself to death, no one cared.\"",
                "Businessman: \"But now everyone will care!\"",
                "The man's body melted into the darkness.\nThe ground began rumbling as the heavy presence grew stronger and stronger.",
                "Out of nowhere, a humongous violet muscular body towards "+IN.name+" as it sat on a floating toilet.",
                "Although, "+IN.name+" was shocked at the sight, He could only care about Shinjiro's safety",
                "No matter what was in front of him.",
                IN.name+": \"Persona!\""};
        for(int i=0;i<arr4.length;i++)
        {
            System.out.println(arr4[i]);
            IN.sc.nextLine();
        }
        Boss1 cc=new Boss1();
        cc.main();
        String arr5[] = {"The monster cried in pain as "+IN.name+" did the last hit.",
                "Red sparks erupted from its body as it slowly disappeared into the air.\nThe surrounding graveyard transmogrified back into a normal hospital room.",
                IN.name+": \"Shinjiro!\", but there was no reply.",
                IN.name+" went towards the bed but there was no sign of him,\nAll that was there was a mysterious letter.",
                "Without hesitation, "+IN.name+" grabbed the letter and read it.",
                "Unknown Writer: \"If you want your friend alive, head to Amagi Park at once.\"",
                IN.name+" ran straight out of the hospital. There was no time to waste."
            };
        for(int i=0;i<arr5.length;i++)
        {
            System.out.println(arr5[i]);
            IN.sc.nextLine();
        }
    }
}