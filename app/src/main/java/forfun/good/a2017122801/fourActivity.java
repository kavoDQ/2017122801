package forfun.good.a2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class fourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }
    public void OKOK (View v)
    {
        EditText ed= findViewById(R.id.editText3);
        Intent it = new Intent();
        it.putExtra("ABC",ed.getEditableText().toString());
        setResult(RESULT_OK, it);
        finish();

    }

}
