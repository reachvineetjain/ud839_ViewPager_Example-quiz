/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import static android.content.ContentValues.TAG;

/**
 * Fragment that displays "Monday".
 */
public class MondayFragment extends Fragment {

    public static final String TAG = MondayFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "Monday Fragment - onCreateView: ");
        return inflater.inflate(R.layout.fragment_monday, container, false);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Monday Fragment - onCreate: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "Monday Fragment - onPause: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "Monday Fragment - onResume: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "Monday Fragment - onStart: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "Monday Fragment - onStop: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "Monday Fragment - onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Monday Fragment - onDestroy: ");
    }
}
