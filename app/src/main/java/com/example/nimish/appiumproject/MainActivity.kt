package com.example.nimish.appiumproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    private var ctr=0
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    protected fun press(view:View)
    {
        var button=view as Button
        ctr+=1
        textView.text=textView.text.toString()+" "+ctr.toString()
    }
}
