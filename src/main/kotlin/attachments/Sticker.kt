package attachments

data class Sticker(
    val productId: Int,
    val stickerId: Int,
    val url: String,
    val height: Int,
    val width: Int,
    val animationUrl: String,
    val isAllowed: Boolean
)
