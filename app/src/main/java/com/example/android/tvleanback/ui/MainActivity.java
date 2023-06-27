/*
 * Copyright (c) 2014 The Android Open Source Project
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

package com.example.android.tvleanback.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import com.example.android.tvleanback.R;
import com.example.android.tvleanback.mobile.MobileWelcomeActivity;
import com.example.android.tvleanback.mobile.TentangUniv;
import com.example.android.tvleanback.mobile.fasilitas;
import com.example.android.tvleanback.mobile.visiMisi;

/*
 * MainActivity class that loads MainFragment.
 */
public class MainActivity extends LeanbackActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(!sharedPreferences.getBoolean(OnboardingFragment.COMPLETED_ONBOARDING, false)) {
            // This is the first time running the app, let's go to onboarding
            startActivity(new Intent(this, OnboardingActivity.class));
        }
    }
    public void mulai (View view){
        Intent intent = new Intent(MainActivity.this, MobileWelcomeActivity.class);
        startActivity(intent);
    }
    public void ttgUniv (View view){
        Intent intent = new Intent(MainActivity.this, TentangUniv.class);
        startActivity(intent);
    }

//    public void fasilitas (View view){
//        Intent intent = new Intent(MainActivity.this, fasilitas.class);
//        startActivity(intent);
//    }
//
//    public void visimisi (View view){
//        Intent intent = new Intent(MainActivity.this, visiMisi.class);
//        startActivity(intent);
//    }
}
