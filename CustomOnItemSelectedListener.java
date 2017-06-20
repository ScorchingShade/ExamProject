package com.ankushinc.thereddragon.govtboardexamhp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by Ankush on 6/14/2017.
 */

public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(),"Your choice :"+parent.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
