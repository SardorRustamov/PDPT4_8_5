package com.example.pdpt4_8_5.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pdpt4_8_5.R;
import com.example.pdpt4_8_5.adapter.ContactAdapter;
import com.example.pdpt4_8_5.databinding.FragmentContactBinding;
import com.example.pdpt4_8_5.model.ContactList;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {

    FragmentContactBinding binding;
    private List<ContactList> contactLists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       binding=FragmentContactBinding.inflate(inflater, container, false);
       loadContactList();

        ContactAdapter contactAdapter = new ContactAdapter(contactLists);
        binding.rvContact.setAdapter(contactAdapter);

       return binding.getRoot();
    }

    private void loadContactList() {
        contactLists = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            contactLists.add(new ContactList("Sarvar", "+998 90 400 00 04"));
            contactLists.add(new ContactList("Jasur", "+998 91 200 40 40"));
            contactLists.add(new ContactList("Anvar", "+998 99 599 09 99"));
            contactLists.add(new ContactList("Bekzod", "+998 97 777 00 00"));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
}