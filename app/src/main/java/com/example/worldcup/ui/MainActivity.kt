package com.example.worldcup.ui
import android.view.LayoutInflater
import com.example.worldcup.databinding.ActivityMainBinding
import com.example.worldcup.util.CSVParser
import java.io.BufferedReader
import java.io.InputStreamReader
//Done

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate


    override fun setUp() {
        openFile()
    }
    override fun addCallBack() {
    }
    private fun openFile(){
        val inputStream = assets.open("worldcup.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CSVParser()
        buffer.forEachLine {
            val currentMatch = parser.parse(it)
            log(currentMatch)
        }
    }


}