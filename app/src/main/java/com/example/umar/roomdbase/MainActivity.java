package com.example.umar.roomdbase;

import android.app.ListActivity;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    RecyclerView.Adapter adapter;
    ArrayList<User> own;
    Button btnSave;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);


        own = new ArrayList<>();


        //own.add(new User(R.drawable.umar,"umar","farooq"));
        own.add(new User(R.mipmap.ic_launcher_round,"umar","00000"));
        own.add(new User(R.mipmap.ic_launcher_round,"umar","1233"));
        own.add(new User(R.mipmap.ic_launcher_round,"umar","55478"));
        own.add(new User(R.mipmap.ic_launcher_round,"ali","88879"));
        own.add(new User(R.mipmap.ic_launcher_round,"fahad","999987"));
        own.add(new User(R.mipmap.ic_launcher_round,"shahzad","88745"));
        own.add(new User(R.mipmap.ic_launcher_round,"ali","99988745"));
        own.add(new User(R.mipmap.ic_launcher_round,"hussnain","88754"));
        own.add(new User(R.mipmap.ic_launcher_round,"mubashir","666541"));
        own.add(new User(R.mipmap.ic_launcher_round,"umer","554"));
        own.add(new User(R.mipmap.ic_launcher_round,"fahad","6654"));
        own.add(new User(R.mipmap.ic_launcher_round,"usama","1554484"));



        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new UserAdapter(this,own);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);





    }
}
