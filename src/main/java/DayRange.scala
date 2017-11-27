
import org.joda.time.{Days, LocalDate}

object DayRange {
  def main(args: Array[String]): Unit = {

    val from = new LocalDate("2017-01-01")
    val until = new LocalDate("2017-02-16")
    import java.text.SimpleDateFormat
    val sdf = new SimpleDateFormat("yyyyMMdd")
    val numberOfDays = Days.daysBetween(from, until).getDays()
    for (f <- 0 to numberOfDays) {
      var date = from.plusDays(f).toDate()
      println(sdf.format(date))
      //yield from.plusDays(f)
    }

  }

}
