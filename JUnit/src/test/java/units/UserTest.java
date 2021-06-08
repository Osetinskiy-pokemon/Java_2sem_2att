package units;

import entity.Sex;
import entity.User;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private User user;
    private User user1;
    private User user2;

    @Before
    public void setUp() throws Exception {
        user = new User("Евгений", 35, Sex.MALE);
        user1 = new User("Марина", 34, Sex.FEMALE);
        user2 = new User("Алина", 7, Sex.FEMALE);
    }

    @Test
    public void getAllUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);
        List<User> actual = User.getAllUsers();

        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAllAgeUsers_MALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getAllAgeUsers(Sex.MALE);

        int actual = 35;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_FEMALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getAllAgeUsers(Sex.FEMALE);

        int actual = 34 + 7;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getHowManyUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestGetHowManyUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected= User.getHowManyUsers(Sex.MALE);
        int expected1 = User.getHowManyUsers(Sex.FEMALE);

        int actual = 1;
        int actual1 = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_MALE() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_MALE_NO_NULL() {
        //с проверкой на NULL
        List<User> expected = User.getAllUsers(Sex.MALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_FEMALE() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

}