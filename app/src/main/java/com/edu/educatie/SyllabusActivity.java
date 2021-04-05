package com.edu.educatie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SyllabusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        TextView SubName, Book, Author;
        TextView U1, U2, U3, U4, U5;
        TextView c1, c2, c3, c4, c5;

        SubName = findViewById(R.id.subName);
        Book = findViewById(R.id.BookName);
        Author = findViewById(R.id.AuthorName);

        U1 = findViewById(R.id.Unit1);
        U2 = findViewById(R.id.Unit2);
        U3 = findViewById(R.id.Unit3);
        U4 = findViewById(R.id.Unit4);
        U5 = findViewById(R.id.Unit5);

        c1 = findViewById(R.id.content1);
        c2 = findViewById(R.id.content2);
        c3 = findViewById(R.id.content3);
        c4 = findViewById(R.id.content4);
        c5 = findViewById(R.id.content5);

        String subName = getIntent().getStringExtra("SubName");
        String authorName = getIntent().getStringExtra("AuthorName");
        String bookName = getIntent().getStringExtra("BookName");

        String unit1 = getIntent().getStringExtra("Unit1");
        String unit2 = getIntent().getStringExtra("Unit2");
        String unit3 = getIntent().getStringExtra("Unit3");
        String unit4 = getIntent().getStringExtra("Unit4");
        String unit5 = getIntent().getStringExtra("Unit5");

        String content1 = getIntent().getStringExtra("Content1");
        String content2 = getIntent().getStringExtra("Content2");
        String content3 = getIntent().getStringExtra("Content3");
        String content4 = getIntent().getStringExtra("Content4");
        String content5 = getIntent().getStringExtra("Content5");

        SubName.setText(subName);
        Book.setText(bookName);
        Author.setText(authorName);

        U1.setText(unit1);
        U2.setText(unit2);
        U3.setText(unit3);
        U4.setText(unit4);
        U5.setText(unit5);

        c1.setText(content1);
        c2.setText(content2);
        c3.setText(content3);
        c4.setText(content4);
        c5.setText(content5);
    }
}