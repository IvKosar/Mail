package mailing;

public enum Sex {
    MALE("Mr"), FEMALE("Mrs");

    private String call;

    Sex(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return call;
    }
}
