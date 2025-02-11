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
import com.kelineyt.foodhub_android.ui.auth.widget.GroupSocialButton
import com.kelineyt.foodhub_android.ui.theme.DarkBlue
import com.kelineyt.foodhub_android.ui.theme.Orange


@Composable
fun AuthScreen() {
    val imageSize = remember {
        mutableStateOf(IntSize.Zero)
    }

    val brush = Brush.verticalGradient(
        colors = listOf(
            Color.Transparent,
            DarkBlue
        ),
        startY = imageSize.value.height.toFloat() / 6
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
                .padding(vertical = 28.dp, horizontal = 16.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
                    .padding(top = 36.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text(text = stringResource(id = R.string.skip), color = Orange)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 130.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.welcome_to),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = stringResource(id = R.string.food_hub),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Orange,
                )
                Text(
                    modifier = Modifier.padding(vertical = 10.dp),
                    text = stringResource(id = R.string.food_hub_des),
                    fontSize = 18.sp,
                    color = Color.DarkGray,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomEnd),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GroupSocialButton()
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
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
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
