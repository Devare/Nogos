package mx.com.devare.nogos;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_alert_dialog_simple,btn_alert_dialog_lista_simple,
            btn_alert_dialog_lista_radiobtns,
            btn_alert_dialog_lista_multirbtn,
            btn_alert_dialog_personalizado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentesUI();
        inicializarSetOnClickListener();
    }

    private void inicializarComponentesUI() {
        btn_alert_dialog_simple=(Button) findViewById(R.id.btn_alert_dialog_simple);
        btn_alert_dialog_lista_simple=(Button) findViewById(R.id.btn_alert_dialog_lista_simple);
        btn_alert_dialog_lista_radiobtns=(Button) findViewById(R.id.btn_alert_dialog_lista_radiobtns);
        btn_alert_dialog_lista_multirbtn=(Button) findViewById(R.id.btn_alert_dialog_lista_multirbtn);
        btn_alert_dialog_personalizado=(Button) findViewById(R.id.btn_alert_dialog_personalizado);
    }

    private void inicializarSetOnClickListener() {
        btn_alert_dialog_simple.setOnClickListener(this);
        btn_alert_dialog_lista_simple.setOnClickListener(this);
        btn_alert_dialog_lista_radiobtns.setOnClickListener(this);
        btn_alert_dialog_lista_multirbtn.setOnClickListener(this);
        btn_alert_dialog_personalizado.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_alert_dialog_simple:
                initDialogEliminacion();
                break;

            case R.id.btn_alert_dialog_lista_simple:
                initDialogListaSimple();
                break;

            case R.id.btn_alert_dialog_lista_radiobtns:
                initDialogListaRadioButtons();
                break;

            case R.id.btn_alert_dialog_lista_multirbtn:
                initDialogListaMultiSeleccion();
                break;

            case R.id.btn_alert_dialog_personalizado:
                initDialogPersonalizado();
                break;
        }

    }

    private void initDialogPersonalizado() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Personalizado_Dialog dialogo= new Personalizado_Dialog();
        dialogo.show(fragmentManager, "Personalizado_Dialog");
    }

    private void initDialogListaMultiSeleccion() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        ListMultiRadio_Dialog dialogo= new ListMultiRadio_Dialog();
        dialogo.show(fragmentManager, "ListMultiRadio_Dialog");
    }


    private void initDialogListaRadioButtons() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        ListRadioButtons_Dialog dialogo= new ListRadioButtons_Dialog();
        dialogo.show(fragmentManager, "ListRadioButtons_Dialog");
    }

    private void initDialogListaSimple() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        ListaSimple_Dialog dialogo = new ListaSimple_Dialog();
        dialogo.setCancelable(false);
        dialogo.show(fragmentManager, "ListaSimple_Dialog");
    }

    private void initDialogEliminacion() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Eliminacion_Dialog dialogo = new Eliminacion_Dialog();
        dialogo.setCancelable(false);
        dialogo.show(fragmentManager, "Eliminacion_Dialog");
    }
}
