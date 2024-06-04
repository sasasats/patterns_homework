package homework4.task3;

public class UserValidator {
    private ValidationStrategy validationStrategy;

    public void setValidationStrategy(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validateUser(User user) {
        return validationStrategy.validate(user);
    }
}
