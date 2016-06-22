package nl.icode4living.devgames.ui.widget;

import java.util.Comparator;

import nl.icode4living.devgames.models.User;

/**
 * TODO: write class level documentation.
 *
 * @author Marcel
 * @since 22-6-2016.
 */
public class UserByNameComparator implements Comparator<User> {
    @Override
    public int compare(User lhs, User rhs) {
        return lhs.getUsername().compareToIgnoreCase(rhs.getUsername());
    }
}
