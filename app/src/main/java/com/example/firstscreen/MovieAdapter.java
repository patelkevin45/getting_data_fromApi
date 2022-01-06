package com.example.firstscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.time.Instant;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {
    private Context context;
    private List<Movie> movieList;

    public MovieAdapter(Context context,List<Movie> movies){
        this.context=context;
        this.movieList=movies;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MovieHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {

        Movie movie=movieList.get(position);
        holder.release.setText(movie.getReleased().toString());
        holder.title.setText(movie.getTitle().toString());
        holder.synopsis.setText(movie.getSynopsis().toString());
        Glide.with(context).load(movie.getImg()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MovieHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title,synopsis,release;

        public MovieHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.Img);
            title = itemView.findViewById(R.id.movie_name);
            synopsis = itemView.findViewById(R.id.Synopsis);
            release = itemView.findViewById(R.id.Release);
        }
    }
}
