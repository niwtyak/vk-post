import additionalClasses.*

fun main(){
    val newPost =
        Post(
            0,
            1,
            1,
            1,
            290322,
            "new post",
            0,
            0,
            false,
            Comment(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
            Copyright(1, "link", "name", "type"),
            Likes(3, userLikes = true, canLike = true, canPublish = true),
            Reposts(0, false),
            Views(10),
            "post type",
            PostSource("vk", null, "likes", "url"),
            Geo("sity", "123.123.213", Place()),
            1,
            null,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            Donut(false, 0, Placeholder(), true, "edit mode"),
            0
        )
    println(newPost)
}