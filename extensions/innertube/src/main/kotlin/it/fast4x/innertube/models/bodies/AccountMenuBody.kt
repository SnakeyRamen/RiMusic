package it.fast4x.innertube.models.bodies

import it.fast4x.innertube.models.Context
import it.fast4x.innertube.models.YouTubeContext
import kotlinx.serialization.Serializable

@Serializable
data class AccountMenuBody(
    val context: Context,
    val deviceTheme: String = "DEVICE_THEME_SELECTED",
    val userInterfaceTheme: String = "USER_INTERFACE_THEME_DARK",
)
