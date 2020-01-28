package edu.example.recyclerviewexamplejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<UserModel> userModels = new ArrayList<>();
        userModels.add(new UserModel(1, "one"));
        userModels.add(new UserModel(2, "two"));
        userModels.add(new UserModel(3, "three"));
        userModels.add(new UserModel(4, "four"));
        userModels.add(new UserModel(5, "five"));
        userModels.add(new UserModel(6, "six"));
        userModels.add(new UserModel(7, "seven"));
        userModels.add(new UserModel(8, "eight"));
        userModels.add(new UserModel(9, "nine"));
        userModels.add(new UserModel(10, "ten"));
        userModels.add(new UserModel(11, "eleven"));
        userModels.add(new UserModel(12, "twelve"));
        userModels.add(new UserModel(13, "threaten"));
        userModels.add(new UserModel(14, "fourteen"));
        userModels.add(new UserModel(15, "fifteen"));
        userModels.add(new UserModel(16, "sixteen"));
        userModels.add(new UserModel(17, "seventeen"));
        userModels.add(new UserModel(18, "eighteen"));
        userModels.add(new UserModel(1, "one"));
        userModels.add(new UserModel(2, "two"));
        userModels.add(new UserModel(3, "three"));
        userModels.add(new UserModel(4, "four"));
        userModels.add(new UserModel(5, "five"));
        userModels.add(new UserModel(6, "six"));
        userModels.add(new UserModel(7, "seven"));
        userModels.add(new UserModel(8, "eight"));
        userModels.add(new UserModel(9, "nine"));
        userModels.add(new UserModel(10, "ten"));
        userModels.add(new UserModel(11, "eleven"));
        userModels.add(new UserModel(12, "twelve"));
        userModels.add(new UserModel(13, "threaten"));
        userModels.add(new UserModel(14, "fourteen"));
        userModels.add(new UserModel(15, "fifteen"));
        userModels.add(new UserModel(16, "sixteen"));
        userModels.add(new UserModel(17, "seventeen"));
        userModels.add(new UserModel(18, "eighteen"));
        userModels.add(new UserModel(1, "one"));
        userModels.add(new UserModel(2, "two"));
        userModels.add(new UserModel(3, "three"));
        userModels.add(new UserModel(4, "four"));
        userModels.add(new UserModel(5, "five"));
        userModels.add(new UserModel(6, "six"));
        userModels.add(new UserModel(7, "seven"));
        userModels.add(new UserModel(8, "eight"));
        userModels.add(new UserModel(9, "nine"));
        userModels.add(new UserModel(10, "ten"));
        userModels.add(new UserModel(11, "eleven"));
        userModels.add(new UserModel(12, "twelve"));
        userModels.add(new UserModel(13, "threaten"));
        userModels.add(new UserModel(14, "fourteen"));
        userModels.add(new UserModel(15, "fifteen"));
        userModels.add(new UserModel(16, "sixteen"));
        userModels.add(new UserModel(17, "seventeen"));
        userModels.add(new UserModel(18, "eighteen"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Adapter adapter = new Adapter(userModels);
        recyclerView.setAdapter(adapter);
    }
}
