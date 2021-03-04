package ru.kostya.citylayout.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.kostya.citylayout.R;
import ru.kostya.citylayout.activities.ContactActivity;
import ru.kostya.citylayout.activities.GeneralActivity;
import ru.kostya.citylayout.models.Model;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Model> list;

    public Adapter(List<Model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView text,data,time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.main_tv);
            data = itemView.findViewById(R.id.data_tv);
            time = itemView.findViewById(R.id.time_tv);
        }

        void bind(final Model currentModel){
            image.setImageResource(currentModel.getImage());
            text.setText(currentModel.getText());
            time.setText(currentModel.getTime());
            data.setText(currentModel.getData());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (currentModel.getImage() == R.drawable.setting) {
                        itemView.getContext().startActivity(new Intent(itemView.getContext(), GeneralActivity.class));
                    } else {
                        itemView.getContext().startActivity(new Intent(itemView.getContext(), ContactActivity.class));
                    }
                }
            });
        }
    }


}
