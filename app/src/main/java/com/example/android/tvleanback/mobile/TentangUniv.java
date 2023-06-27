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
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.android.tvleanback.R;
import com.example.android.tvleanback.ui.MainActivity;

public class TentangUniv extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang_univ);

        VideoView videoView = findViewById(R.id.tentang);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.tentang;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

    public void ttgUniv (View view){
        Intent intent = new Intent(TentangUniv.this, MobileWelcomeActivity.class);
        startActivity(intent);
    }
    public void mulai (View view){
        Intent intent = new Intent(TentangUniv.this, MobileWelcomeActivity.class);
        startActivity(intent);
    }

    public void fasilitas (View view){
        Intent intent = new Intent(TentangUniv.this, fasilitas.class);
        startActivity(intent);
    }

    public void visimisi (View view){
        Intent intent = new Intent(TentangUniv.this, visiMisi.class);
        startActivity(intent);
    }
}
