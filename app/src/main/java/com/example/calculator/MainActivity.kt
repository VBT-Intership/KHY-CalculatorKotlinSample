package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.business.abs.ICalculatorService
import com.example.calculator.business.concerete.CalculatorManager
import com.example.calculator.business.concerete.IntCalculatorManager
import com.example.calculator.controllers.IntOperationController
import com.example.calculator.operations.concerete.IntBaseBasicCalculator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val calculator=IntBaseBasicCalculator()
    val business=IntCalculatorManager(calculator = calculator)

    val intController=IntOperationController(business)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }


}






