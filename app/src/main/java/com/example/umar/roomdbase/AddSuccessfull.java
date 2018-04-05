package com.example.umar.roomdbase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AddSuccessfull extends AppCompatActivity {
    TextView name,phone,txtDesc;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_successfull);
        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        txtDesc=findViewById(R.id.txtDesc);
        image=findViewById(R.id.image);



        // Recieve data
        Intent intent = getIntent();
        String nam = intent.getExtras().getString("Name");
        String ph = intent.getExtras().getString("Phone");
        int imag = intent.getExtras().getInt("Image") ;

        // Setting values

        name.setText(nam);
        phone.setText(ph);
        txtDesc.setText("This is a technician");
        image.setImageResource(imag);




         }
}
