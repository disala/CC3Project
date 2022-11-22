package lk.gov.statistics.cc3.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import lk.gov.statistics.cc3.R

@Composable
fun LoginPage() {

    Box(contentAlignment = Alignment.Center) {

        val userName = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.cc3logo),
                contentDescription = "CC3 Logo",
                modifier = Modifier.clip(RoundedCornerShape(90.dp))
            )

            Spacer(modifier = Modifier.padding(10.dp))

            TextField(
                value = userName.value,
                onValueChange = { userName.value = it },
                label = { Text(text = "Username") })

            Spacer(modifier = Modifier.padding(10.dp))

            TextField(
                value = password.value,
                onValueChange = { password.value = it },
                label = { Text(text = "Password") },
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.padding(10.dp))

            Button(
                onClick = { },
            ) {
                Text(text = "Login")
            }

        }

    }


}