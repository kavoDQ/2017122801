package forfun.good.a2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        TextView tv2 = findViewById(R.id.textView2);
        Intent it =getIntent();
        String str = it.getStringExtra("cool");
        tv2.setText(str);
    }

    public void CL1(View v)
    {
        Intent it2 = new Intent(SecActivity.this, MainActivity.class);
        startActivity(it2);
    }
    public void CL3(View v)
    {
        Intent it = new Intent();
        it.setAction("ACE56");
        it = Intent.createChooser(it,"隨便選一個用吧^^");
        startActivity(it);
    }
}
