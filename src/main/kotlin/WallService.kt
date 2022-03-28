object WallService {
    private var posts = emptyArray<Post>()
    private var globalId = 1

    fun add(post: Post): Post {
        posts += post.copy(id = globalId++)
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
}
