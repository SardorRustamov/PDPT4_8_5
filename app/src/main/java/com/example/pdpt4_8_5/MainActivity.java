package com.example.pdpt4_8_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pdpt4_8_5.adapter.ViewPagerAdapter;
import com.example.pdpt4_8_5.databinding.ActivityMainBinding;
import com.example.pdpt4_8_5.fragment.ContactFragment;
import com.example.pdpt4_8_5.fragment.PostFragment;
import com.example.pdpt4_8_5.fragment.UserFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add("Contacts", new ContactFragment());
        viewPagerAdapter.add("User", new UserFragment());
        viewPagerAdapter.add("Post", new PostFragment());

        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

    }
}