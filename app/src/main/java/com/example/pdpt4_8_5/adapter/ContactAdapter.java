package com.example.pdpt4_8_5.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pdpt4_8_5.databinding.ItemContactBinding;
import com.example.pdpt4_8_5.model.ContactList;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.VH>{

    private List<ContactList> contactLists;

    public ContactAdapter(List<ContactList> contactLists) {
        this.contactLists = contactLists;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemContactBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.binding.nameContact.setText(contactLists.get(position).getName());
        holder.binding.contPhone.setText(contactLists.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return contactLists.size();
    }

    class VH extends RecyclerView.ViewHolder{
        ItemContactBinding binding;
        public VH(@NonNull ItemContactBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
