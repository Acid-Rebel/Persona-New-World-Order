package RPG;


class BabelB
{
    public static void main()
    {
        BASE BB=new BASE();
        String name = BB.name;

        String arr1[] = {
                "The tower was even more frightening up close than it was from a distance.",
                "The entrance stood tall as thoguh it was made for a giant.\nRed light bles from the sides of the closed door.",
                "Veins grew from the base of the tower like the roots of a sequoia tree.",
                "Kasumi: \"This can't be real...\"",
                "Junpei: \"Unfortunately it is. But we don't have time to just stare at it.\"",
                name+": \"Right. We have to destroy it.\"",
                "They went throught the ginormous doors, but they weren't prepared for how it looked on the inside.",
                "Their surroundings resembled a computer motherboard.\nLines of red wires were drawn on the pitch black walls.",
                "Thump. Thump. Thump. They could feel the pulsing of the tower from their feet.",
                "Junpei: \"It's like the tower is alive. Guess our work is going to be easier said than done.\"",
                "Kasumi: \"Not like we though it would be easy to begin with.\"",
                name+": \"Let's move!\"",
            };
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
            BB.sc.nextLine();
        }
        Dungeon4Part1 DD4P1=new Dungeon4Part1();
        DD4P1.main();
        String arr2[] = {
                "Once they crossed the endless flight of stairs, a huge platform appeared right in front of their eyes.",
                name+": \"This place just gets weirder and weirder.\"",
                "As they stepped foot on the platform, a humongous winged knight suddenly crashed to the ground.",
                "He was clad in ash-grey armour that had battle dents and scars.\nIt's bright white sword was nearly the size of a streetlight.\"",
                "Knight: \"Thou shalt not pass, mortals. For creating the link between Earth and Hell, all of humanity shall be punished!",
                "The knight dug its sword through the ground and created a barrier to the other side.",
                "Junpei: \"Archangel, the devoted servant of god. It seems that humanity has angered heaven by summoning the tower.\"",
                "Kasumi:\"This couldn't have gotten any worse.\"",
                name+": \"We don't have time for this!\"",
                name+" summoned his Persona and slashed through the barrier, shattering it to pieces and sending Archangel flying.",
                "Archangel: \"Such power... You must be spawns of Satan. I shall ravage you here!\"",
                name+": \"I don't care what you think we are. If you stand in our way, then you'll die by our hands!\"",
            };
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
            BB.sc.nextLine();
        }
        Angel1 AA1=new Angel1();
        AA1.main();
        String arr3[] = {
                "Archangel disappeared into the light leaving not even a speck of his presence behind.",
                "Kasumi:\"So not we have to fight angels too. I don't know how much longer I can take this.\"",
                "Junpei: \"Hey, Kasumi. We've come this far already. If we work together, we can do anything.\"",
                "Junpei let out his hand for a fist bump. Both Kasumi and " +name+" punched his fist in unison.",
                name+": \"Kasumi, you're strong. With strength and courage you can do anything.\"",
                "Kasumi:\"Thanks, guys. I swear I won't slow us down anymore.\"",
                "Kasumi:\"We're the only ones that can protect our world. So fight on!\"",
            };               
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
            BB.sc.nextLine();
        }
        Dungeon4Part2 DDD4P2=new Dungeon4Part2();
        DDD4P2.main();
        String arr4[] = {
                "Once they reached the next platform, the trio head a faint buzzing sound enter their ears from above.",
                "The team looked up instinctively and and couldn't believe their eyes.",
                "A fly-like demon soared on top of them and crashed down at the center of the platform.\nIt held a bone staff on its right arm that was surrounded by minisucle flies.",
                "Kasumi:\"What kind of fly is that?! I don't want to touch that thing!\"",
                "Junpei: \"That, my friends is Beelzebub, the Lord of the Flies. One of the strongest shadows.\"",
                "Junpei: \"Get ready. This is going to be a tough fight!\"",

            };      
        for(int i=0;i<arr4.length;i++)
        {
            System.out.println(arr4[i]);
            BB.sc.nextLine();
        }
        Angel2 AA2=new Angel2();
        AA2.main();

        String arr5[] = {
                name+": \"Phew! You weren't kidding Junpei.\"",
                "Kasumi:\"If that's just one of the tower leaders, imagine how strong the rest are.\"", 
                "Junpei: \"We still got a long way to go. Let's keep moving.\"",
            };   

        for(int i=0;i<arr5.length;i++)
        {
            System.out.println(arr5[i]);
            BB.sc.nextLine();
        }
        Dungeon4Part3 DD4P3=new Dungeon4Part3();
        DD4P3.main();

        String arr6[] = {
                "Junpei: \"Huff. Huff. Huff. So. Many. Stairs.\"",
                name+": \"I feel like I might collapes at any moment.\"",
                "Kasumi:\"Don't you dare. I'm not gonna carry you both up the rest of the stairs.\"",
                "As they dragged their feet up the remainign stairs,\nThey caught sight of a figure standing at the center of the platform.",
                "It's body was made of pure metal and its wings spread far and wide.",
                "Junpei: \"Metatron, the leader of the angels. He's no joke that's for sure.\"",
                name+": \"Guess we pissed him off for fighting the angels.\"",
                "Metatron: \"Thou mortals! Thou shall be punished for your sins against the Almighty. Prepare to face judgement!\"",
                "Metatron prepared his attacking stance. His wings blew a gust of wind at the trio, sending them flying back.",
                "Kasumi:\"Such power!\"",
                "Junpei: \"Metatron's power is almost second to none. Prepare for one hell of a battle!\"",
            };     
        for(int i=0;i<arr6.length;i++)
        {
            System.out.println(arr6[i]);
            BB.sc.nextLine();
        }
        Angel3 AA3=new Angel3();
        AA3.main();
        String arr7[] = {
                "Metatron: \"I commend thou power, though thou art mine enemy. Don't believe that God has forgiven you.\"",
                "Metatron: \"You will be ravaged by The Almight soon enough. It is only a matter of time...\"",
                "A bright light suddenly shone from above and attracted Metatron to the heavens.",
                "On his exit, he left a glowing feather on the ground that sparkled in the darkness.",
                name+" took the feather in his hand and kept it safely in his pocket.",
                "Junpei: \"Guess this is it. The top of the tower is just past here.\"",
                "Kasumi:\"We'll probably meet that masked man again. I'm gonna freeze him to death this time for sure.\"",
                name+": \"Whatever comes our way, we'll get through it together.\"",
                name+": \"C'mon team! Let's end this!\"",
                "They rushed up the final flight of stairs, struggling to breathe in the thinning air.",
                "A ray of light bled through the opening of the tower.",
                name+": \"Almost there!\"",
                "WOOSH!",
                "The winds blew a death lament on the peak of the tower.\nThe red moon shone a spotlight on the trio.",
                "A lone man stood at the edge of the tower, staring at the scenery below.",
                "Masked Man:\"I've been waiting for you, "+name+".\"",
                name+": \"You! Tell me where Shinjiro is right now or else!\"",
                "Masked Man:\"You'll know where he is soon enough. Before that, I want to tell you all a short story.\"",
                "Junpei: \"Don't screw with us! I know you're the Avatar of Lucifer!\"",
                "Junpei: \"If we kill you right here right now, everything will go back to normal.\"",
                "Kasumi:\"Just say the word "+name+". I'll pierce him straight through the heart!\"",
                name+": \"Wait!\"",
                "The way the Masked Man said those words triggered a reaction in "+name+"'s mind.",
                "It was too familiar...",
                "Kasumi:\"Why?! We can save the world if we kill this one guy!\"",
                name+": \"Tell me the story.\"",
                "Junpei and Kasumi stood shocked hearing "+name+"'s words.\n They had never expected this turn of events.",
                "Masked Man:\"I knew you would understand.\"",
                "The man turned towards the trio and stared straight into "+name+"'s eyes.",
                "Masked Man:\"Once upon a time, there lived a young boy.\"",
                "Masked Man:\"In his childish mind, he thought that the world revolved only around him.\nHe constantly lived life to the fullest.\"",
                "Masked Man:\"But God had other plans.\"",
                "Masked Man:\"When the boy was at the peak of his life, he was infected with an incurable illness.\"",
                "Masked Man:\"The boy's happiness crashed down to the depths of hell and his life was then filled with constant pain and suffering.\"",
                "Raw emotion could be felt from his voice.",
                "The three did not know how to react to this monster showing genuine human feelings.",
                "Masked Man:\"However, everything heard for the boy when he heard a call.\"",
                "Masked Man:\"It was a voice of kindness that he had never heard before in his life.\"",
                "Masked Man:\"The calm voice reached out to him, ready to save him from his suffering.\"",
                "Masked Man:\"That's when he got the greatest gift one could ask for - \"",
                "Masked Man:\"Power...\"",
                "The Masked Man released all of his energy.",
                "An aura of black clouds emerged from the man's person, encovering the blood red sky.\nA red outline glew on the man's body from head to toe.",
                "The presence "+name+" felt previously was nothing compare to what he felt now.",
                "The man was worse than any monster.",
                "He was the devil.",
                "Kasumi:\"He's nothing like how he was before!\"",
                "Junpei: \"Doesn't matter. We'll beat him this time for sure!\"",
                "Kasumi:\"Yeah. Let's end this!\"",
                name+": \"....\"",
            };                
        for(int i=0;i<arr7.length;i++)
        {
            System.out.println(arr7[i]);
            BB.sc.nextLine();
        }
        MaskedMan2 MMM2=new MaskedMan2();
        MMM2.main();
        String arr8[] = {
                "Masked Man: \"GAAH!\"",
                "The masked man recoil in pain.",
                "His suit was full of scuffs and tears and his mask had begun to crack.",
                "Junpei: \"This is it! We've almost finished him off!\"",
                "Kasumi:\""+name+"! Deal the finishing blow!\"",
                "But "+" did not do anything. He continued to stare at the masked man.",
                "Kasumi:\""+name+"?! Why are you blanking out now!\"",
                name+" ignored Kasumi's words and walked towards the masked man.\nHis teammates stood frozen not knowing what he was doing.",
                name+": \"You don't have to hide behind that mask any longer. Take it off.\"",
                "The masked man refused to acknowledge "+name+"'s presence.",
                name+": \"Shinjiro!\"",
                "The man took off his mask, revealing a pale face with pale blue eyes and ash grey hair.",
                "The two friends stared at each other for so long that time seemed to have frozen.",
                "Shinjiro: \"So,you finally found out. Took you long enough.\"",
                name+": \"Why!? Why are you doing this?!\"",
                "Shinjiro: \"Because of you.\"",
                name+"s heart broke into pieces.",
                "Hearing those words from his best friend's heart shattered his mind into pieces. He was at a loss for words.",
                "Shinjiro: \"You were always so perfect and deft. You never faced any difficulties in life.\"",
                "Shinjiro: \"On the other hand, my life had been nothing short of a nightmare!\"",
                "Shinjiro: \"You never had to suffer with a disease! You never had to suffer with this pain!\"",
                "A surge of power suddenly released wildly around him.\nIt was like a raging animal that went out of control.",
                "The ground formed spider-web like cracks below Shinjiro.",
                "The force of his power pushed the trio nearly off the tower.",
                "Junpei: \"How is he getting even stronger!\"",
                "Kasumi:\"If this keeps up, we'll never beat him!\"",
                "The team tried to block the incoming energy but it was too powerful. He had forgone his humanity...",
                "Shinjiro: \"That's why I accepted this power. I don't care who I got it from but it made my dream come true.\"",
                "Shinjiro: \"With this power, I'll make sure you taste suffering "+name+"!\"",
                "Kasumi: \"If you want to get to him, you're gonna have to get through us!\"",
                name+": \"No. If he wants to fight me alone, then so be it.\"",
                name+" moved in front of Kasumi and stood in front of Shinjiro.",
                "The two former best friends glared at each other with contempt. The tension between them could be cut with a knife.",
                name+" and Shinjiro: \"PERSONA!\"",
            };             
        for(int i=0;i<arr8.length;i++)
        {
            System.out.println(arr8[i]);
            BB.sc.nextLine();
        }
        Shinjiro SSS=new Shinjiro();
        SSS.main();
        String arr9[]= {
                "Shinjiro: \"Huff. Huff. Huff.\"",
                "Shinjiro: \"How!? I have everything now! How can I still lose to you?!\"",
                name+": \"Enought of this, Shinjiro. Let's go home.\"",
                name+" held out his hand towards his friend.\nShinjiro's words had hurt him greatly but the bond between them will not be broken so easily.",
                "Shinjiro: \"Disgusting.\"",
                "WACK! Shinjiro smacked away "+name+"'s hand.",
                "Although "+name+" though their bond was strong, in Shinjiro's point of view, their bond had been broken long ago.",
                "There was nothing that could mend it back together.",
                "Shinjiro: \"Why does it always have to be you?! Why do you get to have everything but I don't!\"",
                "Shinjiro wobbled back up to his feet but he succumbed to his injuries and fell back down.",
                "He painstakingly stretched as far as he could towards "+name+" but his body screamed in aches and pains.",
                "Junpei: \"Sometimes, life just doesn't go your way.\"",
                "Junpei: \"We have to learn to accept ourselves and make the best out of our situation.\"",
                "Junpei: \"That's what I learnt from the time in the lab.\"",
                "Shinjiro: \"Shut up, lab rat! don't act like you know me just because you're my predecessor!\"",
                "Kasumi: \"We can't just act like children and be jealous of more fortunate people. It's time to grow up Shinjiro.\"",
                "Shinjiro: \"Shut up. Shut up. SHUT UP!\"", 
                "Unknown Voice: \"Relax, my son. Everything shall be alright now.\"",
                "The mysterious, bone-chilling voice spoke into everyone's mind.",
                "Its deep metallic and throatless tone sent chills down everyone's spine...",
                "Except Shinjiro.",
                "Shinjiro: \"That voice... Master! You've finally come!\"",
                "He raised his hands in the air as though he was worshipping a deity.",
                name+" and Kasumi stood frozen in fear at the overbearing presence they felt,\n But Junpei held his chin in his hand in deep thought.",
                "Junpei: \"There can only be one creature with this much energy.\"",
                "Junpei: \"Guys. Eyes up and stay sharp!\"",
                "GRRRR!",
                "It wasn't just the tower that rumbled. The air, the ground, the sea.",
                "Everything was vibrating with immense force.",
                "A black void suddenly opened in the sky, stretching across the entire city.\nSwarms of demons came rushing out of the portal, massacring all the humans on the ground.",
                "Then it came.",
                "A creature bigger than the largest skyscraper emerged from the portal and floated opposite the tower.",
                "It's dark blue skin absorbed as much light as possible and its humongous claws were as sharp as a bear's.",
                "The creature's blood red eyes stared deep into the eyes of "+name+". He could only utter one word.",
                name+": \"Lucifer.\"",
                "The trio's slight trembling became uncontrollable shivers.\nIt's pure malevolent energt was more powerful than anything they had ever faced.",
                "Shinjiro: \"Master! Please lend me your strength!\"",
                "Lucifer: \"Yes, my child. All will be well now that I've returned to the mortal realm.\"",
                "Lucifer: \"But you shall be the sacrfice of the New World Order.\"",
                "Shinjiro: \"What! No! That wasn't the promise!\"",
                "Energy began being drained from Shinjiro's body.\n His blood curdling scream was all that could be heard in the silence.",
                name+" tried to run towards Shinjiro but he was too late.",
                "All that was left of Shinjiro was a corpse.",
                name+": \"Shinjiro!\"",
                name+" fell to the ground near his friend's body. It felt lifess and was limp and cold.",
                "Tears began pouring from out of "+name+"'s eyes like a raging waterfall.",
                "Kasumi and Shinjiro could only watch their ally's breakdown.",
                "Lucifer: \"Child of man. Feel not sorrow for your loss, as his sacrifice will ben benefitial to this world.\"",
                "Junpei: \"You monster! You think we'll let you just do whatever you want!\"",
                "Kasumi: \"This is our world! We'll fight for it till the bitter end.\"",
                name+": \"Lucifer. I'll never forgive you for taking the life of someone important to me.\"",
                name+": \"I'll never forgive you for causing so much pain and suffering to my friends\"",
                "A burst of energy released from "+name+"'s body.",
                "He unleashed his Persona and pointed his blade towards Lucifer.",
                "Suddenly, the golden feather in "+name+"'s pocked started glowing.",
                "An aura of blinding gold light enveloped him and his Persona.",
                "The Persona transmutate into a new form nothing like how it had been before.",
                "It carried a huge blade and wore golden armour with a long white scarf draped around its neck.",
                "It's face was covered in a white mask and had laser-like red eyes.",
                "The figure pointed its weapon to Lucifer.",
                name+": \"PERISH!\"",
            };
        for(int i=0;i<arr9.length;i++)
        {
            System.out.println(arr9[i]);
            BB.sc.nextLine();
        }
        Lucifer LL=new Lucifer();
        LL.main();
        String arr10[] = {
                "Lucifer: \"The strengh of humanity has surpassed my expectations.\"",
                "Lucifer: \"They are willing to fight for what they desire and protect what is important to them.\"",
                "Lucifer: \"If humans like you three continue to exist through the generations,\nHumanity may not face its inevitable doom.\"",
                "The body of Lucifer began disentegrating into specks of red orbs that diffused all around the premises.",
                "His minion fell apart into dust as the black portal above closed into itself.",
                "The red sky returned to its bright blue hue of ocean with islands of cloud laid on it.",
                "Kasumi: \"Finally. It's over.\"",
                "Junpei: \"The world is finally at peace. You can rest now Mr. Kyouma.\"",
                name+" continued to stare at Shinjiro's body.",
                "As it began disentegrating like Lucifer and his minion's a small photograph appeared from the dust.",
                name+" examined the photograph and gave a warm smile.",
                "It was a picture the two of them had taken when they were kids.",
                name+": \"Rest in peace, Shinjiro. We'll live on for your sake.\"",
                "The trio stared u[ at the sky, taking in the beautiful scenery and life around them.",
                "They accepted the New World with open arms...."
            };
        for(int i=0;i<arr10.length;i++)
        {
            System.out.println(arr10[i]);
            BB.sc.nextLine();
        }
    }
}
