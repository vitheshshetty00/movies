package cse.tackled.movies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myAdapter extends FirebaseRecyclerAdapter<model,myAdapter.myViewHolder> {

    public myAdapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull model model) {
        holder.titleText.setText(model.getTitle());
        holder.genreText.setText(model.getGenre());
        holder.dateText.setText(model.getRelease());
        holder.ratingText.setText(model.getRating());
        holder.runtimeText.setText(model.getRuntime());
        holder.overviewText.setText(model.getOverview());
        Glide.with(holder.poster.getContext()).load(model.getPurl()).into(holder.poster);
            holder.poster.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AppCompatActivity activity =(AppCompatActivity)v.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new descfragment(model.getTitle(),model.getGenre(),model.getPurl(),model.getOverview(),model.getRelease(),model.getRating(),model.getRuntime())).addToBackStack(null).commit();

                }
            });

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return  new myViewHolder(view);
    }

    public  class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView poster;
        TextView titleText,genreText,dateText,ratingText,runtimeText,overviewText;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            poster=itemView.findViewById(R.id.poster);
            titleText=itemView.findViewById(R.id.titleText);
            genreText=itemView.findViewById(R.id.genreText);
            dateText=itemView.findViewById(R.id.dateText);
            ratingText=itemView.findViewById(R.id.ratingText);
            runtimeText=itemView.findViewById(R.id.runtimeText);
            overviewText=itemView.findViewById(R.id.overviewText);

        }
    }

}
