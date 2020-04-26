package theme.patterns.structural.proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProxyTest {
    private static PersonBeanProxy personBeanProxy;
    private PersonBean owner;
    private PersonBean nonOwner;

    @BeforeClass
    public static void beforeClass() {
        personBeanProxy = new PersonBeanProxy();
    }

    @Before
    public void before() {
        owner = new PersonBeanImpl();
        owner.setName("AntoN");
        owner.setGender("mM");
        owner.setInterests("games, money, fum");
        owner.setHotOrNotRating(9);

        nonOwner = new PersonBeanImpl();
        nonOwner.setName("Helen");
        nonOwner.setGender("w");
        nonOwner.setInterests("try to take all 'm' money");
        nonOwner.setHotOrNotRating(8);
    }

    @Test(expected = Exception.class)
    public void testOwnerPersonBean() {
        PersonBean ownerProxyPerson = personBeanProxy.getOwnerPerson(owner);
        ownerProxyPerson.setName("Anton");
        ownerProxyPerson.setGender("m");
        ownerProxyPerson.setInterests("games, money, fun");
        Assert.assertEquals("Anton", ownerProxyPerson.getName());
        Assert.assertEquals("m", ownerProxyPerson.getGender());
        Assert.assertEquals("games, money, fun", ownerProxyPerson.getInterests());
        Assert.assertEquals(9, ownerProxyPerson.getHotOrNotRating());
        ownerProxyPerson.setHotOrNotRating(10);
    }

    @Test(expected = Exception.class)
    public void testNonOwnerPersonBean() {
        PersonBean nonOwnerProxyPerson = personBeanProxy.getNonOwnerPerson(nonOwner);
        Assert.assertEquals("Helen", nonOwnerProxyPerson.getName());
        Assert.assertEquals("w", nonOwnerProxyPerson.getGender());
        Assert.assertEquals("try to take all 'm' money", nonOwnerProxyPerson.getInterests());
        Assert.assertEquals(8, nonOwnerProxyPerson.getHotOrNotRating());
        nonOwnerProxyPerson.setHotOrNotRating(10);
        Assert.assertEquals(9, nonOwnerProxyPerson.getHotOrNotRating());
        nonOwnerProxyPerson.setName("Try to change another person's name");
    }

}
