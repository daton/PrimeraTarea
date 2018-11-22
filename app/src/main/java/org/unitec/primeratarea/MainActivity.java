package org.unitec.primeratarea;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Aqui invocamos el Thread
        TareaBasica t1=new TareaBasica();
        t1.execute(null,null,null);
    }

    public class TareaBasica extends AsyncTask<String,String,String>{
        @Override
        protected String doInBackground(String... strings) {
            //ESto esta mal, pero es para que yo aprenda lo  que
            //no se debe hacer
            System.out.println("AAAHHHHGGGGGGGG");
     TextView tv=  (TextView)findViewById(R.id.miTexto);
        tv.setText("Un thread basico en ves del aaahhhgggg");
            return null;
        }
    }
}
