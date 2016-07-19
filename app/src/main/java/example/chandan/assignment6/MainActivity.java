package example.chandan.assignment6;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView friendsRecyclerView;
    ArrayList<Friends.Friend> friendArrayList;
    int key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recycler Code
        friendsRecyclerView=(RecyclerView)findViewById(R.id.rv);
        friendArrayList=Friends.getFriends();

        //Frag Code
        final Fragment1 fragOne =new Fragment1();
        fragOne.setArguments(0);

        final FragmentManager fragMgr=getSupportFragmentManager();
        FragmentTransaction fragTxn=fragMgr.beginTransaction();
        //Fragment Transaction is of two types support and non-support based on the type of Fragment Manager
        fragTxn.add(R.id.frag_container,fragOne,null);//until you commit no changes are made on the view
        //in above statement if we pass a string instead of null then that fragment can be referred to by that string name
        fragTxn.commit();

        //recycler Code
        FriendsRecyclerViewAdapter friendsRecyclerViewAdapter=new FriendsRecyclerViewAdapter(friendArrayList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        friendsRecyclerView.setLayoutManager(layoutManager);

        friendsRecyclerView.setAdapter(friendsRecyclerViewAdapter);
        friendsRecyclerViewAdapter.notifyDataSetChanged();
    }

    public class friendsRecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView friendImageView;

        public friendsRecyclerViewHolder(View itemView){
            super(itemView);

            friendImageView=(ImageView)itemView.findViewById(R.id.friend_image);
        }
    }

    public class FriendsRecyclerViewAdapter extends RecyclerView.Adapter<friendsRecyclerViewHolder>
    {
        private ArrayList<Friends.Friend> myFriends;

        public FriendsRecyclerViewAdapter(ArrayList<Friends.Friend> myFriends)
        {
            this.myFriends=myFriends;
        }

        @Override
        public friendsRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater li=getLayoutInflater();
            View itemView=li.inflate(R.layout.image_list,parent,false);
            friendsRecyclerViewHolder friendsRecyclerViewHolder=new friendsRecyclerViewHolder(itemView);
            return friendsRecyclerViewHolder;
        }

        @Override
        public void onBindViewHolder(friendsRecyclerViewHolder holder, final int position) {

            Friends.Friend thisFriend=myFriends.get(position);

            holder.friendImageView.setImageResource(thisFriend.image);
            holder.friendImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    key=position;

                    final Fragment1 fragTwo =new Fragment1();
                    fragTwo.setArguments(key);
                    final FragmentManager fragMgr=getSupportFragmentManager();
                    FragmentTransaction fragTxn=fragMgr.beginTransaction();
                    fragTxn.replace(R.id.frag_container,fragTwo,null);
                    fragTxn.commit();

                }
            });
        }

        @Override
        public int getItemCount() {
            return myFriends.size();
        }
    }
/*
    public void ViewPersonalInformation(View view){

        final SecondFragment fragTwo =new SecondFragment();

        final FragmentManager fragMgr=getSupportFragmentManager();
        FragmentTransaction fragTxn=fragMgr.beginTransaction();
        fragTxn.replace(R.id.frag_container,fragTwo,null);
        fragTxn.commit();
    }
    */
}
