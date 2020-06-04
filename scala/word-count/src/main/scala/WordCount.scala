sealed class WordCount private (str: String){
  def countWords(): Map[String, Int] = {

    str.replaceAll("[^a-zA-Z0-9']", " ").trim.
      split("\\s+'*|'*\\s+").map(word => (word.toLowerCase(), 1)).groupBy(_._1).mapValues(_.length)
  }

}
object WordCount {
  def apply(str: String): WordCount = new WordCount(str)

}