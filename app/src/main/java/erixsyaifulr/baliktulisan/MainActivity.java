package erixsyaifulr.baliktulisan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_kata;
    private TextView tv_label;
    private Button bt_reverse,bt_undo_redo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_kata=findViewById(R.id.et_kata);
        tv_label=findViewById(R.id.tv_label);
        bt_reverse=findViewById(R.id.bt_reverse);
        bt_undo_redo=findViewById(R.id.bt_undo);

        bt_reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_kata.getText().toString().length()<1){
                    et_kata.setError("Masukkan kata terlebih dahulu");
                }
                else {
                    String kata=et_kata.getText().toString();
                    String baliktulisan="";
                    int length = kata.length();
                    for (int i = length-1 ; i >= 0 ; i--) {
                        baliktulisan = baliktulisan+kata.charAt(i);
                    }
                    tv_label.setText(baliktulisan);
                }

            }
        });

        bt_undo_redo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_label.getText().toString().length()<1){
                    Toast.makeText(getApplicationContext(),"Anda belum melakukan perubahan pada kata yang dimasukkan", Toast.LENGTH_SHORT).show();
                }
                else {
                    String kata=tv_label.getText().toString();
                    String baliktulisan="";
                    int length = kata.length();
                    for (int i = length-1 ; i >= 0 ; i--) {
                        baliktulisan = baliktulisan+kata.charAt(i);
                    }
                    tv_label.setText(baliktulisan);
                }
            }
        });
    }
}
