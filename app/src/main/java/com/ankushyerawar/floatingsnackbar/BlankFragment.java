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

import com.ankushyerwar.floatingsnackbar.SnackBar;

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

        Button mBtnSuccess = view.findViewById(R.id.btnSuccess);
        Button mBtnError = view.findViewById(R.id.btnError);
        Button mBtnWarning = view.findViewById(R.id.btnWarning);
        Button mBtnInfo = view.findViewById(R.id.btnInfo);
        Button mBtnNormal = view.findViewById(R.id.btnNormal);
        Button mBtnCustom = view.findViewById(R.id.btnCustom);

        mBtnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Here you can pass String id
                SnackBar.success(view, R.string.app_name, SnackBar.LENGTH_LONG).show();

                //Here you can pass your own icon
                //SnackBar.success(view, R.string.app_name, SnackBar.LENGTH_LONG, R.drawable.ic_normal).show();

                //Here you can pass String text
                //SnackBar.success(view, "Sting Success", SnackBar.LENGTH_LONG).show();

                //Here you can specify if you want SnackBar without icon
                //SnackBar.success(view, "Sting Success", SnackBar.LENGTH_LONG, false).show();

            }
        });

        mBtnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Here you can pass String id
                SnackBar.error(view, R.string.app_name, SnackBar.LENGTH_LONG).show();

                //Here you can pass your own icon
                //SnackBar.error(view, R.string.app_name, SnackBar.LENGTH_LONG, R.drawable.ic_normal).show();

                //Here you can pass String text
                //SnackBar.error(view,"String Error", SnackBar.LENGTH_LONG).show();

                //Here you can specify if you want snackbar without icon
                //SnackBar.error(view,"String Error", SnackBar.LENGTH_LONG,false).show();

            }
        });

        mBtnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Here you can pass String id
                SnackBar.warning(view, R.string.app_name, SnackBar.LENGTH_LONG).show();

                //Here you can pass your own icon
                //SnackBar.warning(view, R.string.app_name, SnackBar.LENGTH_LONG, R.drawable.ic_normal).show();

                //Here you can pass String text
                //SnackBar.warning(view,"String Warning", SnackBar.LENGTH_LONG).show();

                //Here you can specify if you want snackbar without icon
                //SnackBar.warning(view,"String Warning", SnackBar.LENGTH_LONG, false).show();

            }
        });

        mBtnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Here you can pass String id
                SnackBar.info(view, R.string.app_name, SnackBar.LENGTH_LONG).show();

                //Here you can pass your own icon
                //SnackBar.info(view, R.string.app_name, SnackBar.LENGTH_LONG, R.drawable.ic_normal).show();

                //Here you can pass String text
                //SnackBar.info(view,"String Info", SnackBar.LENGTH_LONG).show();

                //Here you can specify if you want snackbar without icon
                //SnackBar.info(view,R.string.app_name, SnackBar.LENGTH_LONG,false).show();

            }
        });

        mBtnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Here you can pass String id
                SnackBar.normal(view,R.string.app_name, SnackBar.LENGTH_LONG).show();

                //Here you can pass String text
                //SnackBar.normal(view,"String Normal", SnackBar.LENGTH_LONG).show();

                //Here you can pass your icon
                //SnackBar.normal(view, R.string.app_name, SnackBar.LENGTH_LONG, R.drawable.ic_normal).show();

            }
        });

        mBtnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Here you can pass String id
                SnackBar.custom(view, R.string.app_name, SnackBar.LENGTH_LONG,
                        R.drawable.ic_custom, Color.DKGRAY, Color.WHITE,true).show();

                //Here you can pass String text
                /*SnackBar.custom(view, "String Custom", SnackBar.LENGTH_LONG,
                        R.drawable.ic_custom, Color.DKGRAY, Color.WHITE).show();*/

            }
        });
    }
}
