package khs.onmi.core.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import khs.onmi.core.designsystem.component.ColumnSpacer
import khs.onmi.core.designsystem.component.ONMITextField
import khs.onmi.core.designsystem.theme.ONMITheme

@Composable
fun LabelTextFiled(
    modifier: Modifier = Modifier,
    label: String,
    value: String,
    onValueChange: (String) -> Unit = {},
    placeHolderText: String,
    isReadOnly: Boolean = false,
    focusRequester: FocusRequester = FocusRequester(),
    onClick: () -> Unit = {},
    onTrailingIconClick: () -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
) {
    ONMITheme { color, typography ->
        Column {
            Text(
                text = label,
                style = typography.Body2,
                color = color.TextPrimary
            )
            ColumnSpacer(dp = 8.dp)
            ONMITextField(
                modifier = modifier,
                value = value,
                placeHolderText = placeHolderText,
                onValueChange = onValueChange,
                isReadOnly = isReadOnly,
                onTrailingIconClick = onTrailingIconClick,
                focusRequester = focusRequester,
                onClick = onClick,
                keyboardType = keyboardType,
                imeAction = imeAction,
                keyboardActions = keyboardActions
            )
        }
    }
}