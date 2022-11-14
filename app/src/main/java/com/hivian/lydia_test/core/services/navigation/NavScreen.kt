package com.hivian.lydia_test.core.services.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.*
import com.hivian.lydia_test.ui.composables.DetailScreen
import com.hivian.lydia_test.ui.composables.HomeScreen

sealed class NavScreen {
    object Home : IScreenRoute {

        override val route: String = "home"

        @Composable
        override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
            HomeScreen(hiltViewModel())
        }

    }
    object Detail : IScreenRoute {

        private const val baseRoute: String = "detail"

        const val userIdArgument = "userId"

        override val route: String = "$baseRoute/{$userIdArgument}"

        override val arguments: List<NamedNavArgument> =
            listOf(navArgument(userIdArgument) { type = NavType.IntType })

        @Composable
        override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
            DetailScreen(hiltViewModel())
        }

        fun createRouteWithArgs(userId: Int): String {
            return "$baseRoute/$userId"
        }

    }
}

sealed interface IScreenRoute {

    companion object {
        val allScreens = listOf(
            NavScreen.Home,
            NavScreen.Detail,
        )
    }

    val route: String

    val arguments: List<NamedNavArgument>
        get() = emptyList()

    val deepLinks: List<NavDeepLink>
        get() = emptyList()

    @Composable
    fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    )

}