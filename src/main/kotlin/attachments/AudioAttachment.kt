package attachments

data class AudioAttachment(
    override val type: String = "Audio",
    override val content: Audio
) : Attachment