package com.example.calculator.operations.abs.basic

import com.example.calculator.entities.abstract.INumberEntity
import com.example.calculator.operations.abs.ICalculator

interface IBasicCalculator<T:INumberEntity>:ICalculator,IBasicSingleCalculator<T>,IBasicMultipleCalculator<T> {
}