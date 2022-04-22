package attachments

data class VideoAttachment(override val type: String = "video", val video: Video) : Attachment
