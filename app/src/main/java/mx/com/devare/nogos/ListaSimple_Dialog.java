package mx.com.devare.nogos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;


public class ListaSimple_Dialog extends DialogFragment {

    @Override
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        final CharSequence[] items = new CharSequence[6];

        items[0] = "Oracle Certified Associate";
        items[1] = "Oracle Certified Professional";
        items[2] = "Certificación en Angular";
        items[3] = "Android Certified Professional";
        items[4] = "IOS Certified Professional";
        items[5] = "Phonegap Certified Profesional";

        builder.setTitle("Lista Simple")
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(
                                getActivity(),
                                "Seleccionaste:" + items[which],
                                Toast.LENGTH_SHORT)
                                .show();
                    }
                });

        return builder.create();
    }
}
