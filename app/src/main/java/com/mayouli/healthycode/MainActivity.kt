package com.mayouli.healthycode

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Process
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val url =
        "alipays://platformapi/startapp?appId=2018062060350751&page=%2Fpages%2Fweb%2Fweb%3Furl%3Dhttps%3A%2F%2Fjsstm.jszwfw.gov.cn%2FjkmIndex.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        if (null != intent.resolveActivity(packageManager)) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "未安装支付宝", Toast.LENGTH_SHORT).show()
        }
        Process.killProcess(Process.myPid())
    }
}