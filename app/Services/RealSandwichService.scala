package Services

import com.google.inject.ImplementedBy
import models.Sandwich

class RealSandwichService extends SandwichService{
  override def sandwiches() : List[Sandwich] = List(Sandwich("ham",1.55,"Very tasty"), Sandwich("Cheese", 2.55, "Cheese tastic"), Sandwich("Egg", 1.15, "Fresh"))

}

@ImplementedBy(classOf[RealSandwichService])
trait SandwichService{
  def sandwiches() : List[Sandwich]
}