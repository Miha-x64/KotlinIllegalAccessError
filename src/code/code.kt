package code

import library.SomeClass

fun main(args: Array<String>) {
    SomeClass().takeThis(SomeClass())

    /*
    LINENUMBER 6 L1
    NEW library/SomeClass
    DUP
    INVOKESPECIAL library/SomeClass.<init> ()V
    NEW library/SomeClass
    DUP
    INVOKESPECIAL library/SomeClass.<init> ()V
    CHECKCAST library/SomeInterface
!!                    ^ it's package-private!
    INVOKEVIRTUAL library/SomeClass.takeThis (Llibrary/SomeInterface;)V
     */

}