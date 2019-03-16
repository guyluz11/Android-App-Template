package com.app_name.Fragments;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.app_name.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ForgotPassword extends Fragment {
    private View myView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_forgot_password, container, false);   // get the view of the fragment (do not delete or move)
        constructViews();


        return myView;
    }


    private void constructViews() {        // initialize all the variables in an organized way
    }

}
