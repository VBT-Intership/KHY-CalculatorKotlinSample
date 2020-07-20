package com.example.calculator.core.extensions

import com.example.calculator.entities.abstract.INumberEntity

class NumberEntityExtensions{
    companion object {
        @JvmStatic
        fun <T:INumberEntity,N:Number> List<T>.copyToNumberList(): List<N> {
            val numberList=listOf<N>()
            for(list in this){
                numberList.plus(list.number)
            }

            return numberList
        }
    }

}



