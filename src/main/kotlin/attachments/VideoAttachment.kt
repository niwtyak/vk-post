package attachments

data class VideoAttachment(
    override val type: String = "Video",
    override val content: Video
) : Attachment