package com.example.calculator.controllers

import com.example.calculator.business.concerete.CalculatorManager
import com.example.calculator.entities.concerete.IntegerEntity
import com.example.calculator.entities.enums.Operations


class IntOperationController(calculatorManager: CalculatorManager<IntegerEntity,Int>){
    val _calculatorManager=calculatorManager


    fun add(first:IntegerEntity,second:IntegerEntity,options:Operations):Int{
        return _calculatorManager.add(first,second,options)
    }

    fun extract(first:IntegerEntity,second:IntegerEntity,options:Operations):Int{
        return _calculatorManager.extract(first,second,options)
    }
}