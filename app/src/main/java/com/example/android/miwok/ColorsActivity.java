package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    public static final String LOG_TAG = FamilyActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));
        words.add(new Word("dusty yellow ", "ṭopiisә"));
        words.add(new Word("mustard yellow ", "chiwiiṭә"));


        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.word_list, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
