package tw.travel.ValueObjects.enumerations;

public enum PaymentMode {
    NETBANKING() {
        @Override
        public String toString() {
            return "NETBANKING";
        }
    },
    CC() {
        @Override
        public String toString() {
            return "CC";
        }
    },
    CASH() {
        @Override
        public String toString() {
            return "CASH";
        }
    }
}
