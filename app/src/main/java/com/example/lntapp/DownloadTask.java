package com.example.lntapp;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;



public class DownloadTask extends AsyncTask<String,Integer,Void> {
    private static final String TAG = DownloadTask.class.getSimpleName() ;
    ProgressBar mProgressBar;
    public DownloadTask(ProgressBar progressBar) {
         mProgressBar = progressBar;
    }//input type,progress,result type
    /**
     * this method will run on seperate thread
     * @param strings
     * @return
     */
    @Override
    protected Void doInBackground(String... strings) {
        Log.i(TAG, "doInBackground"+strings[0]);


            try {
                for (int i =0;i<21;i++) {
                    publishProgress(i * 5);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        mProgressBar.setProgress(values[0]);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        mProgressBar.setVisibility(View.INVISIBLE);
    }
}
