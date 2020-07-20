package com.example.calculator.business.concerete

import com.example.calculator.business.abs.ICalculatorService
import com.example.calculator.entities.abstract.INumberEntity
import com.example.calculator.entities.concerete.IntegerEntity
import com.example.calculator.entities.enums.Operations
import com.example.calculator.operations.abs.basic.IBasicCalculator
import java.lang.Exception

abstract class CalculatorManager<T:INumberEntity,N:Number>(calculator: IBasicCalculator<T>):ICalculatorService<T,N>{

    val _calculator=calculator

    abstract fun add(first: T, second: T, option:Operations):N

    abstract fun extract(first: T, second: T, option: Operations):N

}


class IntCalculatorManager(calculator: IBasicCalculator<IntegerEntity>) : CalculatorManager<IntegerEntity,Int>(calculator) {
    override fun add(first: IntegerEntity, second: IntegerEntity, option: Operations): Int {
        if(option==Operations.Plus){
          return _calculator.Plus(first,second).toInt()
        }

        else{
            throw Exception("option must be Plus")
        }
    }

    override fun extract(first: IntegerEntity, second: IntegerEntity, option: Operations): Int {

        if(option==Operations.Extract){
            return _calculator.Extract(first,second).toInt()
        }

        else{
            throw Exception("option must be Extract")
        }

    }

}