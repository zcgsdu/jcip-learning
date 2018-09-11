package net.jcip.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({java.lang.annotation.ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ThreadSafe {}


/* Location:              E:\jcip-annotations.jar!\net\jcip\annotations\ThreadSafe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */