package attachments

data class FileAttachment(override val type: String = "file", val file: File) : Attachment

