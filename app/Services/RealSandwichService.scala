package Services

import com.google.inject.ImplementedBy
import models.Sandwich

class RealSandwichService extends SandwichService{
  override def sandwiches() : List[Sandwich] = List()

}

@ImplementedBy(classOf[RealSandwichService])
trait SandwichService{
  def sandwiches() : List[Sandwich]
}