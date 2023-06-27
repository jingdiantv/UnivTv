package com.example.android.tvleanback.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.android.tvleanback.R;

public class visiMisi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visi_misi);

        VideoView videoView = findViewById(R.id.visi);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.tentang;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

    public void ttgUniv (View view){
        Intent intent = new Intent(visiMisi.this, TentangUniv.class);
        startActivity(intent);
    }

    public void mulai (View view){
        Intent intent = new Intent(visiMisi.this, MobileWelcomeActivity.class);
        startActivity(intent);
    }

    public void fasilitas (View view){
        Intent intent = new Intent(visiMisi.this, fasilitas.class);
        startActivity(intent);
    }

    public void visimisi (View view){
        Intent intent = new Intent(visiMisi.this, visiMisi.class);
        startActivity(intent);
    }
}
