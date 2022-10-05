package lab_9;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;

    }
    protected Animal(Integer speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static class Builder
    {
        private String name;
        private int speed;
        private boolean flyable;

        public Builder() {
        }

        public Builder(String name, int speed, boolean flyable) {
            this.name = name;
            this.speed = speed;
            this.flyable = flyable;
        }

        public Builder setName(String name) {
            this.name=name;
            return this;
        }
        public Builder setSpeed(int Speed)
        {
            this.speed=speed;
            return this;

        }
        public Builder isFlyable(boolean flyable) {
            this.flyable=flyable;
            return this;
        }
        public Animal build() {
            return new Animal(this);
        }
}
}

