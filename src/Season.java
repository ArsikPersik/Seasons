public enum Season {
    WINTER(-20) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(20) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    SPRING(5) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    AUTUMN(-5) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
