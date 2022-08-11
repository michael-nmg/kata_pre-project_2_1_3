package app.model;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
