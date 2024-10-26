package br.com.vinibelo.cashflow.login.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.vinibelo.cashflow.ui.theme.CashFlowTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    email: String,
    password: String
) {
    Scaffold (
        modifier = modifier
    ) { paddingValues ->
        val modifierWithPadding = Modifier.padding(paddingValues)
        Column (
            modifier = modifierWithPadding
                .padding(all = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon (
                    imageVector = Icons.Filled.Email,
                    contentDescription = ""
                )
                TextField (
                    modifier = modifierWithPadding,
                    value = email,
                    onValueChange = {}
                )
            }
            Row (
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon (
                    imageVector = Icons.Filled.Lock,
                    contentDescription = ""
                )
                TextField (
                    modifier = modifierWithPadding,
                    visualTransformation = PasswordVisualTransformation(),
                    value = password,
                    onValueChange = {}
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview () {
    CashFlowTheme {
        LoginScreen(
            email = "test@test.com",
            password = "testPassword123"
        )
    }
}