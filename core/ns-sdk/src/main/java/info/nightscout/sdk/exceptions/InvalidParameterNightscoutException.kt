package info.nightscout.sdk.exceptions

@Suppress("unused")
class InvalidParameterNightscoutException : NightscoutException {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
    constructor(cause: Throwable?) : super(cause)
}
