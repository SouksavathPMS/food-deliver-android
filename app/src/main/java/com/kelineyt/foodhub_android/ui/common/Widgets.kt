package com.kelineyt.foodhub_android.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kelineyt.foodhub_android.ui.theme.Orange

@Composable
fun MainButton(
    text: String,
    color: Color = Orange,
    titleColor: Color = Color.White,
    onPressed: (() -> Unit)? = null,
    prefixIcon: Int? = null
) {
    Button(
        modifier = Modifier
            .width(248.dp)
            .height(58.dp),
        colors = ButtonDefaults.buttonColors(containerColor = color),
        shape = RoundedCornerShape(100.dp),
        onClick = {
            onPressed?.invoke()
        }
    ) {
        Row(
            modifier = Modifier.padding(vertical = 2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            prefixIcon?.let { iconRes ->
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(id = iconRes),
                    contentDescription = null
                )
            }
            Text(
                text = text,
                color = titleColor,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainButtonPreview() {
    MainButton(text = "TEST")
}


