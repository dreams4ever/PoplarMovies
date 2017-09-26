package as.asd.myapp.poplarmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.grid_films);
        gridview.setAdapter(new DataAdapter(this));
        //DataAdapter d=new DataAdapter(this);
       // Picasso.with(this).load(R.mipmap.ic_launcher).centerCrop().into();

    }
}
