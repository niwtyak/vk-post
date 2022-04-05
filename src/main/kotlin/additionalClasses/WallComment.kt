package additionalClasses

import attachments.Attachment

data class WallComment(
    val id: Int,
    val fromId: Int,
    val postId: Int,
    val text: String,
    val array: Array<Attachment>?
)
