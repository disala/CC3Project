//https://semicolonspace.com/pie-chart-android-compose/

package lk.gov.statistics.cc3.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color

@Composable
fun DashboardPage() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DisplayChart()
    }
}

@Composable
fun DisplayChart() {

    val values = listOf(15f, 35f, 50f)
    val colors = listOf(Color(0xFF58BDFF), Color(0xFF125B7F), Color(0xFF092D40))
    val legend = listOf("Mango", "Banana", "Apple")

    val sumOfValues = values.sum()

    // Calculate each proportion value
    val proportions = values.map {
        it * 100 / sumOfValues
    }

    // Convert each proportions to angle
    val sweepAngles = proportions.map {
        360 * it / 100
    }




}