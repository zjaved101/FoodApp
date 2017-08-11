package com.zan.foodapp.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.LayoutInflaterCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.zan.foodapp.R;

/**
 * Created by Zan on 8/10/2017.
 */

public class FalafelBiteFragment extends Fragment {

    private String title;
    private int page;

    public FalafelBiteFragment(){

    }


    public static FalafelBiteFragment newInstance(int page, String title){
        FalafelBiteFragment fragment = new FalafelBiteFragment();
        Bundle args = new Bundle();
        args.putInt("position", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

/*    public static FalafelBiteFragment newInstance(String text){
        FalafelBiteFragment fragment = new FalafelBiteFragment();
        Bundle args = new Bundle();
        args.putString("msg", text);
        fragment.setArguments(args);
        return fragment;
    }*/

/*
    @Override
    public void onCreate(Bundle savedInstaneState){
        super.onCreate(savedInstaneState);
        page = getArguments().getInt("position", 0);
        title = getArguments().getString("title");
    }
*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstances){
        View view = inflater.inflate(R.layout.fragment_falafel_bite, container, false);

        Button button = (Button) view.findViewById(R.id.btn_test);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "This is a toast", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


}
