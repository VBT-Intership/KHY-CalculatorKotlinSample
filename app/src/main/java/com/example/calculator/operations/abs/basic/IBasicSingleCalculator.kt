package com.example.calculator.operations.abs.basic

import com.example.calculator.entities.abstract.INumberEntity
import com.example.calculator.operations.abs.ICalculator


interface IBasicSingleCalculator<T:INumberEntity>:ICalculator {

    fun Plus(firstNumber:T,secondNumber:T):Number

    fun Extract(firstNumber:T,secondNumber:T):Number

    fun Division(firstNumber:T,secondNumber:T):Number

    fun Multiplication(firstNumber:T,secondNumber:T):Number


}