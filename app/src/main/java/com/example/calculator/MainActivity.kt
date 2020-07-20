package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.business.abs.ICalculatorService
import com.example.calculator.business.concerete.CalculatorManager
import com.example.calculator.business.concerete.IntCalculatorManager
import com.example.calculator.controllers.IntOperationController
import com.example.calculator.controllers.OperationController
import com.example.calculator.entities.concerete.IntegerEntity
import com.example.calculator.operations.abs.ICalculator
import com.example.calculator.operations.abs.basic.IBasicCalculator
import com.example.calculator.operations.concerete.IntBaseBasicCalculator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val calculator:IBasicCalculator<IntegerEntity> =IntBaseBasicCalculator()
    private val business:CalculatorManager<IntegerEntity,Int> =IntCalculatorManager(calculator)

    private val intController:OperationController<IntegerEntity,Int> =IntOperationController(business)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }


}






