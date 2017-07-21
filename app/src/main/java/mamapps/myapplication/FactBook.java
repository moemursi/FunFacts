package mamapps.myapplication;


import java.util.Random;

public class FactBook {
   //fields  (MEMBER VARIABLES //
   private String[] mFacts = {
           "Ants stretch when they wake up in the morning.",
           "Ostriches can run faster than horses.",
           "Olympic gold medals are actually made mostly of silver.",
           "You are born with 300 bones; by the time you are an adult you will have 206.",
           "It takes about 8 minutes for light from the Sun to reach Earth.",
           "Some bamboo plants can grow almost a meter in just one day.",
           "The state of Florida is bigger than England.",
           "Some penguins can leap 2-3 meters out of the water.",
           "On average, it takes 66 days to form a new habit.",
           "Mammoths still walked the earth when the Great Pyramid was being built.",
           " The numbers '172' can be found on the back of the U." , "S." , " $5 dollar bill in the bushes at the base of the Lincoln Memorial." ,
           "President Kennedy was the fastest random speaker in the world with upwards of 350 words per minute." ,
           " In the average lifetime, a person will walk the equivalent of 5 times around the equator." ,
           " Odontophobia is the fear of teeth." ,
           "The 57 on Heinz ketchup bottles represents the number of varieties of pickles the company once had." ,
           " In the early days of the telephone, operators would pick up a call and use the phrase,Well, are you there?",
           " According to suicide statistics, Monday is the favored day for self-destruction." ,
           "Cats sleep 16 to 18 hours per day." ,
           "The most common name in the world is Mohammed."
   };

    // Methods (Actions the object can take)
    public String getFact(){


        String fact = "";
        // randomly select a fact
        //random class
        Random randomGen = new Random();
        // random number to random class to length of the array
        int randomNumb = randomGen.nextInt(mFacts.length);
        //assign the randomnumber to the mFacts from the array
        fact = mFacts[randomNumb];
        return fact;
    }
}
