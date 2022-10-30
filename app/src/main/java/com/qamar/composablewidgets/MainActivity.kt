@file:OptIn(ExperimentalAnimationApi::class)

package com.qamar.composablewidgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.qamar.composablewidgets.ui.dragexample.DragExample
import com.qamar.composablewidgets.ui.lottieexample.LottieExample
import com.qamar.composablewidgets.ui.menu.MenuExample
import com.qamar.composablewidgets.ui.modifiers.TryModifiers
import com.qamar.composablewidgets.ui.sendemail.SendEmailExample
import com.qamar.composablewidgets.ui.sideeffect.TryLaunchedEffect
import com.qamar.composablewidgets.ui.staggered.StaggeredList
import com.qamar.composablewidgets.ui.state.StateExample
import com.qamar.composablewidgets.ui.swipableitem.SwipeList
import com.qamar.composablewidgets.ui.swipetorefresh.SwipeToRefreshList
import com.qamar.composablewidgets.ui.theme.ComposableWidgetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableWidgetsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.white)
                ) {
                    SendEmailExample()
                }
            }
        }
    }
}

@Preview()
@Composable
fun DefaultPreview() {
    ComposableWidgetsTheme {
        SendEmailExample()
    }
}