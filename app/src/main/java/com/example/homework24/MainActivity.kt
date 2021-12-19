package com.example.homework24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homework24.adapter.ActivitySuccess
import com.example.homework24.adapter.AlbumAdapter
import com.example.homework24.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val adapter = AlbumAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            albumTop.layoutManager=GridLayoutManager(this@MainActivity,3)
            albumTop.adapter=adapter
            adapter.addAll()
        }
    }

    fun Success(view: android.view.View) {
        val intent=Intent(this@MainActivity, ActivitySuccess::class.java )
        startAlpha(view)
        startIn(view)
        startActivity(intent)
    }
    fun startAlpha(view: View) {
        val startAnimation=AnimationUtils.loadAnimation(this, R.anim.start)
        startAnimation.start()
    }

    fun startIn(view: View){
        val startin=AnimationUtils.loadAnimation(this,R.anim.start_in)
        startin.start()
    }

}