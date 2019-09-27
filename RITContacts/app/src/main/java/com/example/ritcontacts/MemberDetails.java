package com.example.ritcontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MemberDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_details);
        Intent intent = getIntent();
        int id = (int)intent.getLongExtra("id",0);

        MembersList member = MembersList.memberArray[id];

        String name = member.getName();
        int cont = member.getPhone();
        String desc = member.getDescription();

        TextView nameView  = findViewById(R.id.nameView);
        nameView.setText(name);
        TextView descView  = findViewById(R.id.DescView);
        descView.setText(desc);
          TextView contView  = findViewById(R.id.phoneView);
       contView.setText(Integer.toString(cont));


    }


}
