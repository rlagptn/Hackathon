package com.example.hackathonevent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class FeedbackFragment extends Fragment {

    private EditText feedbackEditText;
    private Switch anonymousSwitch;
    private Button submitButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_feedback, container, false);

        feedbackEditText = rootView.findViewById(R.id.feedbackEditText);
        anonymousSwitch = rootView.findViewById(R.id.anonymousSwitch);
        submitButton = rootView.findViewById(R.id.button_submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitFeedback();
            }
        });

        return rootView;
    }

    private void submitFeedback() {
        String feedback = feedbackEditText.getText().toString();
        boolean isAnonymous = anonymousSwitch.isChecked();

        if (isAnonymous) {
            Toast.makeText(getActivity(), "Feedback submitted anonymously: " + feedback, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "Feedback submitted: " + feedback, Toast.LENGTH_SHORT).show();
        }
    }
}
