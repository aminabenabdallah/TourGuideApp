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

public class TopAttractionsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topattractions, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list_topAttractions);
       final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Sidi Bousaid", "In the Capital of Tunisia",R.drawable.sidi_bousaid_tunisia));
        words.add(new Word("Cap Zbib Tunisia", "In Bizerta state north Tunisia",R.drawable.cap_zbib_tunisia));
        words.add(new Word("Kelibia In Nabeul State","Called the cap bon of Tunisia",R.drawable.kelibia_beach_tunisia));

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

