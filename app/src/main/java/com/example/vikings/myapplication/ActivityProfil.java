package com.example.vikings.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ActivityProfil extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_profil, parent, false);
        return rootView;
    }

    public void cellphone(View view) {
        Uri uri = Uri.parse("tlp:0895346350745");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

}
