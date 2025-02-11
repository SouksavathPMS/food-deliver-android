package com.kelineyt.foodhub_android.ui.auth

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kelineyt.foodhub_android.R
import com.kelineyt.foodhub_android.ui.auth.widget.GroupSocialButton
import com.kelineyt.foodhub_android.ui.auth.widget.OutlinedAuthPasswordField
import com.kelineyt.foodhub_android.ui.auth.widget.OutlinedAuthTextField
import com.kelineyt.foodhub_android.ui.common.MainButton
import com.kelineyt.foodhub_android.ui.theme.Orange
import kotlin.math.sign

@Composable
fun SignUpScreen() {
    val fullName = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.ic_auth_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 28.dp, horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(modifier = Modifier.weight(1f))
            Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.sign_up),
                    fontSize = 42.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            OutlinedAuthTextField(
                value = fullName.value,
                singleLine = true,
                onValueChange = {
                    fullName.value = it
                },
                label = {
                    Text(
                        text = stringResource(id = R.string.fullname),
                        color = Color.LightGray,
                        fontSize = 16.sp,
                    )
                },
            )
            Spacer(modifier = Modifier.height(28.dp))
            OutlinedAuthTextField(
                value = email.value,
                singleLine = true,
                onValueChange = {
                    email.value = it
                },
                label = {
                    Text(
                        text = stringResource(id = R.string.email),
                        color = Color.LightGray,
                        fontSize = 16.sp,
                    )
                },
            )
            Spacer(modifier = Modifier.height(28.dp))
            OutlinedAuthPasswordField(
                value = password.value,
                singleLine = true,
                onValueChange = {
                    password.value = it
                },
                label = {
                    Text(
                        text = stringResource(id = R.string.password),
                        color = Color.LightGray,
                        fontSize = 16.sp,
                    )
                },
            )
            Spacer(modifier = Modifier.height(28.dp))
            MainButton(text = stringResource(id = R.string.sign_up).uppercase())
            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 18.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = stringResource(id = R.string.already_have_account),
                    color = Color.Gray,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    modifier = Modifier.clickable {
                        // TODO Go to the login page
                    },
                    text = stringResource(id = R.string.login),
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Orange
                    )
                )

            }

            Spacer(modifier = Modifier.height(20.dp))
            GroupSocialButton(
                text = stringResource(id = R.string.sign_up_with),
                color = Color.Gray,
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}