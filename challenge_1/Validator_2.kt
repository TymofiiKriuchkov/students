
fun validateInputIsValidUrl(input : String) : Boolean {
    val URL_PATTERN = Pattern.compile("^(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?{0,100}$")
}
