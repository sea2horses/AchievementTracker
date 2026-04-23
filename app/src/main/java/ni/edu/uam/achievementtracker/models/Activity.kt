package ni.edu.uam.achievementtracker.models

import java.util.Date

data class Activity(val nombre: String, val hora: Date, val meta: String? = null) {
    var completado = false

    fun marcarComoCompletado() {
        completado = true
    }

    fun getCompletado(): Boolean {
        return completado
    }
}