package com.example.hackathonevent;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

public class ExploreFragment extends Fragment {

    private int redValue = 255;
    private int greenValue = 255;
    private int blueValue = 255;

    enum SeekBarType {
        RED, GREEN, BLUE
    }

    private SeekBarType getSeekBarType(int id) {
        if (id == R.id.redSeekBar) return SeekBarType.RED;
        if (id == R.id.greenSeekBar) return SeekBarType.GREEN;
        if (id == R.id.blueSeekBar) return SeekBarType.BLUE;
        throw new IllegalArgumentException("Unknown SeekBar ID");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_explore, container, false);

        // Seekbar
        SeekBar redSeekBar = rootView.findViewById(R.id.redSeekBar);
        SeekBar greenSeekBar = rootView.findViewById(R.id.greenSeekBar);
        SeekBar blueSeekBar = rootView.findViewById(R.id.blueSeekBar);

        SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                handleSeekBarChange(seekBar.getId(), progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        };

        redSeekBar.setOnSeekBarChangeListener(listener);
        greenSeekBar.setOnSeekBarChangeListener(listener);
        blueSeekBar.setOnSeekBarChangeListener(listener);

        return rootView;
    }

    private void handleSeekBarChange(int seekBarId, int progress) {
        switch (getSeekBarType(seekBarId)) {
            case RED:
                redValue = progress;
                break;
            case GREEN:
                greenValue = progress;
                break;
            case BLUE:
                blueValue = progress;
                break;
        }

        setBackgroundColor();
    }

    private void setBackgroundColor() {
        int color = Color.rgb(redValue, greenValue, blueValue);

        getActivity().getWindow().getDecorView().setBackgroundColor(color);

        View rootView = getActivity().findViewById(android.R.id.content);
        rootView.setBackgroundColor(color);

        View mainLayout = getActivity().findViewById(R.id.mainLayout);
        mainLayout.setBackgroundColor(color);
    }
}
