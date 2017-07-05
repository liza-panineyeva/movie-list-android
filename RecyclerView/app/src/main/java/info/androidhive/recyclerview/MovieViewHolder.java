package info.androidhive.recyclerview;

/**
 * Created by lizaveta on 20.05.2017.
 */
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class MovieViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {
    public TextView yearTextView;
    public TextView titleTextView;
    public TextView genreTextView;
    public TextView seenTextView;
    public ImageView movieImageView;

    public MovieViewHolder(View view){
        super(view);
        titleTextView = (TextView) view.findViewById(R.id.title);
        genreTextView = (TextView) view.findViewById(R.id.genre);
        yearTextView = (TextView) view.findViewById(R.id.year);
        seenTextView = (TextView) view.findViewById(R.id.seen_indicator);
        movieImageView = (ImageView) view.findViewById(R.id.movie_image);
    }

    @Override
    public void onItemSelected() {
        itemView.setBackgroundColor(Color.LTGRAY);
    }

    @Override
    public void onItemClear() {
        itemView.setBackgroundColor(0);
    }
}
