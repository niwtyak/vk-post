package attachments

data class PhotoAttachment(override val type: String = "photo", val photo: Photo) : Attachment