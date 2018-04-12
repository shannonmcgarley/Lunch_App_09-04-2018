package Services

import com.google.inject.ImplementedBy
import models.Sandwich
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class RealSandwichService extends SandwichService{
  override def sandwiches() : Future[List[Sandwich]] = Future(List(Sandwich("Ham", 1.55, "Very tasty"), Sandwich("Cheese", 2.55, "Cheese tastic"), Sandwich("Egg", 1.15, "Fresh")))

}

@ImplementedBy(classOf[RealSandwichService])
trait SandwichService{
  def sandwiches() : Future[List[Sandwich]]
}