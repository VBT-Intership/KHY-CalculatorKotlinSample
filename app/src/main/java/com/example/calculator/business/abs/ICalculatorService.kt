package com.example.calculator.business.abs

import com.example.calculator.entities.abstract.INumberEntity
import com.example.calculator.entities.enums.Operations
import com.example.calculator.operations.abs.ICalculator

interface ICalculatorService<T:INumberEntity,N:Number>{
   val calculator:ICalculator
}