package com.example.verifypass;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ScanFragment extends Fragment  {
    Button btnScan;

public ScanFragment(){

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_scan2, container, false);
        Button btnScan = (Button)view.findViewById(R.id.btnNewScan);

      btnScan.setOnClickListener(View->{
          FragmentTransaction fr = getFragmentManager().beginTransaction();
          fr.replace(R.id.fragment_container, new DetailsFragment()).commit();
      });
        return view;
    }
}