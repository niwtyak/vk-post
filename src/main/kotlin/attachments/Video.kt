package attachments

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val addingDate: Int,
    val views: Int,
    val player: String,
    val width: Int,
    val height: Int,
    val repeat: Boolean?,
)
