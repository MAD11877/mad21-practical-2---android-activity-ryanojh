package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("John", "Test", 1, true);
        Button followBtn = findViewById(R.id.follow);
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.Followed){
                    followBtn.setText("Unfollow");
                    user.Followed = false;
                }
                else{
                    followBtn.setText("Follow");
                    user.Followed = true;
                }
            }
        });
    }
}