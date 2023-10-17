package com.example.worldcup.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
//done
abstract class BaseActivity<viewBinding :ViewBinding> :AppCompatActivity() {
    abstract val LOG_TAG :String
    abstract val bindingInflater: (LayoutInflater) -> viewBinding
    private var _binding :ViewBinding?= null

    protected val binding = _binding as viewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        setUp()
        addCallBack()
    }
    abstract fun setUp()
    abstract fun addCallBack()
    protected fun log(value:Any){
        Log.v(LOG_TAG,value.toString())
    }
 }