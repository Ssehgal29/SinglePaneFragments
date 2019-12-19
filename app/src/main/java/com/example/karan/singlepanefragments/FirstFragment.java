package com.example.karan.singlepanefragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
EditText e1,e2;
Button b1;

   // public FirstFragment() {} kisi kam ka ni hai ye constructor
        // Required empty public constructor



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false); //inflater is used to operate any layout on activity
        e1=v.findViewById(R.id.editText);
        e2=v.findViewById(R.id.editText2);
        b1=v.findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_page,new SecondFragment());
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();
            }
        });
        return v;
    }

}
