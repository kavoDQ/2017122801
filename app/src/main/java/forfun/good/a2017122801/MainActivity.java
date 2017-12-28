package forfun.good.a2017122801;

import android.content.Intent;
import android.print.PrintDocumentAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv5;
    TextView tv4;
    final int Report_3 = 123;
    final int Report_4 = 321;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);

    }


    public void click1(View v)
    {
        TextView tv;
        tv =(TextView)findViewById(R.id.textView);
        tv.setText("測試廣播567");


    }
    public void click2(View v)
    {
        EditText ed=findViewById(R.id.editText);
        Intent it = new Intent(MainActivity.this, SecActivity.class);
        it.putExtra("cool",ed.getEditableText().toString());
        startActivity(it);
    }

    public void click3(View v)
    {
        Intent it2 = new Intent(MainActivity.this, thirdActivity.class);
        //startActivity(it2);
        startActivityForResult(it2,Report_3);
    }
    public void click4(View v)
    {
        Intent it3 = new Intent(MainActivity.this,fourActivity.class);
        startActivityForResult(it3,Report_4);
    }
    public void click5(View v)
    {
        Intent it4 = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(it4);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);//繼承外部的上一層
        if(requestCode ==Report_3) //分辨誰回傳
        {
            if (resultCode == RESULT_OK) //分辨結果
            {
                tv4.setText(data.getStringExtra("ABC")); //執行動作
            }
        }
        if(requestCode == Report_4)
        {
            if(resultCode == RESULT_OK)
            {
                tv5.setText(data.getStringExtra("ABC"));
            }
        }
    }

}