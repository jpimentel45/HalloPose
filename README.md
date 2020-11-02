# HalloPose
Android Canary project: practice for Jetpack Compose
const val SERVER_TIME_STAMP = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"

fun String.convertToSimpleDate(
    startPattern: String = SERVER_TIME_STAMP,
    endPattern: String
) = SimpleDateFormat(startPattern, Locale.ENGLISH).parse(this)?.let {
    SimpleDateFormat(endPattern, Locale.ENGLISH).format(it)
}
