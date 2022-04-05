import additionalClasses.*
import attachments.*
import org.junit.Assert
import org.junit.Test
import java.lang.RuntimeException

class MainKtTest {

    private val newPost =
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
            arrayOf(
                AudioAttachment(Audio(1, 1, "artist", "title", 10, "url", 1, 1, 1, 111020, null, false)),
                VideoAttachment(Video(2, 1, "title", "text", 100, 111020, 300, "player", 1024, 1280, false)),
                PhotoAttachment(Photo(3, 1, 1, 1, "text", 111020, 1024, 1280)),
                StickerAttachment(Sticker(1, 4, "url", 123, 123, "animationUrl", true)),
                FileAttachment(File(5, 1, "title", 123, "doc", "url", 111020, 0))
            ),
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

    @org.junit.After
    fun tearDown() {
        WallService.clear()
    }


    @Test
    fun add() {
        WallService.add(newPost)
        Assert.assertNotEquals(WallService.getGlobalId(), 0)
    }

    @Test
    fun updateExistingPost() {
        WallService.add(newPost)
        Assert.assertTrue(WallService.update(newPost.copy(id = 1, text = "updated text")))
    }

    @Test
    fun updateNotExistingPost() {
        WallService.add(newPost)
        Assert.assertFalse(WallService.update(newPost.copy(id = 0, text = "updated text")))
    }

    @Test()
    fun createCommentToExistingPost() {
        WallService.add(newPost)
        Assert.assertTrue(WallService.createComment(WallComment(1, 1, 1, "comment", null)))
    }

    @Test(expected = WallService.PostNotFoundException::class)
    fun createCommentToNotExistingPost() {
        WallService.add(newPost)
        WallService.createComment(WallComment(1, 1, 2, "comment", null))
    }

}
