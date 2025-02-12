package RPG;


class TatsuyaLab
{
    public static void main()
    {
        BASE TL=new BASE();
        String name=TL.name;
        String arr1[] = {
                "Caw! Caw!",
                "A flock of crows flew above the dilapidated building.",
                "It's grey walls were slowly crumbling and the windows were completely shattered.\nCobwebs were strewn at every corner of the structure.",
                "The lack of any form of life sent chills down their spine.",
                "Kasumi: \"What on earth happened here?\"",
                "Kasumi: \"This lab used to be Japan's greatest research facility.\"",
                "Kasumi: \"But now its nothing more than a relic.\"",
                name+": \"Standing here won't solve anything.\"",
                name+": \"If we want answers, we should just walk nto the devil's nest.\"",
                "The two kicked the door open in unison and entered the mysterious laboratory..."
            };
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
            TL.sc.nextLine();
        }
        Dungeon3 DD3=new Dungeon3();
        DD3.main();
        String arr2[] = {
                "Kasumi: \"I thought this place was creepy from the outside, but it's even worse on the inside.\"",
                "Spots of dried blood were painted on the cracked walls and the blue ceiling lights flickered endlessly.",
                "Spiders and cockroaches crawled all over the floor and through the crevices.",
                "The two examined every nook and corner but it was to no avail.",
                "There were only torn pieces of documents and broken machines.",
                name+": \"We can't get any information like this!\"",
                name+": \"C'mon!, there's gotta be something in here that is useful!\"",
                name+" punched the wall out of frustration, creating a bigger rupture in the wall.",
                "Unknown Voice: \"If you wanted any information, you should have come earlier.\"",
                "A deep voic emerged from the shadow of the corner.",
                "The sound of footsteps came closer and closer towards them",
                "Kasumi: \"Show yourself!\"",
                "The man revealed himself in front of the two, raising his hands in a surrender position.",
                "He wore a red leather jacket with black stripes that complemented his blonde hair.\nHe looked like he was in his early 20s.",
                "Kasumi: \"Who are you?\"",
                "Junpei: \"Junpei Kaoru. Let's just say that I'm the source of the information you need.\"",
                name+" and Kasumi were incredibly suspicious of the man.\nAs he moved closer to the duo, they stood defensively.",
                "Junpei: \"Relax. I'm not your enemy.\"",
                "Roaring Monster: \"ALL LADIES BELONG TO ME!\"",
                "A torrential voice came from above.",
                "CRASH!",
                "A hunking monster broke through the the roof and landed in front of them.",
                "It flexed its balloon like muscles at the group as a laugh escaped from its hair-filled face.",
                "Kasumi: \"What the hell is that thing?!\"",
                "Junpei: \"No time for wondering. Focus on fighting!\"",
            } ;
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
            TL.sc.nextLine();
        }
        Kaushik KKK=new Kaushik();
        KKK.main();

        String arr3[] = {
                name+": \"Phew. That was tough.\"",
                "Kasumi: \"I literally feared for my life.\"",
                "They panted for air after the sudden battle.\nFrom the disappearing body of Kaushik, a book fell to the ground.",
                name+" took the book from the ground and read the blood-stained cover.",
                name+": \"Journal 1 - Houin Kyoma.\"",
                "Junpei: \"He's the head scientist of the head scientist of the project that caused this mess.\"",
                "Junpei: \"Don't even think about looking for him though. He's dead.\"",
                "Kasumi: \"Wait. How do you know all of this.\"",
                "Junpei: \"Because I'm the first Persona user.\"",
                "Time suddenly stood still .",
                name+" and Kasumi continuously at Junped with shocked expressions.",
                "Junpei, not reacting to their expressions, took the book from "+name+"'s hand and began flipping through pages.",
                "He then stopped at a specific page and showed it to the duo.",
                "It was a picture of a young child with blonde hair dressed in a white patient gown,\nStanding in front of a crowd of scientists.",
                "Kasumi: \"I guess the you're the kid?\"",
                "Junpei: \"Bingo. I was one of the first test subject of the 'New World Order' program.\"",
                "Junpei: \"Several children were picked from the streets and were basically forced to become Persona users.\",",
                "Junpei: \"Out of the 20 kids, only one survived - me.\"",
                name+" could feel Junpei's voice starting to break, but his expression remained blank.",
                "No one could read what was going on his mind.",
                "Junpei: \"After that, the tests became worse.\"",
                "Junpei: \"I thought I was going to die but somehow I held on.\"",
                "Junpei: \"Then one day, one of the scientists tried to inject me with some poison while I was asleep.\"",
                "Junpei: \"They finally saw no more use for me and wanted to remove any evidence.\"",
                "Junpei: \"Thanks to my Persona, I was able to escape.\"",
                name+": \"What exactly was the experiment about?\"",
                "Junpei: \"To reshape reality according to the Persona user's wish, creating a New World Order in their vision.\"",
                "Junpei's words struck deep into "+name+" and Kasumi's minds.",
                "Whatever happened in the four walls of this lab was nothing short of terrrifying.",
                "Human experimentation, controlling the world. Those were plots you see in fiction.",
                "But now it had become reality.",
                "Kasumi: \"This is crazy! I mean creating a new world? That's just insane!\"",
                "Junpei: \"Well, you can see for yourself how it ended up.\"",
                "Junpei: \"Obviously it didn't have a good ending.\"",
                name+": \"What else do you know?\"",
                "Junpei: \"That's pretty much it. \"",
                "Junpei: \"After I escaped, I didn't want any connection with this place anymore.\"",
                "Junpei: \"The only reason I'm here now is because of the emergence of Shadows.\"",
                "Kasumi: \"You mean those creatures we've been fighting? What are they?\"",
                "Junpei: \"A side effect of the experiment.\nThe personalities that the public hide come in the form of monsters.\"",
                "Silence filled the air.",
                "The heaviness and despondency of the situation had finally set into their mind.\nThe world was under someone's control and it seemed like there was no hope left.",
                "Unknown Voice: \"Everything was going according to plan. It was all perfect.\"",
                "The three threw their heads in unison towards the voice.",
                "A middle aged man clad in a white lab coat slowly walked towards them.",
                "His eyes had no pupils and his movement was like a zombie.",
                "Junpei: \"Mr Kyouma?\"",
                "Junped stared in disbelief at Houin's living body in the flesh.",
                "Houin: \"Ah, Junpei. You were always my favourite.\"",
                "Houin: \"The way you bore through all the pain and never complained even once.\"",
                "Houin: \"There's a reason only you survived.\"",
                "Houin reached out his hand towards Junpei.",
                "It began glowing with red energy, but Junpei did not recoil.",
                "Instead, he moved closer towards his master's hand.",
                name+": \"Hey Junpei! Snap out of it.!\"",
                "Junpei suddenly returned to his senses and summoned his Persona.",
                "It sliced Houin's body into two and blew the corpse away with a gust of wind.",
                "Junpei: \"Thanks. Lost my mind there for a sec.\"",
                "Kasumi: \"Yeah. And almost your life.\"",
                "But the body was not destroyed. Black bubbles started growing from the leftovers.",
                "The bubbles coalesced together to form a giant creature.",
                "The creature was draped in a silky white cloth that girdled its entire body,\nAnd held two humongous swords in each hand",
                "Its roar reverberated the entire corridor, causing its walls to crumble even more.",
                name+": \"You're not gonna go blank again right?\"",
                "Junpei: \"Not a chance. I'm gonna send this thing to the depths of hell!\"",
            };     
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
            TL.sc.nextLine();
        }
        Kyouma KKY=new Kyouma();
        KKY.main();
        String arr4[] = {
                "Junpei watched as the body of Houin's shadow began turning into specks of bright lights.",
                "They flew up to the sky, reaching out to the heavens.",
                "Kasumi: \"Are you alright?\"",
                "She moved beside Junpei and gave him company in the funeral.",
                "She left her hand on his shoulder, trying to give him as much support as she could.",
                "Junpei: \"I despied him to the core.\"",
                "Junpei: \"He constantly tortured me during the experiments with a smile on his face.\"",
                "Junpei: \"There were times that I wanted to kill him with my own bare hands.\"",
                "Junpei: \"But there were also times when he was such a kind-hearted man.\"",
                "His voice changed from a tone of pure rage to one of grief",
                "Junpei: \"He would calm me down whenever I was down and would play with me whenever I was bored.\"",
                "Junpei: \"He was both a father and a devil to me.\"",
                "Junpei: \"I hated him, but I loved him just as much.\"",
                "Tears began streaming from his eyes like an open faucet.",
                "Kasumi held his hand as "+name+" held his shoulder.",
                "The three of them stood together for almost an eternity.",
                "Junpei: \"Thanks you two. I really appreciate it.\"",
                name+": \"No problem. We're allies aren't we?\"",
                "Kasumi: \"Yeah. We've got your back.\"",
                "Junpei smiled at his new found comrades.",
                "From the beginning of his life, there was no one he could call a friend.\nThey all either died or betrayed him.",
                "But these two high schoolers who fought together with him and stood with him even when he was at his lowest,",
                "He swore to protect them with his life",
                "Almost on cue, the ground started to rumble.\nEverything in the premises was vibrating heavily.",
                "Cracks of concrete began dropping from above as the walls crumbled on itself.",
                name+": \"RUN!\"",
                name+" shouted at the top of his lungs.",
                "The trio ran faster than athletes towards the exit.\nBefore it got blocked by the concrete, they jumped through the doors.",
                "Crash!",
                "The building fell on top of itself, creating a huge dust cloud.",
                "As they got up, they noticed something that looked out of this world.",
                "A dark towering structure stood tall above the clouds and buildings.",
                "Pieces of the tower protruded throught its sides, making it look like a black angel.\nStreaks of red highlighted its edges.",
                "Junpei: \"Crap! We're too late!\"",
                "Kasumi: \"What do you mean? What is happening?!\"",
                "Junpei: \"That's the Tower of Babel, the second phase of 'New World Order'.\"",
                name+": Tower of Babel? Second phase? What are you even saying?!",
                "Junpei: \"When the Tower of Babel appears, the source of the 'New Word Order' will appear...\"",
                "Junpei: \"The Prince of Darkness, Lucifer.\"",
                name+": Lucifer?!",
                "Kasumi: \"This can't be happening!\"",
                "Junpei: \"We have to move now! Before the whole world is destroyed!\"",
                "The trio ran as fast as they could to their final destination, The Tower of Babel."
            };       
        for(int i=0;i<arr4.length;i++)
        {
            System.out.println(arr4[i]);
            TL.sc.nextLine();
        }
    }
}