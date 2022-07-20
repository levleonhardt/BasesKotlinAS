package com.example.baseskotlinas
//-Primer archivo programado en kotlin que tendremos en nuestra App: a_todo fichero de tipo activity en Android tendremos asociado un layout, un fichero correspondiente con la parte gráfica (res/layout/activity_main.xml)
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //onCreate
        variablesYConstantes()
        tiposDeDatos()
        sentenciaIf()
        sentenciaWhen()
        arraysArreglos()
        mapasODiccionarios()
    }

    private fun variablesYConstantes() {
        //=====|| VARIABLES ||=======
        var primeraVariable = "Una variable (var) del tipo String."
        println(primeraVariable)

        primeraVariable = "La variable (var) se puede modificar, pero no cambiar DataType. Al reescribirla, ya no es necesario escribir \"var\""
        println(primeraVariable)

//      primeraVariable = 2  <-- ¡NO se puede cambiar el DataType!

        //=====|| CONSTANTES ||=======
        val unaConstante = "Constante (val): un único valor inmutable."
        println(unaConstante)
    }

    private fun tiposDeDatos() {
        //=====|| DATATYPES ||=======
        //-STRINGS
        var myString = "Kotlin tiene inferencia de tipos: puede saber de qué tipo de dato se trata por cómo lo estamos representando."
        //var myString: String = "Esto es redundante"
        var myString2 = "Se puede concatenar Strings."
        
        println(myString + " " + myString2) //Concatenando

        //-ENTEROS (Byte, Short, Int, Long)
        val myInt1 = 2
        val myInt2 = 4
        val myInt3 = myInt1 + myInt2
        println("Sumando dos enteros: $myInt3") //Concatenando String con Entero

        //-DECIMALES (Float, Double)

        //-BOOLEAN (Bool)
        val myBool1: Boolean = true
        val myBool2 = false
        println(myBool1 == myBool2) //No son iguales
        println(myBool1 && myBool2) //Operador AND (&&)
        println(myBool1 || myBool2) //Operador OR (||)
    }

    private fun sentenciaIf() {
        val myNumber = 10
        if (myNumber > 8){
            println("$myNumber es mayor que 8")
        } else if (myNumber == 8){
            println("$myNumber es 8")
        } else {        
            println("$myNumber es menor que 8")
        }
    }

    fun sentenciaWhen() {
        val country = "Argentina"

        when (country) {    //Cuando country coincida con "Argentina", se ejecuta el bloque correspondiente
            "Argentina", "México", "España" -> { //¡Se puede poner varios!
                println("El idioma es español")
            } "Alemania" -> {
                println("El idioma es alemán")
            } "Francia" -> {
                println("El idioma es francés")
            } else -> {
                println("No conocemos el idioma")
            }
        }
        val age = 100

        when (age) {
            0, 1, 2 -> {
                println("Bebé")
            } in 3..10 -> {
                println("Niño")
            } in 11..17 -> {
                println("Adolescente")
            } in 18..99 -> {
            println("Adulto")
            } else -> {
                println(":omg:")
            }
        }
    }

    fun arraysArreglos() {
        val name = "León"
        val surname = "Leonhardt"
        val company = "L. Akademie"
        var age = "30" //TODOS deben ser el mismo DATATYPE

        //CREANDO EL ARRAY
        val myArray: ArrayList<String> = arrayListOf<String>()

        //AÑADIENDO datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)  ¡Admite elementos repetidos!
        //myArray.add(age)
        println(myArray)

        //AÑADIR un conjunto de datos
        myArray.addAll(listOf("Elemento 1", "Elemento 2" ))

        println(myArray)

        //ACCEDER a datos
        println("Ahora se muestra el dato de índice 2:")
        println(myArray[2])

        //MODIFICAR datos
        myArray[2] = "Leonhardt Akademie"
        println(myArray)

        //BORRAR datos
        myArray.removeAt(5)
        println(myArray)

        //RECORRER datos
        myArray.forEach { it: String ->
            println(it)
        }

        //Otras operaciones

        println(myArray.count())
        println(myArray.first())
        println(myArray.last())
        myArray.clear()
        println(myArray)
    }

    fun mapasODiccionarios() {
        //Sintaxis
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Añadir Elementos
        myMap = mutableMapOf("Leo" to 1, "Juan" to 2, "Pedro" to 3)

        //Añadir un sólo valor
        myMap["Ana"] = 7
        myMap.put("María", 8)   //Dos claves distintas pueden tener el mismo valor
        myMap.put("Luis", 8)
        println(myMap)

        myMap.put("Marcos", 5)
        println(myMap)

        //Actualizar datos
        myMap["Marcos"] = 6
        println(myMap)
        
    }
    
}

    
