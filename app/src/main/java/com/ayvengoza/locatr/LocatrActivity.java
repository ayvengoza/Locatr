package com.ayvengoza.locatr;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LocatrActivity extends SingleActivityFragment {

    @Override
    protected Fragment createFragment() {
        return LocaltrFragment.newInstance();
    }
}
