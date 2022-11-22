//https://semicolonspace.com/pie-chart-android-compose/

package lk.gov.statistics.cc3.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import lk.gov.statistics.cc3.R

@Composable
fun DashboardPage() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.cc3logo),
            contentDescription = "CC3 Logo",
            modifier = Modifier.clip(RoundedCornerShape(90.dp))
        )


        Text(text = "Dashboard", fontSize = 25.sp)
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