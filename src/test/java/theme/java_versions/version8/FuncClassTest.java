package theme.java_versions.version8;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FuncClassTest {

    @Test
    public void testOptional() {
        Optional<String> str = Optional.ofNullable("str");
        Assert.assertEquals("str", str.orElse(""));
    }

    @Test
    public void testFunction() {
        Function<String, Integer> func = Integer::valueOf;
        Integer intVal = 12;
        Assert.assertEquals(intVal, func.apply("12"));
    }

    @Test
    public void testBiFunc() {
        BiFunction<Integer, Long, String> biFunc = (i, l) -> String.valueOf((i + l));
        Assert.assertEquals("15", biFunc.apply(5, 10L));
    }

    @Test
    public void testPredicate() {
        Predicate<String> pred = (s) -> s.length() > 3;
        Assert.assertTrue(pred.test("Anton"));
        Assert.assertFalse(pred.test("An"));
    }

    @Test
    public void testStream() {
        Stream<String> stream = List.of("one", "two", "three", "four").stream();
        Assert.assertEquals(2, stream.filter(s -> s.length() > 3).count());
    }
}
