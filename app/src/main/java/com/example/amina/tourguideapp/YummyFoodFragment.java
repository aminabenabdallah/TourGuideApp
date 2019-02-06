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

public class YummyFoodFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_yummyfood, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list_yummy);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Couscous", "One of the best traditional dishes",R.drawable.couscous));
        words.add(new Word("Grilled Salad ", "In Tunisian dialect: Salade Mechouiyya :D ",R.drawable.grilled_tunisian_salad));
        words.add(new Word("Fricasse","Cute Tuna Sandwish in Flour Pie with Potatoes and olives and Harissa",R.drawable.fricasse));
        words.add(new Word("Tagine","One of the best yummy Tunisian dishes",R.drawable.tunisian_tagine));

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
