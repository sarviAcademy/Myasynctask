package MyAsyncTasks;

import android.os.AsyncTask;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MyTasks extends AsyncTask<View, String, Boolean>
{
    private TextView tv;
    private String TAg;
    private CheckBox ck;

    @Override
    protected Boolean doInBackground(View... textViews) {
        tv=(TextView)textViews[0];
        ck=(CheckBox)textViews[1];

        TAg=getClass().getName();
        int i=0;
        while(i++<15)
        {
            try {
                Thread.sleep(100);
                publishProgress(String.format("value of i: %d",i));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        return true;

    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        ck.setChecked(true);
        ck.setText("Job is Done!");
        ck.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onProgressUpdate(String... values) {
        tv.setText(values[0]);

    }
}
