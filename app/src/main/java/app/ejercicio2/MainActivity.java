package app.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        final TextView nu1 = findViewById(R.id.numero1);
        final TextView nu2 = findViewById(R.id.numero2);
        final TextView respuesta = findViewById(R.id.respuesta);
        String numero1 = nu1.getText().toString();
        String numero2 = nu2.getText().toString();
        int n1 = Integer.parseInt(numero1) ;
        int n2 = Integer.parseInt(numero2) ;
        int i,suma=0;

        for(i=1;i<n1;i++){
            if(n1%i==0){
                suma=suma+i;
            }
        }

        if(suma==n2){
            suma=0;
            for(i=1;i<n2;i++){
                if(n2%i==0){
                    suma=suma+i;
                }
            }

            if(suma==n1){
                respuesta.setText("Son Amigos");
            }else{
                respuesta.setText("No son Amigos");
            }
        }
        else{
            respuesta.setText("No son Amigos");
        }

    }
}
