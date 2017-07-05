package info.androidhive.recyclerview;

/**
 * Created by lizaveta on 20.05.2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActorsFragment extends Fragment {

    @BindView(R.id.actors_list_view)
    ListView actorsList;

    private CustomListAdapter actorsListAdapter;
    private static final String[] actors = {"Joseph Gordon-Levitt", "Leonardo DiCaprio", "Cillian Murphy"};
    Integer[] images={
            R.drawable.joe,
            R.drawable.leo,
            R.drawable.cillian,

    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actorsListAdapter = new CustomListAdapter((Activity) this.getContext(),actors,images);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.actors_list_fragment, container, false);
        ButterKnife.bind(this, view);
        actorsList.setAdapter(actorsListAdapter);
        return view;
    }
}
