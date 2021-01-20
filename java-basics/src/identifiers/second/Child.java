package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    // klasa potomna w innej paczce nie ma dostępu do pol/metod 'private' oraz 'default'

    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}
