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

public class BestHotelsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_besthotels, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list_bestHotels);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("La Badira", "In Nabeul State",R.drawable.la_badira_hotel));
        words.add(new Word("Palais Bayrem", "In Tunis Capital of Tunisia ",R.drawable.palais_bayrem));
        words.add(new Word("Dar Tozeur","In Tozeur State in the south of Tunisia",R.drawable.dar_touzeur));
        words.add(new Word("La Villa Bleue","Sidi Bousaid Tunisia",R.drawable.la_villa_bleue));

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
