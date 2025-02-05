package com.kelineyt.foodhub_android.ui.auth

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.IntState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kelineyt.foodhub_android.R
import com.kelineyt.foodhub_android.ui.theme.Orange


@Composable
fun AuthScreen() {
    val imageSize = remember {
        mutableStateOf(IntSize.Zero)
    }

    val brush = Brush.verticalGradient(
        colors = listOf(
            Color.Transparent,
            Color.Black
        ),
        startY = imageSize.value.height.toFloat() / 3
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(R.drawable.auth_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .onGloballyPositioned {
                    imageSize.value = it.size
                }
                .alpha(0.9f)
        )
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(brush = brush)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 20.dp, horizontal = 16.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text(text = stringResource(id = R.string.skip), color = Orange)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 120.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.welcome_to),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = stringResource(id = R.string.food_hub),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Orange,
                )
                Text(
                    modifier = Modifier.padding(vertical = 10.dp),
                    text = stringResource(id = R.string.food_hub_des),
                    fontSize = 20.sp,
                    color = Color.DarkGray,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomEnd),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(1.dp)
                            .background(Color.White.copy(alpha = .8f))
                    )
                    Text(
                        text = stringResource(id = R.string.sign_in_with),
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 16.dp),
                        fontWeight = FontWeight.Bold,
                    )
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(1.dp)
                            .background(Color.White.copy(alpha = .8f))
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.SpaceBetween // Add this line
                ) {
                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        onClick = {

                        },
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(R.drawable.ic_facebook),
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = stringResource(R.string.facebook).uppercase(),
                                color = Color.Black,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }

                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        onClick = {

                        },
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(R.drawable.ic_google),
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = stringResource(R.string.google).uppercase(),
                                color = Color.Black,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }
                }
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 18.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White.copy(alpha = .2f)),
                    border = BorderStroke(width = 1.dp, color = Color.White)
                ) {
                    Text(
                        modifier = Modifier.padding(6.dp),
                        text = stringResource(R.string.start_with_email_or_phone),
                        fontSize = 16.sp,
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 18.dp),
                    horizontalArrangement = Arrangement.Center // Align text in center
                ) {
                    Text(
                        text = stringResource(id = R.string.already_have_account),
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        modifier = Modifier.clickable {
                            // TODO Go to the sign in page
                        },
                        text = stringResource(id = R.string.sign_in),
                        fontWeight = FontWeight.Medium,
                        style = TextStyle(
                            fontSize = 16.sp,
                            textDecoration = TextDecoration.Underline,
                            color = Color.White
                        )
                    )

                }
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun AuthScreenPreview() {
    AuthScreen()
}
