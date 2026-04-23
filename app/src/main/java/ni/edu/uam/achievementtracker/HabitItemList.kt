package ni.edu.uam.achievementtracker

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import ni.edu.uam.achievementtracker.models.Activity

@Composable
fun HabitItemList(activities: Array<Activity>) {
    Row() {
        LazyColumn() {
            items(activities.size) { index ->
                HabitItem(activities[index])
            }
        }
    }
}