package attachments

data class AudioAttachment(
    override val content: Audio
) : Attachment{
    override val type: String = "Audio"
}