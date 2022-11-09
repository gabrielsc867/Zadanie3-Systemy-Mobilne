package com.example.zadanie3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class TaskListActivity extends SingleFragmentActivity/*AppCompatActivity*/ {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/

    @Override
    protected Fragment createFragment() {
        return new TaskListFragment();
    }

}