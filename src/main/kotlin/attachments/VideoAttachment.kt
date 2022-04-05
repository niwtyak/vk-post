package attachments

data class VideoAttachment(
    override val content: Video
) : Attachment {
    override val type: String = "Video"
}