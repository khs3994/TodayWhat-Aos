package khs.onmi.setting.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import khs.onmi.core.designsystem.component.TopNavigationBar
import khs.onmi.core.designsystem.icon.ArrowBackIcon
import khs.onmi.core.designsystem.icon.PaperIcon
import khs.onmi.core.designsystem.icon.RightArrowIcon
import khs.onmi.core.designsystem.theme.ONMITheme
import khs.onmi.core.designsystem.utils.WrappedIconButton
import khs.onmi.setting.component.RoundedWhiteBox
import khs.onmi.setting.component.SettingListComponent
import khs.onmi.setting.model.SettingItemsData
import khs.onmi.setting.util.WebLink

@Composable
fun MainScreen(
    onBackPressed: () -> Unit,
) {
    val uriHandler = LocalUriHandler.current

    ONMITheme { color, typography ->
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = color.BackgroundSecondary,
            topBar = {
                TopNavigationBar(
                    leading = {
                        WrappedIconButton(onClick = onBackPressed) {
                            ArrowBackIcon(tint = color.Black)
                        }
                    }
                )
            },
        ) {
            Column(
                modifier = Modifier.padding(
                    top = it.calculateTopPadding().value.dp,
                    start = 15.dp,
                    end = 15.dp
                )
            ) {
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "설정",
                    style = typography.Headline1,
                    color = color.Black
                )
                Spacer(modifier = Modifier.height(12.dp))
                RoundedWhiteBox {
                    SettingListComponent(
                        items = listOf(
                            SettingItemsData(
                                trailing = { RightArrowIcon(tint = color.UnselectedPrimary) },
                                text = "이용 약관",
                                leading = { PaperIcon(tint = color.Black) },
                                onClick = { uriHandler.openUri(WebLink.PolicyUrl) }
                            )
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPre() {
    MainScreen {}
}