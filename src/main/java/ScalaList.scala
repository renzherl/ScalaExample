import scala.collection.mutable

/**
  * Created by mi on 2017/9/20.
  */
case class MatrixInterest(
                           id: String,
                           idType: Byte,
                           interestAutomotiveLevel: Byte,
                           interestBeautybodycareLevel: Byte,
                           interestBookLevel: Byte,
                           interestEducationLevel: Byte,
                           interestShowLevel: Byte,
                           interestFoodLevel: Byte,
                           interestGameLevel: Byte,
                           interestLifeserviceLevel: Byte,
                           interestPhotographerLevel: Byte,
                           interestClothingLevel: Byte,
                           interestTravelLevel: Byte,
                           interestVideoLevel: Byte,
                           interestHouseLevel: Byte,
                           interestMovieLevel: Byte,
                           interestDatingLevel: Byte,
                           interestMedicalcareLevel: Byte,
                           interestNewsLevel: Byte,
                           interestSportLevel: Byte,
                           interestBabyLevel: Byte,
                           interestMusicLevel: Byte,
                           interestGameGunbattleLevel: Byte,
                           interestGameKidssmartLevel: Byte,
                           interestGameLeisureideasLevel: Byte,
                           interestGameChessLevel: Byte,
                           interestGameMeleeLevel: Byte,
                           interestGameOnlinerpgLevel: Byte,
                           interestGameParkourLevel: Byte,
                           interestGameRacingsportsLevel: Byte,
                           interestGameSimLevel: Byte,
                           interestGameTdLevel: Byte,
                           interestGameToonshootersLevel: Byte,
                           interestGameWarstrategyLevel: Byte
                         )

object ScalaList {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    //sorted List
    val a = List("2", "3", "1", "7", "-1", "中国", "安第斯山脉", "中国", "安第斯山脉")
    var values = "";
    for (lv <- a.sorted) {
      values = values + lv + ";";
    }
    println(values)

    //methods call
    val myNumbers = List(1, 2, 3, 4, 5)
    myNumbers.map(x => cube(x)).foreach(println)
    myNumbers.map(x => factorial(x)).foreach(println)

    //mutable map
    val countsMap = new mutable.HashMap[String, Int].withDefaultValue(0)
    a.foreach(word => countsMap(word) += 1)
    countsMap.foreach(println)


  }

  def cube(n: Int): Int = {
    n * n * n
  }

  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }

}
