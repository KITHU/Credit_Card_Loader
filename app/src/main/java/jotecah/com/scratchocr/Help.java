package jotecah.com.scratchocr;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class Help extends DialogFragment {
        public Help()
        {
            super();
        }

        //================================================================

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState)
        {
            View view;
            WebView wvHow;

            try
            {
                view = View.inflate(getContext(), R.layout.fragment_help, null);
                wvHow = (WebView) view.findViewById(R.id.wvHow);
            }
            catch(InflateException e)
            {
                view = wvHow = new WebView(getActivity());
            }

            wvHow.loadUrl("file:///android_asset/help.html");

            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(getContext().getResources().getString(R.string.title_activity_main))
                    .setIcon(android.R.drawable.ic_menu_help)
                    .setPositiveButton("OK", null)
                    .setView(view);

            return builder.create();
        }
    }
