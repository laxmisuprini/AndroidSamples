package com.example.ritcontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MemberList extends AppCompatActivity {

    //String[] members = {"Pahni","Abhishek","Zaid Patel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);
       // ArrayAdapter<String> memberAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,members);
        ArrayAdapter<MemberList> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, MembersList.memberArray);
        ListView listView = findViewById(R.id.memberListView);
        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MemberList.this,MemberDetails.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}
