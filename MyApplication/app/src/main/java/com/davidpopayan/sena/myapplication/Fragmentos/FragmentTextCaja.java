package com.davidpopayan.sena.myapplication.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davidpopayan.sena.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTextCaja extends Fragment {


    public FragmentTextCaja() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_text_caja, container, false);

        return view;
    }

}
