// https://developer.android.com/jetpack/compose/navigation
// https://vtsen.hashnode.dev/simple-jetpack-compose-navigation-example
package lk.gov.statistics.cc3.pages

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "dashboardPage" ){
        composable("dashboardPage"){ DashboardPage()}
        composable("enumerationSelectionPage") { EnumerationSelectionPage()}
        composable("operationsMainPage") { OperationsMainPage()}
    }
}
