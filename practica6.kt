import java.io.File

fun leerArchivos(ruta: String): String{
    val archivo = File(ruta)
    return archivo.readText()
}

fun escribirEnArchivos(ruta: String, content: String){
    val archivo = File(ruta)
    archivo.appendText(content)
} 

fun main(args: Array<String>) {
    
    val ruta = "F:\UNIVO\2024 Ciclo 2\Estructura de datos\Practicas\Practica6"
    val contenido = leerArchivos(ruta)
    
    /*Ejemplo 1 - Lectura de Archivos */
    println(contenido)
    println("\n")

    /*Ejemplo 2 - Escritura en Archivosa */
    val escritura = " \nEsta es la practica numero 6"
    

    escribirEnArchivos(ruta, escritura)
    println("Creado exitosamente.")
}