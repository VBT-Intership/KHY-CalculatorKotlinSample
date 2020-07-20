package com.example.calculator.controllers

import com.example.calculator.business.concerete.CalculatorManager
import com.example.calculator.entities.abstract.INumberEntity
import com.example.calculator.entities.concerete.IntegerEntity
import com.example.calculator.entities.enums.Operations





abstract  class OperationController<T:INumberEntity,N:Number>(calculatorManager: CalculatorManager<T,N>)
{
    abstract fun add (first:T,second:T,operations: Operations):N

    abstract fun extract(first: T,second: T,operations: Operations):N
}

class IntOperationController(calculatorManager: CalculatorManager<IntegerEntity,Int>) : OperationController<IntegerEntity, Int>(
    calculatorManager
) {
    private val _calculatorManager=calculatorManager

    override fun add(first: IntegerEntity, second: IntegerEntity,operations: Operations): Int {
        return _calculatorManager.add(first,second,operations)
    }

    override fun extract(first: IntegerEntity, second: IntegerEntity,operations: Operations): Int {
        return _calculatorManager.extract(first,second,operations)
    }

}
