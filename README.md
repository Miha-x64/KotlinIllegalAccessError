~~https://youtrack.jetbrains.com/issue/KT-15315~~

Kotlin Compiler tries to cast an object to a package-private
interface which is set as generic upper-bound
of consumer function's argument.

[code.kt](/src/code/code.kt)
