import additionalClasses.*
import org.junit.Assert
import org.junit.Test

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
            Comment(0, true, true, true, true),
            Copyright(1, "link", "name", "type"),
            Likes(3, true, true, true),
            Reposts(0, false),
            Views(10),
            "post type",
            1,
            true,
            true,
            true,
            false,
            false,
            false,
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

}
