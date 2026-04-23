package ni.edu.uam.achievementtracker.models

import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

enum class Category(val color: Color, val label: String) {
    SALUD(Color(0xFF81C784), "Salud"),
    ESTUDIO(Color(0xFF64B5F6), "Estudio"),
    TRABAJO(Color(0xFFFFB74D), "Trabajo"),
    PERSONAL(Color(0xFFBA68C8), "Personal")
}

data class Activity(
    val nombre: String,
    val meta: String,
    val categoria: Category = Category.PERSONAL
) {
    var completado by mutableStateOf(false)
}

val exampleActivities by mutableStateOf(arrayOf(
    Activity("Beber agua", "2L", Category.SALUD),
    Activity("Hacer ejercicio", "30 min", Category.SALUD),
    Activity("Leer", "20 páginas", Category.ESTUDIO),
    Activity("Estudiar programación", "1 hora", Category.ESTUDIO),
    Activity("Meditar", "10 min", Category.SALUD),
    Activity("Dormir temprano", "10:00 PM", Category.SALUD),
    Activity("Caminar", "5,000 pasos", Category.SALUD),
    Activity("Practicar inglés", "15 min", Category.ESTUDIO),
    Activity("Desayunar saludable", "Antes de 8:00 AM", Category.SALUD),
    Activity("Tomar vitaminas", "1 dosis", Category.SALUD),
    Activity("Revisar tareas", "7:00 PM", Category.ESTUDIO),
    Activity("Escribir diario", "1 página", Category.PERSONAL),
    Activity("Limpiar habitación", "15 min", Category.PERSONAL),
    Activity("Evitar redes sociales", "2 horas", Category.PERSONAL),
    Activity("Planificar el día", "5 min", Category.TRABAJO)
))

val completedPercent by derivedStateOf { 
    if (exampleActivities.isEmpty()) 0f 
    else (exampleActivities.count { it.completado } / exampleActivities.size.toFloat()) * 100 
}