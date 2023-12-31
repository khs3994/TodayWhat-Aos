package khs.onmi.core.designsystem.modifier

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.unit.Dp
import khs.onmi.core.designsystem.utils.runIf

@OptIn(ExperimentalFoundationApi::class)
fun Modifier.onmiClickable(
    rippleEnabled: Boolean = true,
    bounded: Boolean = true,
    radius: Dp = Dp.Unspecified,
    onClick: (() -> Unit)? = null,
) = runIf(onClick != null) {
    composed {
        combinedClickable(
            onClick = onClick!!,
            interactionSource = remember { MutableInteractionSource() },
            indication = if (rippleEnabled) rememberRipple(
                bounded = bounded,
                radius = radius
            ) else null
        )
    }
}