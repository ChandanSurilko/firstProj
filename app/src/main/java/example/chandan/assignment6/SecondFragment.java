package example.chandan.assignment6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_FRIEND_ID = "key";

    ArrayList<Friends.Friend> friendsInfoList = Friends.getFriends();

    TextView FragName;
    TextView FragAge;
    TextView FragEmailId;
    TextView FragAddress;
    TextView FragPhoneNo;
    TextView FragHobbies;

    // TODO: Rename and change types of parameters
    private int key;

    public SecondFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(int key) {
        //First Objects are created and then the variables of the object could be set easily..
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_FRIEND_ID, String.valueOf(key));
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            SecondFragment FragOne = new SecondFragment();
            SecondFragment FragTwo = new SecondFragment();
            SecondFragment FragThree = new SecondFragment();
            SecondFragment FragFour = new SecondFragment();
            SecondFragment FragFive = new SecondFragment();
            SecondFragment FragSix = new SecondFragment();

            int key = getArguments().getInt(ARG_FRIEND_ID);
        } else {
            Log.d(ARG_FRIEND_ID, "So can't be done");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment, container, false);
        FragName = (TextView) rootView.findViewById(R.id.tv_name);
        FragAge = (TextView) rootView.findViewById(R.id.tv_age);
        FragEmailId = (TextView) rootView.findViewById(R.id.tv_email_id);
        FragAddress = (TextView) rootView.findViewById(R.id.tv_address);
        FragPhoneNo = (TextView) rootView.findViewById(R.id.tv_phone_no);
        FragHobbies = (TextView) rootView.findViewById(R.id.tv_hobbies);

        FragName.setText(friendsInfoList.get(key).name);
        FragAge.setText(String.valueOf(friendsInfoList.get(key).age));
        FragEmailId.setText(friendsInfoList.get(key).emailId);
        FragAddress.setText(friendsInfoList.get(key).address);
        FragPhoneNo.setText(friendsInfoList.get(key).phoneNumber);
        FragHobbies.setText(friendsInfoList.get(key).hobbies);

        return rootView;
    }
}