package com.example.hackathonevent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class RegisterFragment2 extends Fragment {

    private RegistrationViewModel registrationViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register2, container, false);

        registrationViewModel = new ViewModelProvider(requireActivity()).get(RegistrationViewModel.class);

        EditText member1EditText = view.findViewById(R.id.editText_member1);
        EditText member1EmailEditText = view.findViewById(R.id.editText_member_Email1);
        EditText member2EditText = view.findViewById(R.id.editText_member2);
        EditText member2EmailEditText = view.findViewById(R.id.editText_member_Email2);
        Button buttonNext2 = view.findViewById(R.id.button_next2);

        buttonNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrationViewModel.setMember1(member1EditText.getText().toString());
                registrationViewModel.setMemberEmail1(member1EmailEditText.getText().toString());
                registrationViewModel.setMember2(member2EditText.getText().toString());
                registrationViewModel.setMemberEmail2(member2EmailEditText.getText().toString());
                getFragmentManager().beginTransaction()
                        .replace(R.id.container, new SummaryFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}
