package edu.cascadia.mobile.apps.passwordcheck;
// Adapted from https://www.bignerdranch.com/blog/two-way-data-binding-on-android-observing-your-view-with-xml/

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;

import androidx.databinding.Bindable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

public class PasswordViewModel extends ViewModel {
    private MutableLiveData<String> password = new MutableLiveData<>();
    private MutableLiveData<String> passwordQuality = new MutableLiveData<String>();

    public String getPassword() {
        return password.getValue();
    }

    public void setPassword(String password) {
        this.password.setValue(password);
    }

    public String getPasswordQuality() {
        return passwordQuality.getValue();
    }

    public void onPasswordTextChanged(CharSequence charSequence) {

        if (password == null || password.getValue() == null ) {
            passwordQuality.setValue("Enter a password");
        } else if (password.getValue().equals("password")) {
            passwordQuality.setValue("Very bad");
        } else if (password.getValue().length() < 6) {
            passwordQuality.setValue("Short");
        } else {
            passwordQuality.setValue("Okay");
        }
    }
}
