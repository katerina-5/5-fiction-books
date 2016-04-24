package com.example.katia.five_fiction_books;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button book1;
    Button book2;
    Button book3;
    Button book4;
    Button book5;
    Button like;
    Button dislike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        book1 = (Button) findViewById(R.id.button1);
        //book1.setOnClickListener(com.example.katia.project_5_books.MainActivity);
        book2 = (Button) findViewById(R.id.button2);
        //book2.setOnClickListener(com.example.katia.project_5_books.MainActivity);
        book3 = (Button) findViewById(R.id.button3);
        //book3.setOnClickListener(com.example.katia.project_5_books.MainActivity);
        book4 = (Button) findViewById(R.id.button4);
        //book4.setOnClickListener(com.example.katia.project_5_books.MainActivity);
        book5 = (Button) findViewById(R.id.button5);
        //book5.setOnClickListener(com.example.katia.project_5_books.MainActivity);
        like = (Button) findViewById(R.id.like);
        //like.setOnClickListener(com.example.katia.project_5_books.MainActivity);
        dislike = (Button) findViewById(R.id.dislike);
        //dislike.setOnClickListener(com.example.katia.project_5_books.MainActivity);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
    
    public void onClick1 (View view) {
        Intent intent1 = new Intent(this, Book1.class);
        startActivity(intent1);
    }

    public void onClick2 (View view) {
        Intent intent2 = new Intent(this, Book2.class);
        startActivity(intent2);
    }

    public void onClick3 (View view) {
        Intent intent3 = new Intent(this, Book3.class);
        startActivity(intent3);
    }

    public void onClick4 (View view) {
        Intent intent4 = new Intent(this, Book4.class);
        startActivity(intent4);
    }

    public void onClick5 (View view) {
        Intent intent5 = new Intent(this, Book5.class);
        startActivity(intent5);
    }

    public void Like_or_dislike (View view) {
        if (view.getId() == R.id.like) {
            Intent intent_like = new Intent(this, Like.class);
            startActivity(intent_like);
        }
        else if (view.getId() == R.id.dislike) {
            Intent intent_dislike = new Intent(this, Dislike.class);
            startActivity(intent_dislike);
        }
    }
}
