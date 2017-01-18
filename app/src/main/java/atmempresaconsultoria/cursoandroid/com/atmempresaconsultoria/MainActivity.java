package atmempresaconsultoria.cursoandroid.com.atmempresaconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Inicia as váriáveis.
    private ImageView empresa;
    private ImageView servicos;
    private ImageView clientes;
    private ImageView contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associa as variáveis aos seus respectivos IDs.
        empresa = (ImageView) findViewById(R.id.empresaId);
        servicos = (ImageView) findViewById(R.id.servicosId);
        clientes = (ImageView) findViewById(R.id.clientesId);
        contato = (ImageView) findViewById(R.id.contatoId);

        //Eventos de clique que chamam as respectivas Activities.
        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent empresaInt = new Intent(MainActivity.this, EmpresaActivity.class);
                startActivity(empresaInt);
            }
        });

        servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent servicosInt = new Intent(MainActivity.this, ServicosActivity.class);
                startActivity(servicosInt);
            }
        });

        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clientesInt = new Intent(MainActivity.this, ClientesActivity.class);
                startActivity(clientesInt);
            }
        });

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contatoInt = new Intent(MainActivity.this, ContatoActivity.class);
                startActivity(contatoInt);
            }
        });

    }
}
