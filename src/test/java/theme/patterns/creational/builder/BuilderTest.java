package theme.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void testRoomBuilder() {
        Room room = Room.newBuilder()
                .setChair("good chair")
                .setBed("good bed")
                .setTable("good table")
                .setLamp("good lamp")
                .build();
        Assert.assertEquals("good chair good bed good table good lamp", room.toString());
    }
}
