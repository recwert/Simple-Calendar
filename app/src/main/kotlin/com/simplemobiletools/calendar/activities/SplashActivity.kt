package com.simplemobiletools.calendar.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.simplemobiletools.calendar.helpers.DAY_CODE
import com.simplemobiletools.calendar.helpers.EVENT_ID
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent.extras?.containsKey(DAY_CODE) == true) {
            startActivity<DayActivity>(DAY_CODE to intent.getStringExtra(DAY_CODE))
        } else if (intent.extras?.containsKey(EVENT_ID) == true) {
            startActivity<DayActivity>(EVENT_ID to intent.getIntExtra(EVENT_ID, 0))
        } else {
            startActivity<MainActivity>()
        }
        finish()
    }
}
