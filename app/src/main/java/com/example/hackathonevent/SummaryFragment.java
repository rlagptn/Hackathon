package com.example.hackathonevent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SummaryFragment extends Fragment {

    private RegistrationViewModel registrationViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_summary, container, false);

        registrationViewModel = new ViewModelProvider(requireActivity()).get(RegistrationViewModel.class);

        TextView summaryTextView = view.findViewById(R.id.textView_summary);
        String summaryText = "# Team Name: " + registrationViewModel.getTeamName() +
                "\n\n# Team Leader: " + registrationViewModel.getTeamLeader() +
                "\n- Email: " + registrationViewModel.getLeaderEmail() +
                "\n\n# Member 1: " + registrationViewModel.getMember1() +
                "\n- Email: " + registrationViewModel.getMemberEmail1() +
                "\n\n# Member 2: " + registrationViewModel.getMember2() +
                "\n- Email: " + registrationViewModel.getMemberEmail2();
        summaryTextView.setText(summaryText);

        Button finishButton = view.findViewById(R.id.button_finish);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.container, new RegisterFragment())
                        .commit();
            }
        });

        return view;
    }
}
