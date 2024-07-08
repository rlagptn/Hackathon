package com.example.hackathonevent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class RegisterFragment extends Fragment {

    private RegistrationViewModel registrationViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        registrationViewModel = new ViewModelProvider(requireActivity()).get(RegistrationViewModel.class);

        EditText teamNameEditText = view.findViewById(R.id.editText_team_name);
        EditText teamLeaderEditText = view.findViewById(R.id.editText_team_leader);
        EditText leaderEmailEditText = view.findViewById(R.id.editText_leader_Email);
        Button buttonNext = view.findViewById(R.id.button_next);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrationViewModel.setTeamName(teamNameEditText.getText().toString());
                registrationViewModel.setTeamLeader(teamLeaderEditText.getText().toString());
                registrationViewModel.setLeaderEmail(leaderEmailEditText.getText().toString());
                getFragmentManager().beginTransaction()
                        .replace(R.id.container, new RegisterFragment2())
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}
