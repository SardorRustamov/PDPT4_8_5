package com.example.pdpt4_8_5.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pdpt4_8_5.R;
import com.example.pdpt4_8_5.adapter.UserAdapter;
import com.example.pdpt4_8_5.databinding.FragmentUserBinding;
import com.example.pdpt4_8_5.model.UserList;

import java.util.ArrayList;
import java.util.List;

public class UserFragment extends Fragment {

    public UserFragment() {
        // Required empty public constructor
    }

    FragmentUserBinding binding;
    List<UserList> userList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding=FragmentUserBinding.inflate(inflater, container, false);

        loadListUser();

        UserAdapter userAdapter = new UserAdapter(userList);

        binding.rvUser.setAdapter(userAdapter);

        return binding.getRoot();
    }

    private void loadListUser() {
        userList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            userList.add(new UserList("Alisher", R.drawable.ic_baseline_hide_image_24));
            userList.add(new UserList("Sarvar", R.drawable.ic_baseline_hide_image_24));
            userList.add(new UserList("Ravshan", R.drawable.ic_baseline_hide_image_24));
            userList.add(new UserList("Sanjar", R.drawable.ic_baseline_hide_image_24));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
}