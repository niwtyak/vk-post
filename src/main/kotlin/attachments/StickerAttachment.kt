package attachments

data class StickerAttachment(override val type: String = "sticker",    val sticker: Sticker) : Attachment