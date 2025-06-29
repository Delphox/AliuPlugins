package me.aniimalz.plugins

import android.text.format.DateFormat
import com.aliucord.Utils
import java.text.SimpleDateFormat
import java.util.*

const val apiUrl = "https://timezonedb.catvibers.me"

fun calculateTime(timezone: String?): String {
    val tz = TimeZone.getTimeZone("$timezone")
    val cal = Calendar.getInstance(tz)

    val dateFormat = if (DateFormat.is24HourFormat(Utils.appContext)) {
        SimpleDateFormat("HH:mm", Locale.getDefault())
    } else {
        SimpleDateFormat("hh:mm a", Locale.getDefault())
    }

    dateFormat.timeZone = tz
    return dateFormat.format(cal.time)
}

fun formatTimeText(timezone: String?): String {
    return "${calculateTime(timezone)} (${timezone})"
}

val timezones = arrayOf(
    "GMT",
    "America/New_York",
    "America/Chicago",
    "America/Denver",
    "America/Los_Angeles",
    "America/Toronto",
    "America/Vancouver",
    "America/Mexico_City",
    "America/Sao_Paulo",
    "America/Buenos_Aires",
    "America/Lima",
    "America/Bogota",
    "America/Caracas",
    "America/Santiago",
    "America/Asuncion",
    "Europe/London",
    "Europe/Paris",
    "Europe/Berlin",
    "Europe/Rome",
    "Europe/Madrid",
    "Europe/Amsterdam",
    "Europe/Stockholm",
    "Europe/Athens",
    "Europe/Warsaw",
    "Europe/Istanbul",
    "Europe/Moscow",
    "Europe/Kyiv",
    "Asia/Dubai",
    "Asia/Riyadh",
    "Asia/Tehran",
    "Asia/Jerusalem",
    "Asia/Baghdad",
    "Asia/Kuwait",
    "Asia/Qatar",
    "Asia/Nicosia",
    "Africa/Tripoli",
    "Africa/Tunis",
    "Africa/Khartoum",
    "Africa/Cairo",
    "Africa/Casablanca",
    "Africa/Nairobi",
    "Africa/Johannesburg",
    "Africa/Lagos",
    "Asia/Kolkata",
    "Asia/Dhaka",
    "Asia/Karachi",
    "Asia/Kathmandu",
    "Asia/Bangkok",
    "Asia/Jakarta",
    "Asia/Singapore",
    "Asia/Kuala_Lumpur",
    "Asia/Shanghai",
    "Asia/Taipei",
    "Asia/Seoul",
    "Asia/Tokyo",
    "Asia/Manila",
    "Asia/Hong_Kong",
    "Australia/Sydney",
    "Australia/Melbourne",
    "Australia/Brisbane",
    "Pacific/Auckland",
    "Pacific/Fiji",
    "Pacific/Honolulu",
    "America/Anchorage",
    "Asia/Almaty",
    "Asia/Tashkent",
    "Asia/Yangon",
    "Asia/Vladivostok",
    "Asia/Macau",
    "Indian/Maldives",
    "Pacific/Port_Moresby",
)