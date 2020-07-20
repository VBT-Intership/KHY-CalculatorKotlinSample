package com.example.calculator.operations.abs.basic

import com.example.calculator.entities.abstract.INumberEntity
import com.example.calculator.operations.abs.ICalculator

interface IBasicMultipleCalculator<T:INumberEntity>:ICalculator{

    fun MultiPlus(numberEntities:List<T>):Number

    fun MultiExtract(numberEntities: List<T>):Number

    fun MultiDivision(numberEntities: List<T>):Number

    fun MultiMultiplication(numberEntities: List<T>):Number

}