package com.example.taruc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SPM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spm);

        EditText text_bm = (EditText)findViewById(R.id.Spm_bm);
        String bm = text_bm.getText().toString();

        EditText text_english = (EditText)findViewById(R.id.Spm_english);
        String english = text_english.getText().toString();

        EditText text_sejarah = (EditText)findViewById(R.id.Spm_Sejarah);
        String sejarah = text_sejarah .getText().toString();


        EditText text_sc = (EditText)findViewById(R.id.Spm_science);
        String sc = text_sejarah .getText().toString();



        EditText text_math = (EditText)findViewById(R.id.Olevel_math);
        String math = text_sejarah .getText().toString();

        Button btn_spm_submit= findViewById(R.id.btn_spm_submit);
        btn_spm_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                EditText text_bm = (EditText)findViewById(R.id.Spm_bm);
                String bm = text_bm.getText().toString();

                EditText text_english = (EditText)findViewById(R.id.Spm_english);
                String english = text_english.getText().toString();

                EditText text_sejarah = (EditText)findViewById(R.id.Spm_Sejarah);
                String sejarah = text_sejarah .getText().toString();


                EditText text_sc = (EditText)findViewById(R.id.Spm_science);
                String sc = text_sejarah .getText().toString();
                EditText text_math = (EditText)findViewById(R.id.Olevel_math);
                String math = text_sejarah .getText().toString();


                if(math.equals("B")  || math.equals("b")||math.equals("A")  || math.equals("a"))
                {
                    if(english.equals("D")||english.equals("d")||english.equals("E")||english.equals("e")||english.equals("F")||english.equals("f")&&bm.equals("D")||bm.equals("d")||bm.equals("E")||bm.equals("e")||bm.equals("F")||bm.equals("f"))
                    {
                        Toast.makeText(SPM.this, "Not Under Requieremnt!",
                                Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        if(sc.equals("D")||sc.equals("d")||sc.equals("E")||sc.equals("e")||sc.equals("F")||sc.equals("f")&&sejarah.equals("D")||sejarah.equals("d")||sejarah.equals("E")||sejarah.equals("e")||sejarah.equals("F")||sejarah.equals("f"))
                        {
                            Toast.makeText(SPM.this, "Not Under Requieremnt!",
                                    Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(SPM.this, "YES Welcome you to taruc!",
                                    Toast.LENGTH_LONG).show();

                        }
                    }
                }
                else
                {
                    Toast.makeText(SPM.this, "Not Under Requieremnt!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
