package com.p4p.android

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

/**
 * Created by Krishnaprasad.RS on 12-06-2018.
 */
class SplashActivity:AppCompatActivity() {
    private var mHandler:Handler?=null;
    private val mDelayTime:Long =3000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mHandler = Handler();
        mHandler!!.postDelayed(mRunnableThread,mDelayTime);

    }

    /**
     * TO declare a thread
     */

    internal var mRunnableThread:Runnable = Runnable {

        if(!isFinishing)
        {
            val intent = Intent(this,MainActivity::class.java);
            startActivity(intent);
            finish();

        }
    }
    public override fun onDestroy() {

        if (mHandler != null) {
            mHandler!!.removeCallbacks(mRunnableThread)
        }

        super.onDestroy()
    }
}
