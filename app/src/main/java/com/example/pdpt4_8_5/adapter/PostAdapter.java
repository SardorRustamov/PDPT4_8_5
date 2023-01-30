package com.example.pdpt4_8_5.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pdpt4_8_5.databinding.ItemPostBinding;
import com.example.pdpt4_8_5.databinding.ItemUserBinding;
import com.example.pdpt4_8_5.model.PostList;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.VH>{

    private List<PostList> postLists;

    public PostAdapter(List<PostList> postLists) {
        this.postLists = postLists;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemPostBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.binding.postText.setText(postLists.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return postLists.size();
    }


    class VH extends RecyclerView.ViewHolder {
        ItemPostBinding binding;
        public VH(@NonNull ItemPostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}