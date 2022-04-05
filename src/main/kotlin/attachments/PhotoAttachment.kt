package attachments

data class PhotoAttachment(
    override val type: String = "Photo",
    override val content: Photo
) : Attachment