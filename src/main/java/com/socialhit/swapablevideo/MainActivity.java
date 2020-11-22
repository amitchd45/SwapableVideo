package com.socialhit.swapablevideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<VideoModel> videoList = new ArrayList<>();
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager2 = findViewById(R.id.viewPager);

        VideoModel obj = new VideoModel("https://docjamal.xyz/wp-content/uploads/2020/08/video1.mp4", "Title1", "This is basic desc");
        videoList.add(obj);

        VideoModel obj1 = new VideoModel("https://docjamal.xyz/wp-content/uploads/2020/08/video2.mp4", "Title2", "This is basic desc");
        videoList.add(obj1);

        VideoModel obj11 = new VideoModel("https://docjamal.xyz/wp-content/uploads/2020/08/video3.mp4", "Title3", "This is basic desc");
        videoList.add(obj11);

        VideoModel obj2 = new VideoModel("https://docjamal.xyz/wp-content/uploads/2020/08/video5.mp4", "Title4", "This is basic desc");
        videoList.add(obj2);

        VideoModel obj3 = new VideoModel("https://docjamal.xyz/wp-content/uploads/2020/08/video6.mp4", "Title5", "This is basic desc");
        videoList.add(obj3);


        viewPager2.setAdapter(new VideoAdapter(MainActivity.this,videoList));
    }
}