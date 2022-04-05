package attachments

data class PhotoAttachment(
    override val content: Photo
) : Attachment{
    override val type: String = "Photo"
}