package com.javaee.proyek.whatsapp_proyek.validator;

import com.javaee.proyek.whatsapp_proyek.models.Users;
import com.javaee.proyek.whatsapp_proyek.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Users.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Users user = (Users) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "first_name", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "last_name", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmpassword", "NotEmpty");
        if (userService.findByEmailAndPassword(user.getEmail(),user.getPassword()) != null) {
            errors.rejectValue("username", "Duplicate.email");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.password");
        }

        if (!user.getPasswordconn().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.passwordConfirm");
        }
    }
}
