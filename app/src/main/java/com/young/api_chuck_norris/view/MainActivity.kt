package com.young.api_chuck_norris.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.young.api_chuck_norris.MainContract
import com.young.api_chuck_norris.R
import com.young.api_chuck_norris.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.view {

    private val presenter : MainContract.presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_update_activity_main.setOnClickListener{
            presenter.buttonClicked()
        }
    }

    override fun showToast(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun updateTextField(id: Int, joke: String) {
        tv_num_activity_main.text = id.toString()
        tv_joke_activity_main.text = joke
    }
}
