package ru.kostya.citylayout.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.kostya.citylayout.R;
import ru.kostya.citylayout.activities.GeneralActivity;
import ru.kostya.citylayout.adapters.Adapter;
import ru.kostya.citylayout.models.Model;

public class NewsFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Model> list = new ArrayList<>();
    private Adapter adapter;
    private ImageView searchBtn,addBtn;
    private CardView cardSetting,cardSupport;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_fragment,container,false);

        searchBtn = view.findViewById(R.id.action_search);
        addBtn = view.findViewById(R.id.action_add);



        recyclerView = view.findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list.add(new Model(R.drawable.setting,getString(R.string.prototip_app_text),getString(R.string.data_tv_prototip),getString(R.string.time_tv_prototip)));
        list.add(new Model(R.drawable.money,getString(R.string.support_project_text),getString(R.string.data_tv),getString(R.string.time_tv)));

        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Была нажата кнопка поиска", Toast.LENGTH_SHORT).show();
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Была нажата кнопка добавить", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
