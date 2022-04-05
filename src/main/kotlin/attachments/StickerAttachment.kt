package attachments

data class StickerAttachment(
    override val content: Sticker
) : Attachment {
    override val type: String = "Sticker"
}