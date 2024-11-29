package com.example.pensamentos_poeticos.ui.askIA

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
<<<<<<< HEAD
=======
import androidx.compose.material.icons.automirrored.filled.Send
>>>>>>> master
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.BottomAppBar
<<<<<<< HEAD
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
=======
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
>>>>>>> master
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
<<<<<<< HEAD
import com.example.pensamentos_poeticos.ui.theme.PensadorDarkGray
import com.example.pensamentos_poeticos.ui.theme.PensadorLightGray
=======
import com.example.pensamentos_poeticos.ui.components.MenuPensador
import com.example.pensamentos_poeticos.ui.theme.PensadorDarkGray
import com.example.pensamentos_poeticos.ui.theme.PensadorLightGray
import kotlinx.coroutines.launch
>>>>>>> master


@Preview
@Composable
private fun AskIAScreenPrev() {
    AskIAScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AskIAScreen(
    state: AskIAUistate = AskIAUistate(),
) {
<<<<<<< HEAD
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = PensadorLightGray
                ),
                title = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(14.dp),
                    modifier =
                    Modifier
                        .fillMaxWidth()

                ) {
                    Icon(Icons.Default.Menu, contentDescription = "Search", tint = Color.White)
                    Text(
                        text = "Pensamentos Poéticos",
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            })
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.background(
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    shape = CircleShape
                ),
                containerColor = PensadorDarkGray,
                actions = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        TextField(
                            leadingIcon = {
                                Icon(
                                    Icons.Default.Search,
                                    contentDescription = "Search",
                                    tint = Color.White
                                )
                            },
                            trailingIcon = {
                                Icon(
                                    Icons.Default.Send,
                                    contentDescription = "Send",
                                    tint = Color.White
                                )
                            },
                            shape = RoundedCornerShape(50),
                            value = state.searchPoet,
                            label = {
                                Text(
                                    text = if (state.searchPoet.isEmpty()) "Digite o nome do autor: " else "",
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            },
                            onValueChange = state.onSearchPoet,
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                                .align(Alignment.CenterVertically),
                            colors = TextFieldDefaults.textFieldColors(
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                containerColor = PensadorLightGray
                            )
                        )
                    }
                }
            )

        }
    )
    {
        Column(
            Modifier
                .padding(it)
                .background(color = PensadorDarkGray)
                .fillMaxSize()
        ) {

        }
    }
=======
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutine = rememberCoroutineScope()
    MenuPensador(drawerState = drawerState, content = {
        Scaffold(
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = PensadorLightGray
                    ),
                    title = {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(14.dp),
                            modifier =
                            Modifier
                                .fillMaxWidth()

                        ) {
                            IconButton(onClick = {
                                coroutine.launch {
                                    if (drawerState.isClosed) {
                                        drawerState.open()
                                    } else {
                                        drawerState.close()
                                    }
                                }
                            }) {
                                Icon(
                                    Icons.Default.Menu,
                                    contentDescription = "Search",
                                    tint = Color.White
                                )
                            }
                            Text(
                                text = "Pesquise o pensador",
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                modifier = Modifier.align(Alignment.CenterVertically)
                            )
                        }
                    })
            },
            bottomBar = {
                BottomAppBar(
                    modifier = Modifier.background(
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        shape = CircleShape
                    ),
                    containerColor = PensadorDarkGray,
                    actions = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            OutlinedTextField(
                                leadingIcon = {
                                    Icon(
                                        Icons.Default.Search,
                                        contentDescription = "Search",
                                        tint = Color.White
                                    )
                                },
                                trailingIcon = {
                                    Icon(
                                        Icons.Default.Send,
                                        contentDescription = "Send",
                                        tint = Color.White
                                    )
                                },
                                shape = RoundedCornerShape(50),
                                value = state.searchPoet,
                                placeholder = {
                                    Text(
                                        text = if (state.searchPoet.isEmpty()) "Digite o nome do autor: " else "",
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                },
                                onValueChange = state.onSearchPoet,
                                modifier = Modifier
                                    .fillMaxWidth(0.9f)
                                    .align(Alignment.CenterVertically),
                                colors = TextFieldDefaults.textFieldColors(
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    containerColor = PensadorLightGray,
                                ),
                                textStyle = TextStyle(color = Color.White)
                            )
                        }
                    }
                )

            }
        )
        {
            Column(
                Modifier
                    .padding(it)
                    .background(color = PensadorDarkGray)
                    .fillMaxSize()
            ) {

            }
        }

    })
>>>>>>> master
}