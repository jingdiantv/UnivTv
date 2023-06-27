/*
 * Copyright 2019 Google LLC
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
package com.example.android.tvleanback.mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.tvleanback.R;
import com.example.android.tvleanback.fai;
import com.example.android.tvleanback.fatek;
import com.example.android.tvleanback.febis;
import com.example.android.tvleanback.fiphum;
import com.example.android.tvleanback.ui.MainActivity;

public class MobileWelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_welcome);
    }

    public void ttgUniv (View view){
        Intent intent = new Intent(MobileWelcomeActivity.this, TentangUniv.class);
        startActivity(intent);
    }

    public void fasilitas (View view){
        Intent intent = new Intent(MobileWelcomeActivity.this, fasilitas.class);
        startActivity(intent);
    }

    public void visimisi (View view){
        Intent intent = new Intent(MobileWelcomeActivity.this, visiMisi.class);
        startActivity(intent);
    }

    public void febis (View view){
        Intent intent = new Intent(MobileWelcomeActivity.this, febis.class);
        startActivity(intent);
    }

    public void fatek (View view){
        Intent intent = new Intent(MobileWelcomeActivity.this, fatek.class);
        startActivity(intent);
    }

    public void fai (View view){
        Intent intent = new Intent(MobileWelcomeActivity.this, fai.class);
        startActivity(intent);
    }

    public void fiphum (View view){
        Intent intent = new Intent(MobileWelcomeActivity.this, fiphum.class);
        startActivity(intent);
    }
}
