package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.follow);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean followed;
                String status = txt.getText().toString();
                if (status == "Follow"){
                    followed = false;
                }
                else{
                    followed = true;
                }
                if (!followed){
                    txt.setText("Unfollow");
                }
                else{
                    txt.setText("Follow");

                }
            }
        });
    }
}