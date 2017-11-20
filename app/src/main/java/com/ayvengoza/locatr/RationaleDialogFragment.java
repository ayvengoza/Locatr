package com.ayvengoza.locatr;


import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * Created by ang on 20.11.17.
 */

public class RationaleDialogFragment extends DialogFragment {
    private static final String ARG_TITLE = "title";
    private static final String ARG_MESSAGE = "message";

    public static RationaleDialogFragment newInstance(int title, int message){
        RationaleDialogFragment fragment = new RationaleDialogFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_TITLE, title);
        args.putInt(ARG_MESSAGE, message);
        fragment.setArguments(args);
        return  fragment;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int title = getArguments().getInt(ARG_TITLE);
        int message = getArguments().getInt(ARG_MESSAGE);

        AlertDialog dialog = new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                requestPermissions(new String[]{
                                        Manifest.permission.ACCESS_FINE_LOCATION,
                                        Manifest.permission.ACCESS_COARSE_LOCATION},
                                        0);
                            }
                        })
                .create();

        return dialog;
    }
}
