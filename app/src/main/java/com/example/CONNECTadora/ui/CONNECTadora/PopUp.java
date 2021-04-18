package com.example.CONNECTadora.ui.CONNECTadora;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class PopUp extends AppCompatDialogFragment {

    final String defaultTitle;
    final String defaultMsg;

    PopUp(String title, String msg){
        this.defaultTitle = title;
        this.defaultMsg = msg;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(defaultTitle).setMessage(defaultMsg).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        return builder.create();
    }
}