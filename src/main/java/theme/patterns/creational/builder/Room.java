package theme.patterns.creational.builder;

public class Room {
    private String chair;
    private String bed;
    private String table;
    private String lamp;

    private Room() {
    }

    public static RoomBuilder newBuilder() {
        return new Room().new RoomBuilder();
    }

    public class RoomBuilder {
        private RoomBuilder() {
        }

        public RoomBuilder setChair(String chair) {
            Room.this.chair = chair;
            return this;
        }
        public RoomBuilder setBed(String bed) {
            Room.this.bed = bed;
            return this;
        }
        public RoomBuilder setTable(String table) {
            Room.this.table = table;
            return this;
        }
        public RoomBuilder setLamp(String lamp) {
            Room.this.lamp = lamp;
            return this;
        }

        public Room build() {
            return Room.this;
        }
    }

    public String getChair() {
        return chair;
    }

    public String getBed() {
        return bed;
    }

    public String getTable() {
        return table;
    }

    public String getLamp() {
        return lamp;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", chair, bed, table, lamp);
    }
}
