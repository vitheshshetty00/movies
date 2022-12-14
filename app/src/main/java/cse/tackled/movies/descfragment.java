package cse.tackled.movies;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
//import com.google.android.youtube.player.YouTubeInitializationResult;
//import com.google.android.youtube.player.YouTubePlayer;
//import com.google.android.youtube.player.YouTubePlayerView;


public class descfragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
//    String api_key = "AIzaSyD3iLHJ9YYTn-4t-LNQkbd2DPbjpsncRs0";

    private String mParam1;
    private String mParam2;
    String title,genre,purl,overview,release,rating,runtime;
//    private YouTubePlayerView ytPlayer;
//    private YouTubePlayerView YouTubePlayerView;


    public descfragment() {
    }
    public descfragment(String title,String genre,String purl,String overview,String release,String rating,String runtime) {
        this.title=title;
        this.genre=genre;
        this.purl=purl;
        this.overview=overview;
        this.release=release;
        this.rating=rating;
        this.runtime=runtime;
    }


    // TODO: Rename and change types and number of parameters
    public static descfragment newInstance(String param1, String param2) {
        descfragment fragment = new descfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_descfragment, container, false);

        ImageView posterHolder =view.findViewById(R.id.descPoster);
        TextView titleHolder=view.findViewById(R.id.titleText);
        TextView genreHolder=view.findViewById(R.id.genreText);
        TextView releaseHolder=view.findViewById(R.id.dateText);
        TextView ratingHolder=view.findViewById(R.id.ratingText);
        TextView runtimeHolder=view.findViewById(R.id.runtimeText);
        TextView overviewHolder=view.findViewById(R.id.overviewText);
//        YouTubePlayerView ytPlayer = view.findViewById(R.id.ytPlayer);


        titleHolder.setText(title);
        genreHolder.setText(genre);
        releaseHolder.setText(release);
        ratingHolder.setText(rating);
        runtimeHolder.setText(runtime);
        overviewHolder.setText(overview);
        Glide.with(getContext()).load(purl).into(posterHolder);
//        ytPlayer.initialize(
//                api_key,
//                new YouTubePlayer.OnInitializedListener() {
//                    @Override
//                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                        youTubePlayer.loadVideo("8mrVmf239GU");
//                        youTubePlayer.play();
//
//                    }
//
//                    @Override
//                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                        Toast.makeText(getContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
//
//                    }
//
//
//                });



        return view;
    }

    public void  onBackPressed(){
        AppCompatActivity activity =(AppCompatActivity)getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new recfragment()).addToBackStack(null).commit();
    }
//    api_key=AIzaSyD3iLHJ9YYTn-4t-LNQkbd2DPbjpsncRs0
}