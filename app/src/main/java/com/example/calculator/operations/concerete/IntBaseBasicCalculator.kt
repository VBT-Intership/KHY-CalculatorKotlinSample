

package com.example.calculator.operations.concerete

import com.example.calculator.core.extensions.NumberEntityExtensions.Companion.copyToNumberList
import com.example.calculator.entities.concerete.IntegerEntity
import com.example.calculator.operations.abs.basic.IBasicCalculator




class IntBaseBasicCalculator: IBasicCalculator<IntegerEntity> {
    override fun Plus(firstNumber: IntegerEntity, secondNumber: IntegerEntity): Int {
        return firstNumber.number+secondNumber.number
    }

    override fun Extract(firstNumber: IntegerEntity, secondNumber: IntegerEntity): Int {
        return firstNumber.number-secondNumber.number
    }

    override fun Division(firstNumber: IntegerEntity, secondNumber: IntegerEntity): Int {
        return firstNumber.number/secondNumber.number
    }

    override fun Multiplication(firstNumber: IntegerEntity, secondNumber: IntegerEntity): Int{
        return firstNumber.number*secondNumber.number
    }

    override fun MultiPlus(numberEntities: List<IntegerEntity>): Int{
        val numberList=numberEntities.copyToNumberList<IntegerEntity,Int>()
        return numberList.reduce{acc,i->acc+i}
    }

    override fun MultiExtract(numberEntities: List<IntegerEntity>):Int{
        val numberList=numberEntities.copyToNumberList<IntegerEntity,Int>()
        return numberList.reduce{acc,i->acc-i}
    }

    override fun MultiDivision(numberEntities: List<IntegerEntity>): Int{
        val numberList=numberEntities.copyToNumberList<IntegerEntity,Int>()
        return numberList.reduce{ acc, i -> acc / i }
    }

    override fun MultiMultiplication(numberEntities: List<IntegerEntity>): Int{
        val numberList=numberEntities.copyToNumberList<IntegerEntity,Int>()
        return numberList.reduce{acc,i->acc*i}
    }




}