package edu.example.recyclerviewexamplejava;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<UserModel> userModels;

    public Adapter(ArrayList<UserModel> userModels) {
        this.userModels = userModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.rv_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserModel user = userModels.get(position);
        Log.d("tag", user.getName());
        holder.bind(user);
    }

    @Override
    public int getItemCount() {
        return userModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv;

        private ViewHolder(View view) {
            super(view);
            tv = view.findViewById(R.id.tv);
        }

        private void bind(UserModel user) {
            tv.setText(user.getName());
        }
    }
}
