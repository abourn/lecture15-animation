package edu.uw.animdemo;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {

    private static final String TAG = "Button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Clicked!");
//                ObjectAnimator anim = ObjectAnimator.ofFloat(v, "y", 300);
//                anim.start();

                // heres the super easy way to do what is above.
                ViewPropertyAnimator anim = v.animate();
                anim.x(200);
                anim.y(300);

                // simplified hella:
                // v.animate().x(150).y(300) ;
            }
        });
    }
}
