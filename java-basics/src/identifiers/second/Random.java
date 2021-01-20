package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa w innej paczce nie ma dostępu do pol/metod 'private' oraz 'default' oraz 'protected'

    public void testIdentifier() {

        Parent parent = new Parent();
        System.out.println(parent.first);
        parent.firstMethod();
    }
}
