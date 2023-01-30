package com.example.pdpt4_8_5.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pdpt4_8_5.databinding.ItemUserBinding;
import com.example.pdpt4_8_5.model.UserList;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.VH>{

    private List<UserList> userLists;

    public UserAdapter(List<UserList> userLists) {
        this.userLists = userLists;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemUserBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.binding.userName.setText(userLists.get(position).getUserName());
        holder.binding.userImg.setImageResource(userLists.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return userLists.size();
    }

    class VH extends RecyclerView.ViewHolder{

        ItemUserBinding binding;
        public VH(@NonNull ItemUserBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
