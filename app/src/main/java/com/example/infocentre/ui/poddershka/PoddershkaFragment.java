package com.example.infocentre.ui.poddershka;

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

import com.example.infocentre.databinding.FragmentPoddershkaBinding;

public class PoddershkaFragment extends Fragment {


    private PoddershkaViewModel poddershkaViewModel;
    private FragmentPoddershkaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        poddershkaViewModel =
                new ViewModelProvider(this).get(PoddershkaViewModel.class);

        binding = FragmentPoddershkaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPoddershka;
        poddershkaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        final TextView textView2 = binding.text;
        poddershkaViewModel.getText2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView2.setText(s);
            }
        });
        final TextView textView3 = binding.textView2;
        poddershkaViewModel.getText3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView3.setText(s);
            }
        });
        final TextView textView4 = binding.textView3;
        poddershkaViewModel.getText4().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView4.setText(s);
            }
        });
        final TextView textView5 = binding.textView4;
        poddershkaViewModel.getText5().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView5.setText(s);
            }
        });
        final TextView textView6 = binding.textView5;
        poddershkaViewModel.getText6().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView6.setText(s);
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
