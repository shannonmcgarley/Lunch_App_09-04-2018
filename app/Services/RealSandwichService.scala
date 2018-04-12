package Services

import com.google.inject.ImplementedBy
import models.Sandwich
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class RealSandwichService extends SandwichService{
  override def sandwiches() : Future[List[Sandwich]] = Future(List())

}

@ImplementedBy(classOf[RealSandwichService])
trait SandwichService{
  def sandwiches() : Future[List[Sandwich]]
}