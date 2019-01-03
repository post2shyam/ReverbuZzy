package com.post2shyam.abcd.screens.first

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.post2shyam.abcd.R
import com.post2shyam.abcd.screens.internal.BaseActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_first.*
import timber.log.Timber


class FirstActivity : BaseActivity() {
    companion object {
        fun launch(launchContext: Context) {
            val intent = Intent(launchContext, FirstActivity::class.java)
            launchContext.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        //Will log tview user clicks for analytics.
        hello_world_tview.setOnClickListener { view -> Timber.d("%s", view.tag) }
    }
}
