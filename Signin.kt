package com.example.androiddev_formula.jetpack_compose_assignments.ui_practice_screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.RemoveRedEye
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevformula.R
import androidx.compose.ui.text.TextStyle

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SignIn() {
    var username by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }
    Column(modifier = Modifier.fillMaxSize()
        .padding(top = 40.dp, start = 30.dp, end = 30.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(70.dp)
                .clip(RoundedCornerShape(24.dp))
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
                imageVector = Icons.Default.Layers,
                contentDescription = "star",
                tint = Color.White,
                modifier = Modifier.size(33.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column() {
            Text(text = "Welcome back!",
                fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold)
            Text(text = "Sign in to your account to continue",
                fontSize = 18.sp,
                modifier = Modifier.alpha(.7f))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column() {
            Text(text = "EMAIL ADDRESS",
                fontWeight = FontWeight.Bold,
                letterSpacing = 2.sp,
            modifier = Modifier.alpha(.7f)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = username,
                onValueChange = {username = it},
                textStyle = TextStyle(fontSize =18.sp),
                placeholder = {Text(text = "Username", fontSize = 18.sp,
                    modifier = Modifier.alpha(.5f))},
                leadingIcon = {Icon(imageVector = Icons.Outlined.Email,
                    contentDescription = "email",
                    modifier = Modifier.alpha(.5f))},
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth()
                    .height(54.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF667de9),
                    focusedContainerColor = Color(0xFFf0f2ff),
                    focusedLeadingIconColor = Color(0xFF667de9),
                )
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "PASSWORD",
                fontWeight = FontWeight.Bold,
                letterSpacing = 2.sp,
                modifier = Modifier.alpha(.7f)
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = password,
                onValueChange = {password = it},
                placeholder = {Text(text = "Enter your password", fontSize = 18.sp,
                    modifier = Modifier.alpha(.5f))},
                leadingIcon = {Icon(imageVector = Icons.Outlined.Lock,
                    contentDescription = "email", modifier = Modifier.alpha(.5f))},
                    trailingIcon = {Icon(imageVector = Icons.Outlined.RemoveRedEye,
                        contentDescription = "show password",
                        modifier = Modifier.alpha(.5f))},
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.fillMaxWidth()
                    .height(54.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Box(modifier = Modifier.fillMaxWidth()
                .clickable(onClick = {}),
                contentAlignment = Alignment.BottomEnd
            ){
                Text(text = "Forgot password?",
                    color = Color(0xFF667de9),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.clickable(onClick = {})
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {},
                modifier = Modifier.fillMaxWidth()
                    .height(52.dp),
//                    .padding(horizontal = 5.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                contentColor = Color.White,
                )
            ) {
                Text(text = "Sign in",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(20.dp))
//            Row(
//                verticalAlignment = Alignment.CenterVertically)
//            {
//                HorizontalDivider(modifier = Modifier.fillMaxWidth(0.4f))
//                Text(text = "OR",
//                    modifier = Modifier.alpha(.5f).
//                padding(horizontal = 6.dp))
//                HorizontalDivider(modifier = Modifier.fillMaxWidth())
//            }
            Box(modifier = Modifier.fillMaxWidth()){
                HorizontalDivider(modifier = Modifier.fillMaxWidth(0.45f)
                    .align(Alignment.CenterStart))
              Text(text = "OR",
                   modifier = Modifier.alpha(.5f)
//                padding(horizontal = 6.dp)
                       .align(Alignment.TopCenter),
                  )
                HorizontalDivider(modifier = Modifier.fillMaxWidth(.45f)
                    .align(Alignment.CenterEnd))
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {},
                modifier = Modifier.fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFf5f5f5),
                    contentColor = Color.Black
                ),
                border = BorderStroke(width = 0.dp,color = Color.Black.copy(alpha = 0.3f),)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically)
                {
                    Image(
                        painter = painterResource(R.drawable.googlepng),
                        contentDescription = "googleicon",
                        modifier = Modifier.size(25.dp),
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Continue with Google",
                        fontSize = 17.sp
                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text(text = "Don't have an account?",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier.alpha(.5f))
                Text(text = " Sign up",
                    color = Color(0xFF667de9),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 16.sp,
                    modifier = Modifier.clickable(onClick = {})
                )
            }

        }
    }
}