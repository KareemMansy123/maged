package info.info.makom

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openWebView()

    }

    private fun openWebView() {
        webview.webChromeClient = WebChromeClient()
        webview.webViewClient = WebViewClient()
        webview.settings.javaScriptEnabled = true
        webview.settings.setSupportMultipleWindows(true)
        webview.loadUrl("http://hr.edf.edu.eg/edf")
    }

}