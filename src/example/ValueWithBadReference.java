package example;

import org.immutables.value.Value;
import java.util.Optional;

@Value.Immutable
public abstract class ValueWithBadReference {
  @Value.Parameter
  public abstract Optional<ImmutableValueWithGenerics<?>> getSet();
}
