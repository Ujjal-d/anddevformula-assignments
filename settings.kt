package com.example.androiddev_formula.jetpack_compose_assignments.ui_practice_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Settings () {
    var searchsettings by remember { mutableStateOf(value ="") }
    Column(modifier = Modifier.padding(top =40.dp, start = 20.dp, end = 20.dp)
        .fillMaxSize()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "ArrowBack",
                modifier = Modifier
                    .background(Color.LightGray, shape = RoundedCornerShape(10.dp))
                    .padding(5.dp)
                    .alpha(0.6f)
            )
            Text(text = "Settings",
            fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))

        TextField(modifier = Modifier.fillMaxWidth(),
            value = searchsettings,
            onValueChange = {searchsettings = it},
            placeholder = {Text("Search settings..")},
            leadingIcon = {Icon(imageVector = Icons.Default.Search,
            contentDescription = "arrow")},
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "ACCOUNT",
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black.copy(alpha = .5f),
            letterSpacing = 2.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        Card(

        ) {
            Column(modifier = Modifier.fillMaxWidth(),
//                .padding(18.dp),
//               verticalArrangement = Arrangement.spacedBy(10.dp)
            ){
            Row(modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(modifier = Modifier.alpha(.6f),
                        imageVector = Icons.Outlined.Person,
                        contentDescription = "account info")
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Account Info",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = "greater than",
                    modifier = Modifier.alpha(0.7f)
                )
            }
                HorizontalDivider()
                Row(modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 10.dp, vertical = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                    verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(modifier = Modifier.alpha(.6f),
                            imageVector = Icons.Outlined.Notifications,
                            contentDescription = "Notifications")
                        Spacer(modifier = Modifier.width(15.dp))
                        Text(text = "Notifications",
                                fontSize = 20.sp,
                            fontWeight = FontWeight.W500
                            )
                    }
                    Card(modifier = Modifier.height(32.dp).width(57.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Green
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize()
                                .padding(end = 2.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End
                        ) {
                            Box(
                                modifier = Modifier.size(28.dp)
                                    .fillMaxWidth()
                                    .background(Color.White, shape = CircleShape)


                            ){

                            }
                        }
                    }
                }
                HorizontalDivider()
                Row(modifier = Modifier.fillMaxWidth()
                   .padding(horizontal = 10.dp, vertical = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(modifier = Modifier.alpha(.6f),
                            imageVector = Icons.Outlined.DarkMode,
                            contentDescription = "Dark Mode")
                        Spacer(modifier = Modifier.width(15.dp))
                        Text(text = "Dark Mode",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W500
                        )
                    }
                    Card(modifier = Modifier.height(32.dp).width(57.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Gray
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize()
                                .padding(start = 2.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Box(
                                modifier = Modifier.size(28.dp)
                                    .fillMaxWidth()
                                    .background(Color.White, shape = CircleShape)


                            ){

                            }
                        }
                    }
                }
                }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "PREFERENCES",
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black.copy(alpha = .5f),
            letterSpacing = 2.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        Card(

        ) {
            Row(modifier = Modifier.fillMaxWidth().
            padding(horizontal = 10.dp, vertical = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(modifier = Modifier.alpha(.6f),
                        imageVector = Icons.Outlined.Language,
                        contentDescription = "Language")
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Language",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "English",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W300)
                    Icon(
                        imageVector = Icons.Default.ChevronRight,
                        contentDescription = "greater than",
                        modifier = Modifier.alpha(0.7f)
                    )
                }
            }
            HorizontalDivider()
            Row(modifier = Modifier.fillMaxWidth().
            padding(horizontal = 10.dp, vertical = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(modifier = Modifier.alpha(.6f),
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = "Lock")
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Lock",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
                Icon(
                        imageVector = Icons.Default.ChevronRight,
                        contentDescription = "greater than",
                        modifier = Modifier.alpha(0.7f)
                    )

            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "PREFERENCES",
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black.copy(alpha = .5f),
            letterSpacing = 2.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        Card(

        ) {
            Row(modifier = Modifier.fillMaxWidth().
            padding(horizontal = 10.dp, vertical = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(modifier = Modifier.alpha(.6f),
                        imageVector = Icons.Outlined.Description,
                        contentDescription = "Terms and conditions")
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Terms of Service",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
                    Icon(
                        imageVector = Icons.Default.ChevronRight,
                        contentDescription = "greater than",
                        modifier = Modifier.alpha(0.7f)
                    )

            }
            HorizontalDivider()
            Row(modifier = Modifier.fillMaxWidth().
            padding(horizontal = 10.dp, vertical = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(modifier = Modifier.alpha(.6f),
                        imageVector = Icons.Outlined.Info,
                        contentDescription = "App version")
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "App Version",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
               Text(text = "V2.4.1",
                   fontSize = 16.sp,
                   fontWeight = FontWeight.W300)

            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFfae8e8)
            )
            ) {
            Row(Modifier
                .padding(horizontal = 10.dp, vertical = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)

            ) {
                Icon(imageVector = Icons.Outlined.Logout,
                    contentDescription = "Logout",
                    tint = Color.Red)
                Text(text = "Log Out",
                    color = Color.Red,
                    fontSize = 20.sp)
            }
        }
    }
}