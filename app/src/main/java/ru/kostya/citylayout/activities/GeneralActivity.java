package ru.kostya.citylayout.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import ru.kostya.citylayout.R;

public class GeneralActivity extends AppCompatActivity {

    private ImageView mainImage,imageTm;
    private TextView mainTv,dateTv,timeTv,namePage,channelTm;
    private LinearLayout linContact,linSurfFun,linBull,linDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        mainImage = findViewById(R.id.main_image);
        imageTm = findViewById(R.id.image_tm);
        mainTv = findViewById(R.id.main_tv);
        dateTv = findViewById(R.id.data_tv);
        timeTv = findViewById(R.id.time_tv);
        namePage = findViewById(R.id.name_page);
        channelTm = findViewById(R.id.channel_tm);
        linContact = findViewById(R.id.lin_contact);
        linSurfFun = findViewById(R.id.lin_surf_fun);
        linBull = findViewById(R.id.lin_ball);
        linDate = findViewById(R.id.lin_date);

        if (getIntent().hasExtra("Photo")){
            mainImage.setImageDrawable(getResources().getDrawable(getIntent().getIntExtra("Photo",R.drawable.money)));
            mainTv.setText(getIntent().getStringExtra("Text"));
            dateTv.setText(getIntent().getStringExtra("Date"));
            timeTv.setText(getIntent().getStringExtra("Time"));
            namePage.setText(getIntent().getStringExtra("NamePage"));
            imageTm.setImageDrawable(getResources().getDrawable(getIntent().getIntExtra("Telegram",R.drawable.money)));
            channelTm.setText("TelegramChannel");
            mainTv.setVisibility(View.VISIBLE);

            linContact.setVisibility(View.VISIBLE);
            namePage.setVisibility(View.VISIBLE);
            linSurfFun.setVisibility(View.GONE);
            linBull.setVisibility(View.GONE);
        }

    }
}