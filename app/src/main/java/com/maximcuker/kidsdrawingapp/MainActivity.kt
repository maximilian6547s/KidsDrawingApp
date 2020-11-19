package com.maximcuker.kidsdrawingapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_brush_size.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawingView.setSizeForBrush(20.toFloat())

        ibBrush.setOnClickListener {
            showBrushChooseSizeDialog()
        }
    }

    private fun showBrushChooseSizeDialog() {
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.setTitle("Brush size: ")
        val smallButton = brushDialog.ibSmallBrush
        smallButton.setOnClickListener {
            drawingView.setSizeForBrush(10.toFloat())
            brushDialog.dismiss()
        }
        val mediumButton = brushDialog.ibMediumBrush
        mediumButton.setOnClickListener {
            drawingView.setSizeForBrush(20.toFloat())
            brushDialog.dismiss()
        }
        val largeBrush = brushDialog.ibLargeBrush
        largeBrush.setOnClickListener {
            drawingView.setSizeForBrush(30.toFloat())
            brushDialog.dismiss()
        }

        brushDialog.show()
    }
}