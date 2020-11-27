package tech.peny.connecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartIsShowing = true;

    public void fade(View view){
        Log.i("Action", "Image tapped");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
//        bartImageView.animate().alpha(0).setDuration(2000);
        if(bartIsShowing){
            bartIsShowing = false;
            bartImageView.animate().translationYBy(1000).alpha(0).scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        }else{
            bartIsShowing = true;
            bartImageView.animate().translationYBy(-1000).alpha(1).scaleX(0.7f).scaleY(0.7f).setDuration(2000);
        }





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}