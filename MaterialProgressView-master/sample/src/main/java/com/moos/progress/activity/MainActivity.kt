package com.moos.progress.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.moos.library.CircleProgressBar
import com.moos.progress.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

/**
 * by Moos on 2018/03/21
 * just a design example to use it
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progress_bar.setAnimateType(CircleProgressBar.ACCELERATE_DECELERATE_INTERPOLATOR)
        progress_bar.setProgressAndAnimate(2f)
        button?.setOnClickListener {
            progress_bar.setProgressAndAnimate(progress_bar.progress + 2f)
        }
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_details) {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java)
            startActivity(intent)
        }
    }
}