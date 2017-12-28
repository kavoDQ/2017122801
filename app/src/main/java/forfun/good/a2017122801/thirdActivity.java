package forfun.good.a2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class thirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void OKOK(View v)
    {
        EditText ed2 = findViewById(R.id.editText2);

        Intent it = new Intent(thirdActivity.this, MainActivity.class);
        it.putExtra("ABC",ed2.getText().toString());
        setResult(RESULT_OK, it);
        finish();
    }
    public void NONO(View v) //取消輸入
    {
        finish();
    }
}
