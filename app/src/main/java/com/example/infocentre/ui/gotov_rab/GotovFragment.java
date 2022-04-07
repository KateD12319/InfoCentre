package com.example.infocentre.ui.gotov_rab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.infocentre.databinding.FragmentGotovRabBinding;

public class GotovFragment extends Fragment {


    private GotovViewModel gotovViewModel;
    private FragmentGotovRabBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gotovViewModel =
                new ViewModelProvider(this).get(GotovViewModel.class);

        binding = FragmentGotovRabBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGotov;
        gotovViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        final TextView textView2 = binding.text;
        gotovViewModel.getText2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView2.setText(s);
            }
        });
        final TextView textView3 = binding.text2;
        gotovViewModel.getText3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView3.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
