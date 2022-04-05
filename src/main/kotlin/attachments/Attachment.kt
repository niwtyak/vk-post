package attachments

sealed interface Attachment {
    val type: String
    val content: Any
}
