# KotlinIllegalAccessError
Bug report repo

Kotlin Compiler tries to cast an object to a package-private
interface which is set as generic upper-bound
of consumer function argument.

[code.kt](/src/code/code.kt)