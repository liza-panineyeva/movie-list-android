package info.androidhive.recyclerview;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by lizaveta on 20.05.2017.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
public class CastDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cast_details_activity);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.actors_container, new ActorsFragment());
        transaction.add(R.id.pictures_container, new ActorsImagesFragment());
        transaction.commit();
    }
}
