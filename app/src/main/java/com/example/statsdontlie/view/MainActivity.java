package com.example.statsdontlie.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.statsdontlie.OnFragmentInteractionListener;
import com.example.statsdontlie.R;
import com.example.statsdontlie.repository.BDLRepository;
import com.example.statsdontlie.view.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new BDLRepository().makeResponse();
        displayMenuFragment();
    }

    @Override
    public void displayMenuFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, MenuFragment.newInstance())
                .commit();
    }

    @Override
    public void displayGameFragment() {}
}