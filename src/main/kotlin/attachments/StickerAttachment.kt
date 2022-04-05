package attachments

data class StickerAttachment(
    override val type: String = "Sticker",
    override val content: Sticker
) : Attachment