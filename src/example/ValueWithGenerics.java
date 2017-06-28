package example;

import org.immutables.value.Value;
import java.util.Optional;

@Value.Immutable
public abstract class ValueWithGenerics<T> {
  @Value.Parameter
  public abstract Optional<T> getOptional();
}
