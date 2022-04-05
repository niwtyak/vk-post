package attachments

data class FileAttachment(
    override val content: File
) : Attachment{
    override val type: String = "File"
}