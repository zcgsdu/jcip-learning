package net.jcip.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GuardedBy
{
  String value();
}


/* Location:              E:\jcip-annotations.jar!\net\jcip\annotations\GuardedBy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */