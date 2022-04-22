import additionalClasses.*
import attachments.*

fun main() {

     println(  listOf(
         AudioAttachment(audio = Audio(1, 1, "artist", "title", 10, "url", 1, 1, 1, 111020, null, false)),
         VideoAttachment(video = Video(2, 1, "title", "text", 100, 111020, 300, "player", 1024, 1280, false)),
         PhotoAttachment(photo = Photo(3, 1, 1, 1, "text", 111020, 1024, 1280)),
         StickerAttachment(sticker = Sticker(1, 4, "url", 123, 123, "animationUrl", true)),
         FileAttachment(file = File(5, 1, "title", 123, "doc", "url", 111020, 0))
     ))

}