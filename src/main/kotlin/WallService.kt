
import additionalClasses.WallComment

object WallService {
    private var globalId = 0
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<WallComment>()

    fun add(post: Post): Post {
        posts += post.copy(id = ++globalId)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, oldPost) in posts.withIndex()) {
            if (oldPost.id == post.id) {
                posts[index] = post.copy(
                    ownerId = oldPost.ownerId,
                    date = oldPost.date
                )
                return true
            }
        }
        return false
    }

    fun getGlobalId() = globalId

    fun clear() {
        posts = emptyArray()
        globalId = 0
    }

    class PostNotFoundException(override val message: String?) : RuntimeException(message)

    fun createComment(comment: WallComment):Boolean {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException("Post not found")
    }
}
