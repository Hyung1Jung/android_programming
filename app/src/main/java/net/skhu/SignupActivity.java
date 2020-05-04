package net.skhu;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button button = (Button)findViewById(R.id.button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, MemoActivity.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(listener);
    }
    static boolean isEmptyOrWhiteSpace(String s) {
        if (s == null) return true;
        return s.trim().length() == 0;
    }
}