val x = "lomna"
val y = "lomna"
// val occurX = x.toLowerCase.toList groupBy ((c: Char) => c)
//((x.toLowerCase groupBy (identity) mapValues(_.size)).toList ++
//(x.toLowerCase groupBy (identity) mapValues(-_.size)).toList)
//  .groupBy(_._1)
//  .mapValues()


!((x.toLowerCase map (x => (x, 1))) ++
  (y.toLowerCase map (y => (y, -1))))
  .toList
  .groupBy(_._1)
  .mapValues(_.map(_._2).sum).exists(_._2 != 0)

