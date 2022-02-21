package edu.cascadia.mobile.apps.passwordcheck;

import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import edu.cascadia.mobile.apps.passwordcheck.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //TODO: create a private ViewModel instance variable

    private PasswordViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Comment out the setContentView - we'll use a binding instead
        //setContentView(R.layout.activity_main);

        //TODO: Create a new binding using DataBindingUtil
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //TODO: Create a new PasswordViewModel object

        viewModel = new ViewModelProvider(this).get(PasswordViewModel.class);

        //TODO: Set the binding's ViewModel to your new PasswordViewModel
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

    }
}
