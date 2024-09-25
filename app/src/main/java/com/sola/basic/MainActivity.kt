package com.sola.basic

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.dcloud.uniapp.UniAppActivity
import io.dcloud.uniapp.appframe.IUniNativePage
import io.dcloud.uniapp.framework.__uniConfig
import org.webrtc.DefaultVideoDecoderFactory

/**
 * @author  SOLA
 * @date    2024/07/11 15:50
 * @email   chenliangliang1468871115@gmail.com
 * @des     '
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        findViewById<View>(R.id.btn_goto).setOnClickListener {
            val intent = Intent(this@MainActivity, UniAppActivity::class.java)
            intent.putExtra("path","111")
            startActivity(intent)
            UniAppActivity().loadPage(IUniNativePage("/"))
        }
    }
}