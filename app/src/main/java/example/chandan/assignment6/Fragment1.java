package example.chandan.assignment6;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * Created by Chandan on 25-06-2016.
 */
public class Fragment1 extends Fragment {

    ArrayList<Friends.Friend> friendsInfoList=Friends.getFriends();
    public static int key;

    TextView FragName;
    TextView FragAge;
    TextView FragEmailId;
    TextView FragAddress;
    TextView FragPhoneNo;
    TextView FragHobbies;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment,container,false);
        FragName=(TextView)rootView.findViewById(R.id.tv_name);
        FragAge=(TextView)rootView.findViewById(R.id.tv_age);
        FragEmailId=(TextView)rootView.findViewById(R.id.tv_email_id);
        FragAddress=(TextView)rootView.findViewById(R.id.tv_address);
        FragPhoneNo=(TextView)rootView.findViewById(R.id.tv_phone_no);
        FragHobbies=(TextView)rootView.findViewById(R.id.tv_hobbies);

        for(int i=0;i<friendsInfoList.size();i++)
        {
            if(i==key)
            {
                FragName.setText(friendsInfoList.get(i).name);
                FragAge.setText(String.valueOf(friendsInfoList.get(i).age));
                FragEmailId.setText(friendsInfoList.get(i).emailId);
                FragAddress.setText(friendsInfoList.get(i).address);
                FragPhoneNo.setText(friendsInfoList.get(i).phoneNumber);
                FragHobbies.setText(friendsInfoList.get(i).hobbies);
            }
        }

        return rootView;
    }

    public void setArguments(int key) {
        this.key=key;
    }


}
