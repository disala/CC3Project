package lk.gov.statistics.cc3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import lk.gov.statistics.cc3.pages.NavigationGraph
import lk.gov.statistics.cc3.ui.theme.CC3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CC3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //LoginPage()
                    val navController = rememberNavController()
                    //  NavigationMenu(navController)
                    //DashboardPage()
                    Scaffold(
                        bottomBar = { BottomBar(navController) }
                    ) {
                        NavigationGraph(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun BottomBar(navController: NavController) {

    BottomNavigation {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        BottomNavigationItem(
            //icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) }
            //label = { Text(text = item.title,        //                fontSize = 9.sp) },
            icon = {},
            label = { Text(text = "Selection") },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.Yellow,
            alwaysShowLabel = true,
            selected = false,
            onClick = { navController.navigate("enumerationSelectionPage") }
        )

        BottomNavigationItem(
            //icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) }
            //label = { Text(text = item.title,        //                fontSize = 9.sp) },
            icon = {},
            label = { Text(text = "Dashboard") },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.Yellow,
            alwaysShowLabel = true,
            selected = false,
            onClick = { navController.navigate("dashboardPage") }
        )

    }


}
