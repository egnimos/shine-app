package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

/**
 * Fragment representing the login screen for Shrine.
 */
public class LoginFragment extends Fragment {
    TextInputLayout passwordInputLayout;
    TextInputEditText passwordInputEditText;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.shr_login_fragment, container, false);
        final Button submitButton = view.findViewById(R.id.submit_button);
        passwordInputEditText = view.findViewById(R.id.passwordText);
        passwordInputLayout = view.findViewById(R.id.password);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }
        });
        // Snippet from "Navigate to the next Fragment" section goes here.

        return view;
    }

    // "isPasswordValid" from "Navigate to the next Fragment" section method goes here
    private boolean isPasswordValid() {
        Editable text = passwordInputEditText.getText();
        return text != null && text.length() >= 8;
    }

    public void submit() {
        if (!isPasswordValid()) {
            passwordInputLayout.setError("Password is invalid");
            return;
        }
        passwordInputLayout.setError(null);
        ((NavigationHost) requireActivity()).navigateTo(new ProductGridFragment(), false);
    }


}
