package com.example.my_app

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.widget.ContentLoadingProgressBar
import kotlinx.android.synthetic.main.activity_async.*
import java.lang.Exception

class AsyncActivity : AppCompatActivity() {
    var task: BackgroundAsyncTask? = null
    //var task1 : BackgroundAsyncTask? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)




        start.setOnClickListener {
            task = BackgroundAsyncTask(progressbar, ment)
            //task1 = BackgroundAsyncTask(progressbar, ment)
            task?.execute()
            //task1?.execute()
        }

        stop.setOnClickListener {
            //task?.cancel(true)
            startActivity(Intent(this, Intent2::class.java))
        }

    }

    override fun onPause() {
        task?.cancel(true)
        super.onPause()
    }
}

class BackgroundAsyncTask(
    val progressBar: ProgressBar,
    val progressText: TextView
) : AsyncTask<Int, Int, Int>() {

    var percent: Int = 0

    override fun onPreExecute() {
        percent = 0
        progressBar.setProgress(percent)
    }

    override fun doInBackground(vararg params: Int?): Int {
        while (isCancelled() == false) {
            percent++
            Log.d("async", "percent: $percent")
            if (percent >= 100) {
                break
            } else {
                publishProgress(percent)
            }

            try {
                Thread.sleep(100)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return percent
    }

    override fun onProgressUpdate(vararg values: Int?) {
        progressBar.setProgress(values[0] ?: 0)
        progressText.setText("Percent: " + values[0])
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: Int?) {
        progressText.setText("Operation is complete.")
    }

    override fun onCancelled() {
        progressBar.setProgress(0)
        progressText.setText("Operation canceled")
    }
}