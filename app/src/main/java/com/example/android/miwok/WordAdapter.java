package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_list, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTv = (TextView) listItemView.findViewById(R.id.english);
        TextView miwokTv = (TextView) listItemView.findViewById(R.id.miwok);

        defaultTv.setText(currentWord.getDefaultTranslation());
        miwokTv.setText(currentWord.getMiwokTranslation());
        return listItemView;
    }
}
