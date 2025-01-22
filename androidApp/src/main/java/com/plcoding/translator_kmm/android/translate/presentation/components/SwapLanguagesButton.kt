package com.plcoding.translator_kmm.android.translate.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.plcoding.translator_kmm.android.R

@Composable
fun SwapLanguagesButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton (
        onClick = onClick,
        modifier = modifier
            .clip(CircleShape)
            .background(MaterialTheme.colors.primary)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.swap_languages),
            contentDescription = stringResource(R.string.swap_languages),
            tint = MaterialTheme.colors.onPrimary
        )
    }

}