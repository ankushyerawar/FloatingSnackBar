package com.ankushyerawar.floatingsnackbar;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ankushyerwar.floatingsnackbar.SnackBar;
import com.google.android.material.snackbar.Snackbar;

public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }

    static BlankFragment newInstance() {
        return new BlankFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button mBtnSubmit = view.findViewById(R.id.btnSubmit);

        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Snackbar snackbar = Snackbar.make(getView(),R.string.app_name,Snackbar.LENGTH_SHORT).setAction()

                //SnackBar.success(view, R.string.app_name, SnackBar.LENGTH_LONG).show();

                SnackBar.custom(view, R.string.app_name, SnackBar.LENGTH_LONG, R.drawable.ic_custom, Color.DKGRAY, Color.WHITE).show();

                //SnackBar.error(getView(),R.string.app_name, SnackBar.LENGTH_LONG).show();

                //SnackBar.warning(getView(),R.string.app_name, SnackBar.LENGTH_LONG).show();

                //SnackBar.info(getView(),R.string.app_name, SnackBar.LENGTH_LONG).show();

                //SnackBar.normal(getView(),R.string.app_name, SnackBar.LENGTH_LONG).show();

            }
        });
    }
}
