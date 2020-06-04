object Anagram {

  def isAnagram(x: String, y: String): Boolean = {
    //(x.toLowerCase.sorted == str.toLowerCase.sorted) && (x.toLowerCase != str.toLowerCase)
    if (x.toLowerCase == y.toLowerCase) false
    else {
      !((x.toLowerCase map (x => (x, 1))) ++
        (y.toLowerCase map (y => (y, -1))))
        .toList
        .groupBy(_._1)
        .mapValues(_.map(_._2).sum).exists(_._2 != 0)
    }
  }


  def findAnagrams(str: String, list: List[String]): List[String] = {
    list filter (x => isAnagram(x, str))
  }
}
