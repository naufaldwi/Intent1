package id.sch.smktelkom_mlg.learn.intent1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    findViewById(R.id.buttonHitung)

    setOnClickListener(new View.OnClickListener() {
        @Override
        publicvoid onClick (View v)
        {
            startActivity(new Intent(MainActivity.this, HasilActivity.class));
        }
    }

    .
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    )
}
