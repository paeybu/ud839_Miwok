package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mResourceColorId;


    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects, int resourceColorId) {
        super(context, resource, objects);
        mResourceColorId = resourceColorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTv = (TextView) listItemView.findViewById(R.id.english);
        TextView miwokTv = (TextView) listItemView.findViewById(R.id.miwok);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.word_image_view);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.words_linear_layout);

        defaultTv.setText(currentWord.getDefaultTranslation());
        miwokTv.setText(currentWord.getMiwokTranslation());
        linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), mResourceColorId));

        if (currentWord.getImageResourceId() != 0) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImageResourceId());
            Log.v(LOG_TAG, "" + currentWord.getImageResourceId());
        } else {
            imageView.setImageResource(0);
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
