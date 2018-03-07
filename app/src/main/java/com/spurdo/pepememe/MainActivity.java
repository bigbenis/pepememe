package com.spurdo.pepememe;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import com.google.android.gms.ads.MobileAds; //для рекламы
import com.google.android.gms.ads.AdRequest; //для рекламы
import com.google.android.gms.ads.AdView; //для рекламы


public class MainActivity extends AppCompatActivity {
    private AdView mAdView; //для рекламы
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-1950220727109099~8595137485"); //для рекламы (мой адмоб)

        mAdView = findViewById(R.id.adView); //для рекламы
        AdRequest adRequest = new AdRequest.Builder().build(); //для рекламы
        mAdView.loadAd(adRequest); //для рекламы
        //заменил пердеж на Reee~, но id и название оставил как под пердеж
        final MediaPlayer fartSoundMP = MediaPlayer.create(this, R.raw.reee); //создаем плеер для проигрыша Рееее~

        final Button playFart = (Button)this.findViewById(R.id.playFart); //не помню, что оно делает
        //final boolean[] flag = {true}; //для щелчка кнопки, не пригодилось

        playFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //запускаем плеер и проигрываем звук
                fartSoundMP.start();
                //смена фона при нажатии, почему-то остается и после нажатия :(
                playFart.setBackgroundResource(R.drawable.pepescream);
             /*   if (flag[0]) playFart.setBackgroundResource(R.drawable.pepememe);
                else
                    // возвращаем первую картинку
                    playFart.setBackgroundResource(R.drawable.pepescream);
                flag[0] = !flag[0]; */
            }
        });
    }
}
