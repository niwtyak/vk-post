package attachments

data class FileAttachment(
    override val type: String = "File",
    override val content: File
) : Attachment