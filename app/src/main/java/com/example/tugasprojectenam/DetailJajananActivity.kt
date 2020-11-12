package com.example.tugasprojectenam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_jajanan.*

class DetailJajananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_jajanan)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partgambar = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var partnama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var partdesc = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var partalamat = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            foto_detail.setImageResource(partgambar)
            nama_detail.text = partnama
            desc_detail.text = partdesc
            alamat.text = partalamat

        }

    }
}