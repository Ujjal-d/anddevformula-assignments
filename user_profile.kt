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
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Cake
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun UserProfile () {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(20.dp)

    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "My Profile",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                imageVector = Icons.Outlined.Settings,
                contentDescription = "settings",
                modifier = Modifier.padding(10.dp,)
                    .background(Color.LightGray, shape = RoundedCornerShape(10.dp))
                    .padding(10.dp)
                    .alpha(0.7f)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(100.dp)
                    .clip(CircleShape)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF6874dd),
                                Color(0xFF7255b0)

                            )
                        )
                    )
            ) {
                Text(
                    text = "A",
                    color = Color.White,
                    fontSize = 36.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Arjun Mehta",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "arjun.mehta@email.com",
                fontWeight = FontWeight.Light,
                fontSize = 15.sp
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black
                )
            ) {
                Text(text = "Edit Profile",
                    fontSize = 16.sp)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        HorizontalDivider()
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(15.dp),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "24",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "POSTS",
                        fontWeight = FontWeight.Light
                    )
                }
                VerticalDivider(modifier = Modifier.height(45.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "1.2k",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "FOLLOWERS",
                        fontWeight = FontWeight.Light
                    )
                }
                VerticalDivider(modifier = Modifier.height(45.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "340",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "FOLLOWING",
                        fontWeight = FontWeight.Light
                    )
                }
                VerticalDivider(modifier = Modifier.height(45.dp))
            }
        }
        HorizontalDivider()
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "PERSONAL INFO",
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black.copy(alpha = .5f),
            letterSpacing = 2.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Phone,
                        contentDescription = "phone",
                        modifier = Modifier
                            .background(Color.LightGray, shape = RoundedCornerShape(10.dp))
                            .padding(10.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Column() {
                        Text(
                            text = "Location",
                            color = Color.Black.copy(alpha = .5f)
                        )
                        Text(
                            text = "Mumbai, India",
                            fontWeight = FontWeight.Bold,
                            fontSize = 19.sp
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = "greater than",
                    modifier = Modifier.alpha(0.7f)
                )
            }
            HorizontalDivider()
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        imageVector = Icons.Outlined.LocationOn,
                        contentDescription = "phone",
                        modifier = Modifier
                            .background(Color.LightGray, shape = RoundedCornerShape(10.dp))
                            .padding(10.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Column() {
                        Text(
                            text = "Phone",
                            color = Color.Black.copy(alpha = .5f)
                        )
                        Text(
                            text = "+91 98765 43210",
                            fontWeight = FontWeight.Bold,
                            fontSize = 19.sp
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = "greater than",
                    modifier = Modifier.alpha(0.7f)
                )
            }
            HorizontalDivider()
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Cake,
                        contentDescription = "phone",
                        modifier = Modifier
                            .background(Color.LightGray, shape = RoundedCornerShape(10.dp))
                            .padding(10.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Column() {
                        Text(
                            text = "Birthday",
                            color = Color.Black.copy(alpha = .5f)
                        )
                        Text(
                            text = "March 13, 1999",
                            fontWeight = FontWeight.Bold,
                            fontSize = 19.sp
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = "greater than",
                    modifier = Modifier.alpha(0.7f)
                )
            }
        }
        Spacer(modifier = Modifier.height(29.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(30.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row() {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.size(60.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(
                                        Color(0xFF6874dd),
                                        Color(0xFF7255b0)
                                    )
                                )
                            )
                    ) {

                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "star",
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Text(text = "Upgrade to Pro",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold)
                        Text(text="Unlock all premium\nfeatures")
                    }
                }
                Text(text = "PRO",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White,
                    modifier = Modifier
                        .background(Color(0xFF6874dd),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .padding(horizontal = 10.dp, vertical = 4.dp)
                    )

            }
        }
    }
}