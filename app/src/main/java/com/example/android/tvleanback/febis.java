package com.example.android.tvleanback;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.android.tvleanback.mobile.MobileWelcomeActivity;
import com.example.android.tvleanback.mobile.TentangUniv;
import com.example.android.tvleanback.mobile.fasilitas;
import com.example.android.tvleanback.mobile.visiMisi;

public class febis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_febis);

        VideoView videoView = findViewById(R.id.visi);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.tentang;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }


    public void mulai (View view){
        Intent intent = new Intent(febis.this, MobileWelcomeActivity.class);
        startActivity(intent);
    }

}
