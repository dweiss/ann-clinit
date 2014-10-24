
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ FIELD, PARAMETER, METHOD, TYPE })
@Retention(RUNTIME) 
public @interface Ann {
  public static String FOO = new String("Foo");
}