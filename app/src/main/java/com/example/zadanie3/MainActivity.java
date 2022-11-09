package com.example.zadanie3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity/*AppCompatActivity*/ {

    @Override
    protected Fragment createFragment() {
        UUID taskID = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return new TaskListFragment();
    }

}