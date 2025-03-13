fun main(args: Array) {
<<<<<<< HEAD
       val (operation, num1, num2) = parseArguments(args)
       val result = when (operation) {
           "multiplica" -> multiplica(num1, num2)
           "divide" -> divide(num1, num2)
           else -> throw IllegalArgumentException("Operación no soportada")
       }
       showResult(operation, result)
=======
    val (operation, num1, num2) = parseArguments(args)
    val result = when (operation) {
        "multiplica" -> multiplica(num1, num2)
<<<<<<< HEAD
        "suma" -> suma(num1, num2)
=======
        "resta" -> resta(num1, num2)
>>>>>>> feature/resta
        else -> throw IllegalArgumentException("Operación no soportada")
    }
    showResult(operation, result)
>>>>>>> feature/suma
}

fun parseArguments(args: Array): Triple {
    if (args.size != 3) {
        throw IllegalArgumentException("Número incorrecto de argumentos")
    }
    val operation = args[0]
    val num1 = args[1].toInt()
    val num2 = args[2].toInt()
    return Triple(operation, num1, num2)
}

fun multiplica(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun showResult(operation: String, result: Int) {
    println("El resultado de la operación \"$operation\" es: $result")
}

<<<<<<< HEAD
<<<<<<< HEAD
fun divide(num1: Int, num2: Int): Int {
    if (num2 == 0) {
        throw IllegalArgumentException("Error: No se puede dividir por cero")
    }
    return num1 / num2
=======
fun suma(num1: Int, num2: Int): Int {
    return num1 + num2
>>>>>>> feature/suma
=======
fun resta(num1: Int, num2: Int): Int {
    return num1 - num2
>>>>>>> feature/resta
}
