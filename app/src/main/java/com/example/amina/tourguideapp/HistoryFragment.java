package com.example.amina.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list_History);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Carthage", "Ancient Ruins of Carthage",R.drawable.ruins_of_ancient_carthage));
        words.add(new Word("Zaghouan", "hanaya of Zaghouan ",R.drawable.hanaya_of_zaghouan));
        words.add(new Word("AlMahdiyyah","Castle of ElJem",R.drawable.castle_of_el_jem));

        WordAdapter adapter = new WordAdapter(getContext(),words);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return view;


    }
}
