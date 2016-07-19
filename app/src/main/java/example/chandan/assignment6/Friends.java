package example.chandan.assignment6;

import java.util.ArrayList;

/**
 * Created by Chandan on 25-06-2016.
 */
public class Friends {

    public static class Friend{

        int key;
        String name;
        int image;
        int age;
        String emailId;
        String phoneNumber;
        String address;
        String hobbies;

        public Friend(int key,String name,int image,int age,String emailId,String phoneNumber,String address,String hobbies)
        {
            this.key=key;
            this.name=name;
            this.image=image;
            this.age=age;
            this.emailId=emailId;
            this.phoneNumber=phoneNumber;
            this.address=address;
            this.hobbies=hobbies;

        }
    }

    public static ArrayList<Friend> getFriends()
    {
        ArrayList<Friend> friends=new ArrayList<>(100);

        friends.add(new Friend(0,"Gaurav Sinha",R.drawable.gaurav_sinha,21,"gauravsinha@gmail.com","1234567890",
                                "N-4/24,R-1, Rajeev Nagar Colony, Karaundi, Post B.H.U, Varanasi, UP 221005",
                                "Play Badminton, Tennis, Programming"));
        friends.add(new Friend(1,"Arpita Singh",R.drawable.arpita_singh,20,"arpitasingh@gmail.com","1345672891",
                                "A-41 Ranjit Singh Block, Asiad Village Complex/Khelgaon, New Delhi",
                                "Hang Out With Friends, Make sketches, Eat Pizza!!"));
        friends.add(new Friend(2,"Anubhav Gupta",R.drawable.anubhav_gupta,21,"anubhav2396@gmail.com","9876543210",
                                "C-9/1, RDSO Colony,Manak Nagar,Near RDSO Stadium, Lucknow",
                                "Play Football, Basketball, Sleep to the extreme!!"));
        friends.add(new Friend(3,"Shraddha Singh",R.drawable.shraddha_singh,21,"sara@gmail.com","9876512340",
                                "B-1/15, Sector-C, Aliganj,Near Mother Care School, Lucknow",
                                "Eat Delicacies, Read Novels, Hang out with Friends, Play with Tedda!!"));
        friends.add(new Friend(4,"Simardeep Kaur Jeji",R.drawable.simardeep_kaur_jeji,20,"simardeep.kaur.jeji@gmail.com","1234598760",
                                "Village-fatehgarh Chhanna,P.O. Box-gajewas, Tehsil-samana,147001,Patiala,Punjab",
                                "Hang Out with Friends, Read Novels, Listening Songs, Busy People!!"));
        friends.add(new Friend(5,"Abhinav Kumar",R.drawable.abhinav_kumar,20,"abhinav2496@gmail.com","1357912345",
                                "Patna","Sleeping to the extreme!!"));

        return friends;
    }
}
