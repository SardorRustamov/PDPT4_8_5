package com.example.pdpt4_8_5.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pdpt4_8_5.R;
import com.example.pdpt4_8_5.adapter.PostAdapter;
import com.example.pdpt4_8_5.databinding.FragmentPostBinding;
import com.example.pdpt4_8_5.model.PostList;

import java.util.ArrayList;
import java.util.List;

public class PostFragment extends Fragment {


    FragmentPostBinding binding;
    private List<PostList> postLists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPostBinding.inflate(inflater, container, false);
        loadPostList();

        PostAdapter postAdapter = new PostAdapter(postLists);

        binding.rvPost.setAdapter(postAdapter);
        return binding.getRoot();
    }

    private void loadPostList() {
        postLists = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            postLists.add(new PostList("Bu yerda text bo'lishi kerak edi"));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
}