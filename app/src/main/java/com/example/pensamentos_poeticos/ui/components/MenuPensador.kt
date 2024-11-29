package com.example.pensamentos_poeticos.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pensamentos_poeticos.R
import com.example.pensamentos_poeticos.ui.theme.PensadorLightGray
import kotlinx.coroutines.launch

@Preview
@Composable
private fun MenuPensadorPrev() {
    MenuPensador(drawerState = DrawerState(DrawerValue.Open))
}

@Composable
fun MenuPensador(
    drawerState: DrawerState,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {}
) {

    ModalNavigationDrawer(
        drawerState = drawerState,
        modifier = modifier.fillMaxSize(),
        drawerContent = {
            ModalDrawerSheet(
                drawerContentColor = PensadorLightGray,
                drawerContainerColor = PensadorLightGray,
                modifier = Modifier
                    .fillMaxWidth(0.6f),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {

                    Text(
                        "Pensamentos Poéticos",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(5.dp)
                    )


                    Spacer(modifier = Modifier.padding(43.dp))

                    Box(modifier = Modifier.clickable { }) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Default.Search, contentDescription = "SearchProduct",
                                tint = Color.White
                            )
                            Text(
                                text = "Pesquisar pensador",
                                color = Color.White,
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp

                            )

                        }
                    }
                    Box(modifier = Modifier.clickable { }) {

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Refresh,
                                contentDescription = "SearchProduct",
                                tint = Color.White

                            )
                            Text(
                                text = "Poesia aleatório",
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.White,


                                )
                        }
                    }


                    Box(modifier = Modifier.clickable { }) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_history),
                                contentDescription = "History",
                                tint = Color.White
                            )
                            Text(
                                text = "Histórico",
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.White,

                                )
                        }
                    }
                    Box(modifier = Modifier.clickable { }) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Default.Settings, contentDescription = "Configurantion",
                                tint = Color.White
                            )
                            Text(
                                text = "Configurações",
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.White,

                                )
                        }
                    }
                }
            }
        },
        content = content
    )

}
