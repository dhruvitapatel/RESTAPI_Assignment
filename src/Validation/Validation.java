package Validation;

public interface Validation {
    void accept(Request request);

    void update(Request request);

    void query(Request request);
}
