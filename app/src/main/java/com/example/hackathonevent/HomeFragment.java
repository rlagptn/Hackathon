package com.example.hackathonevent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonSubmit;
    private TextView textViewForm;
    private RadioGroup userTypeRadioGroup;
    private ProgressBar userTypeProgressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        // Form
        editTextUsername = rootView.findViewById(R.id.usernameEditText);
        editTextPassword = rootView.findViewById(R.id.passwordEditText);
        buttonSubmit = rootView.findViewById(R.id.submitBtn);
        textViewForm = rootView.findViewById(R.id.formTextView);

        // RadioGroup, RadioButton, ProgressBar
        userTypeRadioGroup = rootView.findViewById(R.id.userTypeRadioGroup);
        userTypeProgressBar = rootView.findViewById(R.id.userTypeProgressBar);

        userTypeRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.adminRadioButton) {
                    userTypeProgressBar.setProgress(100);
                } else if (checkedId == R.id.userRadioButton) {
                    userTypeProgressBar.setProgress(70);
                } else if (checkedId == R.id.guestRadioButton) {
                    userTypeProgressBar.setProgress(30);
                }
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });

        return rootView;
    }

    private void submitForm() {
        // Fetch the values from the EditText fields
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        // Update the TextView
        String displayText = "Username: " + username + ". Password: " + password;
        textViewForm.setText(displayText);
    }
}
