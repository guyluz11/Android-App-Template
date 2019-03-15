package workshifter.com.app_name.Fragments;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import workshifter.com.app_name.R;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Login extends Fragment {
    private View myView;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_login, container, false);   // get the view of the fragment (do not delete or move)
        constructViews();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("go", "This is button clicked");
                Navigation.findNavController(myView).navigate(R.id.action_login_to_createNewAccount);  // Change to Chef kitchen Screen
            }
        });
        return myView;
    }


    private void constructViews() {        // initialize all the variables in an organized way

        button = myView.findViewById(R.id.loginButton_login);

    }
}
